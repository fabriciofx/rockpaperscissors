/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;

/**
 * Safe movements.
 *
 * @since 1.0
 */
public final class SafeMoves implements Moves {
    /**
     * Moves.
     */
    private final Moves origin;

    /**
     * Ctor.
     * @param origin Moves to be checked
     */
    public SafeMoves(final Moves origin) {
        this.origin = origin;
    }

    @Override
    public Move move(final int code) {
        if (this.origin == null) {
            throw new InvalidMovesException();
        }
        // @checkstyle MagicNumberCheck (1 lines)
        if (code < 0 || code > 3) {
            throw new InvalidMoveCodeException(code);
        }
        return this.origin.move(code);
    }
}
