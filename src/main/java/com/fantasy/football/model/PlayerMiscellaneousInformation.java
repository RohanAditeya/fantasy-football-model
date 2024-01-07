package com.fantasy.football.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "PLYR_MISC_INFO")
public class PlayerMiscellaneousInformation {

    private PlayerMiscellaneousInformation () {}

    public PlayerMiscellaneousInformation(PlayerBasicInformation playerCode, String news, OffsetDateTime newsAdded, Float ictIndex, Integer influenceRank, Integer influenceRankType, Integer creativityRank, Integer creativityRankType, Integer threatRank, Integer threatRankType, Integer ictIndexRank, Integer ictIndexRankType, String cornersAndIndirectFreeKicksOrder, String cornersAndIndirectFreeKicksText, String directFreeKicksOrder, String directFreeKicksText, String penaltiesOrder, String penaltiesText, Integer nowCostRank, Integer nowCostRankType, Integer formRank, Integer formRankType, Integer pointsPerGameRank, Integer pointsPerGameRankType, Integer selectedRank, Integer selectedRankType) {
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
    @JoinColumn(name = "PLYR_CODE ", referencedColumnName = "CODE")
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

    public void setPlayerCode(PlayerBasicInformation playerCode) {
        this.playerCode = playerCode;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public OffsetDateTime getNewsAdded() {
        return newsAdded;
    }

    public void setNewsAdded(OffsetDateTime newsAdded) {
        this.newsAdded = newsAdded;
    }

    public Float getIctIndex() {
        return ictIndex;
    }

    public void setIctIndex(Float ictIndex) {
        this.ictIndex = ictIndex;
    }

    public Integer getInfluenceRank() {
        return influenceRank;
    }

    public void setInfluenceRank(Integer influenceRank) {
        this.influenceRank = influenceRank;
    }

    public Integer getInfluenceRankType() {
        return influenceRankType;
    }

    public void setInfluenceRankType(Integer influenceRankType) {
        this.influenceRankType = influenceRankType;
    }

    public Integer getCreativityRank() {
        return creativityRank;
    }

    public void setCreativityRank(Integer creativityRank) {
        this.creativityRank = creativityRank;
    }

    public Integer getCreativityRankType() {
        return creativityRankType;
    }

    public void setCreativityRankType(Integer creativityRankType) {
        this.creativityRankType = creativityRankType;
    }

    public Integer getThreatRank() {
        return threatRank;
    }

    public void setThreatRank(Integer threatRank) {
        this.threatRank = threatRank;
    }

    public Integer getThreatRankType() {
        return threatRankType;
    }

    public void setThreatRankType(Integer threatRankType) {
        this.threatRankType = threatRankType;
    }

    public Integer getIctIndexRank() {
        return ictIndexRank;
    }

    public void setIctIndexRank(Integer ictIndexRank) {
        this.ictIndexRank = ictIndexRank;
    }

    public Integer getIctIndexRankType() {
        return ictIndexRankType;
    }

    public void setIctIndexRankType(Integer ictIndexRankType) {
        this.ictIndexRankType = ictIndexRankType;
    }

    public String getCornersAndIndirectFreeKicksOrder() {
        return cornersAndIndirectFreeKicksOrder;
    }

    public void setCornersAndIndirectFreeKicksOrder(String cornersAndIndirectFreeKicksOrder) {
        this.cornersAndIndirectFreeKicksOrder = cornersAndIndirectFreeKicksOrder;
    }

    public String getCornersAndIndirectFreeKicksText() {
        return cornersAndIndirectFreeKicksText;
    }

    public void setCornersAndIndirectFreeKicksText(String cornersAndIndirectFreeKicksText) {
        this.cornersAndIndirectFreeKicksText = cornersAndIndirectFreeKicksText;
    }

    public String getDirectFreeKicksOrder() {
        return directFreeKicksOrder;
    }

    public void setDirectFreeKicksOrder(String directFreeKicksOrder) {
        this.directFreeKicksOrder = directFreeKicksOrder;
    }

    public String getDirectFreeKicksText() {
        return directFreeKicksText;
    }

    public void setDirectFreeKicksText(String directFreeKicksText) {
        this.directFreeKicksText = directFreeKicksText;
    }

    public String getPenaltiesOrder() {
        return penaltiesOrder;
    }

    public void setPenaltiesOrder(String penaltiesOrder) {
        this.penaltiesOrder = penaltiesOrder;
    }

    public String getPenaltiesText() {
        return penaltiesText;
    }

    public void setPenaltiesText(String penaltiesText) {
        this.penaltiesText = penaltiesText;
    }

    public Integer getNowCostRank() {
        return nowCostRank;
    }

    public void setNowCostRank(Integer nowCostRank) {
        this.nowCostRank = nowCostRank;
    }

    public Integer getNowCostRankType() {
        return nowCostRankType;
    }

    public void setNowCostRankType(Integer nowCostRankType) {
        this.nowCostRankType = nowCostRankType;
    }

    public Integer getFormRank() {
        return formRank;
    }

    public void setFormRank(Integer formRank) {
        this.formRank = formRank;
    }

    public Integer getFormRankType() {
        return formRankType;
    }

    public void setFormRankType(Integer formRankType) {
        this.formRankType = formRankType;
    }

    public Integer getPointsPerGameRank() {
        return pointsPerGameRank;
    }

    public void setPointsPerGameRank(Integer pointsPerGameRank) {
        this.pointsPerGameRank = pointsPerGameRank;
    }

    public Integer getPointsPerGameRankType() {
        return pointsPerGameRankType;
    }

    public void setPointsPerGameRankType(Integer pointsPerGameRankType) {
        this.pointsPerGameRankType = pointsPerGameRankType;
    }

    public Integer getSelectedRank() {
        return selectedRank;
    }

    public void setSelectedRank(Integer selectedRank) {
        this.selectedRank = selectedRank;
    }

    public Integer getSelectedRankType() {
        return selectedRankType;
    }

    public void setSelectedRankType(Integer selectedRankType) {
        this.selectedRankType = selectedRankType;
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

        public Builder setPlayerCode(PlayerBasicInformation playerCode) {
            this.playerCode = playerCode;
            return this;
        }

        public Builder setNews(String news) {
            this.news = news;
            return this;
        }

        public Builder setNewsAdded(OffsetDateTime newsAdded) {
            this.newsAdded = newsAdded;
            return this;
        }

        public Builder setIctIndex(Float ictIndex) {
            this.ictIndex = ictIndex;
            return this;
        }

        public Builder setInfluenceRank(Integer influenceRank) {
            this.influenceRank = influenceRank;
            return this;
        }

        public Builder setInfluenceRankType(Integer influenceRankType) {
            this.influenceRankType = influenceRankType;
            return this;
        }

        public Builder setCreativityRank(Integer creativityRank) {
            this.creativityRank = creativityRank;
            return this;
        }

        public Builder setCreativityRankType(Integer creativityRankType) {
            this.creativityRankType = creativityRankType;
            return this;
        }

        public Builder setThreatRank(Integer threatRank) {
            this.threatRank = threatRank;
            return this;
        }

        public Builder setThreatRankType(Integer threatRankType) {
            this.threatRankType = threatRankType;
            return this;
        }

        public Builder setIctIndexRank(Integer ictIndexRank) {
            this.ictIndexRank = ictIndexRank;
            return this;
        }

        public Builder setIctIndexRankType(Integer ictIndexRankType) {
            this.ictIndexRankType = ictIndexRankType;
            return this;
        }

        public Builder setCornersAndIndirectFreeKicksOrder(String cornersAndIndirectFreeKicksOrder) {
            this.cornersAndIndirectFreeKicksOrder = cornersAndIndirectFreeKicksOrder;
            return this;
        }

        public Builder setCornersAndIndirectFreeKicksText(String cornersAndIndirectFreeKicksText) {
            this.cornersAndIndirectFreeKicksText = cornersAndIndirectFreeKicksText;
            return this;
        }

        public Builder setDirectFreeKicksOrder(String directFreeKicksOrder) {
            this.directFreeKicksOrder = directFreeKicksOrder;
            return this;
        }

        public Builder setDirectFreeKicksText(String directFreeKicksText) {
            this.directFreeKicksText = directFreeKicksText;
            return this;
        }

        public Builder setPenaltiesOrder(String penaltiesOrder) {
            this.penaltiesOrder = penaltiesOrder;
            return this;
        }

        public Builder setPenaltiesText(String penaltiesText) {
            this.penaltiesText = penaltiesText;
            return this;
        }

        public Builder setNowCostRank(Integer nowCostRank) {
            this.nowCostRank = nowCostRank;
            return this;
        }

        public Builder setNowCostRankType(Integer nowCostRankType) {
            this.nowCostRankType = nowCostRankType;
            return this;
        }

        public Builder setFormRank(Integer formRank) {
            this.formRank = formRank;
            return this;
        }

        public Builder setFormRankType(Integer formRankType) {
            this.formRankType = formRankType;
            return this;
        }

        public Builder setPointsPerGameRank(Integer pointsPerGameRank) {
            this.pointsPerGameRank = pointsPerGameRank;
            return this;
        }

        public Builder setPointsPerGameRankType(Integer pointsPerGameRankType) {
            this.pointsPerGameRankType = pointsPerGameRankType;
            return this;
        }

        public Builder setSelectedRank(Integer selectedRank) {
            this.selectedRank = selectedRank;
            return this;
        }

        public Builder setSelectedRankType(Integer selectedRankType) {
            this.selectedRankType = selectedRankType;
            return this;
        }

        public PlayerMiscellaneousInformation build () {
            return new PlayerMiscellaneousInformation(
                    this.playerCode, this.news, this.newsAdded, this.ictIndex, this.influenceRank, this.influenceRankType, this.creativityRank, this.creativityRankType
                    , this.threatRank, this.threatRankType, this.ictIndexRank, this.ictIndexRankType, this.cornersAndIndirectFreeKicksOrder, this.cornersAndIndirectFreeKicksText
                    , this.directFreeKicksOrder, this.directFreeKicksText, this.penaltiesOrder, this.penaltiesText, this.nowCostRank, this.nowCostRankType
                    , this.formRank, this.formRankType, this.pointsPerGameRank, this.pointsPerGameRankType, this.selectedRank, this.selectedRankType
            );
        }
    }
}