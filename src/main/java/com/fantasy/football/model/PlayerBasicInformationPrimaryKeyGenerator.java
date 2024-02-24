package com.fantasy.football.model;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.UUID;

public class PlayerBasicInformationPrimaryKeyGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        if (object instanceof PlayerBasicInformation entity)
            return new PlayerBasicInformationPrimaryKey(UUID.randomUUID(), entity.getCompositeKey().getCode(), entity.getCompositeKey().getFirstName(), entity.getCompositeKey().getSecondName());
        else
            throw new IllegalArgumentException("cannot generate Id of class type " + PlayerBasicInformation.class.getName() + " got object of class type " + object.getClass().getName());
    }
}