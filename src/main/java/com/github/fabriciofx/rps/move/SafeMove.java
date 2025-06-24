/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;

/**
 * Safe movement.
 *
 * @since 1.0
 */
public final class SafeMove implements Move {
    /**
     * Move.
     */
    private final Move origin;

    /**
     * Ctor.
     * @param origin The move to be checked
     */
    public SafeMove(final Move origin) {
        this.origin = origin;
    }

    @Override
    public int code() {
        if (this.origin == null) {
            throw new InvalidMoveException();
        }
        return this.origin.code();
    }

    @Override
    public int compareTo(final Move move) {
        if (this.origin == null || move == null) {
            throw new InvalidMoveException();
        }
        return this.origin.compareTo(move);
    }
}
