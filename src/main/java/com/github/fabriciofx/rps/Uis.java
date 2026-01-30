/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Collection of user interfaces.
 *
 * @since 1.0
 */
@SuppressWarnings({"PMD.SystemPrintln", "PMD.DoNotTerminateVM"})
public final class Uis {
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
    public Uis(
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
    public Uis(
        final Map.Entry<String, Ui> def,
        final Map<String, Ui> uis,
        final List<String> args
    ) {
        this.def = def;
        this.all = uis;
        this.arguments = args;
    }

    /**
     * Select the user interface.
     *
     * @return The selected user interface.
     */
    public Ui select() {
        Ui selected = this.def.getValue();
        if (!this.arguments.isEmpty()) {
            boolean found = false;
            for (final Ui iface : this.all.values()) {
                if (this.arguments.get(0).contains(iface.name())) {
                    selected = iface;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.err.printf(
                    "User interface '%s' not found! You must use %s%n",
                    this.arguments.get(0),
                    this.all.keySet()
                );
                System.exit(1);
            }
        }
        return selected;
    }
}
