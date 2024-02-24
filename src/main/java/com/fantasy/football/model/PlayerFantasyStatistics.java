package com.fantasy.football.model;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "PLYR_FANT_STCS")
public class PlayerFantasyStatistics {

    private PlayerFantasyStatistics () {}

    private PlayerFantasyStatistics(PlayerBasicInformation playerCode, Integer chanceOfPlayingNextRound, Integer chanceOfPlayingThisRound, Integer dreamTeamCount, Float expectedPointsNext, Float expectedPointsThis, Integer eventPoints, Boolean isInDreamTeam, Float form, Integer nowCost, Float pointsPerGame, Float selectedByPercent, Integer totalPoints, Long transfersIn, Long transfersOut, Float valueForm, Float valueSeason, Integer bonus, Integer bps, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float expectedGoalsPer90, Float expectedAssistsPer90, Float expectedGoalInvolvementsPer90, Float expectedGoalConcededPer90) {
        this.playerCode = playerCode;
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
    @OneToOne(optional = false)
    @JoinColumns(value = {
            @JoinColumn(name = "PLYR_CODE", referencedColumnName = "code"),
            @JoinColumn(name = "PLYR_UUID", referencedColumnName = "recordId"),
            @JoinColumn(name = "PLYR_FRST_NAME", referencedColumnName = "FRST_NAME"),
            @JoinColumn(name = "PLYR_SECD_NAME", referencedColumnName = "SECD_NAME")
    })
    private PlayerBasicInformation playerCode;
    @Column(name = "CHNC_OF_PLYNG_NXT_RD")
    private Integer chanceOfPlayingNextRound;
    @Column(name = "CHNC_OF_PLYNG_CURR_RD")
    private Integer chanceOfPlayingThisRound;
    @Column(name = "DREAM_TM_CT")
    private Integer dreamTeamCount;
    @Column(name = "EXP_PNTS_NXT")
    private Float expectedPointsNext;
    @Column(name = "EXP_PNTS_CURR")
    private Float expectedPointsThis;
    @Column(name = "EVT_PNTS")
    private Integer eventPoints;
    @Column(name = "IS_IN_DREAM_TM")
    private Boolean isInDreamTeam;
    private Float form;
    @Column(name = "CURR_COST")
    private Integer nowCost;
    @Column(name = "PNTS_PER_GAME")
    private Float pointsPerGame;
    @Column(name = "SEL_BY_PRCT")
    private Float selectedByPercent;
    @Column(name = "TOTAL_PNTS")
    private Integer totalPoints;
    @Column(name = "TRNFR_IN")
    private Long transfersIn;
    @Column(name = "TRNFR_OUT")
    private Long transfersOut;
    @Column(name = "VAL_FROM")
    private Float valueForm;
    @Column(name = "VAL_SEASN")
    private Float valueSeason;
    private Integer bonus;
    private Integer bps;
    @Column(name = "EXP_GOALS")
    private Float expectedGoals;
    @Column(name = "EXP_ASSTS")
    private Float expectedAssists;
    @Column(name = "EXP_GOAL_INVLMTS")
    private Float expectedGoalInvolvements;
    @Column(name = "EXP_GOALS_CNCDED")
    private Float expectedGoalsConceded;
    @Column(name = "EXP_GOALS_90")
    private Float expectedGoalsPer90;
    @Column(name = "EXP_ASSTS_90")
    private Float expectedAssistsPer90;
    @Column(name = "EXP_GOAL_INVLMTS_90")
    private Float expectedGoalInvolvementsPer90;
    @Column(name = "EXP_GOALS_CNCDED_90")
    private Float expectedGoalConcededPer90;
    @Version
    private long versionNumber;

    public PlayerBasicInformation getPlayerCode() {
        return playerCode;
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

    void setPlayerCode(PlayerBasicInformation playerCode) {
        this.playerCode = playerCode;
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
        private PlayerBasicInformation playerCode;
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

        public Builder playerCode(PlayerBasicInformation playerCode) {
            this.playerCode = playerCode;
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
            return new PlayerFantasyStatistics(this.playerCode, this.chanceOfPlayingNextRound, this.chanceOfPlayingThisRound, this.dreamTeamCount, this.expectedPointsNext, this.expectedPointsThis, this.eventPoints, this.isInDreamTeam, this.form, this.nowCost, this.pointsPerGame, this.selectedByPercent, this.totalPoints, this.transfersIn, this.transfersOut, this.valueForm, this.valueSeason, this.bonus, this.bps, this.expectedGoals, this.expectedAssists, this.expectedGoalInvolvements, this.expectedGoalsConceded, this.expectedGoalsPer90, this.expectedAssistsPer90, this.expectedGoalInvolvementsPer90, this.expectedGoalConcededPer90);
        }
    }
}