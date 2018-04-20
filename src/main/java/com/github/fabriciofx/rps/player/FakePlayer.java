/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2017-2018 Fabrício Barros Cabral
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
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.Move;

/**
 * Fake Player.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class FakePlayer implements Player {
    /**
     * The player's number.
     */
    private final int id;
    private final Move move;

    /**
     * The player's move.
     */
    private final Move mov;

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
