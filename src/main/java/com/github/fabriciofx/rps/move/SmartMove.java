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

/**
 * Default move.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class SmartMove implements Move {
    /**
     * Move's cod.
     */
    private final int cod;

    /**
     * Move's name.
     */
    private final String name;

    /**
     * Ctor.
     * @param cod The cod of the move
     * @param nam The name of the move
     */
    public SmartMove(final int cod, final String nam) {
        this.cod = cod;
        this.name = nam;
    }

    @Override
    public int code() {
        return this.cod;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // This algorithm has been found here:
    // https://stackoverflow.com/questions/11377117/
    //   rock-paper-scissors-determine-win-loss-tie-using-math
    @Override
    public int compareTo(final Move move) {
        final int cmp;
        if (this.cod == move.code()) {
            cmp = 0;
            // @checkstyle MagicNumberCheck (1 lines)
        } else if ((this.cod - move.code() + 3) % 3 == 1) {
            cmp = -1;
        } else {
            cmp = 1;
        }
        return cmp;
    }
}
