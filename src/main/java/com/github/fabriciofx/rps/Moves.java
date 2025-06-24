/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.move.SmartMove;

/**
 * The moves.
 *
 * @since 1.0
 */
public interface Moves {
    /**
     * Rock move.
     */
    Move ROCK = new SmartMove(0, "Rock");

    /**
     * Paper move.
     */
    Move PAPER = new SmartMove(1, "Paper");

    /**
     * Scissors move.
     */
    Move SCISSORS = new SmartMove(2, "Scissors");

    /**
     * Convert code to move.
     * @param code The code of the move
     * @return The move
     */
    Move move(int code);
}
