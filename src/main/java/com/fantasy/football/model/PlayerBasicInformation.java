package com.fantasy.football.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

@Entity
@Audited
@DynamicUpdate
@Table(name = "PLYR_BSC_INFO")
public class PlayerBasicInformation {

    protected PlayerBasicInformation () {}

    private PlayerBasicInformation(PlayerBasicInformationPrimaryKey compositeKey, Integer squadNumber, Character status, LeagueTeam team, String webName, PlayerFantasyStatistics playerFantasyStatistics, PlayerGameStatistics playerGameStatistics, PlayerMiscellaneousInformation playerMiscellaneousInformation) {
        this.compositeKey = compositeKey;
        this.squadNumber = squadNumber;
        this.status = status;
        this.team = team;
        this.webName = webName;
        this.playerFantasyStatistics = playerFantasyStatistics;
        this.playerGameStatistics = playerGameStatistics;
        this.playerMiscellaneousInformation = playerMiscellaneousInformation;
    }

    @EmbeddedId
    @GeneratedValue(generator = "basicInformationKeyGenerator")
    @GenericGenerator(
            name = "basicInformationKeyGenerator",
            type = PlayerBasicInformationPrimaryKeyGenerator.class
    )
    private PlayerBasicInformationPrimaryKey compositeKey;
    @Positive
    @Column(name = "SQD_NO")
    private Integer squadNumber;
    @Column(name = "PLYR_STS")
    private Character status;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumns(value = {
            @JoinColumn(name = "TEAM_CODE", referencedColumnName = "code"),
            @JoinColumn(name = "TEAM_NAME", referencedColumnName = "name"),
            @JoinColumn(name = "TEAM_UUID", referencedColumnName = "recordId")
    })
    private LeagueTeam team;
    @NotNull
    @Column(name = "WEB_NAME", length = 15)
    private String webName;
    @JoinColumn(name = "PLYR_FANT_STCS_PK", referencedColumnName = "recordId")
    @OneToOne(orphanRemoval = true, cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, optional = false)
    private PlayerFantasyStatistics playerFantasyStatistics;
    @JoinColumn(name = "PLYR_GAME_STCS_PK", referencedColumnName = "recordId")
    @OneToOne(orphanRemoval = true, cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, optional = false)
    private PlayerGameStatistics playerGameStatistics;
    @JoinColumn(name = "PLYR_MISC_INFO_PK", referencedColumnName = "recordId")
    @OneToOne(orphanRemoval = true, cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, optional = false)
    private PlayerMiscellaneousInformation playerMiscellaneousInformation;
    @Version
    private long versionNumber;

    public PlayerBasicInformationPrimaryKey getCompositeKey() {
        return compositeKey;
    }

    public Integer getSquadNumber() {
        return squadNumber;
    }

    public Character getStatus() {
        return status;
    }

    public LeagueTeam getTeam() {
        return team;
    }

    public String getWebName() {
        return webName;
    }

    public PlayerFantasyStatistics getPlayerFantasyStatistics() {
        return playerFantasyStatistics;
    }

    public PlayerGameStatistics getPlayerGameStatistics() {
        return playerGameStatistics;
    }

    public PlayerMiscellaneousInformation getPlayerMiscellaneousInformation() {
        return playerMiscellaneousInformation;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setSquadNumber(Integer squadNumber) {
        this.squadNumber = squadNumber;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public void setTeam(LeagueTeam team) {
        this.team = team;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public void setPlayerFantasyStatistics(PlayerFantasyStatistics playerFantasyStatistics) {
        this.playerFantasyStatistics = playerFantasyStatistics;
    }

    public void setPlayerGameStatistics(PlayerGameStatistics playerGameStatistics) {
        this.playerGameStatistics = playerGameStatistics;
    }

    public void setPlayerMiscellaneousInformation(PlayerMiscellaneousInformation playerMiscellaneousInformation) {
        this.playerMiscellaneousInformation = playerMiscellaneousInformation;
    }

    public static class Builder {
        private PlayerBasicInformationPrimaryKey compositeKey;
        private Integer squadNumber;
        private Character status;
        private LeagueTeam team;
        private String webName;
        private PlayerFantasyStatistics playerFantasyStatistics;
        private PlayerGameStatistics playerGameStatistics;
        private PlayerMiscellaneousInformation playerMiscellaneousInformation;

        public Builder compositeKey(PlayerBasicInformationPrimaryKey compositeKey) {
            this.compositeKey = compositeKey;
            return this;
        }

        public Builder squadNumber(Integer squadNumber) {
            this.squadNumber = squadNumber;
            return this;
        }

        public Builder status(Character status) {
            this.status = status;
            return this;
        }

        public Builder team(LeagueTeam team) {
            this.team = team;
            return this;
        }

        public Builder webName(String webName) {
            this.webName = webName;
            return this;
        }

        public Builder playerFantasyStatistics(PlayerFantasyStatistics playerFantasyStatistics) {
            this.playerFantasyStatistics = playerFantasyStatistics;
            return this;
        }

        public Builder playerGameStatistics(PlayerGameStatistics playerGameStatistics) {
            this.playerGameStatistics = playerGameStatistics;
            return this;
        }

        public Builder playerMiscellaneousInformation(PlayerMiscellaneousInformation playerMiscellaneousInformation) {
            this.playerMiscellaneousInformation = playerMiscellaneousInformation;
            return this;
        }

        public PlayerBasicInformation build () {
            return new PlayerBasicInformation(this.compositeKey, this.squadNumber, this.status, this.team, this.webName, this.playerFantasyStatistics, this.playerGameStatistics, this.playerMiscellaneousInformation);
        }
    }
}