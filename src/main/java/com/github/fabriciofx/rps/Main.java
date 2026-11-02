/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.game.RockPaperScissors;
import com.github.fabriciofx.rps.uis.InvalidUiException;

/**
 * Main.
 *
 * @since 1.4
 */
@SuppressWarnings("PMD.SystemPrintln")
public final class Main {

    /**
     * Private ctor.
     */
    private Main() {
        // Empty on purpose
    }

    /**
     * Main method.
     *
     * @param args The program arguments
     */
    public static void main(final String[] args) {
        try {
            new RockPaperScissors(args).run();
        } catch (final InvalidUiException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
        }
    }
}
