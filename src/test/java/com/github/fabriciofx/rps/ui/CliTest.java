/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Cli tests.
 *
 * @since 1.4
 */
final class CliTest {

    @Test
    void readsSecondValueAfterFirst() {
        final Ui cli = new Cli(
            new ByteArrayInputStream(
                "kq7 Zx2".getBytes(StandardCharsets.UTF_8)
            ),
            new ByteArrayOutputStream()
        );
        cli.value("");
        MatcherAssert.assertThat(
            "Cli lost the second value after reading the first one",
            cli.value(""),
            Matchers.equalTo("Zx2")
        );
    }
}
