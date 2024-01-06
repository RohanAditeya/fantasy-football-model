package com.fantasy.football;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import javax.sql.DataSource;

@AutoConfigureAfter(value = {JpaRepositoriesAutoConfiguration.class})
@ConditionalOnBean({DataSource.class})
@ConditionalOnClass({JpaRepository.class})
@ConditionalOnProperty(
        prefix = "spring.data.jpa.repositories",
        name = {"enabled"},
        havingValue = "true",
        matchIfMissing = true
)
@Import(FantasyFootballModelJpaRegistrarAutoConfiguration.JpaRepositoriesRegistrar.class)
public class FantasyFootballModelJpaRegistrarAutoConfiguration {

    @EntityScan
    static class JpaRepositoriesRegistrar {

    }
}