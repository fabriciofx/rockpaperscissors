/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;

/**
 * Convert a string to move.
 *
 * @since 1.0
 */
public final class StringAsMove implements Move {

    /**
     * Moves.
     */
    private final Moves moves;

    /**
     * Move as string.
     */
    private final String value;

    /**
     * Ctor.
     *
     * @param value String to be converted to move
     */
    public StringAsMove(final String value) {
        this(
            new SafeMoves(
                new MovesOf()
            ),
            value
        );
    }

    /**
     * Ctor.
     *
     * @param moves All possible moves
     * @param value String to be converted to move
     */
    public StringAsMove(final Moves moves, final String value) {
        this.moves = moves;
        this.value = value;
    }

    @Override
    public int compareTo(final Move move) {
        return this.moves.move(this.code()).compareTo(move);
    }

    @Override
    public int code() {
        return switch (this.value.charAt(0)) {
            case 'p', 'P' -> 1;
            case 's', 'S' -> 2;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return this.moves.move(this.code()).toString();
    }
}
