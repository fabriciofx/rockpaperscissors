/**
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
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps;

import java.io.IOException;
import java.util.Arrays;

/**
 * Collection of user interfaces.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
@SuppressWarnings("PMD.ShortMethodName")
public final class Uis {
    /**
     * Arguments.
     */
    private final String[] arguments;

    /**
     * User interfaces.
     */
    private final Ui[] all;

    /**
     * Ctor.
     * @param uis All user interfaces
     * @param args Arguments to the user interface
     */
    public Uis(final String[] args, final Ui... uis) {
        this.arguments = Arrays.copyOf(args, args.length);
        this.all = uis;
    }

    /**
     * Select the user interface.
     * @return The selected user interface.
     * @throws IOException If a user interface not found
     * @checkstyle MethodNameCheck (10 lines)
     */
    public Ui ui() throws IOException {
        final String name;
        if (this.arguments.length < 1) {
            name = "--console";
        } else {
            name = this.arguments[0];
        }
        // @checkstyle LocalFinalVariableNameCheck (5 lines)
        for (final Ui ui : this.all) {
            if (name.contains(ui.name())) {
                return ui;
            }
        }
        throw new IOException(
            String.format(
                "User interface '%s' not found!",
                this.arguments[0]
            )
        );
    }
}
