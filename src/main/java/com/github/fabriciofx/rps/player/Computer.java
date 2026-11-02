/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.move.MovesOf;
import com.github.fabriciofx.rps.move.SafeMoves;
import java.security.SecureRandom;

/**
 * Computer Player.
 *
 * @since 1.0
 */
public final class Computer implements Player {

    /**
     * The random.
     */
    private final SecureRandom random;

    /**
     * The moves.
     */
    private final Moves moves;

    /**
     * Ctor.
     */
    public Computer() {
        this(
            new SafeMoves(
                new MovesOf()
            ),
            new SecureRandom()
        );
    }

    /**
     * Ctor.
     *
     * @param moves All possible moves
     */
    public Computer(final Moves moves) {
        this(moves, new SecureRandom());
    }

    /**
     * Ctor.
     *
     * @param moves All possible moves
     * @param random Pseudo aleatory random number generator
     */
    public Computer(final Moves moves, final SecureRandom random) {
        this.moves = moves;
        this.random = random;
    }

    @Override
    public String name() {
        return "The Computer";
    }

    @Override
    public Move move() {
        return this.moves.move(this.random.nextInt(3));
    }
}
