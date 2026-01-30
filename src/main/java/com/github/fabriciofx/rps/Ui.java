/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * User interface.
 *
 * @since 1.0
 */
public interface Ui {
    /**
     * Return the user interface name.
     * @return The user interface name
     */
    String name();

    /**
     * Show a message using the user interface.
     * @param message The message to be show
     */
    void show(String message);

    /**
     * Get a value based into the message showed.
     * @param message The message to be showed
     * @return The value I got
     */
    String value(String message);
}
