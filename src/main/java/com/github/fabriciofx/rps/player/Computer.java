/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.move.MovesOf;
import com.github.fabriciofx.rps.move.SafeMoves;
import java.util.Random;

/**
 * Computer Player.
 *
 * @since 1.0
 */
public final class Computer implements Player {
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
            )
        );
    }

    /**
     * Ctor.
     * @param moves All possible moves
     */
    public Computer(final Moves moves) {
        this.moves = moves;
    }

    @Override
    public String name() {
        return "The Computer";
    }

    @Override
    public Move move() {
        // @checkstyle MagicNumberCheck (1 lines)
        return this.moves.move(new Random().nextInt(3));
    }
}
