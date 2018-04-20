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
package com.github.fabriciofx.rps.move;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Moves;

/**
 * Convert a string to move.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class StringAsMove implements Move {
    /**
     * Moves.
     */
    private final Moves moves;

    /**
     * Move as string.
     */
    private final String value;

    /**
     * Ctor.
     * @param value String to be converted to move
     */
    public StringAsMove(final String value) {
        this(
            new SafeMoves(
                new SmartMoves()
            ),
            value
        );
    }

    /**
     * Ctor.
     * @param mvs All possible moves
     * @param val String to be converted to move
     */
    public StringAsMove(final Moves mvs, final String val) {
        this.moves = mvs;
        this.value = val;
    }

    @Override
    public int compareTo(final Move move) {
        return this.moves.move(this.code()).compareTo(move);
    }

    @Override
    public int code() {
        int code = 0;
        switch(this.value.charAt(0)) {
        case 'r':
        case 'R':
            code = 0;
            break;
        case 'p':
        case 'P':
            code = 1;
            break;
        case 's':
        case 'S':
            code = 2;
            break;
        }
        return code;
    }

    @Override
    public String toString() {
        return this.moves.move(this.code()).toString();
    }
}
