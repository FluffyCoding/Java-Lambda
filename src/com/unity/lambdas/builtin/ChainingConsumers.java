package com.unity.lambdas.builtin;

import java.util.List;
import java.util.function.Consumer;

public class ChainingConsumers {

  static List<String> list = List.of("Difficulty", "Convenient", "Complication", "Expression", "Motherhood", "Confession", "Photograph", "Perfection", "Opportunity", "Distinguish");

    public static void main(String[] args) {
        Consumer<String> print = p -> System.out.println(p);
        Consumer<String> printToLower = p -> System.out.println(p.toLowerCase());
        Consumer<String> printToUpperCase = p ->  System.out.println(p.toUpperCase());

        list.forEach(print.andThen(printToUpperCase).andThen(printToLower));
    }

}
