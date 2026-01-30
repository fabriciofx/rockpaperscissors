/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;

/**
 * Fake Player.
 *
 * @since 1.0
 */
@SuppressWarnings("PMD.AvoidFieldNameMatchingMethodName")
public final class FakePlayer implements Player {
    /**
     * The player's number.
     */
    private final int id;

    /**
     * The player's move.
     */
    private final Move move;

    /**
     * Ctor.
     * @param move Player's 1 move
     */
    public FakePlayer(final Move move) {
        this(1, move);
    }

    /**
     * Ctor.
     * @param id The player's number
     * @param move The player's move
     */
    public FakePlayer(final int id, final Move move) {
        this.id = id;
        this.move = move;
    }

    @Override
    public String name() {
        return String.format("Player %d", this.id);
    }

    @Override
    public Move move() {
        return this.move;
    }
}
