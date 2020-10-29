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
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.ResultMatch;
import com.github.fabriciofx.rps.result.TieResultMatch;
import com.github.fabriciofx.rps.result.WinResultMatch;

/**
 * Default Match implementation.
 *
 * @since 1.0
 */
public final class SmartMatch implements Match {
    /**
     * Player 1.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player1;

    /**
     * Player 2.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Player player2;

    /**
     * Ctor.
     * @param one Player 1
     * @param two Player 2
     */
    public SmartMatch(final Player one, final Player two) {
        this.player1 = one;
        this.player2 = two;
    }

    @Override
    public ResultMatch result() {
        //@checkstyle LocalFinalVariableNameCheck (2 lines)
        final Move move1 = this.player1.move();
        final Move move2 = this.player2.move();
        final ResultMatch result;
        switch (move1.compareTo(move2)) {
            case -1:
                result = new WinResultMatch(
                    this.player1,
                    move1,
                    this.player2,
                    move2
                );
                break;
            case 1:
                result = new WinResultMatch(
                    this.player2,
                    move2,
                    this.player1,
                    move1
                );
                break;
            default:
                result = new TieResultMatch(
                    this.player1,
                    move1,
                    this.player2,
                    move2
                );
                break;
        }
        return result;
    }
}
