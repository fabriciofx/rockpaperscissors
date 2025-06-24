/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;

/**
 * Filter user interface input.
 *
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
     * @param regex Regular expression filter
     * @checkstyle ParameterNameCheck (2 lines)
     */
    public FilteredUi(final Ui ui, final String regex) {
        this.origin = ui;
        this.regex = regex;
    }

    @Override
    public String name() {
        return "filtered";
    }

    @Override
    public void show(final String message) {
        this.origin.show(message);
    }

    @Override
    public String value(final String message) {
        String val;
        while (true) {
            val = this.origin.value(message);
            if (val.matches(this.regex)) {
                break;
            } else {
                this.origin.show(
                    String.format(
                        "Invalid input '%s'. Try it again.\n",
                        val
                    )
                );
            }
        }
        return val;
    }
}
