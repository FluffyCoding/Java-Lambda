package com.unity.lambdas.builtin;

import java.util.function.BiFunction;
import java.util.function.Function;

// obj function(T,R) it can map a value to a different value.
public class FunctionInterface {


    public static void main(String[] args) {
        Function<String,Integer> map = str -> str.length();
        Function<String,Boolean> startsWith = str -> str.toLowerCase().startsWith("j");

//        System.out.println(map.apply("HELLO WORLD"));
//        System.out.println(startsWith.apply("Java"));
//
//            composeFunctions("#STRING_BUILDER");

        biFunctionandFunction();

    }

    public static void composeFunctions(String value){

        Function<String,String> replaceHash = str -> str.replace("#","__");
        Function<String,String> addSamiColon = str -> str + "__;";

       // String stringBuilder = replaceHash.andThen(addSamiColon).apply(value);
        String apply = addSamiColon.compose(replaceHash).apply(value);

        System.out.println(apply);
    }


    public static void biFunctionInterface(){
                // BiFunction<T, U, R> - It takes two arguments and returns an object
        BiFunction<Integer,Integer,Integer> sum = (x , y) -> x + y;

        BiFunction<Integer,Integer,Double> sum2 = (x , y) -> Math.pow(x , y);
    }

    //  BiFunction<T, U, R> + Function<T, R>

    public static void biFunctionandFunction(){

        BiFunction<Integer,Integer,Double> sum2 = (x , y) -> Math.pow(x , y);
        Function<Double,String> result = intput -> "Result " + intput;

        String value = sum2.andThen(result).apply(2, 5);
        System.out.println(value);
    }

}
