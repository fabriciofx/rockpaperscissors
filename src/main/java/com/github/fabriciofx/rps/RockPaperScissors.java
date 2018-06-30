/*
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
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.match.PrintedMatch;
import com.github.fabriciofx.rps.match.SmartMatch;
import com.github.fabriciofx.rps.move.SafeMoves;
import com.github.fabriciofx.rps.move.SmartMoves;
import com.github.fabriciofx.rps.player.Computer;
import com.github.fabriciofx.rps.player.Human;
import com.github.fabriciofx.rps.ui.Console;
import com.github.fabriciofx.rps.ui.Gui;

/**
 * The game.
 *
 * @since 1.0
 * @checkstyle ClassDataAbstractionCouplingCheck (100 lines)
 */
public final class RockPaperScissors {
    /**
     * Command line args.
     */
    private final String[] arguments;

    /**
     * Ctor.
     * @param args Command line arguments
     */
    public RockPaperScissors(final String... args) {
        this.arguments = args;
    }

    /**
     * Main.
     * @param args Command line arguments
     * @throws Exception If detected any error
     */
    public static void main(final String... args) throws Exception {
        new RockPaperScissors(args).exec();
    }

    /**
     * Start of the game.
     * @throws Exception If detected any error
     */
    public void exec() throws Exception {
        // @checkstyle LocalFinalVariableNameCheck (1 line)
        final Ui ui = new Uis(
            this.arguments,
            new Console(),
            new Gui()
        ).ui();
        new Attempts(
            new PrintedMatch(
                new SmartMatch(
                    new Computer(
                        new SafeMoves(
                            new SmartMoves()
                        )
                    ),
                    new Human(ui)
                ),
                ui
            ),
            // @checkstyle MagicNumberCheck (1 lines)
            3
        ).matches();
    }
}
