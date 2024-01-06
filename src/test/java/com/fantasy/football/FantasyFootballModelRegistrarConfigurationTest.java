package com.fantasy.football;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.domain.EntityScanPackages;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class FantasyFootballModelRegistrarConfigurationTest {

    @Test
    public void fantasyModelPackagesAreScannedTest () {
        new ApplicationContextRunner().withInitializer(ConditionEvaluationReportLoggingListener.forLogLevel(LogLevel.INFO))
                // Added autoconfiguration.
                .withConfiguration(
                        AutoConfigurations.of(
                                FantasyFootballModelJpaRegistrarAutoConfiguration.class
                        )
                )
                // Added Repository bean to satisfy conditionals.
                .withBean(JpaRepository.class, () -> mock(JpaRepository.class))
                .withBean(DataSource.class, () -> mock(DataSource.class))
                .run(
                        (context) -> {
                            EntityScanPackages scanPackages = context.getBean(EntityScanPackages.class);
                            assertThat(
                                    scanPackages.getPackageNames().stream()
                                            .anyMatch(packageName -> packageName.equals(FantasyFootballModelJpaRegistrarAutoConfiguration.class.getPackageName()))
                            ).isTrue();
                        }
                );
    }

    @Test
    public void fantasyModelPackagesBackOffWhenJpaDisabled () {
        new ApplicationContextRunner().withInitializer(ConditionEvaluationReportLoggingListener.forLogLevel(LogLevel.INFO))
                // Added autoconfiguration.
                .withConfiguration(
                        AutoConfigurations.of(
                                FantasyFootballModelJpaRegistrarAutoConfiguration.class
                        )
                )
                // Added Repository bean to satisfy conditionals.
                .withBean(JpaRepository.class, () -> mock(JpaRepository.class))
                .withBean(DataSource.class, () -> mock(DataSource.class))
                .withPropertyValues("spring.data.jpa.repositories.enabled=false")
                .run(
                        (context) -> {
                            assertThat(context).doesNotHaveBean(EntityScanPackages.class);
                        }
                );
    }

    @Test
    public void fantasyModelPackagesBackOffWhenDatasourceBeanIsAbsent () {
        new ApplicationContextRunner().withInitializer(ConditionEvaluationReportLoggingListener.forLogLevel(LogLevel.INFO))
                // Added autoconfiguration.
                .withConfiguration(
                        AutoConfigurations.of(
                                FantasyFootballModelJpaRegistrarAutoConfiguration.class
                        )
                )
                // Added Repository bean to satisfy conditionals.
                .withBean(JpaRepository.class, () -> mock(JpaRepository.class))
                .run(
                        (context) -> {
                            assertThat(context).doesNotHaveBean(EntityScanPackages.class);
                        }
                );
    }
}