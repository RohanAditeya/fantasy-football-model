package com.fantasy.football.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLYR_GAME_STCS")
public class PlayerGameStatistics {

    private PlayerGameStatistics () {}

    public PlayerGameStatistics(PlayerBasicInformation playerCode, Integer minutes, Integer goalsScored, Integer assists, Integer cleanSheets, Integer goalsConceded, Integer ownGoals, Integer penaltiesSaved, Integer penaltiesMissed, Integer yellowCards, Integer redCards, Integer saves, Float influence, Float creativity, Float threat, Integer starts, Float startsPer90, Float cleanSheetsPer90, Float savesPer90, Float goalsConcededPer90) {
        this.playerCode = playerCode;
        this.minutes = minutes;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.cleanSheets = cleanSheets;
        this.goalsConceded = goalsConceded;
        this.ownGoals = ownGoals;
        this.penaltiesSaved = penaltiesSaved;
        this.penaltiesMissed = penaltiesMissed;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.saves = saves;
        this.influence = influence;
        this.creativity = creativity;
        this.threat = threat;
        this.starts = starts;
        this.startsPer90 = startsPer90;
        this.cleanSheetsPer90 = cleanSheetsPer90;
        this.savesPer90 = savesPer90;
        this.goalsConcededPer90 = goalsConcededPer90;
    }

    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "PLYR_CODE", referencedColumnName = "CODE")
    private PlayerBasicInformation playerCode;
    @Column(name = "MINS")
    private Integer minutes;
    @Column(name = "GOALS_SCRD")
    private Integer goalsScored;
    @Column(name = "ASSTS")
    private Integer assists;
    @Column(name = "CLEAN_SHTS")
    private Integer cleanSheets;
    @Column(name = "GOALS_CNCDED")
    private Integer goalsConceded;
    @Column(name = "OWN_GOALS")
    private Integer ownGoals;
    @Column(name = "PEN_SAVED")
    private Integer penaltiesSaved;
    @Column(name = "PEN_MISSED")
    private Integer penaltiesMissed;
    @Column(name = "YELL_CARDS")
    private Integer yellowCards;
    @Column(name = "RED_CARDS")
    private Integer redCards;
    private Integer saves;
    private Float influence;
    private Float creativity;
    private Float threat;
    private Integer starts;
    @Column(name = "STARTS_90")
    private Float startsPer90;
    @Column(name = "CLEAN_SHTS_90")
    private Float cleanSheetsPer90;
    @Column(name = "SAVES_90")
    private Float savesPer90;
    @Column(name = "GOALS_CNCDED_90")
    private Float goalsConcededPer90;

    public PlayerBasicInformation getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(PlayerBasicInformation playerCode) {
        this.playerCode = playerCode;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Integer getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Integer getSaves() {
        return saves;
    }

    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    public Float getInfluence() {
        return influence;
    }

    public void setInfluence(Float influence) {
        this.influence = influence;
    }

    public Float getCreativity() {
        return creativity;
    }

    public void setCreativity(Float creativity) {
        this.creativity = creativity;
    }

    public Float getThreat() {
        return threat;
    }

    public void setThreat(Float threat) {
        this.threat = threat;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Float getStartsPer90() {
        return startsPer90;
    }

    public void setStartsPer90(Float startsPer90) {
        this.startsPer90 = startsPer90;
    }

    public Float getCleanSheetsPer90() {
        return cleanSheetsPer90;
    }

    public void setCleanSheetsPer90(Float cleanSheetsPer90) {
        this.cleanSheetsPer90 = cleanSheetsPer90;
    }

    public Float getSavesPer90() {
        return savesPer90;
    }

    public void setSavesPer90(Float savesPer90) {
        this.savesPer90 = savesPer90;
    }

    public Float getGoalsConcededPer90() {
        return goalsConcededPer90;
    }

    public void setGoalsConcededPer90(Float goalsConcededPer90) {
        this.goalsConcededPer90 = goalsConcededPer90;
    }

    public static class Builder {
        private PlayerBasicInformation playerCode;
        private Integer minutes;
        private Integer goalsScored;
        private Integer assists;
        private Integer cleanSheets;
        private Integer goalsConceded;
        private Integer ownGoals;
        private Integer penaltiesSaved;
        private Integer penaltiesMissed;
        private Integer yellowCards;
        private Integer redCards;
        private Integer saves;
        private Float influence;
        private Float creativity;
        private Float threat;
        private Integer starts;
        private Float startsPer90;
        private Float cleanSheetsPer90;
        private Float savesPer90;
        private Float goalsConcededPer90;

        public Builder setPlayerCode(PlayerBasicInformation playerCode) {
            this.playerCode = playerCode;
            return this;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder setGoalsScored(Integer goalsScored) {
            this.goalsScored = goalsScored;
            return this;
        }

        public Builder setAssists(Integer assists) {
            this.assists = assists;
            return this;
        }

        public Builder setCleanSheets(Integer cleanSheets) {
            this.cleanSheets = cleanSheets;
            return this;
        }

        public Builder setGoalsConceded(Integer goalsConceded) {
            this.goalsConceded = goalsConceded;
            return this;
        }

        public Builder setOwnGoals(Integer ownGoals) {
            this.ownGoals = ownGoals;
            return this;
        }

        public Builder setPenaltiesSaved(Integer penaltiesSaved) {
            this.penaltiesSaved = penaltiesSaved;
            return this;
        }

        public Builder setPenaltiesMissed(Integer penaltiesMissed) {
            this.penaltiesMissed = penaltiesMissed;
            return this;
        }

        public Builder setYellowCards(Integer yellowCards) {
            this.yellowCards = yellowCards;
            return this;
        }

        public Builder setRedCards(Integer redCards) {
            this.redCards = redCards;
            return this;
        }

        public Builder setSaves(Integer saves) {
            this.saves = saves;
            return this;
        }

        public Builder setInfluence(Float influence) {
            this.influence = influence;
            return this;
        }

        public Builder setCreativity(Float creativity) {
            this.creativity = creativity;
            return this;
        }

        public Builder setThreat(Float threat) {
            this.threat = threat;
            return this;
        }

        public Builder setStarts(Integer starts) {
            this.starts = starts;
            return this;
        }

        public Builder setStartsPer90(Float startsPer90) {
            this.startsPer90 = startsPer90;
            return this;
        }

        public Builder setCleanSheetsPer90(Float cleanSheetsPer90) {
            this.cleanSheetsPer90 = cleanSheetsPer90;
            return this;
        }

        public Builder setSavesPer90(Float savesPer90) {
            this.savesPer90 = savesPer90;
            return this;
        }

        public Builder setGoalsConcededPer90(Float goalsConcededPer90) {
            this.goalsConcededPer90 = goalsConcededPer90;
            return this;
        }

        public PlayerGameStatistics build () {
            return new PlayerGameStatistics(
                    this.playerCode, this.minutes, this.goalsScored, this.assists, this.cleanSheets, this.goalsConceded, this.ownGoals, this.penaltiesSaved
                    , this.penaltiesMissed, this.yellowCards, this.redCards, this.saves, this.influence, this.creativity, this.threat
                    , this.starts, this.startsPer90, this.cleanSheetsPer90, this.savesPer90, this.goalsConcededPer90
            );
        }
    }
}