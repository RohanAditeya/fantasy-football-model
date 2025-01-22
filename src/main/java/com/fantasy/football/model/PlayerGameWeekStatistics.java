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
	public PlayerGameWeekStatistics(UUID recordId, UUID playerId, int gameWeek, int minutes, int goalsScored, int assists, int cleanSheets, int goalsConceded, int ownGoals, int penaltiesSaved, int penaltiesMissed, int yellowCards, int redCards, int saves, int bonus, int bps, float influence, float creativity, float threat, float ictIndex, float starts, float expectedGoals, float expectedAssists, float expectedGoalInvolvements, float expectedGoalsConceded, float totalPoints, boolean inDreamTeam, long versionNumber) {
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

	public PlayerGameWeekStatistics(UUID recordId, UUID playerId, int gameWeek, int minutes, int goalsScored, int assists, int cleanSheets, int goalsConceded, int ownGoals, int penaltiesSaved, int penaltiesMissed, int yellowCards, int redCards, int saves, int bonus, int bps, float influence, float creativity, float threat, float ictIndex, float starts, float expectedGoals, float expectedAssists, float expectedGoalInvolvements, float expectedGoalsConceded, float totalPoints, boolean inDreamTeam) {
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
	private int gameWeek;
	@Column(value = "MINS")
	private int minutes;
	@Column(value = "GOALS_SCRD")
	private int goalsScored;
	@Column(value = "ASSTS")
	private int assists;
	@Column(value = "CLEAN_SHTS")
	private int cleanSheets;
	@Column(value = "GOALS_CNCDED")
	private int goalsConceded;
	@Column(value = "OWN_GOALS")
	private int ownGoals;
	@Column(value = "PEN_SAVED")
	private int penaltiesSaved;
	@Column(value = "PEN_MISSED")
	private int penaltiesMissed;
	@Column(value = "YELL_CARDS")
	private int yellowCards;
	@Column(value = "RED_CARDS")
	private int redCards;
	private int saves;
	private int bonus;
	private int bps;
	private float influence;
	private float creativity;
	private float threat;
	@Column(value = "ICT_INDX")
	private float ictIndex;
	private float starts;
	@Column(value = "EXP_GOALS")
	private float expectedGoals;
	@Column(value = "EXP_ASSTS")
	private float expectedAssists;
	@Column(value = "EXP_GOAL_INVLMTS")
	private float expectedGoalInvolvements;
	@Column(value = "EXP_GOALS_CNCDED")
	private float expectedGoalsConceded;
	private float totalPoints;
	@Column(value = "IN_DREAM_TM")
	private boolean inDreamTeam;
	@Version
	private long versionNumber;

	public UUID getRecordId() {
		return recordId;
	}

	public UUID getPlayerId() {
		return playerId;
	}

	public int getGameWeek() {
		return gameWeek;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public int getAssists() {
		return assists;
	}

	public int getCleanSheets() {
		return cleanSheets;
	}

	public int getGoalsConceded() {
		return goalsConceded;
	}

	public int getOwnGoals() {
		return ownGoals;
	}

	public int getPenaltiesSaved() {
		return penaltiesSaved;
	}

	public int getPenaltiesMissed() {
		return penaltiesMissed;
	}

	public int getYellowCards() {
		return yellowCards;
	}

	public int getRedCards() {
		return redCards;
	}

	public int getSaves() {
		return saves;
	}

	public int getBonus() {
		return bonus;
	}

	public int getBps() {
		return bps;
	}

	public float getInfluence() {
		return influence;
	}

	public float getCreativity() {
		return creativity;
	}

	public float getThreat() {
		return threat;
	}

	public float getIctIndex() {
		return ictIndex;
	}

	public float getStarts() {
		return starts;
	}

	public float getExpectedGoals() {
		return expectedGoals;
	}

	public float getExpectedAssists() {
		return expectedAssists;
	}

	public float getExpectedGoalInvolvements() {
		return expectedGoalInvolvements;
	}

	public float getExpectedGoalsConceded() {
		return expectedGoalsConceded;
	}

	public float getTotalPoints() {
		return totalPoints;
	}

	public boolean isInDreamTeam() {
		return inDreamTeam;
	}

	public long getVersionNumber() {
		return versionNumber;
	}

	public static class Builder {
		private UUID recordId;
		private UUID playerId;
		private int gameWeek;
		private int minutes;
		private int goalsScored;
		private int assists;
		private int cleanSheets;
		private int goalsConceded;
		private int ownGoals;
		private int penaltiesSaved;
		private int penaltiesMissed;
		private int yellowCards;
		private int redCards;
		private int saves;
		private int bonus;
		private int bps;
		private float influence;
		private float creativity;
		private float threat;
		private float ictIndex;
		private float starts;
		private float expectedGoals;
		private float expectedAssists;
		private float expectedGoalInvolvements;
		private float expectedGoalsConceded;
		private float totalPoints;
		private boolean inDreamTeam;

		public Builder recordId (UUID recordId) {
			this.recordId = recordId;
			return this;
		}

		public Builder playerId (UUID playerId) {
			this.playerId = playerId;
			return this;
		}

		public Builder gameWeek (int gameWeek) {
			this.gameWeek = gameWeek;
			return this;
		}

		public Builder minutes (int minutes) {
			this.minutes = minutes;
			return this;
		}

		public Builder goalsScored (int goalsScored) {
			this.goalsScored = goalsScored;
			return this;
		}

		public Builder assists (int assists) {
			this.assists = assists;
			return this;
		}

		public Builder cleanSheets (int cleanSheets) {
			this.cleanSheets = cleanSheets;
			return this;
		}

		public Builder goalsConceded (int goalsConceded) {
			this.goalsConceded = goalsConceded;
			return this;
		}

		public Builder ownGoals (int ownGoals) {
			this.ownGoals = ownGoals;
			return this;
		}

		public Builder penaltiesSaved (int penaltiesSaved) {
			this.penaltiesSaved = penaltiesSaved;
			return this;
		}

		public Builder penaltiesMissed (int penaltiesMissed) {
			this.penaltiesMissed = penaltiesMissed;
			return this;
		}

		public Builder yellowCards (int yellowCards) {
			this.yellowCards = yellowCards;
			return this;
		}

		public Builder redCards (int redCards) {
			this.redCards = redCards;
			return this;
		}

		public Builder saves (int saves) {
			this.saves = saves;
			return this;
		}

		public Builder bonus (int bonus) {
			this.bonus = bonus;
			return this;
		}

		public Builder bps (int bps) {
			this.bps = bps;
			return this;
		}

		public Builder influence (float influence) {
			this.influence = influence;
			return this;
		}

		public Builder creativity (float creativity) {
			this.creativity = creativity;
			return this;
		}

		public Builder threat (float threat) {
			this.threat = threat;
			return this;
		}

		public Builder ictIndex (float ictIndex) {
			this.ictIndex = ictIndex;
			return this;
		}

		public Builder starts (float starts) {
			this.starts = starts;
			return this;
		}

		public Builder expectedGoals (float expectedGoals) {
			this.expectedGoals = expectedGoals;
			return this;
		}

		public Builder expectedAssists (float expectedAssists) {
			this.expectedAssists = expectedAssists;
			return this;
		}

		public Builder expectedGoalInvolvements (float expectedGoalInvolvements) {
			this.expectedGoalInvolvements = expectedGoalInvolvements;
			return this;
		}

		public Builder expectedGoalsConceded (float expectedGoalsConceded) {
			this.expectedGoalsConceded = expectedGoalsConceded;
			return this;
		}

		public Builder totalPoints (float totalPoints) {
			this.totalPoints = totalPoints;
			return this;
		}

		public Builder inDreamTeam (boolean inDreamTeam) {
			this.inDreamTeam = inDreamTeam;
			return this;
		}

		public PlayerGameWeekStatistics build () {
			return new PlayerGameWeekStatistics(recordId, playerId, gameWeek, minutes, goalsScored, assists, cleanSheets, goalsConceded, ownGoals, penaltiesSaved, penaltiesMissed, yellowCards, redCards, saves, bonus, bps, influence, creativity, threat, ictIndex, starts, expectedGoals, expectedAssists, expectedGoalInvolvements, expectedGoalsConceded, totalPoints, inDreamTeam);
		}
	}
}