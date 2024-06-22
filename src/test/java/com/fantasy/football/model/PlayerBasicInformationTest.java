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
public class PlayerBasicInformationTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Saving a player basic information record")
	public void insertRecordTest () {
		PlayerBasicInformation playerBasicInformation = new PlayerBasicInformation.Builder()
				.recordId(UUID.randomUUID())
				.code(1L)
				.firstName("Martin")
				.secondName("Odegaard")
				.squadNumber(8)
				.status("W")
				.team(UUID.fromString("cdcb1c7f-c686-4865-8404-f04f7fbacadd"))
				.webName("Odegaard")
				.playerFantasyStatistics(UUID.randomUUID())
				.playerGameStatistics(UUID.randomUUID())
				.playerMiscellaneousInformation(UUID.randomUUID())
				.build();
		Mono<PlayerBasicInformation> savedRecord = r2dbcEntityTemplate.insert(PlayerBasicInformation.class).using(playerBasicInformation);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Saved player basic information records should return the saved record"))
				.expectNext(playerBasicInformation)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Updating a player basic information record")
	public void updateRecordTest () {
		Mono<PlayerBasicInformation> updatedRecord = r2dbcEntityTemplate.update(PlayerBasicInformation.class).matching(query(where("webName").is("Trossard"))).apply(update("squadNumber", 22))
				.flatMap(updatedCount -> r2dbcEntityTemplate.select(PlayerBasicInformation.class).matching(query(where("webName").is("Trossard"))).one());
		StepVerifier
				.create(updatedRecord, StepVerifierOptions.create().scenarioName("Update player record should have updated record"))
				.assertNext(returnedRecord -> assertThat(returnedRecord.getSquadNumber()).isEqualTo(22))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Deleting a player basic information record")
	public void deleteRecordTest () {
		Mono<Long> deletedCount = r2dbcEntityTemplate.delete(PlayerBasicInformation.class).matching(query(where("webName").is("Haaland"))).all();
		StepVerifier
				.create(deletedCount, StepVerifierOptions.create().scenarioName("Deleting Player record should return event with count 1"))
				.expectNext(1L)
				.verifyComplete();
	}
}