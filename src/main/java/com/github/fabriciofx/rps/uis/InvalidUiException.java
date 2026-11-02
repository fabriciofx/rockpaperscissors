/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.uis;

import java.util.Collection;

/**
 * Invalid user interface exception.
 *
 * @since 1.4
 */
public final class InvalidUiException extends IllegalArgumentException {

    private static final long serialVersionUID = 1123841572087653742L;

    /**
     * Ctor.
     *
     * @param key The requested user interface key
     * @param keys The registered user interface keys
     */
    public InvalidUiException(final String key, final Collection<String> keys) {
        super(
            String.format(
                "user interface '%s' not found, use one of %s",
                key,
                keys
            )
        );
    }
}
