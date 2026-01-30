/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * The game.
 *
 * @since 1.4
 */
@FunctionalInterface
public interface Game {
    /**
     * Start of the game.
     */
    void run();
}
