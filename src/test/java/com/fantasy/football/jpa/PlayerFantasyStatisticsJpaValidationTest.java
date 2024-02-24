package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerFantasyStatistics;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerFantasyStatisticsJpaValidationTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerFantasyStatistics.class);
    }
}