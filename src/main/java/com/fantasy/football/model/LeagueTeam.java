package com.fantasy.football.model;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "LEAGUE_TEAM")
public class LeagueTeam {

    private LeagueTeam () {}

    private LeagueTeam(int draw, float form, int loss, int played, int points, int position, String shortName, int strength, String teamDivision, boolean unavailable, int win, int strengthOverallHome, int strengthOverallAway, int strengthAttackHome, int strengthAttackAway, int strengthDefenceHome, int strengthDefenceAway, int pulseId, int code, String name) {
        this.draw = draw;
        this.form = form;
        this.loss = loss;
        this.played = played;
        this.points = points;
        this.position = position;
        this.shortName = shortName;
        this.strength = strength;
        this.teamDivision = teamDivision;
        this.unavailable = unavailable;
        this.win = win;
        this.strengthOverallHome = strengthOverallHome;
        this.strengthOverallAway = strengthOverallAway;
        this.strengthAttackHome = strengthAttackHome;
        this.strengthAttackAway = strengthAttackAway;
        this.strengthDefenceHome = strengthDefenceHome;
        this.strengthDefenceAway = strengthDefenceAway;
        this.pulseId = pulseId;
        this.code = code;
        this.name = name;
    }

    @Id
    private int code;
    private String name;
    private int draw;
    private float form;
    private int loss;
    private int played;
    private int points;
    private int position;
    @Column(name = "SHRT_NAME", length = 3)
    private String shortName;
    @Column(name = "STRGTH")
    private int strength;
    @Column(name = "TEAM_DIV", length = 10)
    private String teamDivision;
    @Column(name = "UN_AVLBL")
    private boolean unavailable;
    private int win;
    @Column(name = "STRGTH_OVR_HOME")
    private int strengthOverallHome;
    @Column(name = "STRGTH_OVR_AWAY")
    private int strengthOverallAway;
    @Column(name = "STRGTH_ATT_HOME")
    private int strengthAttackHome;
    @Column(name = "STRGTH_ATT_AWAY")
    private int strengthAttackAway;
    @Column(name = "STRGTH_DEF_HOME")
    private int strengthDefenceHome;
    @Column(name = "STRGTH_DEF_AWAY")
    private int strengthDefenceAway;
    @Column(name = "PULSE_ID")
    private int pulseId;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public float getForm() {
        return form;
    }

    public void setForm(float form) {
        this.form = form;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getTeamDivision() {
        return teamDivision;
    }

    public void setTeamDivision(String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public boolean isUnavailable() {
        return unavailable;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getStrengthOverallHome() {
        return strengthOverallHome;
    }

    public void setStrengthOverallHome(int strengthOverallHome) {
        this.strengthOverallHome = strengthOverallHome;
    }

    public int getStrengthOverallAway() {
        return strengthOverallAway;
    }

    public void setStrengthOverallAway(int strengthOverallAway) {
        this.strengthOverallAway = strengthOverallAway;
    }

    public int getStrengthAttackHome() {
        return strengthAttackHome;
    }

    public void setStrengthAttackHome(int strengthAttackHome) {
        this.strengthAttackHome = strengthAttackHome;
    }

    public int getStrengthAttackAway() {
        return strengthAttackAway;
    }

    public void setStrengthAttackAway(int strengthAttackAway) {
        this.strengthAttackAway = strengthAttackAway;
    }

    public int getStrengthDefenceHome() {
        return strengthDefenceHome;
    }

    public void setStrengthDefenceHome(int strengthDefenceHome) {
        this.strengthDefenceHome = strengthDefenceHome;
    }

    public int getStrengthDefenceAway() {
        return strengthDefenceAway;
    }

    public void setStrengthDefenceAway(int strengthDefenceAway) {
        this.strengthDefenceAway = strengthDefenceAway;
    }

    public int getPulseId() {
        return pulseId;
    }

    public void setPulseId(int pulseId) {
        this.pulseId = pulseId;
    }

    public static class Builder {
        private int draw;
        private float form;
        private int loss;
        private int played;
        private int points;
        private int position;
        private String shortName;
        private int strength;
        private String teamDivision;
        private boolean unavailable;
        private int win;
        private int strengthOverallHome;
        private int strengthOverallAway;
        private int strengthAttackHome;
        private int strengthAttackAway;
        private int strengthDefenceHome;
        private int strengthDefenceAway;
        private int pulseId;
        private int code;
        private String name;

        public Builder draw(int draw) {
            this.draw = draw;
            return this;
        }

        public Builder form(float form) {
            this.form = form;
            return this;
        }

        public Builder loss(int loss) {
            this.loss = loss;
            return this;
        }

        public Builder played(int played) {
            this.played = played;
            return this;
        }

        public Builder points(int points) {
            this.points = points;
            return this;
        }

        public Builder position(int position) {
            this.position = position;
            return this;
        }

        public Builder shortName(String shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder teamDivision(String teamDivision) {
            this.teamDivision = teamDivision;
            return this;
        }

        public Builder unavailable(boolean unavailable) {
            this.unavailable = unavailable;
            return this;
        }

        public Builder win(int win) {
            this.win = win;
            return this;
        }

        public Builder strengthOverallHome(int strengthOverallHome) {
            this.strengthOverallHome = strengthOverallHome;
            return this;
        }

        public Builder strengthOverallAway(int strengthOverallAway) {
            this.strengthOverallAway = strengthOverallAway;
            return this;
        }

        public Builder strengthAttackHome(int strengthAttackHome) {
            this.strengthAttackHome = strengthAttackHome;
            return this;
        }

        public Builder strengthAttackAway(int strengthAttackAway) {
            this.strengthAttackAway = strengthAttackAway;
            return this;
        }

        public Builder strengthDefenceHome(int strengthDefenceHome) {
            this.strengthDefenceHome = strengthDefenceHome;
            return this;
        }

        public Builder strengthDefenceAway(int strengthDefenceAway) {
            this.strengthDefenceAway = strengthDefenceAway;
            return this;
        }

        public Builder pulseId(int pulseId) {
            this.pulseId = pulseId;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public LeagueTeam build () {
            return new LeagueTeam(
                    draw, form, loss, played, points, position, shortName, strength
                    , teamDivision, unavailable, win, strengthOverallHome, strengthOverallAway, strengthAttackHome, strengthAttackAway
                    , strengthDefenceHome, strengthDefenceAway, pulseId, code, name
            );
        }
    }
}