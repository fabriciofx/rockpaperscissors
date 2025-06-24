/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.result;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.Result;

/**
 * Winner Match.
 *
 * @since 1.0
 */
public final class WinResult implements Result {
    /**
     * Winner player.
     */
    private final Player winner;

    /**
     * Winner player move.
     */
    private final Move one;

    /**
     * Looser player.
     */
    private final Player looser;

    /**
     * Looser player move.
     */
    private final Move two;

    /**
     * Ctor.
     * @param winner Winner player
     * @param one Winner player move
     * @param looser Looser player
     * @param two Looser player move
     * @checkstyle ParameterNumberCheck (6 lines)
     */
    public WinResult(
        final Player winner,
        final Move one,
        final Player looser,
        final Move two
    ) {
        this.winner = winner;
        this.one = one;
        this.looser = looser;
        this.two = two;
    }

    @Override
    public String asString() {
        return String.format(
            "%s wins!! %s played %s and %s played %s\n",
            this.winner.name(),
            this.winner.name(),
            this.one,
            this.looser.name(),
            this.two
        );
    }
}
