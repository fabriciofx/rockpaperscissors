/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * The player.
 *
 * @since 1.0
 */
public interface Player {

    /**
     * The player's name.
     * @return The name of the player
     */
    String name();

    /**
     * The player's move.
     * @return The move of the player
     */
    Move move();
}
