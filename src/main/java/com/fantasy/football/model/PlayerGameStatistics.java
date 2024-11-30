package com.fantasy.football.model;

import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table(name = "PLYR_GAME_STCS")
public class PlayerGameStatistics {

    private PlayerGameStatistics() {}

    @PersistenceCreator
    public PlayerGameStatistics(UUID recordId, Integer minutes, Integer goalsScored, Integer assists, Integer cleanSheets, Integer goalsConceded, Integer ownGoals, Integer penaltiesSaved, Integer penaltiesMissed, Integer yellowCards, Integer redCards, Integer saves, Float influence, Float creativity, Float threat, Integer starts, Integer totalPoints, Float startsPer90, Float cleanSheetsPer90, Float savesPer90, Float goalsConcededPer90, long versionNumber) {
        this.recordId = recordId;
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
        this.totalPoints = totalPoints;
        this.startsPer90 = startsPer90;
        this.cleanSheetsPer90 = cleanSheetsPer90;
        this.savesPer90 = savesPer90;
        this.goalsConcededPer90 = goalsConcededPer90;
        this.versionNumber = versionNumber;
    }

    public PlayerGameStatistics(UUID recordId, Integer minutes, Integer goalsScored, Integer assists, Integer cleanSheets, Integer goalsConceded, Integer ownGoals, Integer penaltiesSaved, Integer penaltiesMissed, Integer yellowCards, Integer redCards, Integer saves, Float influence, Float creativity, Float threat, Integer starts, Integer totalPoints, Float startsPer90, Float cleanSheetsPer90, Float savesPer90, Float goalsConcededPer90) {
        this.recordId = recordId;
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
        this.totalPoints = totalPoints;
        this.startsPer90 = startsPer90;
        this.cleanSheetsPer90 = cleanSheetsPer90;
        this.savesPer90 = savesPer90;
        this.goalsConcededPer90 = goalsConcededPer90;
    }

    @Id
    private UUID recordId;
    @PositiveOrZero
    @Column(value = "MINS")
    private Integer minutes;
    @PositiveOrZero
    @Column(value = "GOALS_SCRD")
    private Integer goalsScored;
    @PositiveOrZero
    @Column(value = "ASSTS")
    private Integer assists;
    @PositiveOrZero
    @Column(value = "CLEAN_SHTS")
    private Integer cleanSheets;
    @PositiveOrZero
    @Column(value = "GOALS_CNCDED")
    private Integer goalsConceded;
    @PositiveOrZero
    @Column(value = "OWN_GOALS")
    private Integer ownGoals;
    @PositiveOrZero
    @Column(value = "PEN_SAVED")
    private Integer penaltiesSaved;
    @PositiveOrZero
    @Column(value = "PEN_MISSED")
    private Integer penaltiesMissed;
    @PositiveOrZero
    @Column(value = "YELL_CARDS")
    private Integer yellowCards;
    @PositiveOrZero
    @Column(value = "RED_CARDS")
    private Integer redCards;
    @PositiveOrZero
    private Integer saves;
    @PositiveOrZero
    private Float influence;
    @PositiveOrZero
    private Float creativity;
    @PositiveOrZero
    private Float threat;
    @PositiveOrZero
    private Integer starts;
    @PositiveOrZero
    private Integer totalPoints;
    @PositiveOrZero
    @Column(value = "STARTS_90")
    private Float startsPer90;
    @PositiveOrZero
    @Column(value = "CLEAN_SHTS_90")
    private Float cleanSheetsPer90;
    @PositiveOrZero
    @Column(value = "SAVES_90")
    private Float savesPer90;
    @PositiveOrZero
    @Column(value = "GOALS_CNCDED_90")
    private Float goalsConcededPer90;
    @Version
    private long versionNumber;

