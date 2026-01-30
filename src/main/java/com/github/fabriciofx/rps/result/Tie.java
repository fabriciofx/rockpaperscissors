/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.result;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.Result;

/**
 * Tie Match.
 *
 * @since 1.0
 */
public final class Tie implements Result {
    /**
     * Player 1.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player1;

    /**
     * Player 1 move.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Move move1;

    /**
     * Player 2.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player2;

    /**
     * Player 2 move.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Move move2;

    /**
     * Ctor.
     * @param player1 Player 1
     * @param move1 Player 1 move
     * @param player2 Player 2
     * @param move2 Player 2 move
     * @checkstyle ParameterNameCheck (7 lines)
     * @checkstyle ParameterNumberCheck (7 lines)
     */
    public Tie(
        final Player player1,
        final Move move1,
        final Player player2,
        final Move move2
    ) {
        this.player1 = player1;
        this.move1 = move1;
        this.player2 = player2;
        this.move2 = move2;
    }

    @Override
    public String asString() {
        return String.format(
            "Tie!! %s played %s and %s played %s\n",
            this.player1.name(),
            this.move1,
            this.player2.name(),
            this.move2
        );
    }
}
