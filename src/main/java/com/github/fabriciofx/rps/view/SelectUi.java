/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2017 Fabrício Barros Cabral
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
package com.github.fabriciofx.rps.view;

import java.util.HashMap;
import java.util.Map;

public final class SelectUi {
    private final Map<String, Ui> uis;

    public SelectUi() {
        this(
            new HashMap<String, Ui>() {
                private static final long serialVersionUID = -9006497991653108409L;
                {
                    put("--console", new Console());
                    put("--gui", new Gui());
                }
            }
        );
    }

    public SelectUi(final Map<String, Ui> uis) {
        this.uis = uis;
    }

    public Ui select(final String... args) {
        final String selected;
        if (args != null && args.length >= 1 && this.uis.containsKey(args[0])) {
            selected = args[0];
        } else {
            selected = "--console";
        }
        return this.uis.get(selected);
    }
}
