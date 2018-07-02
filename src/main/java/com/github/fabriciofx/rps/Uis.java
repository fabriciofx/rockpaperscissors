/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2017-2018 Fabrício Barros Cabral
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps;

import java.io.IOException;
import java.util.Map;

/**
 * Collection of user interfaces.
 *
 * @since 1.0
 */
@SuppressWarnings("PMD.ShortMethodName")
public final class Uis {
    /**
     * Defulat user interfaces.
     */
    private final Map.Entry<String, Ui> def;

    /**
     * User interfaces.
     */
    private final Map<String, Ui> all;

    /**
     * Arguments.
     */
    private final String[] arguments;

    /**
     * Ctor.
     * @param def Default interface
     * @param uis All user interfaces
     * @param args Arguments to the user interface
     */
    public Uis(
        final Map.Entry<String, Ui> def,
        final Map<String, Ui> uis,
        final String... args
    ) {
        this.def = def;
        this.all = uis;
        this.arguments = args;
    }

    /**
     * Select the user interface.
     * @return The selected user interface.
     * @throws Exception If a user interface not found
     * @checkstyle MethodNameCheck (10 lines)
     */
    public Ui ui() throws Exception {
        Ui selected = this.def.getValue();
        if (this.arguments.length >= 1) {
            // @checkstyle LocalFinalVariableNameCheck (5 lines)
            boolean found = false;
            for (final Ui ui : this.all.values()) {
                if (this.arguments[0].contains(ui.name())) {
                    selected = ui;
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new IOException(
                    String.format(
                        "User interface '%s' not found!",
                        this.arguments[0]
                    )
                );
            }
        }
        return selected;
    }
}
