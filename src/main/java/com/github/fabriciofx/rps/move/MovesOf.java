/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;
import java.util.Arrays;
import java.util.List;

/**
 * Default moves.
 *
 * @since 1.0
 */
public final class MovesOf implements Moves {
    /**
     * Moves.
     */
    private final List<Move> moves;

    /**
     * Ctor.
     */
    public MovesOf() {
        this(Moves.ROCK, Moves.PAPER, Moves.SCISSORS);
    }

    /**
     * Ctor.
     *
     * @param moves All possible moves
     */
    public MovesOf(final Move... moves) {
        this.moves = Arrays.asList(moves);
    }

    @Override
    public Move move(final int code) {
        return this.moves.get(code);
    }
}
