package com.fantasy.football.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table(name = "PLYR_GAME_WK_STCS")
public class PlayerGameWeekStatistics {

	private PlayerGameWeekStatistics() {}

	@PersistenceCreator
	public PlayerGameWeekStatistics(UUID recordId, UUID playerId, Integer gameWeek, Integer minutes, Integer goalsScored, Integer assists, Integer cleanSheets, Integer goalsConceded, Integer ownGoals, Integer penaltiesSaved, Integer penaltiesMissed, Integer yellowCards, Integer redCards, Integer saves, Integer bonus, Integer bps, Float influence, Float creativity, Float threat, Float ictIndex, Float starts, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float totalPoints, Boolean inDreamTeam, long versionNumber) {
		this.recordId = recordId;
		this.playerId = playerId;
		this.gameWeek = gameWeek;
		this.minutes = minutes;
		this.goalsScored = goalsScored;
		this.assists = assists;
		this.cleanSheets = cleanSheets;
		this.goalsConceded = goalsConceded;
		this.ownGoals = ownGoals;
		this.penaltiesSaved = penaltiesSaved;
		this.penaltiesMissed = penaltiesMissed;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.saves = saves;
		this.bonus = bonus;
		this.bps = bps;
		this.influence = influence;
		this.creativity = creativity;
		this.threat = threat;
		this.ictIndex = ictIndex;
		this.starts = starts;
		this.expectedGoals = expectedGoals;
		this.expectedAssists = expectedAssists;
		this.expectedGoalInvolvements = expectedGoalInvolvements;
		this.expectedGoalsConceded = expectedGoalsConceded;
		this.totalPoints = totalPoints;
		this.inDreamTeam = inDreamTeam;
		this.versionNumber = versionNumber;
	}

	public PlayerGameWeekStatistics(UUID recordId, UUID playerId, Integer gameWeek, Integer minutes, Integer goalsScored, Integer assists, Integer cleanSheets, Integer goalsConceded, Integer ownGoals, Integer penaltiesSaved, Integer penaltiesMissed, Integer yellowCards, Integer redCards, Integer saves, Integer bonus, Integer bps, Float influence, Float creativity, Float threat, Float ictIndex, Float starts, Float expectedGoals, Float expectedAssists, Float expectedGoalInvolvements, Float expectedGoalsConceded, Float totalPoints, Boolean inDreamTeam) {
		this.recordId = recordId;
		this.playerId = playerId;
		this.gameWeek = gameWeek;
		this.minutes = minutes;
		this.goalsScored = goalsScored;
		this.assists = assists;
		this.cleanSheets = cleanSheets;
		this.goalsConceded = goalsConceded;
		this.ownGoals = ownGoals;
		this.penaltiesSaved = penaltiesSaved;
		this.penaltiesMissed = penaltiesMissed;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.saves = saves;
		this.bonus = bonus;
		this.bps = bps;
		this.influence = influence;
		this.creativity = creativity;
		this.threat = threat;
		this.ictIndex = ictIndex;
		this.starts = starts;
		this.expectedGoals = expectedGoals;
		this.expectedAssists = expectedAssists;
		this.expectedGoalInvolvements = expectedGoalInvolvements;
		this.expectedGoalsConceded = expectedGoalsConceded;
		this.totalPoints = totalPoints;
		this.inDreamTeam = inDreamTeam;
	}

	@Id
	private UUID recordId;
	@Column(value = "PLYR_ID")
	private UUID playerId;
	@Column(value = "GAME_WK")
	private Integer gameWeek;
	@Column(value = "MINS")
	private Integer minutes;
	@Column(value = "GOALS_SCRD")
	private Integer goalsScored;
	@Column(value = "ASSTS")
	private Integer assists;
	@Column(value = "CLEAN_SHTS")
	private Integer cleanSheets;
	@Column(value = "GOALS_CNCDED")
	private Integer goalsConceded;
	@Column(value = "OWN_GOALS")
	private Integer ownGoals;
	@Column(value = "PEN_SAVED")
	private Integer penaltiesSaved;
	@Column(value = "PEN_MISSED")
	private Integer penaltiesMissed;
	@Column(value = "YELL_CARDS")
	private Integer yellowCards;
	@Column(value = "RED_CARDS")
	private Integer redCards;
	private Integer saves;
	private Integer bonus;
	private Integer bps;
	private Float influence;
	private Float creativity;
	private Float threat;
	@Column(value = "ICT_INDX")
	private Float ictIndex;
	private Float starts;
	@Column(value = "EXP_GOALS")
	private Float expectedGoals;
	@Column(value = "EXP_ASSTS")
	private Float expectedAssists;
	@Column(value = "EXP_GOAL_INVLMTS")
	private Float expectedGoalInvolvements;
	@Column(value = "EXP_GOALS_CNCDED")
	private Float expectedGoalsConceded;
	private Float totalPoints;
	@Column(value = "IN_DREAM_TM")
	private Boolean inDreamTeam;
	@Version
	private long versionNumber;

	public UUID getRecordId() {
		return recordId;
	}

	public UUID getPlayerId() {
		return playerId;
	}

