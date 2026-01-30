/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
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
     * @param input Cli input
     * @param output Cli output
     */
    public Cli(final InputStream input, final OutputStream output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public String name() {
        return "console";
    }

    @Override
    public void show(final String message) {
        new PrintStream(
            this.output,
            true,
            StandardCharsets.UTF_8
        ).print(message);
    }

    @Override
    public String value(final String message) {
        this.show(message);
        return new Scanner(this.input, StandardCharsets.UTF_8).next();
    }
}
