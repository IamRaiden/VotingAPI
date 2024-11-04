package com.example.votingapp;

import com.example.votingapp.Service.VotingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static junit.framework.Assert.*;

@SpringBootTest
class VotingappApplicationTests {


	private VotingService votingService;

	@BeforeEach
	void setUp() {
		votingService = new VotingService();
	}

	@Test
	void testAddCandidate() {
		assertTrue(votingService.addCandidate("Alice"));
		assertFalse(votingService.addCandidate("Alice"));
	}

	@Test
	void testCastVote() {
		votingService.addCandidate("Bob");
		assertTrue(votingService.castVote("Bob"));
		assertFalse(votingService.castVote("Unknown"));
	}

	@Test
	void testGetVoteCount() {
		votingService.addCandidate("Charlie");
		votingService.castVote("Charlie");
		assertEquals(Optional.of(1), votingService.getVoteCount("Charlie"));
	}

	@Test
	void testGetAllVotes() {
		votingService.addCandidate("Dave");
		votingService.castVote("Dave");
		assertEquals(Optional.of(1), votingService.getAllVotes().get("Dave"));
	}

	@Test
	void testGetWinner() {
		votingService.addCandidate("Eve");
		votingService.castVote("Eve");
		assertEquals("Eve", votingService.getWinner().orElse(null));
	}
}
