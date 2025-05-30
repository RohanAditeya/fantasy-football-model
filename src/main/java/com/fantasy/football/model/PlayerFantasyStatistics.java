package com.fantasy.football.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table(name = "PLYR_FANT_STCS")
public class PlayerFantasyStatistics {

    private PlayerFantasyStatistics() {}

    @PersistenceCreator
    public PlayerFantasyStatistics(UUID recordId, Integer chanceOfPlayingNextRound, Integer chanceOfPlayingThisRound, Integer dreamTeamCount, Float expectedPointsNext, Float expectedPointsThis, Integer eventPoints, Boolean isInDreamTeam, Float form, Integer nowCost, Float pointsPerGame, Float selectedByPercent, Integer totalPoints, Long transfersIn, Long transfersOut, Float valueForm, Float valueSeason, Integer bonus, Integer bps, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float expectedGoalsPer90, Float expectedAssistsPer90, Float expectedGoalInvolvementsPer90, Float expectedGoalConcededPer90, long versionNumber) {
        this.recordId = recordId;
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
        this.dreamTeamCount = dreamTeamCount;
        this.expectedPointsNext = expectedPointsNext;
        this.expectedPointsThis = expectedPointsThis;
        this.eventPoints = eventPoints;
        this.isInDreamTeam = isInDreamTeam;
        this.form = form;
        this.nowCost = nowCost;
        this.pointsPerGame = pointsPerGame;
        this.selectedByPercent = selectedByPercent;
        this.totalPoints = totalPoints;
        this.transfersIn = transfersIn;
        this.transfersOut = transfersOut;
        this.valueForm = valueForm;
        this.valueSeason = valueSeason;
        this.bonus = bonus;
        this.bps = bps;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.expectedGoalInvolvements = expectedGoalInvolvements;
        this.expectedGoalsConceded = expectedGoalsConceded;
        this.expectedGoalsPer90 = expectedGoalsPer90;
        this.expectedAssistsPer90 = expectedAssistsPer90;
        this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
        this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
        this.versionNumber = versionNumber;
    }

    public PlayerFantasyStatistics(UUID recordId, Integer chanceOfPlayingNextRound, Integer chanceOfPlayingThisRound, Integer dreamTeamCount, Float expectedPointsNext, Float expectedPointsThis, Integer eventPoints, Boolean isInDreamTeam, Float form, Integer nowCost, Float pointsPerGame, Float selectedByPercent, Integer totalPoints, Long transfersIn, Long transfersOut, Float valueForm, Float valueSeason, Integer bonus, Integer bps, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float expectedGoalsPer90, Float expectedAssistsPer90, Float expectedGoalInvolvementsPer90, Float expectedGoalConcededPer90) {
        this.recordId = recordId;
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
        this.dreamTeamCount = dreamTeamCount;
        this.expectedPointsNext = expectedPointsNext;
        this.expectedPointsThis = expectedPointsThis;
        this.eventPoints = eventPoints;
        this.isInDreamTeam = isInDreamTeam;
        this.form = form;
        this.nowCost = nowCost;
        this.pointsPerGame = pointsPerGame;
        this.selectedByPercent = selectedByPercent;
        this.totalPoints = totalPoints;
        this.transfersIn = transfersIn;
        this.transfersOut = transfersOut;
        this.valueForm = valueForm;
        this.valueSeason = valueSeason;
        this.bonus = bonus;
        this.bps = bps;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.expectedGoalInvolvements = expectedGoalInvolvements;
        this.expectedGoalsConceded = expectedGoalsConceded;
        this.expectedGoalsPer90 = expectedGoalsPer90;
        this.expectedAssistsPer90 = expectedAssistsPer90;
        this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
        this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
    }

    @Id
    private UUID recordId;
    @Column(value = "CHNC_OF_PLYNG_NXT_RD")
    private Integer chanceOfPlayingNextRound;
    @Column(value = "CHNC_OF_PLYNG_CURR_RD")
    private Integer chanceOfPlayingThisRound;
    @Column(value = "DREAM_TM_CT")
    private Integer dreamTeamCount;
    @Column(value = "EXP_PNTS_NXT")
    private Float expectedPointsNext;
    @Column(value = "EXP_PNTS_CURR")
    private Float expectedPointsThis;
    @Column(value = "EVT_PNTS")
    private Integer eventPoints;
    @Column(value = "IS_IN_DREAM_TM")
    private Boolean isInDreamTeam;
    private Float form;
    @Column(value = "CURR_COST")
    private Integer nowCost;
    @Column(value = "PNTS_PER_GAME")
    private Float pointsPerGame;
    @Column(value = "SEL_BY_PRCT")
    private Float selectedByPercent;
    @Column(value = "TOTAL_PNTS")
    private Integer totalPoints;
    @Column(value = "TRNFR_IN")
    private Long transfersIn;
    @Column(value = "TRNFR_OUT")
    private Long transfersOut;
    @Column(value = "VAL_FROM")
    private Float valueForm;
    @Column(value = "VAL_SEASN")
    private Float valueSeason;
    private Integer bonus;
    private Integer bps;
    @Column(value = "EXP_GOALS")
    private Float expectedGoals;
    @Column(value = "EXP_ASSTS")
    private Float expectedAssists;
    @Column(value = "EXP_GOAL_INVLMTS")
    private Float expectedGoalInvolvements;
    @Column(value = "EXP_GOALS_CNCDED")
    private Float expectedGoalsConceded;
    @Column(value = "EXP_GOALS_90")
    private Float expectedGoalsPer90;
    @Column(value = "EXP_ASSTS_90")
    private Float expectedAssistsPer90;
    @Column(value = "EXP_GOAL_INVLMTS_90")
    private Float expectedGoalInvolvementsPer90;
    @Column(value = "EXP_GOALS_CNCDED_90")
    private Float expectedGoalConcededPer90;
    @Version
    private long versionNumber;

