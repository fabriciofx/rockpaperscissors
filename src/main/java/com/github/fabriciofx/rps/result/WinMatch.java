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
package com.github.fabriciofx.rps.result;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.ResultMatch;

/**
 * Winner Match.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class WinMatch implements ResultMatch {
    /**
     * Winner player.
     */
    private final Player winner;

    /**
     * Winner player move.
     */
    private final Move one;

    /**
     * Looser player.
     */
    private final Player looser;

    /**
     * Looser player move.
     */
    private final Move two;

    /**
     * Ctor.
     * @param winner Winner player
     * @param one Winner player move
     * @param looser Looser player
     * @param two Looser player move
     * @checkstyle ParameterNumberCheck (6 lines)
     */
    public WinMatch(
        final Player winner,
        final Move one,
        final Player looser,
        final Move two
    ) {
        this.winner = winner;
        this.one = one;
        this.looser = looser;
        this.two = two;
    }

    @Override
    public String toString() {
        return String.format(
            "%s wins!! %s played %s and %s played %s\n",
            this.winner.name(),
            this.winner.name(),
            this.one,
            this.looser.name(),
            this.two
        );
    }
}
