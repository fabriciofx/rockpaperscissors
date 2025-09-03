/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import java.util.List;

/**
 * Results of all rounds.
 *
 * @since 1.4
 */
public interface Rounds {
    /**
     * Execute the matches and return the result of them.
     * @return Result of all matches
     */
    List<Result> results();
}
