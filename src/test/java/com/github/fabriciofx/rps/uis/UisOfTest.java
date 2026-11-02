/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.uis;

import com.github.fabriciofx.rps.map.MapEntry;
import com.github.fabriciofx.rps.map.MapOf;
import com.github.fabriciofx.rps.ui.Cli;
import com.github.fabriciofx.rps.ui.Gui;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.llorllale.cactoos.matchers.Assertion;
import org.llorllale.cactoos.matchers.Throws;

/**
 * UisOf tests.
 *
 * @since 1.4
 */
final class UisOfTest {

    @Test
    void selectsCliWhenAskedByArgument() {
        new Assertion<>(
            "UisOf ignored the cli argument and picked another interface",
            new UisOf(
                new MapEntry<>(
                    "--gui",
                    new Cli(
                        new ByteArrayInputStream(
                            "Gq0".getBytes(StandardCharsets.UTF_8)
                        ),
                        new ByteArrayOutputStream()
                    )
                ),
                new MapOf<>(
                    new MapEntry<>(
                        "--cli",
                        new Cli(
                            new ByteArrayInputStream(
                                "w9q".getBytes(StandardCharsets.UTF_8)
                            ),
                            new ByteArrayOutputStream()
                        )
                    ),
                    new MapEntry<>("--gui", new Gui())
                ),
                "--cli"
            ).select().value(""),
            Matchers.equalTo("w9q")
        ).affirm();
    }

    @Test
    void selectsInterfaceByItsArgumentKey() {
        new Assertion<>(
            "UisOf cannot find the interface registered under its key",
            new UisOf(
                new MapEntry<>(
                    "--window",
                    new Cli(
                        new ByteArrayInputStream(
                            "mT3".getBytes(StandardCharsets.UTF_8)
                        ),
                        new ByteArrayOutputStream()
                    )
                ),
                new MapOf<>(
                    new MapEntry<>(
                        "--terminal",
                        new Cli(
                            new ByteArrayInputStream(
                                "Lp4".getBytes(StandardCharsets.UTF_8)
                            ),
                            new ByteArrayOutputStream()
                        )
                    ),
                    new MapEntry<>("--window", new Gui())
                ),
                "--terminal"
            ).select().value(""),
            Matchers.equalTo("Lp4")
        ).affirm();
    }

    @Test
    void rejectsArgumentThatOnlyContainsKey() {
        new Assertion<>(
            "UisOf accepted an argument that is not a registered key",
            () -> new UisOf(
                new MapEntry<>("--gui", new Gui()),
                new MapOf<>(
                    new MapEntry<>("--cli", new Gui()),
                    new MapEntry<>("--gui", new Gui())
                ),
                "--clix7"
            ).select(),
            new Throws<>(InvalidUiException.class)
        ).affirm();
    }
}
