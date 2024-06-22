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
public class PlayerGameStatisticsTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Save player statistics record")
	public void savePlayerGameStatisticsRecordTest () {
		PlayerGameStatistics playerGameStatistics = new PlayerGameStatistics.Builder()
				.recordId(UUID.randomUUID()).build();
		Mono<PlayerGameStatistics> savedRecord = r2dbcEntityTemplate.insert(PlayerGameStatistics.class).using(playerGameStatistics);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Save player statistics record"))
				.expectNext(playerGameStatistics)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Update player statistics record")
	public void updatePlayerGameStatisticsRecordTest () {
		Mono<PlayerGameStatistics> updatedRecord = r2dbcEntityTemplate.update(PlayerGameStatistics.class).matching(query(where("recordId").is("34b242ca-b998-4537-b951-4c2b0529c34c"))).apply(update("minutes", 90))
				.flatMap(updatedCount -> r2dbcEntityTemplate.select(PlayerGameStatistics.class).matching(query(where("recordId").is("34b242ca-b998-4537-b951-4c2b0529c34c"))).one());
		StepVerifier
				.create(updatedRecord, StepVerifierOptions.create().scenarioName("Update player statistics record"))
				.assertNext(fetchedRecord -> assertThat(fetchedRecord.getMinutes()).isEqualTo(90))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Delete player statistics record")
	public void deletePlayerGameStatisticsRecordTest () {
		Mono<Long> deletedRecordCount = r2dbcEntityTemplate.delete(PlayerGameStatistics.class).matching(query(where("recordId").is("98397c06-49a3-4f44-8d1a-bd245c0a7916"))).all();
		StepVerifier
				.create(deletedRecordCount, StepVerifierOptions.create().scenarioName("Delete player statistics record"))
				.expectNext(1L)
				.verifyComplete();
	}
}