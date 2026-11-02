/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.llorllale.cactoos.matchers.Assertion;

/**
 * Cli tests.
 *
 * @since 1.4
 */
final class CliTest {

    @Test
    void readsSecondValueAfterFirst() {
        new Assertion<>(
            "Cli lost the second value after reading the first one",
            new Filtered(
                new Cli(
                    new ByteArrayInputStream(
                        "kq7 Zx2".getBytes(StandardCharsets.UTF_8)
                    ),
                    new ByteArrayOutputStream()
                ),
                "Zx2"
            ).value(""),
            Matchers.equalTo("Zx2")
        ).affirm();
    }
}
