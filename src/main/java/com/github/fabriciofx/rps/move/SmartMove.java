/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;

/**
 * Default move.
 *
 * @since 1.0
 */
@SuppressWarnings("PMD.AvoidFieldNameMatchingMethodName")
public final class SmartMove implements Move {
    /**
     * Move's cod.
     */
    private final int code;

    /**
     * Move's name.
     */
    private final String name;

    /**
     * Ctor.
     * @param code The cod of the move
     * @param name The name of the move
     */
    public SmartMove(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // This algorithm has been found here:
    // https://stackoverflow.com/questions/11377117/
    // rock-paper-scissors-determine-win-loss-tie-using-math
    @Override
    public int compareTo(final Move move) {
        final int cmp;
        if (this.code == move.code()) {
            cmp = 0;
            // @checkstyle MagicNumberCheck (1 lines)
        } else if ((this.code - move.code() + 3) % 3 == 1) {
            cmp = -1;
        } else {
            cmp = 1;
        }
        return cmp;
    }
}
