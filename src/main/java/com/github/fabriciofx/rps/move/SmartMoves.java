/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
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
public final class SmartMoves implements Moves {
    /**
     * Moves.
     */
    private final List<Move> all;

    /**
     * Ctor.
     */
    public SmartMoves() {
        this(Moves.ROCK, Moves.PAPER, Moves.SCISSORS);
    }

    /**
     * Ctor.
     *
     * @param all All possible moves
     */
    public SmartMoves(final Move... all) {
        this.all = Arrays.asList(all);
    }

    @Override
    public Move move(final int code) {
        return this.all.get(code);
    }
}
