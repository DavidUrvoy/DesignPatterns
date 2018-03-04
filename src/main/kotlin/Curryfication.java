package main.kotlin;

import java.util.function.Function;

public class Curryfication {

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> sum = (a) -> (b) -> a + b;

        System.out.println(sum.apply(5)
                              .apply(6));
    }
}
