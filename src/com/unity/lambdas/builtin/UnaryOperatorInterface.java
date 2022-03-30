package com.unity.lambdas.builtin;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {
        UnaryOperator<Integer> multiply = n -> n * n;
        UnaryOperator<Integer> increment = n -> n += 1;
        var resutl = increment.andThen(multiply).apply(1);
        System.out.println(resutl);
    }

}
