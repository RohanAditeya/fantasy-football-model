package com.fantasy.football.autoconfigure;

import com.fantasy.football.envers.CustomAuditEntity;
import com.fantasy.football.model.LeagueTeam;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.domain.EntityScanPackages;

import java.util.HashSet;
import java.util.Set;

public class EntityRegistrarBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Set<String> packagesToScan = new HashSet<>();
        packagesToScan.add(LeagueTeam.class.getPackageName());
        packagesToScan.add(CustomAuditEntity.class.getPackageName());
        EntityScanPackages.register((DefaultListableBeanFactory) beanFactory, packagesToScan);
    }
}