/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
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
public final class Win implements Result {
    /**
     * Winner player.
     */
    private final Player winner;

    /**
     * Winner player move.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Move move1;

    /**
     * Looser player.
     */
    private final Player looser;

    /**
     * Looser player move.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Move move2;

    /**
     * Ctor.
     * @param winner Winner player
     * @param move1 Winner player move
     * @param looser Looser player
     * @param move2 Looser player move
     * @checkstyle ParameterNameCheck (7 lines)
     * @checkstyle ParameterNumberCheck (7 lines)
     */
    public Win(
        final Player winner,
        final Move move1,
        final Player looser,
        final Move move2
    ) {
        this.winner = winner;
        this.move1 = move1;
        this.looser = looser;
        this.move2 = move2;
    }

    @Override
    public String asString() {
        return String.format(
            "%s wins!! %s played %s and %s played %s\n",
            this.winner.name(),
            this.winner.name(),
            this.move1,
            this.looser.name(),
            this.move2
        );
    }
}
