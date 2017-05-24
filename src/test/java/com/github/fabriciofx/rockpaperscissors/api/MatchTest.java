package com.github.fabriciofx.rockpaperscissors.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.fabriciofx.rockpaperscissors.fake.FakePlayer;

public final class MatchTest {
	@Test
	public void rocksTie() {
		final Match match = new Match(
			new FakePlayer(1, Moves.ROCK),
			new FakePlayer(2, Moves.ROCK)
		);
		assertEquals(
			"Tie!! Player 1 played Rock and Player 2 played Rock\n",
			match.result().toString()
		);
	}
	
	@Test
	public void papersTie() {
		final Match match = new Match(
			new FakePlayer(1, Moves.PAPER),
			new FakePlayer(2, Moves.PAPER)
		);
		assertEquals(
			"Tie!! Player 1 played Paper and Player 2 played Paper\n",
			match.result().toString()
		);
	}
	
	@Test
	public void scissorsTie() {
		final Match match = new Match(
			new FakePlayer(1, Moves.SCISSORS),
			new FakePlayer(2, Moves.SCISSORS)
		);
		assertEquals(
			"Tie!! Player 1 played Scissors and Player 2 played Scissors\n",
			match.result().toString()
		);
	}
	
	@Test
	public void rockWinsScissors() {
		final Match match = new Match(
			new FakePlayer(1, Moves.ROCK),
			new FakePlayer(2, Moves.SCISSORS)
		);
		assertEquals(
			"Player 1 wins!! Player 1 played Rock and Player 2 played Scissors\n",
			match.result().toString()
		);
	}

	@Test
	public void paperWinsRock() {
		final Match match = new Match(
			new FakePlayer(1, Moves.PAPER),
			new FakePlayer(2, Moves.ROCK)
		);
		assertEquals(
			"Player 1 wins!! Player 1 played Paper and Player 2 played Rock\n",
			match.result().toString()
		);
	}
	
	@Test
	public void scissorsWinsPaper() {
		final Match match = new Match(
			new FakePlayer(1, Moves.SCISSORS),
			new FakePlayer(2, Moves.PAPER)
		);
		assertEquals(
			"Player 1 wins!! Player 1 played Scissors and Player 2 played Paper\n",
			match.result().toString()
		);
	}
	
	@Test
	public void rockLoosesPaper() {
		final Match match = new Match(
			new FakePlayer(1, Moves.ROCK),
			new FakePlayer(2, Moves.PAPER)
		);
		assertEquals(
			"Player 2 wins!! Player 2 played Paper and Player 1 played Rock\n",
			match.result().toString()
		);
	}
	
	@Test
	public void paperLoosesScissors() {
		final Match match = new Match(
			new FakePlayer(1, Moves.PAPER),
			new FakePlayer(2, Moves.SCISSORS)
		);
		assertEquals(
			"Player 2 wins!! Player 2 played Scissors and Player 1 played Paper\n",
			match.result().toString()
		);
	}
	
	@Test
	public void scissorsLoosesRock() {
		final Match match = new Match(
			new FakePlayer(1, Moves.SCISSORS),
			new FakePlayer(2, Moves.ROCK)
		);
		assertEquals(
			"Player 2 wins!! Player 2 played Rock and Player 1 played Scissors\n",
			match.result().toString()
		);
	}

	
}
