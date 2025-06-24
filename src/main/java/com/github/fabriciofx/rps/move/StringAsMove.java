/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
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
     * @param value String to be converted to move
     */
    public StringAsMove(final String value) {
        this(
            new SafeMoves(
                new SmartMoves()
            ),
            value
        );
    }

    /**
     * Ctor.
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
        final int code;
        switch (this.value.charAt(0)) {
            case 'r':
            case 'R':
                code = 0;
                break;
            case 'p':
            case 'P':
                code = 1;
                break;
            case 's':
            case 'S':
                code = 2;
                break;
            default:
                code = 0;
                break;
        }
        return code;
    }

    @Override
    public String toString() {
        return this.moves.move(this.code()).toString();
    }
}
