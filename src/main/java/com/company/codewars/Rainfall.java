package com.company.codewars;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Rainfall {

    public static double mean(String town, String strng) {
        List<BigDecimal> collect = getValuesForTownFormInput(town, strng);
        return getMeanFromValues(collect);
    }

    public static double variance(String town, String strng) {
        List<BigDecimal> valueForTown = getValuesForTownFormInput(town, strng);
        if (valueForTown.get(0).equals(BigDecimal.ONE.negate())) {
            return -1;
        }
        BigDecimal meanFromValues = new BigDecimal(getMeanFromValues(valueForTown));
        return valueForTown.stream()
                .map(meanFromValues::subtract)
                .map(bigDecimal -> bigDecimal.pow(2))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(valueForTown.size()), MathContext.DECIMAL32)
                .doubleValue();
    }

    private static double getMeanFromValues(List<BigDecimal> collect) {
        return collect.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(collect.size()), MathContext.DECIMAL32)
                .doubleValue();
    }

    private static List<BigDecimal> getValuesForTownFormInput(String town, String strng) {
        Optional<String> valuesInString = Arrays.stream(strng.split("\n"))
                .filter(s -> s.substring(0, town.length() + 1).equals(town + ":"))
                .reduce((s1, s2) -> {
                    throw new IllegalStateException("Multiple elements: " + s1 + ", " + s2);
                });

        String[] split = valuesInString.orElse("-1")
                .replaceAll("[^-?0-9.]+", " ")
                .trim()
                .split(" ");

        return Arrays.stream(split)
                .map(BigDecimal::new)
                .collect(Collectors.toList());
    }

}