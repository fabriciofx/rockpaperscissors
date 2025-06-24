/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
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
public final class TieResult implements Result {
    /**
     * Player 1.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player1;

    /**
     * Player 1 move.
     */
    private final Move one;

    /**
     * Player 2.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player2;

    /**
     * Player 2 move.
     */
    private final Move two;

    /**
     * Ctor.
     * @param plyr1 Player 1
     * @param one Player 1 move
     * @param plyr2 Player 2
     * @param two Player 2 move
     * @checkstyle ParameterNameCheck (6 lines)
     * @checkstyle ParameterNumberCheck (6 lines)
     */
    public TieResult(
        final Player plyr1,
        final Move one,
        final Player plyr2,
        final Move two
    ) {
        this.player1 = plyr1;
        this.one = one;
        this.player2 = plyr2;
        this.two = two;
    }

    @Override
    public String asString() {
        return String.format(
            "Tie!! %s played %s and %s played %s\n",
            this.player1.name(),
            this.one,
            this.player2.name(),
            this.two
        );
    }
}
