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
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Console user interface.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class Console implements Ui {
    /**
     * Console input.
     */
    private final InputStream input;

    /**
     * Console output.
     */
    private final OutputStream output;

    /**
     * Ctor.
     */
    public Console() {
        this(System.in, System.out);
    }

    /**
     * Ctor.
     * @param npt Console input
     * @param tpt Console output
     */
    public Console(final InputStream npt, final OutputStream tpt) {
        this.input = npt;
        this.output = tpt;
    }

    @Override
    public void print(final String message) {
        new PrintStream(this.output).print(message);
    }

    @Override
    public String value(final String message) {
        this.print(message);
        return new Scanner(this.input).next();
    }
}
