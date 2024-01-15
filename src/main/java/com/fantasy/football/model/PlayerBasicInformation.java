package com.fantasy.football.model;

import jakarta.persistence.*;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "PLYR_BSC_INFO")
public class PlayerBasicInformation {

    private PlayerBasicInformation () {}

    private PlayerBasicInformation(Long code, String firstName, String secondName, Integer squadNumber, Character status, LeagueTeam team, String webName, PlayerFantasyStatistics playerFantasyStatistics, PlayerGameStatistics playerGameStatistics, PlayerMiscellaneousInformation playerMiscellaneousInformation, int teamCode) {
        this.code = code;
        this.firstName = firstName;
        this.secondName = secondName;
        this.squadNumber = squadNumber;
        this.status = status;
        this.team = team;
        this.webName = webName;
        this.playerFantasyStatistics = playerFantasyStatistics;
        this.playerGameStatistics = playerGameStatistics;
        this.playerMiscellaneousInformation = playerMiscellaneousInformation;
        this.teamCode = teamCode;
    }

    @Id
    private Long code;
    @Column(name = "FRST_NAME")
    private String firstName;
    @Column(name = "SECD_NAME")
    private String secondName;
    @Column(name = "SQD_NO")
    private Integer squadNumber;
    @Column(name = "PLYR_STS")
    private Character status;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_CODE", referencedColumnName = "code")
    private LeagueTeam team;
    @Column(name = "WEB_NAME")
    private String webName;
    @Nullable
    @OneToOne(mappedBy = "playerCode")
    private PlayerFantasyStatistics playerFantasyStatistics;
    @Nullable
    @OneToOne(mappedBy = "playerCode")
    private PlayerGameStatistics playerGameStatistics;
    @Nullable
    @OneToOne(mappedBy = "playerCode")
    private PlayerMiscellaneousInformation playerMiscellaneousInformation;
    @Transient
    private int teamCode;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(Integer squadNumber) {
        this.squadNumber = squadNumber;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public LeagueTeam getTeam() {
        return team;
    }

    public void setTeam(LeagueTeam team) {
        this.team = team;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public PlayerFantasyStatistics getPlayerFantasyStatistics() {
        return playerFantasyStatistics;
    }

    public void setPlayerFantasyStatistics(PlayerFantasyStatistics playerFantasyStatistics) {
        this.playerFantasyStatistics = playerFantasyStatistics;
    }

    public PlayerGameStatistics getPlayerGameStatistics() {
        return playerGameStatistics;
    }

    public void setPlayerGameStatistics(PlayerGameStatistics playerGameStatistics) {
        this.playerGameStatistics = playerGameStatistics;
    }

    public PlayerMiscellaneousInformation getPlayerMiscellaneousInformation() {
        return playerMiscellaneousInformation;
    }

    public void setPlayerMiscellaneousInformation(PlayerMiscellaneousInformation playerMiscellaneousInformation) {
        this.playerMiscellaneousInformation = playerMiscellaneousInformation;
    }

    public int getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }

    public static class Builder {
        private Long code;
        private String firstName;
        private String secondName;
        private Integer squadNumber;
        private Character status;
        private LeagueTeam team;
        private String webName;
        private PlayerFantasyStatistics playerFantasyStatistics;
        private PlayerGameStatistics playerGameStatistics;
        private PlayerMiscellaneousInformation playerMiscellaneousInformation;
        private int teamCode;

        public Builder code (Long code) {
            this.code = code;
            return this;
        }

        public Builder firstName (String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName (String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder squadNumber (Integer squadNumber) {
            this.squadNumber = squadNumber;
            return this;
        }

        public Builder status (Character status) {
            this.status = status;
            return this;
        }

        public Builder team (LeagueTeam team) {
            this.team = team;
            return this;
        }

        public Builder webName (String webName) {
            this.webName = webName;
            return this;
        }

        public Builder playerFantasyStatistics (PlayerFantasyStatistics playerFantasyStatistics) {
            this.playerFantasyStatistics = playerFantasyStatistics;
            return this;
        }

        public Builder playerGameStatistics (PlayerGameStatistics playerGameStatistics) {
            this.playerGameStatistics = playerGameStatistics;
            return this;
        }

        public Builder playerMiscellaneousInformation (PlayerMiscellaneousInformation playerMiscellaneousInformation) {
            this.playerMiscellaneousInformation = playerMiscellaneousInformation;
            return this;
        }

        public Builder teamCode (int teamCode) {
            this.teamCode = teamCode;
            return this;
        }

        public PlayerBasicInformation build () {
            return new PlayerBasicInformation(
                    this.code, this.firstName, this.secondName, this.squadNumber, this.status, this.team, this.webName, playerFantasyStatistics, playerGameStatistics, playerMiscellaneousInformation, teamCode
            );
        }
    }
}