/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.uis;

import com.github.fabriciofx.rps.Ui;
import com.github.fabriciofx.rps.Uis;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Collection of user interfaces.
 *
 * @since 1.0
 */
public final class UisOf implements Uis {

    /**
     * Default user interfaces.
     */
    private final Map.Entry<String, Ui> def;

    /**
     * User interfaces.
     */
    private final Map<String, Ui> all;

    /**
     * Arguments.
     */
    private final List<String> arguments;

    /**
     * Ctor.
     *
     * @param def Default interface
     * @param uis All user interfaces
     * @param args Arguments to the user interface
     */
    public UisOf(
        final Map.Entry<String, Ui> def,
        final Map<String, Ui> uis,
        final String... args
    ) {
        this(def, uis, Arrays.asList(args));
    }

    /**
     * Ctor.
     *
     * @param def Default interface
     * @param uis All user interfaces
     * @param args Arguments to the user interface
     */
    public UisOf(
        final Map.Entry<String, Ui> def,
        final Map<String, Ui> uis,
        final List<String> args
    ) {
        this.def = def;
        this.all = uis;
        this.arguments = args;
    }

    @Override
    public Ui select() {
        Ui selected = this.def.getValue();
        if (!this.arguments.isEmpty()) {
            final String key = this.arguments.get(0);
            if (!this.all.containsKey(key)) {
                throw new InvalidUiException(key, this.all.keySet());
            }
            selected = this.all.get(key);
        }
        return selected;
    }
}
