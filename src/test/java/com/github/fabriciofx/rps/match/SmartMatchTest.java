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
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.match.SmartMatch;
import com.github.fabriciofx.rps.player.FakePlayer;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class SmartMatchTest {
    @Test
    public void rocksTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing rock",
            new SmartMatch(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.ROCK)
            ).result().toString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Rock and Player 2 played Rock\n"
            )
        );
    }

    @Test
    public void papersTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing paper",
            new SmartMatch(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.PAPER)
            ).result().toString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Paper and Player 2 played Paper\n"
            )
        );
    }

    @Test
    public void scissorsTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing scissors",
            new SmartMatch(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().toString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Scissors and Player 2 played Scissors\n"
            )
        );
    }

    @Test
    public void rockWinsScissors() {
        MatcherAssert.assertThat(
            "Can't rock win with two players playing rock and scissors",
            new SmartMatch(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().toString(),
            Matchers.equalTo(
                "Player 1 wins!! Player 1 played Rock and Player 2 played Scissors\n"
            )
        );
    }

    @Test
    public void paperWinsRock() {
        final Match match = new SmartMatch(
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
        final Match match = new SmartMatch(
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
        final Match match = new SmartMatch(
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
        final Match match = new SmartMatch(
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
        final Match match = new SmartMatch(
            new FakePlayer(1, Moves.SCISSORS),
            new FakePlayer(2, Moves.ROCK)
        );
        assertEquals(
            "Player 2 wins!! Player 2 played Rock and Player 1 played Scissors\n",
            match.result().toString()
        );
    }
}
