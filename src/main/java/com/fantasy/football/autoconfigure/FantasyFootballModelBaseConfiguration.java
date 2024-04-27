package com.fantasy.football.autoconfigure;

import com.fantasy.football.envers.CustomAuditEntity;
import com.fantasy.football.envers.CustomRevisionEntityListener;
import com.fantasy.football.model.LeagueTeamPrimaryKeyGenerator;
import com.fantasy.football.model.PlayerBasicInformationPrimaryKeyGenerator;
import jakarta.persistence.EntityManager;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.UUID;

import static org.springframework.aot.hint.MemberCategory.*;

@AutoConfiguration
@EntityScan(value = {"com.fantasy.football.model", "com.fantasy.football.envers"})
@ImportRuntimeHints(value = FantasyFootballModelBaseConfiguration.ModelClassesReflectionHintsRegistrar.class)
@ConditionalOnClass({ LocalContainerEntityManagerFactoryBean.class, EntityManager.class, SessionImplementor.class })
public class FantasyFootballModelBaseConfiguration {

    static class ModelClassesReflectionHintsRegistrar implements RuntimeHintsRegistrar {

        @Override
        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
            hints.reflection().registerType(LeagueTeamPrimaryKeyGenerator.class
                    , DECLARED_FIELDS, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
            hints.reflection().registerType(CustomAuditEntity.class, DECLARED_FIELDS, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
            hints.reflection().registerType(CustomRevisionEntityListener.class, DECLARED_FIELDS, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
            hints.reflection().registerType(PlayerBasicInformationPrimaryKeyGenerator.class, DECLARED_FIELDS, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
            // TODO Temporary Fix added and needs to be fixed by future versions of hibernate ORM
            hints.reflection().registerType(UUID[].class, DECLARED_FIELDS, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
        }
    }
}