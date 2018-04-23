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
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.ResultMatch;
import com.github.fabriciofx.rps.Ui;

/**
 * Printed Match.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 1.0
 */
public final class PrintedMatch implements Match {
    /**
     * Decorated match.
     */
    private final Match origin;

    /**
     * The user interface.
     * @checkstyle MemberNameCheck (2 lines)
     */
    private final Ui ui;

    /**
     * Ctor.
     * @param match Match to be decorated
     * @param ui The user interface
     * @checkstyle ParameterNameCheck (3 lines)
     * @checkstyle MemberNameCheck (2 lines)
     */
    public PrintedMatch(final Match match, final Ui ui) {
        this.origin = match;
        this.ui = ui;
    }

    @Override
    public ResultMatch result() {
        final ResultMatch result = this.origin.result();
        this.ui.print(result.asString());
        return result;
    }
}
