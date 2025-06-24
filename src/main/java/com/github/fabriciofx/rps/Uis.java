/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Collection of user interfaces.
 *
 * @since 1.0
 */
@SuppressWarnings("PMD.ShortMethodName")
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
     * @throws Exception If a user interface not found
     * @checkstyle MethodNameCheck (10 lines)
     */
    public Ui ui() throws Exception {
        Ui selected = this.def.getValue();
        if (this.arguments.size() >= 1) {
            // @checkstyle LocalFinalVariableNameCheck (5 lines)
            boolean found = false;
            for (final Ui ui : this.all.values()) {
                if (this.arguments.get(0).contains(ui.name())) {
                    selected = ui;
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new IOException(
                    String.format(
                        "User interface '%s' not found!",
                        this.arguments.get(0)
                    )
                );
            }
        }
        return selected;
    }
}
