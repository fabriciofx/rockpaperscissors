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

import com.github.fabriciofx.rps.ui.Console;
import com.github.fabriciofx.rps.ui.Gui;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Collection of user interfaces.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
@SuppressWarnings({"PMD.ShortMethodName", "PMD.NonStaticInitializer"})
public final class Uis {
    /**
     * Default user interface.
     */
    private static final String DEFAULT = "--console";

    /**
     * Map user interface name to the user interface.
     */
    private final Map<String, Ui> map;

    /**
     * Arguments.
     */
    private final String[] args;

    /**
     * Ctor.
     * @param args Arguments to the user interface
     */
    public Uis(final String... args) {
        this(
            new HashMap<String, Ui>() {
                private static final long serialVersionUID = -9006497991653108409L;
                {
                    put("--console", new Console());
                    put("--gui", new Gui());
                }
            },
            args.length > 0 ? args[0] : "--console"
        );
    }

    /**
     * Ctor.
     * @param uis All user interfaces
     * @param args Arguments to the user interface
     */
    public Uis(final Map<String, Ui> uis, final String... args) {
        this.map = uis;
        this.args = args;
    }

    /**
     * Select the user interface.
     * @return The selected user interface.
     * @checkstyle MethodNameCheck (2 lines)
     */
    public Ui ui() {
        return this.uis.get(this.args[0]);
    }
}
