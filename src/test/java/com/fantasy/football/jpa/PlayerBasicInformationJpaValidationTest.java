package com.fantasy.football.jpa;

import com.fantasy.football.model.LeagueTeam;
import com.fantasy.football.model.PlayerBasicInformation;
import com.fantasy.football.model.PlayerBasicInformationPrimaryKey;
import com.fantasy.football.model.PlayerGameStatistics;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
            PlayerGameStatistics gameStatistics = new PlayerGameStatistics.Builder()
                    .minutes(90)
                    .goalsScored(5)
                    .assists(5)
                    .cleanSheets(0)
                    .build();
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(11)
                    .status('G')
                    .team(team)
                    .webName("Havertz")
                    .playerGameStatistics(gameStatistics)
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
            PlayerGameStatistics gameStatistics = new PlayerGameStatistics.Builder()
                    .minutes(90)
                    .goalsScored(5)
                    .assists(5)
                    .cleanSheets(0)
                    .build();
            PlayerBasicInformation basicInformationRecord = new PlayerBasicInformation.Builder()
                    .compositeKey(primaryKey)
                    .squadNumber(11)
                    .status('G')
                    .team(team)
                    .webName("Martinelli")
                    .playerGameStatistics(gameStatistics)
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
}