/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.game;

import com.github.fabriciofx.rps.Game;
import com.github.fabriciofx.rps.Ui;
import com.github.fabriciofx.rps.Uis;
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
public final class RockPaperScissors implements Game {
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
     * @param arguments Command line args
     */
    public RockPaperScissors(final String... arguments) {
        this(Arrays.asList(arguments));
    }

    /**
     * Ctor.
     * @param arguments Command line args
     */
    public RockPaperScissors(final List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public void run() {
        final Ui iface = new Uis(
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
                    new Human(iface)
                ),
                iface
            ),
            RockPaperScissors.NUM_ATTEMPTS
        ).matches();
    }
}
