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
public class PlayerGameWeekBreakUpTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Saved player game week break up record")
	public void savePlayerGameWeekBreakUpRecordTest () {
		PlayerGameWeekBreakup playerGameWeekBreakUp = new PlayerGameWeekBreakup(UUID.randomUUID(), UUID.fromString("e5d92908-dac6-476c-bd04-1a44f4be1874"), "goals", 5, 1);
		Mono<PlayerGameWeekBreakup> savedRecord = r2dbcEntityTemplate.insert(PlayerGameWeekBreakup.class).using(playerGameWeekBreakUp);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Saved player game week break up record"))
				.expectNext(playerGameWeekBreakUp)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Update player game week break up record")
	public void updatePlayerGameWeekBreakUpRecordTest () {
		Mono<PlayerGameWeekBreakup> updatedRecord = r2dbcEntityTemplate.update(PlayerGameWeekBreakup.class).matching(query(where("recordId").is("66671fdc-0d5a-486e-b229-db22a4e107c7"))).apply(update("points", 10))
				.flatMap(updateCount -> r2dbcEntityTemplate.select(PlayerGameWeekBreakup.class).matching(query(where("recordId").is("66671fdc-0d5a-486e-b229-db22a4e107c7"))).one());
		StepVerifier
				.create(updatedRecord, StepVerifierOptions.create().scenarioName("Update player game week break up record"))
				.assertNext(fetchedRecord -> assertThat(fetchedRecord.getPoints()).isEqualTo(10))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Delete player game week break up record")
	public void deletePlayerGameWeekBreakUpRecordTest () {
		Mono<Long> deletedRecordCount = r2dbcEntityTemplate.delete(PlayerGameWeekBreakup.class).matching(query(where("recordId").is("2596466e-886d-4eb7-9610-02d981ef6c91"))).all();
		StepVerifier
				.create(deletedRecordCount, StepVerifierOptions.create().scenarioName("Delete player game week break up record"))
				.expectNext(1L)
				.verifyComplete();
	}
}