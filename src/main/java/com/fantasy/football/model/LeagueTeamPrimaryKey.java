package com.fantasy.football.model;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.springframework.lang.NonNull;

@Embeddable
@Access(value = AccessType.FIELD)
public class LeagueTeamPrimaryKey {

    private LeagueTeamPrimaryKey () {}
    public LeagueTeamPrimaryKey (int code, String name) {
        this.code = code;
        this.name = name;
    }

    @NonNull
    @Column(unique = true, updatable = false)
    private int code;
    @NonNull
    @Column(length = 30, updatable = false)
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}