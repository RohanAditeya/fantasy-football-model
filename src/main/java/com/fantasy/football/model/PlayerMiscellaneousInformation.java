package com.fantasy.football.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.DynamicUpdate;

import java.time.OffsetDateTime;

@Entity
@DynamicUpdate
@Table(name = "PLYR_MISC_INFO")
public class PlayerMiscellaneousInformation {

    private PlayerMiscellaneousInformation () {}

    private PlayerMiscellaneousInformation(PlayerBasicInformation playerCode, String news, OffsetDateTime newsAdded, Float ictIndex, Integer influenceRank, Integer influenceRankType, Integer creativityRank, Integer creativityRankType, Integer threatRank, Integer threatRankType, Integer ictIndexRank, Integer ictIndexRankType, String cornersAndIndirectFreeKicksOrder, String cornersAndIndirectFreeKicksText, String directFreeKicksOrder, String directFreeKicksText, String penaltiesOrder, String penaltiesText, Integer nowCostRank, Integer nowCostRankType, Integer formRank, Integer formRankType, Integer pointsPerGameRank, Integer pointsPerGameRankType, Integer selectedRank, Integer selectedRankType) {
        this.playerCode = playerCode;
        this.news = news;
        this.newsAdded = newsAdded;
        this.ictIndex = ictIndex;
        this.influenceRank = influenceRank;
        this.influenceRankType = influenceRankType;
        this.creativityRank = creativityRank;
        this.creativityRankType = creativityRankType;
        this.threatRank = threatRank;
        this.threatRankType = threatRankType;
        this.ictIndexRank = ictIndexRank;
        this.ictIndexRankType = ictIndexRankType;
        this.cornersAndIndirectFreeKicksOrder = cornersAndIndirectFreeKicksOrder;
        this.cornersAndIndirectFreeKicksText = cornersAndIndirectFreeKicksText;
        this.directFreeKicksOrder = directFreeKicksOrder;
        this.directFreeKicksText = directFreeKicksText;
        this.penaltiesOrder = penaltiesOrder;
        this.penaltiesText = penaltiesText;
        this.nowCostRank = nowCostRank;
        this.nowCostRankType = nowCostRankType;
        this.formRank = formRank;
        this.formRankType = formRankType;
        this.pointsPerGameRank = pointsPerGameRank;
        this.pointsPerGameRankType = pointsPerGameRankType;
        this.selectedRank = selectedRank;
        this.selectedRankType = selectedRankType;
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
    private String news;
    @PastOrPresent
    private OffsetDateTime newsAdded;
    @Column(name = "ICT_INDX")
    private Float ictIndex;
    private Integer influenceRank;
    private Integer influenceRankType;
    private Integer creativityRank;
    private Integer creativityRankType;
    private Integer threatRank;
    private Integer threatRankType;
    private Integer ictIndexRank;
    private Integer ictIndexRankType;
    @Column(name = "CRNRS_AND_INDR_FK_ORDR")
    private String cornersAndIndirectFreeKicksOrder;
    @Column(name = "CRNRS_AND_INDR_FK_TX")
    private String cornersAndIndirectFreeKicksText;
    @Column(name = "DR_FK_ORDR")
    private String directFreeKicksOrder;
    @Column(name = "DR_FK_TX")
    private String directFreeKicksText;
    @Column(name = "PEN_ORDR")
    private String penaltiesOrder;
    @Column(name = "PEN_TX")
    private String penaltiesText;
    @Column(name = "CURR_COST_RANK")
    private Integer nowCostRank;
    @Column(name = "CURR_COST_RANK_TYPE")
    private Integer nowCostRankType;
    private Integer formRank;
    private Integer formRankType;
    @Column(name = "PNTS_PER_GAME_RANK")
    private Integer pointsPerGameRank;
    @Column(name = "PNTS_PER_GAME_RANK_TYPE")
    private Integer pointsPerGameRankType;
    @Column(name = "SEL_RANK")
    private Integer selectedRank;
    @Column(name = "SEL_RANK_TYPE")
    private Integer selectedRankType;

    public PlayerBasicInformation getPlayerCode() {
        return playerCode;
    }

    public String getNews() {
        return news;
    }

    public OffsetDateTime getNewsAdded() {
        return newsAdded;
    }

    public Float getIctIndex() {
        return ictIndex;
    }

    public Integer getInfluenceRank() {
        return influenceRank;
    }

    public Integer getInfluenceRankType() {
        return influenceRankType;
    }

    public Integer getCreativityRank() {
        return creativityRank;
    }

    public Integer getCreativityRankType() {
        return creativityRankType;
    }

    public Integer getThreatRank() {
        return threatRank;
    }

    public Integer getThreatRankType() {
        return threatRankType;
    }

    public Integer getIctIndexRank() {
        return ictIndexRank;
    }

    public Integer getIctIndexRankType() {
        return ictIndexRankType;
    }

    public String getCornersAndIndirectFreeKicksOrder() {
        return cornersAndIndirectFreeKicksOrder;
    }

    public String getCornersAndIndirectFreeKicksText() {
        return cornersAndIndirectFreeKicksText;
    }

    public String getDirectFreeKicksOrder() {
        return directFreeKicksOrder;
    }

    public String getDirectFreeKicksText() {
        return directFreeKicksText;
    }

    public String getPenaltiesOrder() {
        return penaltiesOrder;
    }

    public String getPenaltiesText() {
        return penaltiesText;
    }

    public Integer getNowCostRank() {
        return nowCostRank;
    }

    public Integer getNowCostRankType() {
        return nowCostRankType;
    }

    public Integer getFormRank() {
        return formRank;
    }

    public Integer getFormRankType() {
        return formRankType;
    }

    public Integer getPointsPerGameRank() {
        return pointsPerGameRank;
    }

    public Integer getPointsPerGameRankType() {
        return pointsPerGameRankType;
    }

    public Integer getSelectedRank() {
        return selectedRank;
    }

    public Integer getSelectedRankType() {
        return selectedRankType;
    }

    void setPlayerCode(PlayerBasicInformation playerCode) {
        this.playerCode = playerCode;
    }

    public static class Builder {
        private PlayerBasicInformation playerCode;
        private String news;
        private OffsetDateTime newsAdded;
        private Float ictIndex;
        private Integer influenceRank;
        private Integer influenceRankType;
        private Integer creativityRank;
        private Integer creativityRankType;
        private Integer threatRank;
        private Integer threatRankType;
        private Integer ictIndexRank;
        private Integer ictIndexRankType;
        private String cornersAndIndirectFreeKicksOrder;
        private String cornersAndIndirectFreeKicksText;
        private String directFreeKicksOrder;
        private String directFreeKicksText;
        private String penaltiesOrder;
        private String penaltiesText;
        private Integer nowCostRank;
        private Integer nowCostRankType;
        private Integer formRank;
        private Integer formRankType;
        private Integer pointsPerGameRank;
        private Integer pointsPerGameRankType;
        private Integer selectedRank;
        private Integer selectedRankType;

        public Builder playerCode(PlayerBasicInformation playerCode) {
            this.playerCode = playerCode;
            return this;
        }

        public Builder news(String news) {
            this.news = news;
            return this;
        }

        public Builder newsAdded(OffsetDateTime newsAdded) {
            this.newsAdded = newsAdded;
            return this;
        }

        public Builder ictIndex(Float ictIndex) {
            this.ictIndex = ictIndex;
            return this;
        }

        public Builder influenceRank(Integer influenceRank) {
            this.influenceRank = influenceRank;
            return this;
        }

        public Builder influenceRankType(Integer influenceRankType) {
            this.influenceRankType = influenceRankType;
            return this;
        }

        public Builder creativityRank(Integer creativityRank) {
            this.creativityRank = creativityRank;
            return this;
        }

        public Builder creativityRankType(Integer creativityRankType) {
            this.creativityRankType = creativityRankType;
            return this;
        }

        public Builder threatRank(Integer threatRank) {
            this.threatRank = threatRank;
            return this;
        }

        public Builder threatRankType(Integer threatRankType) {
            this.threatRankType = threatRankType;
            return this;
        }

        public Builder ictIndexRank(Integer ictIndexRank) {
            this.ictIndexRank = ictIndexRank;
            return this;
        }

        public Builder ictIndexRankType(Integer ictIndexRankType) {
            this.ictIndexRankType = ictIndexRankType;
            return this;
        }

        public Builder cornersAndIndirectFreeKicksOrder(String cornersAndIndirectFreeKicksOrder) {
            this.cornersAndIndirectFreeKicksOrder = cornersAndIndirectFreeKicksOrder;
            return this;
        }

        public Builder cornersAndIndirectFreeKicksText(String cornersAndIndirectFreeKicksText) {
            this.cornersAndIndirectFreeKicksText = cornersAndIndirectFreeKicksText;
            return this;
        }

        public Builder directFreeKicksOrder(String directFreeKicksOrder) {
            this.directFreeKicksOrder = directFreeKicksOrder;
            return this;
        }

        public Builder directFreeKicksText(String directFreeKicksText) {
            this.directFreeKicksText = directFreeKicksText;
            return this;
        }

        public Builder penaltiesOrder(String penaltiesOrder) {
            this.penaltiesOrder = penaltiesOrder;
            return this;
        }

        public Builder penaltiesText(String penaltiesText) {
            this.penaltiesText = penaltiesText;
            return this;
        }

        public Builder nowCostRank(Integer nowCostRank) {
            this.nowCostRank = nowCostRank;
            return this;
        }

        public Builder nowCostRankType(Integer nowCostRankType) {
            this.nowCostRankType = nowCostRankType;
            return this;
        }

        public Builder formRank(Integer formRank) {
            this.formRank = formRank;
            return this;
        }

        public Builder formRankType(Integer formRankType) {
            this.formRankType = formRankType;
            return this;
        }

        public Builder pointsPerGameRank(Integer pointsPerGameRank) {
            this.pointsPerGameRank = pointsPerGameRank;
            return this;
        }

        public Builder pointsPerGameRankType(Integer pointsPerGameRankType) {
            this.pointsPerGameRankType = pointsPerGameRankType;
            return this;
        }

        public Builder selectedRank(Integer selectedRank) {
            this.selectedRank = selectedRank;
            return this;
        }

        public Builder selectedRankType(Integer selectedRankType) {
            this.selectedRankType = selectedRankType;
            return this;
        }

        public PlayerMiscellaneousInformation build () {
            return new PlayerMiscellaneousInformation(this.playerCode, this.news, this.newsAdded, this.ictIndex, this.influenceRank, this.influenceRankType, this.creativityRank, this.creativityRankType, this.threatRank, this.threatRankType, this.ictIndexRank, this.ictIndexRankType, this.cornersAndIndirectFreeKicksOrder, this.cornersAndIndirectFreeKicksText, this.directFreeKicksOrder, this.directFreeKicksText, this.penaltiesOrder, this.penaltiesText, this.nowCostRank, this.nowCostRankType, this.formRank, this.formRankType, this.pointsPerGameRank, this.pointsPerGameRankType, this.selectedRank, this.selectedRankType);
        }
    }
}