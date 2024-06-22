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
public class PlayerMiscellaneousInformationTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Saved player misc info record")
	public void savePlayerMiscInfoRecordTest () {
		PlayerMiscellaneousInformation playerMiscellaneousInformation = new PlayerMiscellaneousInformation.Builder()
				.recordId(UUID.randomUUID())
				.build();
		Mono<PlayerMiscellaneousInformation> savedRecord = r2dbcEntityTemplate.insert(PlayerMiscellaneousInformation.class).using(playerMiscellaneousInformation);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Saved player misc info record"))
				.expectNext(playerMiscellaneousInformation)
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Updated player misc info record")
	public void updatePlayerMiscInfoRecordTest () {
		Mono<PlayerMiscellaneousInformation> updatedRecord = r2dbcEntityTemplate.update(PlayerMiscellaneousInformation.class).matching(query(where("recordId").is("28775c5f-5291-4878-9f1b-369030ef2ddf"))).apply(update("influenceRank", 20))
				.flatMap(updatedCount -> r2dbcEntityTemplate.select(PlayerMiscellaneousInformation.class).matching(query(where("recordId").is("28775c5f-5291-4878-9f1b-369030ef2ddf"))).one());
		StepVerifier
				.create(updatedRecord, StepVerifierOptions.create().scenarioName("Updated player misc info record"))
				.assertNext(fetchedRecord -> assertThat(fetchedRecord.getInfluenceRank()).isEqualTo(20))
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Deleted player misc info record")
	public void deletePlayerMiscInfoRecordTest () {
		Mono<Long> deletedRecordCount = r2dbcEntityTemplate.delete(PlayerMiscellaneousInformation.class).matching(query(where("recordId").is("ddcea133-633e-4ea4-af2e-9d665beb6ad6"))).all();
		StepVerifier
				.create(deletedRecordCount, StepVerifierOptions.create().scenarioName("Deleted player misc info record"))
				.expectNext(1L)
				.verifyComplete();
	}
}