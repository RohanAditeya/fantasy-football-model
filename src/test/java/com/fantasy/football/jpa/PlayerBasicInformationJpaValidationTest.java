package com.fantasy.football.jpa;

import com.fantasy.football.model.*;
import jakarta.persistence.*;
import org.assertj.core.api.Assertions;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PlayerBasicInformationJpaValidationTest extends JpaRegistrarTestBase {

    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest () {
        checkTableIsCreated(PlayerBasicInformation.class);
    }

    @Test
    @DisplayName(value = "test to validate if keyGenerator adds UUID to instance")
    public void primaryKeyGeneratorAddsUUIDTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            LeagueTeam team = (LeagueTeam) entityManager.createQuery("select i from LeagueTeam i where i.compositeKey.name = 'Arsenal'").getResultList().get(0);
            PlayerBasicInformationPrimaryKey primaryKey = new PlayerBasicInformationPrimaryKey(1L, "Martin", "Odegaard");
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(8)
                    .status('G')
                    .team(team)
                    .webName("Odegaard")
                    .playerGameStatistics(buildMockGameStatisticsInstance())
                    .playerMiscellaneousInformation(buildMockMiscellaneousInstance())
                    .playerFantasyStatistics(buildMockFantasyStatisticsInstance())
                    .build();
            Assertions.assertThat(basicInformationRecord.getCompositeKey().getRecordId()).isNull();
            entityManager.persist(basicInformationRecord);
            Assertions.assertThat(basicInformationRecord.getCompositeKey().getRecordId()).isNotNull();
            entityManager.remove(basicInformationRecord);
        }
    }

    @Test
    @DisplayName(value = "test to validate if persisting/removing basic info entity also persists/removes associated entities")
    public void playerInfoManageAssociatedEntitiesTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam team = (LeagueTeam) entityManager.createQuery("select i from LeagueTeam i where i.compositeKey.name = 'Arsenal'").getResultList().get(0);
            PlayerBasicInformationPrimaryKey primaryKey = new PlayerBasicInformationPrimaryKey(1L, "Kai", "Havertz");
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(11)
                    .status('G')
                    .team(team)
                    .webName("Havertz")
                    .playerGameStatistics(buildMockGameStatisticsInstance())
                    .playerMiscellaneousInformation(buildMockMiscellaneousInstance())
                    .playerFantasyStatistics(buildMockFantasyStatisticsInstance())
                    .build();
            entityManager.persist(basicInformationRecord);
            Assertions.assertThat(entityManager.createQuery("select g from PlayerGameStatistics g").getResultList().size()).isEqualTo(1);
            entityManager.remove(basicInformationRecord);
            Assertions.assertThat(entityManager.createQuery("select g from PlayerGameStatistics g").getResultList().size()).isEqualTo(0);
            entityManager.getTransaction().commit();
        }
    }

    @Test
    @DisplayName(value = "test to validate if updating entity updates version number")
    public void updatePlayerInformationUpdatesVersionNumberTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam team = (LeagueTeam) entityManager.createQuery("select i from LeagueTeam i where i.compositeKey.name = 'Arsenal'").getResultList().get(0);
            PlayerBasicInformationPrimaryKey primaryKey = new PlayerBasicInformationPrimaryKey(1L, "Gabriel", "Martinelli");
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(11)
                    .status('G')
                    .team(team)
                    .webName("Martinelli")
                    .playerGameStatistics(buildMockGameStatisticsInstance())
                    .playerMiscellaneousInformation(buildMockMiscellaneousInstance())
                    .playerFantasyStatistics(buildMockFantasyStatisticsInstance())
                    .build();
            entityManager.persist(basicInformationRecord);
            entityManager.getTransaction().commit();
            // start new transaction to simulate new update
            entityManager.getTransaction().begin();
            basicInformationRecord.setStatus('W');
            entityManager.getTransaction().commit();
            // commit to update
            entityManager.refresh(basicInformationRecord);
            Assertions.assertThat(basicInformationRecord.getVersionNumber()).isEqualTo(1);
        }
    }

    @Test
    @DisplayName(value = "test to validate if associations are fetched lazily")
    public void associationsAreLoadedLazilyTest () {
        PlayerBasicInformation basicInformationRecord = null;
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam team = (LeagueTeam) entityManager.createQuery("select i from LeagueTeam i where i.compositeKey.name = 'Arsenal'").getResultList().get(0);
            PlayerBasicInformationPrimaryKey primaryKey = new PlayerBasicInformationPrimaryKey(1L, "Leandro", "Trossard");
            basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(19)
                    .status('G')
                    .team(team)
                    .webName("Trossard")
                    .playerGameStatistics(buildMockGameStatisticsInstance())
                    .playerMiscellaneousInformation(buildMockMiscellaneousInstance())
                    .playerFantasyStatistics(buildMockFantasyStatisticsInstance())
                    .build();
            entityManager.persist(basicInformationRecord);
            entityManager.getTransaction().commit();
        }
        // close persistence context and open a new one to load entities again if loaded within
        // the same persistence context then it is fetched from the cache and not loaded from DB.
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            PlayerBasicInformation trossardReference = entityManager.getReference(PlayerBasicInformation.class, basicInformationRecord.getCompositeKey());
            PersistenceUtil persistenceUtil = Persistence.getPersistenceUtil();
            Assertions.assertThat(persistenceUtil.isLoaded(trossardReference.getPlayerGameStatistics())).isFalse();
            Assertions.assertThat(persistenceUtil.isLoaded(trossardReference.getPlayerMiscellaneousInformation())).isFalse();
            Assertions.assertThat(persistenceUtil.isLoaded(trossardReference.getPlayerFantasyStatistics())).isFalse();
            Assertions.assertThat(persistenceUtil.isLoaded(trossardReference.getTeam())).isFalse();
        }
    }

    @Test
    @DisplayName(value = "test to validate entity is not audited when associated entity is changed")
    public void associatedEntityChangeIsNotAuditedTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam team = (LeagueTeam) entityManager.createQuery("select i from LeagueTeam i where i.compositeKey.name = 'Arsenal'").getResultList().get(0);
            PlayerBasicInformationPrimaryKey primaryKey = new PlayerBasicInformationPrimaryKey(1L, "Declan", "Rice");
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(26)
                    .status('G')
                    .team(team)
                    .webName("Rice")
                    .playerGameStatistics(buildMockGameStatisticsInstance())
                    .playerMiscellaneousInformation(buildMockMiscellaneousInstance())
                    .playerFantasyStatistics(buildMockFantasyStatisticsInstance())
                    .build();
            entityManager.persist(basicInformationRecord);
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            AuditReader auditReader = AuditReaderFactory.get(entityManager);
            List<Number> revisions = auditReader.getRevisions(PlayerBasicInformation.class, basicInformationRecord.getCompositeKey());
            Assertions.assertThat(revisions.size()).isEqualTo(1);
            basicInformationRecord.getPlayerGameStatistics().setGoalsScored(1);
            entityManager.getTransaction().commit();
            revisions = auditReader.getRevisions(PlayerBasicInformation.class, basicInformationRecord.getCompositeKey());
            Assertions.assertThat(revisions.size()).isEqualTo(1);
        }
    }

    private PlayerGameStatistics buildMockGameStatisticsInstance () {
        return new PlayerGameStatistics.Builder().build();
    }

    private PlayerFantasyStatistics buildMockFantasyStatisticsInstance () {
        return new PlayerFantasyStatistics.Builder().build();
    }

    private PlayerMiscellaneousInformation buildMockMiscellaneousInstance () {
        return new PlayerMiscellaneousInformation.Builder().build();
    }
}