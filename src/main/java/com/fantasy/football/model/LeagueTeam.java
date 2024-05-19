package com.fantasy.football.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

@Entity
@Audited
@DynamicUpdate
@Table(
        name = "LEAGUE_TEAM",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"SHRT_NAME"})}
)
public class LeagueTeam {
    protected LeagueTeam () {}

    private LeagueTeam(LeagueTeamPrimaryKey compositeKey, int draw, float form, int loss, int played, int points, int position, @NotNull String shortName, int strength, @NotNull String teamDivision, boolean unavailable, int win, int strengthOverallHome, int strengthOverallAway, int strengthAttackHome, int strengthAttackAway, int strengthDefenceHome, int strengthDefenceAway, int pulseId) {
        this.compositeKey = compositeKey;
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
    }

    @EmbeddedId
    @GeneratedValue(generator = "leagueTeamKeyGenerator")
    @GenericGenerator(
            name = "leagueTeamKeyGenerator",
            type = LeagueTeamPrimaryKeyGenerator.class
    )
    private LeagueTeamPrimaryKey compositeKey;
    @PositiveOrZero
    private int draw;
    @Positive
    @Digits(integer = 5, fraction = 2)
    private Float form;
    @PositiveOrZero
    private int loss;
    @PositiveOrZero
    private int played;
    @PositiveOrZero
    private int points;
    @Positive
    private int position;
    @NotNull
    @Column(name = "SHRT_NAME", length = 3)
    private String shortName;
    @Positive
    @Column(name = "STRGTH")
    private int strength;
    @NotNull
    @Column(name = "TEAM_DIV", length = 10)
    private String teamDivision;
    @Column(name = "UN_AVLBL")
    private boolean unavailable;
    @PositiveOrZero
    private int win;
    @Positive
    @Column(name = "STRGTH_OVR_HOME")
    private int strengthOverallHome;
    @Positive
    @Column(name = "STRGTH_OVR_AWAY")
    private int strengthOverallAway;
    @Positive
    @Column(name = "STRGTH_ATT_HOME")
    private int strengthAttackHome;
    @Positive
    @Column(name = "STRGTH_ATT_AWAY")
    private int strengthAttackAway;
    @Positive
    @Column(name = "STRGTH_DEF_HOME")
    private int strengthDefenceHome;
    @Positive
    @Column(name = "STRGTH_DEF_AWAY")
    private int strengthDefenceAway;
    @Positive
    @Column(name = "PULSE_ID")
    private int pulseId;

    @Version
    private long versionNumber;

    public LeagueTeamPrimaryKey getCompositeKey() {
        return compositeKey;
    }

    public int getDraw() {
        return draw;
    }

    public Float getForm() {
        return form;
    }

    public int getLoss() {
        return loss;
    }

    public int getPlayed() {
        return played;
    }

    public int getPoints() {
        return points;
    }

    public int getPosition() {
        return position;
    }

    @NotNull
    public String getShortName() {
        return shortName;
    }

    public int getStrength() {
        return strength;
    }

    @NotNull
    public String getTeamDivision() {
        return teamDivision;
    }

    public boolean isUnavailable() {
        return unavailable;
    }

    public int getWin() {
        return win;
    }

    public int getStrengthOverallHome() {
        return strengthOverallHome;
    }

    public int getStrengthOverallAway() {
        return strengthOverallAway;
    }

    public int getStrengthAttackHome() {
        return strengthAttackHome;
    }

    public int getStrengthAttackAway() {
        return strengthAttackAway;
    }

    public int getStrengthDefenceHome() {
        return strengthDefenceHome;
    }

    public int getStrengthDefenceAway() {
        return strengthDefenceAway;
    }

    public int getPulseId() {
        return pulseId;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setForm(Float form) {
        this.form = form;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setTeamDivision(String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setStrengthOverallHome(int strengthOverallHome) {
        this.strengthOverallHome = strengthOverallHome;
    }

    public void setStrengthOverallAway(int strengthOverallAway) {
        this.strengthOverallAway = strengthOverallAway;
    }

    public void setStrengthAttackHome(int strengthAttackHome) {
        this.strengthAttackHome = strengthAttackHome;
    }

    public void setStrengthAttackAway(int strengthAttackAway) {
        this.strengthAttackAway = strengthAttackAway;
    }

    public void setStrengthDefenceHome(int strengthDefenceHome) {
        this.strengthDefenceHome = strengthDefenceHome;
    }

    public void setStrengthDefenceAway(int strengthDefenceAway) {
        this.strengthDefenceAway = strengthDefenceAway;
    }

    public void setPulseId(int pulseId) {
        this.pulseId = pulseId;
    }

    public static class Builder {
        private LeagueTeamPrimaryKey compositeKey;
        private int draw;
        private Float form;
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

        public Builder compositeKey(LeagueTeamPrimaryKey compositeKey) {
            this.compositeKey = compositeKey;
            return this;
        }

        public Builder draw(int draw) {
            this.draw = draw;
            return this;
        }

        public Builder form(Float form) {
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
        
        public LeagueTeam build () {
            return new LeagueTeam(
                    compositeKey, draw, form, loss, played, points, position, shortName, strength, teamDivision, unavailable, win, strengthOverallHome
                    , strengthOverallAway, strengthAttackHome, strengthAttackAway, strengthDefenceHome, strengthDefenceAway, pulseId
            );
        }
    }
}