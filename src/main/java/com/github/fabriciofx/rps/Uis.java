/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

/**
 * User interfaces.
 *
 * @since 1.4
 */
@FunctionalInterface
public interface Uis {
    /**
     * Select a user interface.
     * @return The selected user interface
     */
    Ui select();
}
