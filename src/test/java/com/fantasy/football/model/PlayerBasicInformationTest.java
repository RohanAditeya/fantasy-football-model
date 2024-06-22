package com.fantasy.football.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifierOptions;

import java.util.UUID;

@DataR2dbcTest
public class PlayerBasicInformationTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	public void insertRecordTest () {
		PlayerBasicInformation playerBasicInformation = new PlayerBasicInformation.Builder()
				.recordId(UUID.randomUUID())
				.code(1L)
				.firstName("Martin")
				.secondName("Odegaard")
				.squadNumber(8)
				.status("W")
				.team(UUID.randomUUID())
				.webName("Odegaard")
				.playerFantasyStatistics(UUID.randomUUID())
				.playerGameStatistics(UUID.randomUUID())
				.playerMiscellaneousInformation(UUID.randomUUID())
				.build();
		Mono<PlayerBasicInformation> savedRecord = r2dbcEntityTemplate.insert(PlayerBasicInformation.class).using(playerBasicInformation);
		StepVerifier
				.create(savedRecord, StepVerifierOptions.create().scenarioName("Saved player basic information records"))
				.expectNext(playerBasicInformation)
				.verifyComplete();
	}
}