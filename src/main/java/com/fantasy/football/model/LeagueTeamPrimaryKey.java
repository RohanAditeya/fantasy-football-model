package com.fantasy.football.model;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Embeddable
@Access(value = AccessType.FIELD)
public class LeagueTeamPrimaryKey {

    protected LeagueTeamPrimaryKey () {}

    public LeagueTeamPrimaryKey (String name, int code) {
        this(null, name, code);
    }
    LeagueTeamPrimaryKey(UUID recordId, String name, int code) {
        this.recordId = recordId;
        this.name = name;
        this.code = code;
    }

    private UUID recordId;
    @NotNull
    @Size(max = 30)
    private String name;
    @Positive
    @Column(unique = true)
    private int code;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public UUID getRecordId() {
        return recordId;
    }
}