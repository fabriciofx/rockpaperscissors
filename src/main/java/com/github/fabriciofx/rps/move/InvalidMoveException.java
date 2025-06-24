/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

/**
 * Invalid move exception.
 *
 * @since 1.0
 */
public final class InvalidMoveException extends IllegalArgumentException {
    private static final long serialVersionUID = 5814831787607231801L;

    /**
     * Ctor.
     */
    public InvalidMoveException() {
        super("move is invalid (null)");
    }
}
