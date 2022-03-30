package com.unity.lambdas.builtin;

import java.util.List;

public class ComsumerIntface {

    public static void main(String[] args) {

        List<Integer> list = List.of(282, 564, 8, 298, 322, 347, 597, 598, 790, 405);

        // Imperative Programming (for, if/else, switch/case)
        for (var i: list) {
            System.out.println(i);
        }

        // Declarative Programming
        list.forEach(item-> System.out.println(item));
        list.forEach(System.out::println);

    }

}
