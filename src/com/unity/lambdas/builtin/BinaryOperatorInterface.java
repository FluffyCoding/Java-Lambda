package com.unity.lambdas.builtin;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class BinaryOperatorInterface {

    public static void main(String[] args) {

        BinaryOperator<Integer> multiply = (a,b) ->  a * b;
        Function<Integer,Integer> squar = a -> a * a;
        IntBinaryOperator add = (a, b) -> a + b;
        IntFunction<Integer> pow = a -> a * a;

        add.applyAsInt(25,25);

        System.out.println( multiply.andThen(squar).apply(5,2));
        binaryOp();
    }


    public static void binaryOp(){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //System.out.println(math(Arrays.asList(numbers),0, (x, y) -> x + y ));
        System.out.println(math(Arrays.asList(numbers),0,Integer::sum));
    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator){
        T result = init;
        for (T t: list) {
            result = accumulator.apply(result,t);
        }
    return result;
    }

}
