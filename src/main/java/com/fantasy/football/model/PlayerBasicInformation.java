package com.fantasy.football.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.util.UUID;

@Table(name = "PLYR_BSC_INFO")
public class PlayerBasicInformation {

    private PlayerBasicInformation() {}

    public PlayerBasicInformation(UUID recordId, Long code, String firstName, String secondName, Integer squadNumber, String status, UUID team, String webName, UUID playerFantasyStatistics, UUID playerGameStatistics, UUID playerMiscellaneousInformation) {
        this.recordId = recordId;
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
    }

    @PersistenceCreator
    public PlayerBasicInformation(UUID recordId, Long code, String firstName, String secondName, Integer squadNumber, String status, UUID team, String webName, UUID playerFantasyStatistics, UUID playerGameStatistics, UUID playerMiscellaneousInformation, long versionNumber) {
        this.recordId = recordId;
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
        this.versionNumber = versionNumber;
    }

    @Id
    private UUID recordId;
    @Positive
    private Long code;
    @Column(value = "FRST_NAME")
    private String firstName;
    @Column(value = "SECD_NAME")
    private String secondName;
    @Positive
    @Column(value = "SQD_NO")
    private Integer squadNumber;
    @Column(value = "PLYR_STS")
    private String status;
    @Column(value = "TEAM_UUID")
    private UUID team;
    @NotNull
    @Column(value = "WEB_NAME")
    private String webName;
    @Column(value = "PLYR_FANT_STCS_PK")
    private UUID playerFantasyStatistics;
    @Column(value = "PLYR_GAME_STCS_PK")
    private UUID playerGameStatistics;
    @Column(value = "PLYR_MISC_INFO_PK")
    private UUID playerMiscellaneousInformation;
    @Version
    private long versionNumber;

    public UUID getRecordId() {
        return recordId;
    }

    public @Positive Long getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public @Positive Integer getSquadNumber() {
        return squadNumber;
    }

    public String getStatus() {
        return status;
    }

    public UUID getTeam() {
        return team;
    }

    public @NotNull String getWebName() {
        return webName;
    }

    public UUID getPlayerFantasyStatistics() {
        return playerFantasyStatistics;
    }

    public UUID getPlayerGameStatistics() {
        return playerGameStatistics;
    }

    public UUID getPlayerMiscellaneousInformation() {
        return playerMiscellaneousInformation;
    }

    public long getVersionNumber() {
        return versionNumber;
    }

    public void setSquadNumber(@Positive Integer squadNumber) {
        this.squadNumber = squadNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTeam(UUID team) {
        this.team = team;
    }

    public void setWebName(@NotNull String webName) {
        this.webName = webName;
    }

    public void setPlayerFantasyStatistics(UUID playerFantasyStatistics) {
        this.playerFantasyStatistics = playerFantasyStatistics;
    }

    public void setPlayerGameStatistics(UUID playerGameStatistics) {
        this.playerGameStatistics = playerGameStatistics;
    }

    public void setPlayerMiscellaneousInformation(UUID playerMiscellaneousInformation) {
        this.playerMiscellaneousInformation = playerMiscellaneousInformation;
    }

    public void setVersionNumber(long versionNumber) {
        this.versionNumber = versionNumber;
    }

    public static class Builder {
        private UUID recordId;
        private Long code;
        private String firstName;
        private String secondName;
        private Integer squadNumber;
        private String status;
        private UUID team;
        private String webName;
        private UUID playerFantasyStatistics;
        private UUID playerGameStatistics;
        private UUID playerMiscellaneousInformation;

        public Builder recordId (UUID recordId) {
            this.recordId = recordId;
            return this;
        }

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

        public Builder status (String status) {
            this.status = status;
            return this;
        }

        public Builder team (UUID team) {
            this.team = team;
            return this;
        }

        public Builder webName (String webName) {
            this.webName = webName;
            return this;
        }

        public Builder playerFantasyStatistics (UUID playerFantasyStatistics) {
            this.playerFantasyStatistics = playerFantasyStatistics;
            return this;
        }

        public Builder playerGameStatistics (UUID playerGameStatistics) {
            this.playerGameStatistics = playerGameStatistics;
            return this;
        }

        public Builder playerMiscellaneousInformation (UUID playerMiscellaneousInformation) {
            this.playerMiscellaneousInformation = playerMiscellaneousInformation;
            return this;
        }

        public PlayerBasicInformation build () {
            return new PlayerBasicInformation(recordId, code, firstName, secondName, squadNumber, status, team, webName, playerFantasyStatistics, playerGameStatistics, playerMiscellaneousInformation);
        }
    }
}