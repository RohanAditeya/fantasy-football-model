package com.fantasy.football.jpa;

import com.fantasy.football.model.LeagueTeam;
import com.fantasy.football.model.LeagueTeamPrimaryKey;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LeagueTeamJpaValidationTest extends JpaRegistrarTestBase {

    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest () {
        checkTableIsCreated(LeagueTeam.class);
    }

    @Test
    @DisplayName(value = "test to validate if inserting records with same short name throws exception")
    public void insertingRecordWithShortNameAlreadyExistingTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeamPrimaryKey primaryKey = new LeagueTeamPrimaryKey("Chelsea", 2);
            LeagueTeam.Builder leagueTeamBuilder = new LeagueTeam.Builder().compositeKey(primaryKey).draw(10).form(1).loss(10)
                    .played(38).points(10).position(2).shortName("ARS").strength(1).teamDivision("1").unavailable(false).win(10).strengthOverallHome(1)
                    .strengthOverallAway(1).strengthAttackHome(1).strengthAttackAway(1).strengthDefenceHome(1).strengthDefenceAway(1).pulseId(1);
            entityManager.persist(leagueTeamBuilder.build());
            Assertions.assertThatThrownBy(() -> entityManager.getTransaction().commit()).hasCauseInstanceOf(ConstraintViolationException.class);
        }
    }

    @Test
    @DisplayName(value = "test to validate if keyGenerator adds UUID to instance")
    public void persistCallGeneratesAndAssignsUUID () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            LeagueTeamPrimaryKey primaryKey = new LeagueTeamPrimaryKey("Liverpool", 3);
            LeagueTeam.Builder leagueTeamBuilder = new LeagueTeam.Builder().compositeKey(primaryKey).draw(10).form(1).loss(10)
                    .played(38).points(10).position(2).shortName("LIV").strength(1).teamDivision("1").unavailable(false).win(10).strengthOverallHome(1)
                    .strengthOverallAway(1).strengthAttackHome(1).strengthAttackAway(1).strengthDefenceHome(1).strengthDefenceAway(1).pulseId(1);
            LeagueTeam liverpool = leagueTeamBuilder.build();
            Assertions.assertThat(liverpool.getCompositeKey().getRecordId()).isNull();
            entityManager.persist(liverpool);
            Assertions.assertThat(liverpool.getCompositeKey().getRecordId()).isNotNull();
        }
    }

    @Test
    @DisplayName(value = "test to validate if updates to entities also updates version number")
    public void persistsCallUpdatesVersionNumber () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam arsenal = (LeagueTeam) entityManager.createQuery("select l from LeagueTeam l where l.compositeKey.name = 'Arsenal'").getResultList().get(0);
            arsenal.setWin(arsenal.getWin() - 1);
            entityManager.getTransaction().commit();
            entityManager.refresh(arsenal);
            Assertions.assertThat(arsenal.getVersionNumber()).isEqualTo(1);
        }
    }

    @Test
    @DisplayName(value = "test to validate audit information is stored properly")
    public void entitiesAreAuditedTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            LeagueTeam arsenal = (LeagueTeam) entityManager.createQuery("select l from LeagueTeam l where l.compositeKey.name = 'Arsenal'").getResultList().get(0);
            arsenal.setDraw(arsenal.getDraw() - 1);
            entityManager.getTransaction().commit();
            AuditReader auditReader = AuditReaderFactory.get(entityManager);
            List<Number> revisions = auditReader.getRevisions(LeagueTeam.class, arsenal.getCompositeKey());
            Assertions.assertThat(revisions.size()).isEqualTo(1);
        }
    }
}