	public Integer getGameWeek() {
		return gameWeek;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public Integer getGoalsScored() {
		return goalsScored;
	}

	public Integer getAssists() {
		return assists;
	}

	public Integer getCleanSheets() {
		return cleanSheets;
	}

	public Integer getGoalsConceded() {
		return goalsConceded;
	}

	public Integer getOwnGoals() {
		return ownGoals;
	}

	public Integer getPenaltiesSaved() {
		return penaltiesSaved;
	}

	public Integer getPenaltiesMissed() {
		return penaltiesMissed;
	}

	public Integer getYellowCards() {
		return yellowCards;
	}

	public Integer getRedCards() {
		return redCards;
	}

	public Integer getSaves() {
		return saves;
	}

	public Integer getBonus() {
		return bonus;
	}

	public Integer getBps() {
		return bps;
	}

	public Float getInfluence() {
		return influence;
	}

	public Float getCreativity() {
		return creativity;
	}

	public Float getThreat() {
		return threat;
	}

	public Float getIctIndex() {
		return ictIndex;
	}

	public Float getStarts() {
		return starts;
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

	public Float getTotalPoints() {
		return totalPoints;
	}

	public Boolean isInDreamTeam() {
		return inDreamTeam;
	}

	public long getVersionNumber() {
		return versionNumber;
	}

	public static class Builder {
		private UUID recordId;
		private UUID playerId;
		private Integer gameWeek;
		private Integer minutes;
		private Integer goalsScored;
		private Integer assists;
		private Integer cleanSheets;
		private Integer goalsConceded;
		private Integer ownGoals;
		private Integer penaltiesSaved;
		private Integer penaltiesMissed;
		private Integer yellowCards;
		private Integer redCards;
		private Integer saves;
		private Integer bonus;
		private Integer bps;
		private Float influence;
		private Float creativity;
		private Float threat;
		private Float ictIndex;
		private Float starts;
		private Float expectedGoals;
		private Float expectedAssists;
		private Float expectedGoalInvolvements;
		private Float expectedGoalsConceded;
		private Float totalPoints;
		private Boolean inDreamTeam;

		public Builder recordId (UUID recordId) {
			this.recordId = recordId;
			return this;
		}

		public Builder playerId (UUID playerId) {
			this.playerId = playerId;
			return this;
		}

		public Builder gameWeek (Integer gameWeek) {
			this.gameWeek = gameWeek;
			return this;
		}

		public Builder minutes (Integer minutes) {
			this.minutes = minutes;
			return this;
		}

		public Builder goalsScored (Integer goalsScored) {
			this.goalsScored = goalsScored;
			return this;
		}

		public Builder assists (Integer assists) {
			this.assists = assists;
			return this;
		}

		public Builder cleanSheets (Integer cleanSheets) {
			this.cleanSheets = cleanSheets;
			return this;
		}

		public Builder goalsConceded (Integer goalsConceded) {
			this.goalsConceded = goalsConceded;
			return this;
		}

		public Builder ownGoals (Integer ownGoals) {
			this.ownGoals = ownGoals;
			return this;
		}

		public Builder penaltiesSaved (Integer penaltiesSaved) {
			this.penaltiesSaved = penaltiesSaved;
			return this;
		}

		public Builder penaltiesMissed (Integer penaltiesMissed) {
			this.penaltiesMissed = penaltiesMissed;
			return this;
		}

		public Builder yellowCards (Integer yellowCards) {
			this.yellowCards = yellowCards;
			return this;
		}

		public Builder redCards (Integer redCards) {
			this.redCards = redCards;
			return this;
		}

		public Builder saves (Integer saves) {
			this.saves = saves;
			return this;
		}

		public Builder bonus (Integer bonus) {
			this.bonus = bonus;
			return this;
		}

		public Builder bps (Integer bps) {
			this.bps = bps;
			return this;
		}

		public Builder influence (Float influence) {
			this.influence = influence;
			return this;
		}

		public Builder creativity (Float creativity) {
			this.creativity = creativity;
			return this;
		}

		public Builder threat (Float threat) {
			this.threat = threat;
			return this;
		}

		public Builder ictIndex (Float ictIndex) {
			this.ictIndex = ictIndex;
			return this;
		}

		public Builder starts (Float starts) {
			this.starts = starts;
			return this;
		}

		public Builder expectedGoals (Float expectedGoals) {
			this.expectedGoals = expectedGoals;
			return this;
		}

		public Builder expectedAssists (Float expectedAssists) {
			this.expectedAssists = expectedAssists;
			return this;
		}

		public Builder expectedGoalInvolvements (Float expectedGoalInvolvements) {
			this.expectedGoalInvolvements = expectedGoalInvolvements;
			return this;
		}

		public Builder expectedGoalsConceded (Float expectedGoalsConceded) {
			this.expectedGoalsConceded = expectedGoalsConceded;
			return this;
		}

		public Builder totalPoints (Float totalPoints) {
			this.totalPoints = totalPoints;
			return this;
		}

		public Builder inDreamTeam (Boolean inDreamTeam) {
			this.inDreamTeam = inDreamTeam;
			return this;
		}

		public PlayerGameWeekStatistics build () {
			return new PlayerGameWeekStatistics(recordId, playerId, gameWeek, minutes, goalsScored, assists, cleanSheets, goalsConceded, ownGoals, penaltiesSaved, penaltiesMissed, yellowCards, redCards, saves, bonus, bps, influence, creativity, threat, ictIndex, starts, expectedGoals, expectedAssists, expectedGoalInvolvements, expectedGoalsConceded, totalPoints, inDreamTeam);
		}
	}
}