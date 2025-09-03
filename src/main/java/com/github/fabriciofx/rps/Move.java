/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
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
     * Return the move's code.
     * @return The move's code
     */
    int code();
}
