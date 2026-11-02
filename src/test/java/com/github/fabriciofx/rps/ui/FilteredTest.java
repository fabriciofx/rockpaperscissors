/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.llorllale.cactoos.matchers.Assertion;

/**
 * Cli filter tests.
 *
 * @since 1.0
 */
final class FilteredTest {

    @Test
    void correct() {
        new Assertion<>(
            "Can't read correct value at filtered ui",
            new Filtered(
                new Cli(
                    new ByteArrayInputStream(
                        "r".getBytes(StandardCharsets.UTF_8)
                    ),
                    System.out
                ),
                "[rpsRPS]"
            ).value(""),
            Matchers.equalTo("r")
        ).affirm();
    }
}
