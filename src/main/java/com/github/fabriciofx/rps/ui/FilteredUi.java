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
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;

/**
 * Filter user interface input.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class FilteredUi implements Ui {
    /**
     * User interface.
     */
    private final Ui origin;

    /**
     * Regular expression to be filtered.
     */
    private final String regex;

    /**
     * Ctor.
     * @param ui The user interface
     * @param rgx Regular expression filter
     * @checkstyle ParameterNameCheck (2 lines)
     */
    public FilteredUi(final Ui ui, final String rgx) {
        this.origin = ui;
        this.regex = rgx;
    }

    @Override
    public String name() {
        return "filtered";
    }

    @Override
    public void print(final String message) {
        this.origin.print(message);
    }

    @Override
    public String value(final String message) {
        final String val = this.origin.value(message);
        if (!val.matches(this.regex)) {
            throw new IllegalArgumentException("error: out of specification");
        }
        return val;
    }
}
