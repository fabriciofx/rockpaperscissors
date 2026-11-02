/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.move;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * StringAsMove tests.
 *
 * @since 1.4
 */
final class StringAsMoveTest {

    @ParameterizedTest
    @CsvSource({
        "r, 0", "Rq, 0", "p, 1", "P7, 1", "s, 2", "Sx, 2", "z, 0", "9, 0"
    })
    void convertsFirstLetterToMoveCode(final String text, final int code) {
        MatcherAssert.assertThat(
            "StringAsMove cannot convert the first letter to its move code",
            new StringAsMove(text).code(),
            Matchers.equalTo(code)
        );
    }
}
