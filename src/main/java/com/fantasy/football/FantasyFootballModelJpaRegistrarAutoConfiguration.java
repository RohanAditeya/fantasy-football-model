package com.fantasy.football;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

@AutoConfigureAfter(value = {JpaRepositoriesAutoConfiguration.class})
@Import(FantasyFootballModelJpaRegistrarAutoConfiguration.JpaRepositoriesRegistrar.class)
public class FantasyFootballModelJpaRegistrarAutoConfiguration {

    @EntityScan
    static class JpaRepositoriesRegistrar {

    }
}