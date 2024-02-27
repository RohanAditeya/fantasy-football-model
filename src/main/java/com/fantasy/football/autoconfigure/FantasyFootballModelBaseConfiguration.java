package com.fantasy.football.autoconfigure;

import jakarta.persistence.EntityManager;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@AutoConfiguration
@ConditionalOnClass({ LocalContainerEntityManagerFactoryBean.class, EntityManager.class, SessionImplementor.class })
public class FantasyFootballModelBaseConfiguration {

    @Bean
    public EntityRegistrarBeanFactoryPostProcessor entityRegistrarBeanFactoryPostProcessor () {
        return new EntityRegistrarBeanFactoryPostProcessor();
    }
}