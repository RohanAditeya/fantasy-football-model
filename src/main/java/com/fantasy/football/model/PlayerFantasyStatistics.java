package com.fantasy.football.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLYR_FANT_STCS")
public class PlayerFantasyStatistics {

    private PlayerFantasyStatistics () {}

    public PlayerFantasyStatistics(PlayerBasicInformation playerCode, Integer chanceOfPlayingNextRound, Integer chanceOfPlayingThisRound, Integer dreamTeamCount, Float expectedPointsNext, Float expectedPointsThis, Integer eventPoints, Boolean isInDreamTeam, Float form, Integer nowCost, Float pointsPerGame, Float selectedByPercent, Integer totalPoints, Long transfersIn, Long transfersOut, Float valueForm, Float valueSeason, Integer bonus, Integer bps, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float expectedGoalsPer90, Float expectedAssistsPer90, Float expectedGoalInvolvementsPer90, Float expectedGoalConcededPer90) {
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
    @JoinColumn(name = "PLYR_CODE", referencedColumnName = "CODE")
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

    public PlayerBasicInformation getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(PlayerBasicInformation playerCode) {
        this.playerCode = playerCode;
    }

    public Integer getChanceOfPlayingNextRound() {
        return chanceOfPlayingNextRound;
    }

    public void setChanceOfPlayingNextRound(Integer chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
    }

    public Integer getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    public void setChanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
    }

    public Integer getDreamTeamCount() {
        return dreamTeamCount;
    }

    public void setDreamTeamCount(Integer dreamTeamCount) {
        this.dreamTeamCount = dreamTeamCount;
    }

    public Float getExpectedPointsNext() {
        return expectedPointsNext;
    }

    public void setExpectedPointsNext(Float expectedPointsNext) {
        this.expectedPointsNext = expectedPointsNext;
    }

    public Float getExpectedPointsThis() {
        return expectedPointsThis;
    }

    public void setExpectedPointsThis(Float expectedPointsThis) {
        this.expectedPointsThis = expectedPointsThis;
    }

    public Integer getEventPoints() {
        return eventPoints;
    }

