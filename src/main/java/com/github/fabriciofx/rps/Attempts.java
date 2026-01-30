/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * Attempts interface.
 *
 * @since 1.4
 */
@FunctionalInterface
public interface Attempts {
    /**
     * Check if the attempts reach the max.
     *
     * @return True if the attempts reach the max
     */
    boolean matches();
}
