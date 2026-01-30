/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.game.RockPaperScissors;

/**
 * Main.
 *
 * @since 1.4
 */
public final class Main {
    /**
     * Private ctor.
     */
    private Main() {
        // Empty on purpose
    }

    /**
     * Main method.
     * @param args The program arguments
     */
    public static void main(final String[] args) {
        new RockPaperScissors(args).run();
    }
}