    public void setEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
    }

    public Boolean getInDreamTeam() {
        return isInDreamTeam;
    }

    public void setInDreamTeam(Boolean inDreamTeam) {
        isInDreamTeam = inDreamTeam;
    }

    public Float getForm() {
        return form;
    }

    public void setForm(Float form) {
        this.form = form;
    }

    public Float getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Float pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Float getSelectedByPercent() {
        return selectedByPercent;
    }

    public void setSelectedByPercent(Float selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Long getTransfersIn() {
        return transfersIn;
    }

    public void setTransfersIn(Long transfersIn) {
        this.transfersIn = transfersIn;
    }

    public Long getTransfersOut() {
        return transfersOut;
    }

    public void setTransfersOut(Long transfersOut) {
        this.transfersOut = transfersOut;
    }

    public Float getValueForm() {
        return valueForm;
    }

    public void setValueForm(Float valueForm) {
        this.valueForm = valueForm;
    }

    public Float getValueSeason() {
        return valueSeason;
    }

    public void setValueSeason(Float valueSeason) {
        this.valueSeason = valueSeason;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getBps() {
        return bps;
    }

    public void setBps(Integer bps) {
        this.bps = bps;
    }

    public Float getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Float expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Float getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Float expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public Float getExpectedGoalInvolvements() {
        return expectedGoalInvolvements;
    }

    public void setExpectedGoalInvolvements(Float expectedGoalInvolvements) {
        this.expectedGoalInvolvements = expectedGoalInvolvements;
    }

    public Float getExpectedGoalsConceded() {
        return expectedGoalsConceded;
    }

    public void setExpectedGoalsConceded(Float expectedGoalsConceded) {
        this.expectedGoalsConceded = expectedGoalsConceded;
    }

    public Float getExpectedGoalsPer90() {
        return expectedGoalsPer90;
    }

    public void setExpectedGoalsPer90(Float expectedGoalsPer90) {
        this.expectedGoalsPer90 = expectedGoalsPer90;
    }

    public Float getExpectedAssistsPer90() {
        return expectedAssistsPer90;
    }

    public void setExpectedAssistsPer90(Float expectedAssistsPer90) {
        this.expectedAssistsPer90 = expectedAssistsPer90;
    }

    public Float getExpectedGoalInvolvementsPer90() {
        return expectedGoalInvolvementsPer90;
    }

    public void setExpectedGoalInvolvementsPer90(Float expectedGoalInvolvementsPer90) {
        this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
    }

    public Float getExpectedGoalConcededPer90() {
        return expectedGoalConcededPer90;
    }

    public void setExpectedGoalConcededPer90(Float expectedGoalConcededPer90) {
        this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
    }

    public Integer getNowCost() {
        return nowCost;
    }

    public void setNowCost(Integer nowCost) {
        this.nowCost = nowCost;
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

        public Builder playerCode (PlayerBasicInformation playerCode) {
            this.playerCode = playerCode;
            return this;
        }

        public Builder chanceOfPlayingNextRound (Integer chanceOfPlayingNextRound) {
            this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
            return this;
        }

        public Builder chanceOfPlayingThisRound (Integer chanceOfPlayingThisRound) {
            this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
            return this;
        }

        public Builder dreamTeamCount (Integer dreamTeamCount) {
            this.dreamTeamCount = dreamTeamCount;
            return this;
        }

        public Builder expectedPointsNext (Float expectedPointsNext) {
            this.expectedPointsNext = expectedPointsNext;
            return this;
        }

        public Builder expectedPointsThis (Float expectedPointsThis) {
            this.expectedPointsThis = expectedPointsThis;
            return this;
        }

        public Builder eventPoints (Integer eventPoints) {
            this.eventPoints = eventPoints;
            return this;
        }

        public Builder isInDreamTeam (Boolean isInDreamTeam) {
            this.isInDreamTeam = isInDreamTeam;
            return this;
        }

        public Builder form (Float form) {
            this.form = form;
            return this;
        }

        public Builder setNowCost(Integer nowCost) {
            this.nowCost = nowCost;
            return this;
        }

        public Builder setPointsPerGame(Float pointsPerGame) {
            this.pointsPerGame = pointsPerGame;
            return this;
        }

        public Builder setSelectedByPercent(Float selectedByPercent) {
            this.selectedByPercent = selectedByPercent;
            return this;
        }

        public Builder setTotalPoints(Integer totalPoints) {
            this.totalPoints = totalPoints;
            return this;
        }

        public Builder setTransfersIn(Long transfersIn) {
            this.transfersIn = transfersIn;
            return this;
        }

        public Builder setTransfersOut(Long transfersOut) {
            this.transfersOut = transfersOut;
            return this;
        }

        public Builder setValueForm(Float valueForm) {
            this.valueForm = valueForm;
            return this;
        }

        public Builder setValueSeason(Float valueSeason) {
            this.valueSeason = valueSeason;
            return this;
        }

        public Builder setBonus(Integer bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder setBps(Integer bps) {
            this.bps = bps;
            return this;
        }

        public Builder setExpectedGoals(Float expectedGoals) {
            this.expectedGoals = expectedGoals;
            return this;
        }

        public Builder setExpectedAssists(Float expectedAssists) {
            this.expectedAssists = expectedAssists;
            return this;
        }

        public Builder setExpectedGoalInvolvements(Float expectedGoalInvolvements) {
            this.expectedGoalInvolvements = expectedGoalInvolvements;
            return this;
        }

        public Builder setExpectedGoalsConceded(Float expectedGoalsConceded) {
            this.expectedGoalsConceded = expectedGoalsConceded;
            return this;
        }

        public Builder setExpectedGoalsPer90(Float expectedGoalsPer90) {
            this.expectedGoalsPer90 = expectedGoalsPer90;
            return this;
        }

        public Builder setExpectedAssistsPer90(Float expectedAssistsPer90) {
            this.expectedAssistsPer90 = expectedAssistsPer90;
            return this;
        }

        public Builder setExpectedGoalInvolvementsPer90(Float expectedGoalInvolvementsPer90) {
            this.expectedGoalInvolvementsPer90 = expectedGoalInvolvementsPer90;
            return this;
        }

        public Builder setExpectedGoalConcededPer90(Float expectedGoalConcededPer90) {
            this.expectedGoalConcededPer90 = expectedGoalConcededPer90;
            return this;
        }

        public PlayerFantasyStatistics build () {
            return new PlayerFantasyStatistics(
                    this.playerCode, this.chanceOfPlayingNextRound, this.chanceOfPlayingThisRound, this.dreamTeamCount, this.expectedPointsNext
                    , this.expectedPointsThis, this.eventPoints, this.isInDreamTeam, this.form, this.nowCost, this.pointsPerGame, this.selectedByPercent
                    , this.totalPoints, this.transfersIn, this.transfersOut, this.valueForm, this.valueSeason, this.bonus, this.bps, this.expectedGoals
                    , this.expectedAssists, this.expectedGoalInvolvements, this.expectedGoalsConceded, this.expectedGoalsPer90, this.expectedAssistsPer90
                    , this.expectedGoalInvolvementsPer90, this.expectedGoalConcededPer90
            );
        }
    }
}