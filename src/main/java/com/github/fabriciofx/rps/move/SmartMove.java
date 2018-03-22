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

public final class SmartMove implements Move {
    private final int code;
    private final String name;

    public SmartMove(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // This algorithm has been found here:
    // https://stackoverflow.com/questions/11377117/rock-paper-scissors-determine-win-loss-tie-using-math
    @Override
    public int compareTo(final Move move) {
        final int cmp;
        if (this.code() == move.code()) {
            cmp = 0;
        } else if ((this.code() - move.code() + 3) % 3 == 1) {
            cmp = -1;
        } else {
            cmp = 1;
        }
        return cmp;
    }
}
