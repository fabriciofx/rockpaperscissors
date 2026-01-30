/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * Perform attempts.
 *
 * @since 1.0
 */
public final class Attempts {

    /**
     * Match.
     */
    private final Match match;

    /**
     * Number max of attempts.
     */
    private final int max;

    /**
     * Ctor.
     * @param match Match to be printed
     * @param max Number max of attempts
     */
    public Attempts(final Match match, final int max) {
        this.match = match;
        this.max = max;
    }

    /**
     * Check if the attempts reach the max.
     *
     * @return True if the attempts reach the max
     */
    public boolean matches() {
        int attempts = 0;
        while (attempts < this.max) {
            this.match.result();
            ++attempts;
        }
        return attempts <= this.max;
    }
}
