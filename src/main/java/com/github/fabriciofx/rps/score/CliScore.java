package com.github.fabriciofx.rps.score;

import com.github.fabriciofx.rps.Report;
import com.github.fabriciofx.rps.Score;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class CliScore implements Score {
    private final Report report;

    public CliScore(final Report report) {
        this.report = report;
    }

    @Override
    public void show() {
        /* 1) Converte JSON em List<LinkedHashMap> */
        List<LinkedHashMap<String, String>> rows = new ArrayList<>();
        Pattern objectPattern = Pattern.compile("\\{(.*?)\\}");
        Pattern fieldPattern = Pattern.compile("\"(\\w+)\"\\s*:\\s*(\"[^\"]*\"|\\d+)");
        Matcher objectMatcher = objectPattern.matcher(this.report.json());
        while (objectMatcher.find()) {
            String objectContent = objectMatcher.group(1);
            Matcher fieldMatcher = fieldPattern.matcher(objectContent);
            LinkedHashMap<String, String> map = new LinkedHashMap<>();
            while (fieldMatcher.find()) {
                String key = fieldMatcher.group(1);
                String value = fieldMatcher.group(2).replaceAll("^\"|\"$", "");
                map.put(key, value);
            }
            rows.add(map);
        }

        // DEBUG
//        for (final LinkedHashMap<String, String> row : rows) {
//            row.forEach((key, value) -> {
//                System.out.println("key: " + key + " value: " + value);
//            });
//        }

        /* 2) Descobre o conjunto de colunas (mantém a ordem de aparição) */
        LinkedHashSet<String> headers = new LinkedHashSet<>();
        rows.forEach(row -> headers.addAll(row.keySet()));

        /* 3) Calcula a largura máxima de cada coluna (cabeçalho ou valor) */
        Map<String, Integer> width = new LinkedHashMap<>();
        // começa com tamanho do cabeçalho
        headers.forEach(h -> width.put(
            h,
            h.length()
        ));
        for (Map<String, String> row : rows) {
            for (String h : headers) {
                String cell = String.valueOf(row.getOrDefault(h, ""));
                width.put(h, Math.max(width.get(h), cell.length()));
            }
        }

        // DEBUG
//        for (Map.Entry<String, Integer> entry : width.entrySet()) {
//            System.out.println("Cell: " + entry.getKey() + " : " + entry.getValue());
//        }

        /* 4) Funções auxiliares */
        String horizontal = buildHorizontalLine(width);
        java.util.function.Function<String, String> pad = (s) -> {
            if (s == null) {
//                System.out.println("s is null");
                return "";
            } else {
//                System.out.println("S: " + s);
                int w = width.getOrDefault(s, s.length());
//                System.out.println("w: " + w);
                String fmt = String.format(
                    " %-" + w + "s ",
                    s
                );        // espaço antes/depois
//                System.out.println("fmt: '" + fmt + "'");
                return fmt;
            }
        };

        /* 5) Imprime a tabela */
        System.out.println(horizontal);
        // Cabeçalhos
        System.out.print("|");
        headers.forEach(h -> System.out.print(pad.apply(h) + "|"));
        System.out.println();
        System.out.println(horizontal);
        // Linhas
        for (Map<String, String> row : rows) {
            System.out.print("|");
            for (String h : headers) {
                String cell = String.valueOf(row.getOrDefault(h, ""));
//                System.out.println("Cell: " + cell);
                String padding = pad.apply(cell);
//                System.out.println("'" + padding + "'");
                System.out.print(padding + "|");
            }
            System.out.println();
        }
        System.out.println(horizontal);
    }

    /* Constrói algo como +------+--------+------+
       usando a largura de cada coluna */
    private static String buildHorizontalLine(Map<String, Integer> width) {
        StringBuilder sb = new StringBuilder("+");
        width.values().forEach(w -> sb.append("-".repeat(w + 2)).append("+"));
        return sb.toString();
    }
}
