/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
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
