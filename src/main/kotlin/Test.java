package main.kotlin;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println(maxPow(Stream.of(1, 5, 10).collect(Collectors.toList()), 3, 150));
    }

    private static Map<Integer, Double> maxPow(List<Integer> values, Integer pow, Integer limit) {
        return values.stream().map(e -> Math.pow(e, pow)).collect(Collectors.toMap(Double::intValue, Double::doubleValue));
    }
}
