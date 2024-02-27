package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerGameStatistics;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerGameStatisticsJpaValidatorTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerGameStatistics.class);
    }

    @Test
    @DisplayName(value = "test to validate if record Id is generated when persisting entity")
    public void uuidGeneratedOnPersistTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            PlayerGameStatistics gameStatisticsRecord = new PlayerGameStatistics.Builder().build();
            assertThat(gameStatisticsRecord.getRecordId()).isNull();
            entityManager.persist(gameStatisticsRecord);
            assertThat(gameStatisticsRecord.getRecordId()).isNotNull();
        }
    }
}