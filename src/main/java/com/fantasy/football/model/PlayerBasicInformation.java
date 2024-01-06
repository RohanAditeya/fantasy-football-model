package com.fantasy.football.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLYR_BSC_INFO")
public class PlayerBasicInformation {

    private PlayerBasicInformation () {}

    public PlayerBasicInformation(Long code, String firstName, String secondName, Integer squadNumber, Character status, LeagueTeam teamCode, String webName) {
        this.code = code;
        this.firstName = firstName;
        this.secondName = secondName;
        this.squadNumber = squadNumber;
        this.status = status;
        this.teamCode = teamCode;
        this.webName = webName;
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
    @OneToOne(optional = false)
    @JoinColumn(name = "TEAM_CODE", referencedColumnName = "CODE")
    private LeagueTeam teamCode;
    @Column(name = "WEB_NAME")
    private String webName;

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

    public LeagueTeam getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(LeagueTeam teamCode) {
        this.teamCode = teamCode;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public static class Builder {
        private Long code;
        private String firstName;
        private String secondName;
        private Integer squadNumber;
        private Character status;
        private LeagueTeam teamCode;
        private String webName;

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

        public Builder teamCode (LeagueTeam teamCode) {
            this.teamCode = teamCode;
            return this;
        }

        public Builder webName (String webName) {
            this.webName = webName;
            return this;
        }

        public PlayerBasicInformation build () {
            return new PlayerBasicInformation(
                    this.code, this.firstName, this.secondName, this.squadNumber, this.status, this.teamCode, this.webName
            );
        }
    }
}