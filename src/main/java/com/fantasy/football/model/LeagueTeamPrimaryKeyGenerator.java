package com.fantasy.football.model;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.UUID;

public class LeagueTeamPrimaryKeyGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        if (object instanceof LeagueTeam entity)
            return new LeagueTeamPrimaryKey(UUID.randomUUID(), entity.getCompositeKey().getName(), entity.getCompositeKey().getCode());
        else
            throw new IllegalArgumentException("cannot generate Id of class type " + LeagueTeam.class.getName() + " got object of class type " + object.getClass().getName());
    }
}