package com.fantasy.football.model;

import jakarta.validation.constraints.PastOrPresent;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;
import java.util.UUID;

@Table(name = "PLYR_MISC_INFO")
public class PlayerMiscellaneousInformation {

    private PlayerMiscellaneousInformation() {}

    public PlayerMiscellaneousInformation(UUID recordId, String news, OffsetDateTime newsAdded, Float ictIndex, Integer influenceRank, Integer influenceRankType, Integer creativityRank, Integer creativityRankType, Integer threatRank, Integer threatRankType, Integer ictIndexRank, Integer ictIndexRankType, String cornersAndIndirectFreeKicksOrder, String cornersAndIndirectFreeKicksText, String directFreeKicksOrder, String directFreeKicksText, String penaltiesOrder, String penaltiesText, Integer nowCostRank, Integer nowCostRankType, Integer formRank, Integer formRankType, Integer pointsPerGameRank, Integer pointsPerGameRankType, Integer selectedRank, Integer selectedRankType, long versionNumber) {
        this.recordId = recordId;
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
        this.versionNumber = versionNumber;
    }

    @PersistenceCreator
    public PlayerMiscellaneousInformation(UUID recordId, String news, OffsetDateTime newsAdded, Float ictIndex, Integer influenceRank, Integer influenceRankType, Integer creativityRank, Integer creativityRankType, Integer threatRank, Integer threatRankType, Integer ictIndexRank, Integer ictIndexRankType, String cornersAndIndirectFreeKicksOrder, String cornersAndIndirectFreeKicksText, String directFreeKicksOrder, String directFreeKicksText, String penaltiesOrder, String penaltiesText, Integer nowCostRank, Integer nowCostRankType, Integer formRank, Integer formRankType, Integer pointsPerGameRank, Integer pointsPerGameRankType, Integer selectedRank, Integer selectedRankType) {
        this.recordId = recordId;
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
    private UUID recordId;
    private String news;
    @PastOrPresent
    private OffsetDateTime newsAdded;
    @Column(value = "ICT_INDX")
    private Float ictIndex;
    private Integer influenceRank;
    private Integer influenceRankType;
    private Integer creativityRank;
    private Integer creativityRankType;
    private Integer threatRank;
    private Integer threatRankType;
    private Integer ictIndexRank;
    private Integer ictIndexRankType;
    @Column(value = "CRNRS_AND_INDR_FK_ORDR")
    private String cornersAndIndirectFreeKicksOrder;
    @Column(value = "CRNRS_AND_INDR_FK_TX")
    private String cornersAndIndirectFreeKicksText;
    @Column(value = "DR_FK_ORDR")
    private String directFreeKicksOrder;
    @Column(value = "DR_FK_TX")
    private String directFreeKicksText;
    @Column(value = "PEN_ORDR")
    private String penaltiesOrder;
    @Column(value = "PEN_TX")
    private String penaltiesText;
    @Column(value = "CURR_COST_RANK")
    private Integer nowCostRank;
    @Column(value = "CURR_COST_RANK_TYPE")
    private Integer nowCostRankType;
    private Integer formRank;
    private Integer formRankType;
    @Column(value = "PNTS_PER_GAME_RANK")
    private Integer pointsPerGameRank;
    @Column(value = "PNTS_PER_GAME_RANK_TYPE")
    private Integer pointsPerGameRankType;
    @Column(value = "SEL_RANK")
    private Integer selectedRank;
    @Column(value = "SEL_RANK_TYPE")
    private Integer selectedRankType;
    @Version
    private long versionNumber;

    public UUID getRecordId() {
        return recordId;
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

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setRecordId(UUID recordId) {
        this.recordId = recordId;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void setNewsAdded(OffsetDateTime newsAdded) {
        this.newsAdded = newsAdded;
    }

    public void setIctIndex(Float ictIndex) {
        this.ictIndex = ictIndex;
    }

    public void setInfluenceRank(Integer influenceRank) {
        this.influenceRank = influenceRank;
    }

    public void setInfluenceRankType(Integer influenceRankType) {
        this.influenceRankType = influenceRankType;
    }

    public void setCreativityRank(Integer creativityRank) {
        this.creativityRank = creativityRank;
    }

    public void setCreativityRankType(Integer creativityRankType) {
        this.creativityRankType = creativityRankType;
    }

    public void setThreatRank(Integer threatRank) {
        this.threatRank = threatRank;
    }

    public void setThreatRankType(Integer threatRankType) {
        this.threatRankType = threatRankType;
    }

    public void setIctIndexRank(Integer ictIndexRank) {
        this.ictIndexRank = ictIndexRank;
    }

    public void setIctIndexRankType(Integer ictIndexRankType) {
        this.ictIndexRankType = ictIndexRankType;
    }

    public void setCornersAndIndirectFreeKicksOrder(String cornersAndIndirectFreeKicksOrder) {
        this.cornersAndIndirectFreeKicksOrder = cornersAndIndirectFreeKicksOrder;
    }

    public void setCornersAndIndirectFreeKicksText(String cornersAndIndirectFreeKicksText) {
        this.cornersAndIndirectFreeKicksText = cornersAndIndirectFreeKicksText;
    }

    public void setDirectFreeKicksOrder(String directFreeKicksOrder) {
        this.directFreeKicksOrder = directFreeKicksOrder;
    }

    public void setDirectFreeKicksText(String directFreeKicksText) {
        this.directFreeKicksText = directFreeKicksText;
    }

    public void setPenaltiesOrder(String penaltiesOrder) {
        this.penaltiesOrder = penaltiesOrder;
    }

    public void setPenaltiesText(String penaltiesText) {
        this.penaltiesText = penaltiesText;
    }

    public void setNowCostRank(Integer nowCostRank) {
        this.nowCostRank = nowCostRank;
    }

    public void setNowCostRankType(Integer nowCostRankType) {
        this.nowCostRankType = nowCostRankType;
    }

    public void setFormRank(Integer formRank) {
        this.formRank = formRank;
    }

    public void setFormRankType(Integer formRankType) {
        this.formRankType = formRankType;
    }

    public void setPointsPerGameRank(Integer pointsPerGameRank) {
        this.pointsPerGameRank = pointsPerGameRank;
    }

    public void setPointsPerGameRankType(Integer pointsPerGameRankType) {
        this.pointsPerGameRankType = pointsPerGameRankType;
    }

    public void setSelectedRank(Integer selectedRank) {
        this.selectedRank = selectedRank;
    }

    public void setSelectedRankType(Integer selectedRankType) {
        this.selectedRankType = selectedRankType;
    }

    public static class Builder {
        private UUID recordId;
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

        public Builder recordId(UUID recordId) {
            this.recordId = recordId;
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
            return new PlayerMiscellaneousInformation(this.recordId, this.news, this.newsAdded, this.ictIndex, this.influenceRank, this.influenceRankType, this.creativityRank, this.creativityRankType, this.threatRank, this.threatRankType, this.ictIndexRank, this.ictIndexRankType, this.cornersAndIndirectFreeKicksOrder, this.cornersAndIndirectFreeKicksText, this.directFreeKicksOrder, this.directFreeKicksText, this.penaltiesOrder, this.penaltiesText, this.nowCostRank, this.nowCostRankType, this.formRank, this.formRankType, this.pointsPerGameRank, this.pointsPerGameRankType, this.selectedRank, this.selectedRankType);
        }
    }
}