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
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.move.Move;

public final class Match {
    private final Player one;
    private final Player two;

    public Match(final Player one, final Player two) {
        this.one = one;
        this.two = two;
    }

    public ResultMatch result() {
        final Move one = this.one.move();
        final Move two = this.two.move();
        final ResultMatch result;
        switch(one.compareTo(two)) {
        case -1:
            result = new WinMatch(this.one, one, this.two, two);
            break;
        case 1:
            result = new WinMatch(this.two, two, this.one, one);
            break;
        default:
            result = new TieMatch(this.one, one, this.two, two);
        }
        return result;
    }
}
