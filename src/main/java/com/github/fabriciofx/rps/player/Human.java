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
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.misc.StringAsMove;
import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.ui.Console;
import com.github.fabriciofx.rps.Ui;
import com.github.fabriciofx.rps.ui.FilteredUi;

/**
 * Human player.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class Human implements Player {
    /**
     * User interface.
     */
    private final Ui ui;

    /**
     * Ctor.
     */
    public Human() {
        this(new Console());
    }

    /**
     * Ctor.
     * @param ui User interface
     */
    public Human(final Ui ui) {
        this.ui = new FilteredUi(ui, "[rpsRPS]");
    }

    @Override
    public String name() {
        return "You";
    }

    @Override
    public Move move() {
        return new StringAsMove(
            this.ui.value("What is your move (Rock, Paper or Scissors)? ")
        );
    }
}