    public UUID getRecordId() {
        return recordId;
    }

    public Integer getChanceOfPlayingNextRound() {
        return chanceOfPlayingNextRound;
    }

    public Integer getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    public Integer getDreamTeamCount() {
        return dreamTeamCount;
    }

    public Float getExpectedPointsNext() {
        return expectedPointsNext;
    }

    public Float getExpectedPointsThis() {
        return expectedPointsThis;
    }

    public Integer getEventPoints() {
        return eventPoints;
    }

    public Boolean getInDreamTeam() {
        return isInDreamTeam;
    }

    public Float getForm() {
        return form;
    }

    public Integer getNowCost() {
        return nowCost;
    }

    public Float getPointsPerGame() {
        return pointsPerGame;
    }

    public Float getSelectedByPercent() {
        return selectedByPercent;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public Long getTransfersIn() {
        return transfersIn;
    }

    public Long getTransfersOut() {
        return transfersOut;
    }

    public Float getValueForm() {
        return valueForm;
    }

    public Float getValueSeason() {
        return valueSeason;
    }

    public Integer getBonus() {
        return bonus;
    }

    public Integer getBps() {
        return bps;
    }

    public Float getExpectedGoals() {
        return expectedGoals;
    }

    public Float getExpectedAssists() {
        return expectedAssists;
    }

    public Float getExpectedGoalInvolvements() {
        return expectedGoalInvolvements;
    }

    public Float getExpectedGoalsConceded() {
        return expectedGoalsConceded;
    }

    public Float getExpectedGoalsPer90() {
        return expectedGoalsPer90;
    }

    public Float getExpectedAssistsPer90() {
        return expectedAssistsPer90;
    }

    public Float getExpectedGoalInvolvementsPer90() {
        return expectedGoalInvolvementsPer90;
    }

    public Float getExpectedGoalConcededPer90() {
        return expectedGoalConcededPer90;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setRecordId(UUID recordId) {
        this.recordId = recordId;
    }

    public void setChanceOfPlayingNextRound(Integer chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
    }

    public void setChanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
    }

    public void setDreamTeamCount(Integer dreamTeamCount) {
        this.dreamTeamCount = dreamTeamCount;
    }

    public void setExpectedPointsNext(Float expectedPointsNext) {
        this.expectedPointsNext = expectedPointsNext;
    }

    public void setExpectedPointsThis(Float expectedPointsThis) {
        this.expectedPointsThis = expectedPointsThis;
    }

    public void setEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
    }

    public void setInDreamTeam(Boolean inDreamTeam) {
        isInDreamTeam = inDreamTeam;
    }

    public void setForm(Float form) {
        this.form = form;
    }

    public void setNowCost(Integer nowCost) {
        this.nowCost = nowCost;
    }

