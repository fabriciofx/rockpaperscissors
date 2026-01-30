/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.attempts.AttemptsOf;
import com.github.fabriciofx.rps.map.MapEntry;
import com.github.fabriciofx.rps.map.MapOf;
import com.github.fabriciofx.rps.match.MatchOf;
import com.github.fabriciofx.rps.match.Printed;
import com.github.fabriciofx.rps.move.MovesOf;
import com.github.fabriciofx.rps.move.SafeMoves;
import com.github.fabriciofx.rps.player.Computer;
import com.github.fabriciofx.rps.player.Human;
import com.github.fabriciofx.rps.ui.Cli;
import com.github.fabriciofx.rps.ui.Gui;
import java.util.Arrays;
import java.util.List;

/**
 * The game.
 *
 * @since 1.0
 * @checkstyle ClassDataAbstractionCouplingCheck (100 lines)
 */
public final class RockPaperScissors {
    /**
     * Default attempts.
     */
    private static final int NUM_ATTEMPTS = 3;

    /**
     * Command line args.
     */
    private final List<String> arguments;

    /**
     * Ctor.
     * @param args Command line arguments
     */
    public RockPaperScissors(final String... args) {
        this.arguments = Arrays.asList(args);
    }

    /**
     * Main.
     * @param args Command line arguments
     * @throws Exception If detected any error
     */
    public static void main(final String... args) throws Exception {
        new RockPaperScissors(args).run();
    }

    /**
     * Start of the game.
     */
    @SuppressWarnings("unchecked")
    public void run() {
        // @checkstyle LocalFinalVariableNameCheck (1 line)
        final Ui ui = new Uis(
            new MapEntry<>("--cli", new Cli()),
            new MapOf<>(
                new MapEntry<>("--cli", new Cli()),
                new MapEntry<>("--gui", new Gui())
            ),
            this.arguments
        ).select();
        new AttemptsOf(
            new Printed(
                new MatchOf(
                    new Computer(
                        new SafeMoves(
                            new MovesOf()
                        )
                    ),
                    new Human(ui)
                ),
                ui
            ),
            RockPaperScissors.NUM_ATTEMPTS
        ).matches();
    }
}
