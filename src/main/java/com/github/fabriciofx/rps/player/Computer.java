/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2017-2018 Fabricio Barros Cabral
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.move.SafeMoves;
import com.github.fabriciofx.rps.move.SmartMoves;
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
                new SmartMoves()
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
