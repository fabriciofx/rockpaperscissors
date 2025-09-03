/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.rounds;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.Result;
import com.github.fabriciofx.rps.Rounds;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform attempts.
 *
 * @since 1.0
 */
public final class RoundsOf implements Rounds {
    /**
     * Results of the matches.
     */
    private final List<Result> results;

    /**
     * Match.
     */
    private final Match match;

    /**
     * Number max of matches.
     */
    private final int max;

    /**
     * Ctor.
     * @param match Match to be printed
     * @param max Number max of matches
     */
    public RoundsOf(final Match match, final int max) {
        this(new ArrayList<>(), match, max);
    }

    /**
     * Ctor.
     * @param results List os results
     * @param match Match to be printed
     * @param max Number max of matches
     */
    public RoundsOf(
        final List<Result> results,
        final Match match,
        final int max
    ) {
        this.results = results;
        this.match = match;
        this.max = max;
    }

    /**
     * Check if the rounds reach the max.
     *
     * @return The results of each match
     */
    @Override
    public List<Result> results() {
        int rounds = 0;
        while (rounds < this.max) {
            this.results.add(this.match.run());
            ++rounds;
        }
        return this.results;
    }
}
