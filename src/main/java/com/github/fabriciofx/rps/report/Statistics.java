/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.report;

import com.github.fabriciofx.rps.Report;
import com.github.fabriciofx.rps.Result;
import com.github.fabriciofx.rps.Rounds;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class Statistics implements Report {
    private final Rounds origin;

    public Statistics(final Rounds rounds) {
        this.origin = rounds;
    }

    @Override
    public String json() {
        final Pattern pattern = Pattern.compile("(.*?)\\s+wins!!");
        final Map<String, Integer> table = new HashMap<>();
        final List<Result> results = this.origin.results();
        for (final Result result : results) {
            final String message = result.asString();
            final Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                final String winner = matcher.group(1);
                table.put(winner, table.getOrDefault(winner, 0) + 1);
            } else {
                table.put("Tie", table.getOrDefault("Tie", 0) + 1);
            }
        }
        final StringBuilder json = new StringBuilder();
        json.append("[");
        for (final Map.Entry<String, Integer> entry : table.entrySet()) {
            json.append(
                String.format(
                    "{ \"player\": \"%s\", \"points\": \"%d\" },",
                    entry.getKey(),
                    entry.getValue()
                )
            );
        }
        json.deleteCharAt(json.length() - 1);
        json.append("]");
        return json.toString();
    }
}
