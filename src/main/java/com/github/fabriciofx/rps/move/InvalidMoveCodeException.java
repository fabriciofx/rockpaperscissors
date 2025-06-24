/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

/**
 * Invalid move code exception.
 *
 * @since 1.0
 */
public final class InvalidMoveCodeException extends IllegalArgumentException {
    private static final long serialVersionUID = 7380630554895576829L;

    /**
     * Ctor.
     * @param code The invalid move code
     */
    public InvalidMoveCodeException(final int code) {
        super(
            String.format(
                // @checkstyle LineLengthCheck (1 lines)
                "invalid move code (%d). The code must be something between 0 or 2",
                code
            )
        );
    }
}
