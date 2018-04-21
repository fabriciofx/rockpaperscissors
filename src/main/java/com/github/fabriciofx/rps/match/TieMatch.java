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
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.ResultMatch;

/**
 * Tie Match.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class TieMatch implements ResultMatch {
    /**
     * Player 1.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player1;

    /**
     * Player 1 move.
     */
    private final Move one;

    /**
     * Player 2.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player2;

    /**
     * Player 2 move.
     */
    private final Move two;

    /**
     * Ctor.
     * @param plyr1 Player 1
     * @param one Player 1 move
     * @param plyr2 Player 2
     * @param two Player 2 move
     * @checkstyle ParameterNameCheck (6 lines)
     * @checkstyle ParameterNumberCheck (6 lines)
     */
    public TieMatch(
        final Player plyr1,
        final Move one,
        final Player plyr2,
        final Move two
    ) {
        this.player1 = plyr1;
        this.one = one;
        this.player2 = plyr2;
        this.two = two;
    }

    @Override
    public String toString() {
        return String.format(
            "Tie!! %s played %s and %s played %s\n",
            this.player1.name(),
            this.one,
            this.player2.name(),
            this.two
        );
    }
}
