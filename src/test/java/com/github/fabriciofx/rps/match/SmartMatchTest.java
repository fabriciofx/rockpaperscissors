/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2017-2018 Fabrício Barros Cabral
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

import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.player.FakePlayer;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * SmartMatch tests.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
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
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Rock and Player 2 played Scissors\n"
            )
        );
    }

    @Test
    public void paperWinsRock() {
        MatcherAssert.assertThat(
            "Can't paper win with two players playing paper and rock",
            new SmartMatch(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.ROCK)
            ).result().toString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Paper and Player 2 played Rock\n"
            )
        );
    }

    @Test
    public void scissorsWinsPaper() {
        MatcherAssert.assertThat(
            "Can't scissors win with two players playing scissors and paper",
            new SmartMatch(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.PAPER)
            ).result().toString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Scissors and Player 2 played Paper\n"
            )
        );
    }

    @Test
    public void rockLoosesPaper() {
        MatcherAssert.assertThat(
            "Can't paper win with two players playing rock and paper",
            new SmartMatch(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.PAPER)
            ).result().toString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Paper and Player 1 played Rock\n"
            )
        );
    }

    @Test
    public void paperLoosesScissors() {
        MatcherAssert.assertThat(
            "Can't scissors win with two players playing papers and scissors",
            new SmartMatch(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().toString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Scissors and Player 1 played Paper\n"
            )
        );
    }

    @Test
    public void scissorsLoosesRock() {
        MatcherAssert.assertThat(
            "Can't rock win with two players playing scissors and rock",
            new SmartMatch(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.ROCK)
            ).result().toString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Rock and Player 1 played Scissors\n"
            )
        );
    }
}