    public void setPointsPerGame(Float pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public void setSelectedByPercent(Float selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void setTransfersIn(Long transfersIn) {
        this.transfersIn = transfersIn;
    }

    public void setTransfersOut(Long transfersOut) {
        this.transfersOut = transfersOut;
    }

    public void setValueForm(Float valueForm) {
        this.valueForm = valueForm;
    }

    public void setValueSeason(Float valueSeason) {
        this.valueSeason = valueSeason;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public void setBps(Integer bps) {
        this.bps = bps;
    }

    public void setExpectedGoals(Float expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public void setExpectedAssists(Float expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public void setExpectedGoalInvolvements(Float expectedGoalInvolvements) {
        this.expectedGoalInvolvements = expectedGoalInvolvements;
    }

    public void setExpectedGoalsConceded(Float expectedGoalsConceded) {
        this.expectedGoalsConceded = expectedGoalsConceded;
    }

    public void setExpectedGoalsPer90(Float expectedGoalsPer90) {
        this.expectedGoalsPer90 = expectedGoalsPer90;
    }

    public void setExpectedAssistsPer90(Float expectedAssistsPer90) {
        this.expectedAssistsPer90 = expectedAssistsPer90;
    }

    public void setExpectedGoalInvolvementsPer90(Float expectedGoalInvolvementsPer90) {
        this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
    }

    public void setExpectedGoalConcededPer90(Float expectedGoalConcededPer90) {
        this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
    }

    public static class Builder {
        private UUID recordId;
        private Integer chanceOfPlayingNextRound;
        private Integer chanceOfPlayingThisRound;
        private Integer dreamTeamCount;
        private Float expectedPointsNext;
        private Float expectedPointsThis;
        private Integer eventPoints;
        private Boolean isInDreamTeam;
        private Float form;
        private Integer nowCost;
        private Float pointsPerGame;
        private Float selectedByPercent;
        private Integer totalPoints;
        private Long transfersIn;
        private Long transfersOut;
        private Float valueForm;
        private Float valueSeason;
        private Integer bonus;
        private Integer bps;
        private Float expectedGoals;
        private Float expectedAssists;
        private Float expectedGoalInvolvements;
        private Float expectedGoalsConceded;
        private Float expectedGoalsPer90;
        private Float expectedAssistsPer90;
        private Float expectedGoalInvolvementsPer90;
        private Float expectedGoalConcededPer90;

        public Builder recordId(UUID recordId) {
            this.recordId = recordId;
            return this;
        }

        public Builder chanceOfPlayingNextRound(Integer chanceOfPlayingNextRound) {
            this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
            return this;
        }

        public Builder chanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
            this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
            return this;
        }

        public Builder dreamTeamCount(Integer dreamTeamCount) {
            this.dreamTeamCount = dreamTeamCount;
            return this;
        }

        public Builder expectedPointsNext(Float expectedPointsNext) {
            this.expectedPointsNext = expectedPointsNext;
            return this;
        }

        public Builder expectedPointsThis(Float expectedPointsThis) {
            this.expectedPointsThis = expectedPointsThis;
            return this;
        }

        public Builder eventPoints(Integer eventPoints) {
            this.eventPoints = eventPoints;
            return this;
        }

        public Builder inDreamTeam(Boolean inDreamTeam) {
            isInDreamTeam = inDreamTeam;
            return this;
        }

        public Builder form(Float form) {
            this.form = form;
            return this;
        }

        public Builder nowCost(Integer nowCost) {
            this.nowCost = nowCost;
            return this;
        }

        public Builder pointsPerGame(Float pointsPerGame) {
            this.pointsPerGame = pointsPerGame;
            return this;
        }

        public Builder selectedByPercent(Float selectedByPercent) {
            this.selectedByPercent = selectedByPercent;
            return this;
        }

        public Builder totalPoints(Integer totalPoints) {
            this.totalPoints = totalPoints;
            return this;
        }

        public Builder transfersIn(Long transfersIn) {
            this.transfersIn = transfersIn;
            return this;
        }

        public Builder transfersOut(Long transfersOut) {
            this.transfersOut = transfersOut;
            return this;
        }

        public Builder valueForm(Float valueForm) {
            this.valueForm = valueForm;
            return this;
        }

        public Builder valueSeason(Float valueSeason) {
            this.valueSeason = valueSeason;
            return this;
        }

        public Builder bonus(Integer bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder bps(Integer bps) {
            this.bps = bps;
            return this;
        }

        public Builder expectedGoals(Float expectedGoals) {
            this.expectedGoals = expectedGoals;
            return this;
        }

        public Builder expectedAssists(Float expectedAssists) {
            this.expectedAssists = expectedAssists;
            return this;
        }

        public Builder expectedGoalInvolvements(Float expectedGoalInvolvements) {
            this.expectedGoalInvolvements = expectedGoalInvolvements;
            return this;
        }

        public Builder expectedGoalsConceded(Float expectedGoalsConceded) {
            this.expectedGoalsConceded = expectedGoalsConceded;
            return this;
        }

        public Builder expectedGoalsPer90(Float expectedGoalsPer90) {
            this.expectedGoalsPer90 = expectedGoalsPer90;
            return this;
        }

        public Builder expectedAssistsPer90(Float expectedAssistsPer90) {
            this.expectedAssistsPer90 = expectedAssistsPer90;
            return this;
        }

        public Builder expectedGoalInvolvementsPer90(Float expectedGoalInvolvementsPer90) {
            this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
            return this;
        }

        public Builder expectedGoalConcededPer90(Float expectedGoalConcededPer90) {
            this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
            return this;
        }

        public PlayerFantasyStatistics build () {
            return new PlayerFantasyStatistics(this.recordId, this.chanceOfPlayingNextRound, this.chanceOfPlayingThisRound, this.dreamTeamCount, this.expectedPointsNext, this.expectedPointsThis, this.eventPoints, this.isInDreamTeam, this.form, this.nowCost, this.pointsPerGame, this.selectedByPercent, this.totalPoints, this.transfersIn, this.transfersOut, this.valueForm, this.valueSeason, this.bonus, this.bps, this.expectedGoals, this.expectedAssists, this.expectedGoalInvolvements, this.expectedGoalsConceded, this.expectedGoalsPer90, this.expectedAssistsPer90, this.expectedGoalInvolvementsPer90, this.expectedGoalConcededPer90);
        }
    }
}