/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * A move.
 *
 * @since 1.0
 */
public interface Move extends Comparable<Move> {
    /**
     * Perform the move's code.
     * @return The move's code
     */
    int code();
}
