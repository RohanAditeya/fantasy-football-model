package com.fantasy.football.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.util.Optional;

@Entity
@DynamicUpdate
@Table(name = "PLYR_BSC_INFO")
public class PlayerBasicInformation {

    private PlayerBasicInformation () {}

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
    @OneToOne(mappedBy = "playerCode", orphanRemoval = true, cascade = {CascadeType.ALL})
    private PlayerFantasyStatistics playerFantasyStatistics;
    @OneToOne(mappedBy = "playerCode", orphanRemoval = true, cascade = {CascadeType.ALL})
    private PlayerGameStatistics playerGameStatistics;
    @OneToOne(mappedBy = "playerCode", orphanRemoval = true, cascade = {CascadeType.ALL})
    private PlayerMiscellaneousInformation playerMiscellaneousInformation;

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
            PlayerBasicInformation entity = new PlayerBasicInformation(this.compositeKey, this.squadNumber, this.status, this.team, this.webName, this.playerFantasyStatistics, this.playerGameStatistics, this.playerMiscellaneousInformation);
            Optional.ofNullable(this.playerGameStatistics).ifPresent(gameStatistics -> gameStatistics.setPlayerCode(entity));
            Optional.ofNullable(this.playerFantasyStatistics).ifPresent(fantasyStatistics -> fantasyStatistics.setPlayerCode(entity));
            Optional.ofNullable(this.playerMiscellaneousInformation).ifPresent(miscellaneousInformation -> miscellaneousInformation.setPlayerCode(entity));
            return entity;
        }
    }
}