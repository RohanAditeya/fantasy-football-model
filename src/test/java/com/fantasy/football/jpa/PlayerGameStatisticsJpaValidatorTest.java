package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerGameStatistics;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerGameStatisticsJpaValidatorTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerGameStatistics.class);
    }
}