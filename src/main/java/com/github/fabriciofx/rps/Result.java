/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * The match result.
 *
 * @since 1.0
 */
public interface Result {
    /**
     * Encoding the result of the match into a string.
     * @return The result as a string
     */
    String asString();
}
