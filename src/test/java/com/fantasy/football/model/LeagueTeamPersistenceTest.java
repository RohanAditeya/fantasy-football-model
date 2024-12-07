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
import static org.springframework.data.relational.core.query.Query.query;
import static org.springframework.data.relational.core.query.Update.*;

@DataR2dbcTest
public class LeagueTeamPersistenceTest {

	@Autowired
	private R2dbcEntityTemplate r2dbcEntityTemplate;

	@Test
	@DisplayName(value = "Insert League Team Record")
	public void saveLeagueTeamInsertsRecord () {
		LeagueTeam leagueTeam = new LeagueTeam.Builder().recordId(UUID.randomUUID()).name("Arsenal").form(1f).build();
		Mono<LeagueTeam> leagueTeamMono = r2dbcEntityTemplate
				.insert(LeagueTeam.class)
				.using(leagueTeam);
		StepVerifier
				.create(leagueTeamMono, StepVerifierOptions.create().scenarioName("Inserting league Team Record saves record in DB"))
				.assertNext(leagueTeamRecord -> assertThat(leagueTeamRecord.getVersionNumber()).isEqualTo(1).as(() -> "Version number is not matching"))
				.as("Stage failed")
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Update League Team Record")
	public void updateLeagueTeamUpdatesRecord () {
		Mono<LeagueTeam> updatedRows = r2dbcEntityTemplate.update(LeagueTeam.class)
				.matching(query(where("recordId").is("558b31c8-21ef-412e-a612-08d637c6a5c6")))
				.apply(update("loss", 1))
				.flatMap(updatedNumberOfRows -> r2dbcEntityTemplate.select(LeagueTeam.class).matching(query(where("code").is(100))).one());
		StepVerifier
				.create(updatedRows, StepVerifierOptions.create().scenarioName("Update request should update exactly 1 row"))
				.assertNext(modifiedRecord -> assertThat(modifiedRecord.getLoss()).isEqualTo(1).as(() -> "Modified column is not updated")).as("Update pipeline failed")
				.verifyComplete();
	}

	@Test
	@DisplayName(value = "Delete League Team Record")
	public void deleteLeagueTeamRemovesRecord () {
		Mono<LeagueTeam> deletedRecords = r2dbcEntityTemplate.delete(LeagueTeam.class)
				.matching(query(where("recordId").is("bb92d104-16d0-4ec8-b111-fed16d23efc1")))
				.all()
				.flatMap(updatedNumberOfRows -> r2dbcEntityTemplate.select(LeagueTeam.class).matching(query(where("code").is(200))).one());
		StepVerifier
				.create(deletedRecords, StepVerifierOptions.create().scenarioName("Delete request deletes record"))
				.verifyComplete();
	}
}