/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.player.FakePlayer;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.llorllale.cactoos.matchers.Assertion;

/**
 * SmartMatch tests.
 *
 * @since 1.0
 */
final class MatchOfTest {

    @Test
    void rocksTie() {
        new Assertion<>(
            "Can't tie with two players playing rock",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Tie!! Player 1 played Rock and Player 2 played Rock%n"
                )
            )
        ).affirm();
    }

    @Test
    void papersTie() {
        new Assertion<>(
            "Can't tie with two players playing paper",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Tie!! Player 1 played Paper and Player 2 played Paper%n"
                )
            )
        ).affirm();
    }

    @Test
    void scissorsTie() {
        new Assertion<>(
            "Can't tie with two players playing scissors",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Tie!! Player 1 played Scissors and Player 2 played Scissors%n"
                )
            )
        ).affirm();
    }

    @Test
    void rockWinsScissors() {
        new Assertion<>(
            "Can't rock win with two players playing rock and scissors",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 1 wins!! Player 1 played Rock and Player 2 played Scissors%n"
                )
            )
        ).affirm();
    }

    @Test
    void scissorsLoosesRock() {
        new Assertion<>(
            "Can't rock win with two players playing scissors and rock",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 2 wins!! Player 2 played Rock and Player 1 played Scissors%n"
                )
            )
        ).affirm();
    }

    @Test
    void paperWinsRock() {
        new Assertion<>(
            "Can't paper win with two players playing paper and rock",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.ROCK)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 1 wins!! Player 1 played Paper and Player 2 played Rock%n"
                )
            )
        ).affirm();
    }

    @Test
    void rockLoosesPaper() {
        new Assertion<>(
            "Can't paper win with two players playing rock and paper",
            new MatchOf(
                new FakePlayer(1, Moves.ROCK),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 2 wins!! Player 2 played Paper and Player 1 played Rock%n"
                )
            )
        ).affirm();
    }

    @Test
    void scissorsWinsPaper() {
        new Assertion<>(
            "Can't scissors win with two players playing scissors and paper",
            new MatchOf(
                new FakePlayer(1, Moves.SCISSORS),
                new FakePlayer(2, Moves.PAPER)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 1 wins!! Player 1 played Scissors and Player 2 played Paper%n"
                )
            )
        ).affirm();
    }

    @Test
    void paperLoosesScissors() {
        new Assertion<>(
            "Can't scissors win with two players playing papers and scissors",
            new MatchOf(
                new FakePlayer(1, Moves.PAPER),
                new FakePlayer(2, Moves.SCISSORS)
            ).result().asString(),
            Matchers.equalTo(
                String.format(
                    "Player 2 wins!! Player 2 played Scissors and Player 1 played Paper%n"
                )
            )
        ).affirm();
    }
}
