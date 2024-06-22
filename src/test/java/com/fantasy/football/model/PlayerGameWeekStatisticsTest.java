package com.fantasy.football.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifierOptions;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.data.relational.core.query.Criteria.*;
import static org.springframework.data.relational.core.query.Query.*;
import static org.springframework.data.relational.core.query.Update.*;

@DataR2dbcTest
public class PlayerGameWeekStatisticsTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Save Player game week statistics record")
	public void savePlayerGameWeekStatisticsRecordTest () {
		PlayerGameWeekStatistics playerGameWeekStatistics = new PlayerGameWeekStatistics.Builder()
				.recordId(UUID.randomUUID())
				.playerId(UUID.fromString("fd044956-24e4-4e60-ae2e-e039556da418"))
				.build();
		Mono<PlayerGameWeekStatistics> savedRecord = r2dbcEntityTemplate.insert(PlayerGameWeekStatistics.class).using(playerGameWeekStatistics);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Save Player game week statistics record"))
				.expectNext(playerGameWeekStatistics)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Update player game week statistics record")
	public void updatePlayerGameWeekStatisticsRecordTest () {
		Mono<PlayerGameWeekStatistics> updatedRecord = r2dbcEntityTemplate.update(PlayerGameWeekStatistics.class).matching(query(where("recordId").is("dc3fd787-a092-49a2-a261-c10f88703d93"))).apply(update("minutes", 90))
				.flatMap(updateCount -> r2dbcEntityTemplate.select(PlayerGameWeekStatistics.class).matching(query(where("recordId").is("dc3fd787-a092-49a2-a261-c10f88703d93"))).one());
		StepVerifier
				.create(updatedRecord, StepVerifierOptions.create().scenarioName("Update player game week statistics record"))
				.assertNext(fetchedRecord -> assertThat(fetchedRecord.getMinutes()).isEqualTo(90))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Delete player game week statistics record")
	public void deletePlayerGameWeekStatisticsRecordTest () {
		Mono<Long> deleteRecordCount = r2dbcEntityTemplate.delete(PlayerGameWeekStatistics.class).matching(query(where("recordId").is("7fe1f65b-c80b-4fd6-94cd-bc1cd481b235"))).all();
		StepVerifier
				.create(deleteRecordCount, StepVerifierOptions.create().scenarioName("Delete player game week statistics record"))
				.expectNext(1L)
				.verifyComplete();
	}
}