package com.fantasy.football.jpa;

import com.fantasy.football.model.PlayerMiscellaneousInformation;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerMiscellaneousInformationJpaValidatorTest extends JpaRegistrarTestBase {
    @Test
    @Override
    @DisplayName(value = "test to validate if JPA creates table")
    public void isTablePresentTest() {
        this.checkTableIsCreated(PlayerMiscellaneousInformation.class);
    }

    @Test
    @DisplayName(value = "test to validate if record Id is generated when persisting entity")
    public void uuidGeneratedOnPersistTest () {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            PlayerMiscellaneousInformation miscellaneousInformationRecord = new PlayerMiscellaneousInformation.Builder().build();
            assertThat(miscellaneousInformationRecord.getRecordId()).isNull();
            entityManager.persist(miscellaneousInformationRecord);
            assertThat(miscellaneousInformationRecord.getRecordId()).isNotNull();
        }
    }
}