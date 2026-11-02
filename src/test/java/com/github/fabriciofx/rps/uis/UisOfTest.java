/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.uis;

import com.github.fabriciofx.rps.Ui;
import com.github.fabriciofx.rps.map.MapEntry;
import com.github.fabriciofx.rps.map.MapOf;
import com.github.fabriciofx.rps.ui.Cli;
import com.github.fabriciofx.rps.ui.Gui;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * UisOf tests.
 *
 * @since 1.4
 */
final class UisOfTest {

    @Test
    void selectsCliWhenAskedByArgument() {
        final Ui cli = new Cli(
            new ByteArrayInputStream(
                "w9q".getBytes(StandardCharsets.UTF_8)
            ),
            new ByteArrayOutputStream()
        );
        MatcherAssert.assertThat(
            "UisOf ignored the cli argument and picked another interface",
            new UisOf(
                new MapEntry<>("--gui", new Gui()),
                new MapOf<>(
                    new MapEntry<>("--cli", cli),
                    new MapEntry<>("--gui", new Gui())
                ),
                "--cli"
            ).select(),
            Matchers.sameInstance(cli)
        );
    }
}
