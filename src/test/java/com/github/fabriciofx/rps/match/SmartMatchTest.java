/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.player.FakePlayer;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * SmartMatch tests.
 *
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
final class SmartMatchTest {
    @Test
    void rocksTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing rock",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Rock and Player 2 played Rock\n"
            )
        );
    }

    @Test
    void papersTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing paper",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Paper and Player 2 played Paper\n"
            )
        );
    }

    @Test
    void scissorsTie() {
        MatcherAssert.assertThat(
            "Can't tie with two players playing scissors",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                "Tie!! Player 1 played Scissors and Player 2 played Scissors\n"
            )
        );
    }

    @Test
    void rockWinsScissors() {
        MatcherAssert.assertThat(
            "Can't rock win with two players playing rock and scissors",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Rock and Player 2 played Scissors\n"
            )
        );
    }

    @Test
    void scissorsLoosesRock() {
        MatcherAssert.assertThat(
            "Can't rock win with two players playing scissors and rock",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Rock and Player 1 played Scissors\n"
            )
        );
    }

    @Test
    void paperWinsRock() {
        MatcherAssert.assertThat(
            "Can't paper win with two players playing paper and rock",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Paper and Player 2 played Rock\n"
            )
        );
    }

    @Test
    void rockLoosesPaper() {
        MatcherAssert.assertThat(
            "Can't paper win with two players playing rock and paper",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Paper and Player 1 played Rock\n"
            )
        );
    }

    @Test
    void scissorsWinsPaper() {
        MatcherAssert.assertThat(
            "Can't scissors win with two players playing scissors and paper",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 1 wins!! Player 1 played Scissors and Player 2 played Paper\n"
            )
        );
    }

    @Test
    void paperLoosesScissors() {
        MatcherAssert.assertThat(
            "Can't scissors win with two players playing papers and scissors",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                // @checkstyle LineLengthCheck (1 lines)
                "Player 2 wins!! Player 2 played Scissors and Player 1 played Paper\n"
            )
        );
    }
}
