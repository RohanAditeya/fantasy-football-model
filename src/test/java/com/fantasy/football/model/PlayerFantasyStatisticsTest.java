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
public class PlayerFantasyStatisticsTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Saving player fantasy statistics record")
	public void savePlayerFantasyStatisticsRecordTest () {
		PlayerFantasyStatistics playerFantasyStatistics = new PlayerFantasyStatistics.Builder()
				.recordId(UUID.randomUUID())
				.build();
		Mono<PlayerFantasyStatistics> savedRecord = r2dbcEntityTemplate.insert(PlayerFantasyStatistics.class).using(playerFantasyStatistics);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Saving player fantasy statistics record"))
				.expectNext(playerFantasyStatistics)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Updating player fantasy statistics record")
	public void updatePlayerFantasyStatisticsRecordTest () {
		Mono<PlayerFantasyStatistics> updatedRecordCount = r2dbcEntityTemplate.update(PlayerFantasyStatistics.class).matching(query(where("recordId").is("27827963-ef18-4627-89b0-e6805ea53b55"))).apply(update("nowCost", 15))
				.flatMap(updatedCount -> r2dbcEntityTemplate.select(PlayerFantasyStatistics.class).matching(query(where("recordId").is("27827963-ef18-4627-89b0-e6805ea53b55"))).one());
		StepVerifier
				.create(updatedRecordCount, StepVerifierOptions.create().scenarioName("Updating player fantasy statistics record"))
				.assertNext(updatedRecord -> assertThat(updatedRecord.getNowCost()).isEqualTo(15))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Deleting player fantasy statistics record")
	public void deletePlayerFantasyStatisticsRecordTest () {
		Mono<Long> deletedRecordCount = r2dbcEntityTemplate.delete(PlayerFantasyStatistics.class).matching(query(where("recordId").is("ffe96dab-ea86-460d-8e0f-f88fd505d5ed"))).all();
		StepVerifier
				.create(deletedRecordCount, StepVerifierOptions.create().scenarioName("Deleting player fantasy statistics record"))
				.expectNext(1L)
				.verifyComplete();
	}
}