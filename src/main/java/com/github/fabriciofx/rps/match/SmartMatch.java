/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.Result;
import com.github.fabriciofx.rps.result.TieResult;
import com.github.fabriciofx.rps.result.WinResult;

/**
 * Default Match implementation.
 *
 * @since 1.0
 */
public final class SmartMatch implements Match {
    /**
     * Player 1.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player1;

    /**
     * Player 2.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player2;

    /**
     * Ctor.
     * @param one Player 1
     * @param two Player 2
     */
    public SmartMatch(final Player one, final Player two) {
        this.player1 = one;
        this.player2 = two;
    }

    @Override
    public Result result() {
        //@checkstyle LocalFinalVariableNameCheck (2 lines)
        final Move move1 = this.player1.move();
        final Move move2 = this.player2.move();
        final Result result;
        switch (move1.compareTo(move2)) {
            case -1:
                result = new WinResult(
                    this.player1,
                    move1,
                    this.player2,
                    move2
                );
                break;
            case 1:
                result = new WinResult(
                    this.player2,
                    move2,
                    this.player1,
                    move1
                );
                break;
            default:
                result = new TieResult(
                    this.player1,
                    move1,
                    this.player2,
                    move2
                );
                break;
        }
        return result;
    }
}
