package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerMiscellaneousInformation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerMiscellaneousInformationJpaValidatorTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerMiscellaneousInformation.class);
    }
}