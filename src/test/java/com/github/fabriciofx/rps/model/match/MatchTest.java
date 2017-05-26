/**
 * The MIT License (MIT)
 * 
 * Copyright (C) 2017 Fabrício Barros Cabral
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps.model.match;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.fabriciofx.rps.fake.FakePlayer;
import com.github.fabriciofx.rps.match.Match;
import com.github.fabriciofx.rps.move.Moves;

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
