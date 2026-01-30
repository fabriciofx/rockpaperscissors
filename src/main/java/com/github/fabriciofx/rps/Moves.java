/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.move.MoveOf;

/**
 * The moves.
 *
 * @since 1.0
 */
@FunctionalInterface
public interface Moves {
    /**
     * Rock move.
     */
    Move ROCK = new MoveOf(0, "Rock");

    /**
     * Paper move.
     */
    Move PAPER = new MoveOf(1, "Paper");

    /**
     * Scissors move.
     */
    Move SCISSORS = new MoveOf(2, "Scissors");

    /**
     * Convert code to move.
     * @param code The code of the move
     * @return The move
     */
    Move move(int code);
}
