/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2017 Fabrício Barros Cabral
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
import com.github.fabriciofx.rps.move.SafeMoves;
import com.github.fabriciofx.rps.move.SmartMoves;

public final class StringAsMove implements Move {
    private final Moves moves;
    private final CharSequence string;

    public StringAsMove(final CharSequence string) {
        this(
            new SafeMoves(
                new SmartMoves()
            ),
            string
        );
    }

    public StringAsMove(final Moves moves, final CharSequence string) {
        this.moves = moves;
        this.string = string;
    }

    @Override
    public int compareTo(final Move move) {
        return this.moves.move(this.code()).compareTo(move);
    }

    @Override
    public int code() {
        int code = 0;
        switch(this.string.charAt(0)) {
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
