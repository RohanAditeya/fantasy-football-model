package com.fantasy.football.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.util.UUID;

@Table(
        name = "LEAGUE_TEAM"
)
public class LeagueTeam {

    private LeagueTeam() {}

    public LeagueTeam(UUID recordId, String name, int code, int draw, Float form, int loss, int played, int points, int position, String shortName, int strength, String teamDivision, boolean unavailable, int win, int strengthOverallHome, int strengthOverallAway, int strengthAttackHome, int strengthAttackAway, int strengthDefenceHome, int strengthDefenceAway, int pulseId) {
        this.recordId = recordId;
        this.name = name;
        this.code = code;
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

    @PersistenceCreator
    public LeagueTeam(UUID recordId, String name, int code, int draw, Float form, int loss, int played, int points, int position, String shortName, int strength, String teamDivision, boolean unavailable, int win, int strengthOverallHome, int strengthOverallAway, int strengthAttackHome, int strengthAttackAway, int strengthDefenceHome, int strengthDefenceAway, int pulseId, long versionNumber) {
        this.recordId = recordId;
        this.name = name;
        this.code = code;
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
        this.versionNumber = versionNumber;
    }

    @Id
    private UUID recordId;
    @NotNull
    @Size(max = 30)
    private String name;
    @Positive
    private int code;
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
    @Column(value = "SHRT_NAME")
    private String shortName;
    @Positive
    @Column(value = "STRGTH")
    private int strength;
    @NotNull
    @Column(value = "TEAM_DIV")
    private String teamDivision;
    @Column(value = "UN_AVLBL")
    private boolean unavailable;
    @PositiveOrZero
    private int win;
    @Positive
    @Column(value = "STRGTH_OVR_HOME")
    private int strengthOverallHome;
    @Positive
    @Column(value = "STRGTH_OVR_AWAY")
    private int strengthOverallAway;
    @Positive
    @Column(value = "STRGTH_ATT_HOME")
    private int strengthAttackHome;
    @Positive
    @Column(value = "STRGTH_ATT_AWAY")
    private int strengthAttackAway;
    @Positive
    @Column(value = "STRGTH_DEF_HOME")
    private int strengthDefenceHome;
    @Positive
    @Column(value = "STRGTH_DEF_AWAY")
    private int strengthDefenceAway;
    @Positive
    @Column(value = "PULSE_ID")
    private int pulseId;
    @Version
    private long versionNumber;

    public UUID getRecordId() {
        return recordId;
    }

    public @NotNull @Size(max = 30) String getName() {
        return name;
    }

    @Positive
    public int getCode() {
        return code;
    }

    @PositiveOrZero
    public int getDraw() {
        return draw;
    }

    public @Positive @Digits(integer = 5, fraction = 2) Float getForm() {
        return form;
    }

    @PositiveOrZero
    public int getLoss() {
        return loss;
    }

    @PositiveOrZero
    public int getPlayed() {
        return played;
    }

    @PositiveOrZero
    public int getPoints() {
        return points;
    }

    @Positive
    public int getPosition() {
        return position;
    }

    public @NotNull String getShortName() {
        return shortName;
    }

    @Positive
    public int getStrength() {
        return strength;
    }

    public @NotNull String getTeamDivision() {
        return teamDivision;
    }

    public boolean isUnavailable() {
        return unavailable;
    }

    @PositiveOrZero
    public int getWin() {
        return win;
    }

    @Positive
    public int getStrengthOverallHome() {
        return strengthOverallHome;
    }

    @Positive
    public int getStrengthOverallAway() {
        return strengthOverallAway;
    }

    @Positive
    public int getStrengthAttackHome() {
        return strengthAttackHome;
    }

    @Positive
    public int getStrengthAttackAway() {
        return strengthAttackAway;
    }

    @Positive
    public int getStrengthDefenceHome() {
        return strengthDefenceHome;
    }

    @Positive
    public int getStrengthDefenceAway() {
        return strengthDefenceAway;
    }

    @Positive
    public int getPulseId() {
        return pulseId;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setDraw(@PositiveOrZero int draw) {
        this.draw = draw;
    }

    public void setForm(@Positive @Digits(integer = 5, fraction = 2) Float form) {
        this.form = form;
    }

    public void setLoss(@PositiveOrZero int loss) {
        this.loss = loss;
    }

    public void setPlayed(@PositiveOrZero int played) {
        this.played = played;
    }

    public void setPoints(@PositiveOrZero int points) {
        this.points = points;
    }

    public void setPosition(@Positive int position) {
        this.position = position;
    }

    public void setShortName(@NotNull String shortName) {
        this.shortName = shortName;
    }

    public void setStrength(@Positive int strength) {
        this.strength = strength;
    }

    public void setTeamDivision(@NotNull String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    public void setWin(@PositiveOrZero int win) {
        this.win = win;
    }

    public void setStrengthOverallHome(@Positive int strengthOverallHome) {
        this.strengthOverallHome = strengthOverallHome;
    }

    public void setStrengthOverallAway(@Positive int strengthOverallAway) {
        this.strengthOverallAway = strengthOverallAway;
    }

    public void setStrengthAttackHome(@Positive int strengthAttackHome) {
        this.strengthAttackHome = strengthAttackHome;
    }

    public void setStrengthAttackAway(@Positive int strengthAttackAway) {
        this.strengthAttackAway = strengthAttackAway;
    }

    public void setStrengthDefenceHome(@Positive int strengthDefenceHome) {
        this.strengthDefenceHome = strengthDefenceHome;
    }

    public void setStrengthDefenceAway(@Positive int strengthDefenceAway) {
        this.strengthDefenceAway = strengthDefenceAway;
    }

    public void setPulseId(@Positive int pulseId) {
        this.pulseId = pulseId;
    }

    public void setRecordId(UUID recordId) {
        this.recordId = recordId;
    }

    public static class Builder {
        private UUID recordId;
        private String name;
        private int code;
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

        public Builder recordId (UUID recordId) {
            this.recordId = recordId;
            return this;
        }

        public Builder name (String name) {
            this.name = name;
            return this;
        }

        public Builder code (int code) {
            this.code = code;
            return this;
        }

        public Builder draw (int draw) {
            this.draw = draw;
            return this;
        }

        public Builder form (Float form) {
            this.form = form;
            return this;
        }

        public Builder loss (int loss) {
            this.loss = loss;
            return this;
        }

        public Builder played (int played) {
            this.played = played;
            return this;
        }

        public Builder points (int points) {
            this.points = points;
            return this;
        }

        public Builder position (int position) {
            this.position = position;
            return this;
        }

        public Builder shortName (String shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder strength (int strength) {
            this.strength = strength;
            return this;
        }

        public Builder recordId (String teamDivision) {
            this.teamDivision = teamDivision;
            return this;
        }

        public Builder unavailable (boolean unavailable) {
            this.unavailable = unavailable;
            return this;
        }

        public Builder win (int win) {
            this.win = win;
            return this;
        }

        public Builder strengthOverallHome (int strengthOverallHome) {
            this.strengthOverallHome = strengthOverallHome;
            return this;
        }

        public Builder strengthOverallAway (int strengthOverallAway) {
            this.strengthOverallAway = strengthOverallAway;
            return this;
        }

        public Builder strengthAttackHome (int strengthAttackHome) {
            this.strengthAttackHome = strengthAttackHome;
            return this;
        }

        public Builder strengthAttackAway (int strengthAttackAway) {
            this.strengthAttackAway = strengthAttackAway;
            return this;
        }

        public Builder strengthDefenceHome (int strengthDefenceHome) {
            this.strengthDefenceHome = strengthDefenceHome;
            return this;
        }

        public Builder strengthDefenceAway (int strengthDefenceAway) {
            this.strengthDefenceAway = strengthDefenceAway;
            return this;
        }

        public Builder pulseId (int pulseId) {
            this.pulseId = pulseId;
            return this;
        }

        public LeagueTeam build () {
            return new LeagueTeam(recordId, name, code, draw, form, loss, played, points, position, shortName, strength, teamDivision, unavailable, win, strengthOverallHome, strengthOverallAway, strengthAttackHome, strengthAttackAway, strengthDefenceHome, strengthDefenceAway, pulseId);
        }
    }
}