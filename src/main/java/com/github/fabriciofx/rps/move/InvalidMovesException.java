/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

/**
 * Invalid moves exception.
 *
 * @since 1.0
 */
public final class InvalidMovesException extends IllegalArgumentException {
    private static final long serialVersionUID = 2692386514120488638L;

    /**
     * Ctor.
     */
    public InvalidMovesException() {
        super("moves is invalid (null)");
    }
}
