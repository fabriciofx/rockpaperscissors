/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Cli filter tests.
 *
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
final class FilteredUiTest {
    @Test
    void correct() {
        MatcherAssert.assertThat(
            "Can't read correct value at filtered ui",
            new FilteredUi(
                new Cli(
                    new ByteArrayInputStream(
                        "r".getBytes(StandardCharsets.UTF_8)
                    ),
                    System.out
                ),
                "[rpsRPS]"
            ).value(""),
            Matchers.equalTo("r")
        );
    }
}
