package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerFantasyStatistics;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerFantasyStatisticsJpaValidationTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerFantasyStatistics.class);
    }

    @Test
    @DisplayName(value = "test to validate if record Id is generated when persisting entity")
    public void uuidGeneratedOnPersistTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            PlayerFantasyStatistics fantasyStatisticsRecord = new PlayerFantasyStatistics.Builder().build();
            assertThat(fantasyStatisticsRecord.getRecordId()).isNull();
            entityManager.persist(fantasyStatisticsRecord);
            assertThat(fantasyStatisticsRecord.getRecordId()).isNotNull();
        }
    }
}