    public UUID getRecordId() {
        return recordId;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getCleanSheets() {
        return cleanSheets;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public Integer getOwnGoals() {
        return ownGoals;
    }

    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public Integer getSaves() {
        return saves;
    }

    public Float getInfluence() {
        return influence;
    }

    public Float getCreativity() {
        return creativity;
    }

    public Float getThreat() {
        return threat;
    }

    public Integer getStarts() {
        return starts;
    }
    
    public Integer getTotalPoints() {
        return totalPoints;
    }

    public Float getStartsPer90() {
        return startsPer90;
    }

    public Float getCleanSheetsPer90() {
        return cleanSheetsPer90;
    }

    public Float getSavesPer90() {
        return savesPer90;
    }

    public Float getGoalsConcededPer90() {
        return goalsConcededPer90;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setRecordId(UUID recordId) {
        this.recordId = recordId;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    public void setInfluence(Float influence) {
        this.influence = influence;
    }

    public void setCreativity(Float creativity) {
        this.creativity = creativity;
    }

    public void setThreat(Float threat) {
        this.threat = threat;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }
    
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void setStartsPer90(Float startsPer90) {
        this.startsPer90 = startsPer90;
    }

    public void setCleanSheetsPer90(Float cleanSheetsPer90) {
        this.cleanSheetsPer90 = cleanSheetsPer90;
    }

    public void setSavesPer90(Float savesPer90) {
        this.savesPer90 = savesPer90;
    }

    public void setGoalsConcededPer90(Float goalsConcededPer90) {
        this.goalsConcededPer90 = goalsConcededPer90;
    }

    public static class Builder {
        private UUID recordId;
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
        private Integer totalPoints;
        private Float startsPer90;
        private Float cleanSheetsPer90;
        private Float savesPer90;
        private Float goalsConcededPer90;

        public Builder recordId(UUID recordId) {
            this.recordId = recordId;
            return this;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder goalsScored(Integer goalsScored) {
            this.goalsScored = goalsScored;
            return this;
        }

        public Builder assists(Integer assists) {
            this.assists = assists;
            return this;
        }

        public Builder cleanSheets(Integer cleanSheets) {
            this.cleanSheets = cleanSheets;
            return this;
        }

        public Builder goalsConceded(Integer goalsConceded) {
            this.goalsConceded = goalsConceded;
            return this;
        }

        public Builder ownGoals(Integer ownGoals) {
            this.ownGoals = ownGoals;
            return this;
        }

        public Builder penaltiesSaved(Integer penaltiesSaved) {
            this.penaltiesSaved = penaltiesSaved;
            return this;
        }

        public Builder penaltiesMissed(Integer penaltiesMissed) {
            this.penaltiesMissed = penaltiesMissed;
            return this;
        }

        public Builder yellowCards(Integer yellowCards) {
            this.yellowCards = yellowCards;
            return this;
        }

        public Builder redCards(Integer redCards) {
            this.redCards = redCards;
            return this;
        }

        public Builder saves(Integer saves) {
            this.saves = saves;
            return this;
        }

        public Builder influence(Float influence) {
            this.influence = influence;
            return this;
        }

        public Builder creativity(Float creativity) {
            this.creativity = creativity;
            return this;
        }

        public Builder threat(Float threat) {
            this.threat = threat;
            return this;
        }

        public Builder starts(Integer starts) {
            this.starts = starts;
            return this;
        }

        public Builder totalPoints(Integer totalPoints) {
            this.totalPoints = totalPoints;
            return this;
        }

        public Builder startsPer90(Float startsPer90) {
            this.startsPer90 = startsPer90;
            return this;
        }

        public Builder cleanSheetsPer90(Float cleanSheetsPer90) {
            this.cleanSheetsPer90 = cleanSheetsPer90;
            return this;
        }

        public Builder savesPer90(Float savesPer90) {
            this.savesPer90 = savesPer90;
            return this;
        }

        public Builder goalsConcededPer90(Float goalsConcededPer90) {
            this.goalsConcededPer90 = goalsConcededPer90;
            return this;
        }

        public PlayerGameStatistics build () {
            return new PlayerGameStatistics(this.recordId, this.minutes, this.goalsScored, this.assists, this.cleanSheets, this.goalsConceded, this.ownGoals, this.penaltiesSaved, this.penaltiesMissed, this.yellowCards, this.redCards, this.saves, this.influence, this.creativity, this.threat, this.starts, this.totalPoints, this.startsPer90, this.cleanSheetsPer90, this.savesPer90, this.goalsConcededPer90);
        }
    }
}