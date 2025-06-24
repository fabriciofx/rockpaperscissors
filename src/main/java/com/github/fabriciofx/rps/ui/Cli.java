/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Cli user interface.
 *
 * @since 1.0
 */
public final class Cli implements Ui {
    /**
     * Cli input.
     */
    private final InputStream input;

    /**
     * Cli output.
     */
    private final OutputStream output;

    /**
     * Ctor.
     */
    public Cli() {
        this(System.in, System.out);
    }

    /**
     * Ctor.
     * @param npt Cli input
     * @param tpt Cli output
     */
    public Cli(final InputStream npt, final OutputStream tpt) {
        this.input = npt;
        this.output = tpt;
    }

    @Override
    public String name() {
        return "console";
    }

    @Override
    public void show(final String message) {
        new PrintStream(this.output).print(message);
    }

    @Override
    public String value(final String message) {
        this.show(message);
        return new Scanner(this.input).next();
    }
}
