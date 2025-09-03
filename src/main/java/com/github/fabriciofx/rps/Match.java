/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * A match.
 *
 * @since 1.0
 */
public interface Match {
    /**
     * Perform the match.
     * @return The result of the match
     */
    Result run();
}
