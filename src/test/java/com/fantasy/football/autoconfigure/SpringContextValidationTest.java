package com.fantasy.football.autoconfigure;

import com.fantasy.football.envers.CustomAuditEntity;
import com.fantasy.football.model.LeagueTeam;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.domain.EntityScanPackages;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringContextValidationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withInitializer(ConditionEvaluationReportLoggingListener.forLogLevel(LogLevel.INFO));

    @Test
    public void registerModelEntitiesTest () {
        contextRunner.withConfiguration(
                AutoConfigurations.of(
                        FantasyFootballModelBaseConfiguration.class,
                        HibernateJpaAutoConfiguration.class,
                        DataSourceAutoConfiguration.class
                )
        ).run(context -> {
            EntityScanPackages entityRegistrarBean = context.getBean(EntityScanPackages.class);
            assertThat(entityRegistrarBean.getPackageNames().contains(LeagueTeam.class.getPackageName())).isTrue();
            assertThat(entityRegistrarBean.getPackageNames().contains(CustomAuditEntity.class.getPackageName())).isTrue();
        });
    }
}