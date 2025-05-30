package com.fantasy.football.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table(name = "PLYR_GAME_WK_BK")
public class PlayerGameWeekBreakup {

	private PlayerGameWeekBreakup() {}

	@PersistenceCreator
	public PlayerGameWeekBreakup(UUID recordId, UUID gameWeek, String identifier, int points, int value, long versionNumber) {
		this.recordId = recordId;
		this.gameWeek = gameWeek;
		this.identifier = identifier;
		this.points = points;
		this.value = value;
		this.versionNumber = versionNumber;
	}

	public PlayerGameWeekBreakup(UUID recordId, UUID gameWeek, String identifier, int points, int value) {
		this.recordId = recordId;
		this.gameWeek = gameWeek;
		this.identifier = identifier;
		this.points = points;
		this.value = value;
	}

	@Id
	private UUID recordId;
	@Column(value = "GAME_WK_PK")
	private UUID gameWeek;
	private String identifier;
	private int points;
	@Column(value = "ID_VALUE")
	private int value;
	@Version
	private long versionNumber;

	public long getVersionNumber() {
		return versionNumber;
	}

	public int getValue() {
		return value;
	}

	public int getPoints() {
		return points;
	}

	public String getIdentifier() {
		return identifier;
	}

	public UUID getGameWeek() {
		return gameWeek;
	}

	public UUID getRecordId() {
		return recordId;
	}
}