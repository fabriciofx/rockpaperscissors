/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.match;

import com.github.fabriciofx.rps.Match;
import com.github.fabriciofx.rps.Result;
import com.github.fabriciofx.rps.Ui;

/**
 * Printed Match.
 *
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
    public Result result() {
        final Result result = this.origin.result();
        this.ui.show(result.asString());
        return result;
    }
}
