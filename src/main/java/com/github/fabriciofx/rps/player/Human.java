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
package com.github.fabriciofx.rps.player;

import com.github.fabriciofx.rps.Move;
import com.github.fabriciofx.rps.Player;
import com.github.fabriciofx.rps.Ui;
import com.github.fabriciofx.rps.move.StringAsMove;
import com.github.fabriciofx.rps.ui.Cli;
import com.github.fabriciofx.rps.ui.FilteredUi;

/**
 * Human player.
 *
 * @since 1.0
 */
public final class Human implements Player {
    /**
     * User interface.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Ui ui;

    /**
     * Ctor.
     */
    public Human() {
        this(new Cli());
    }

    /**
     * Ctor.
     * @param ui User interface
     * @checkstyle ParameterNameCheck (2 lines)
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
