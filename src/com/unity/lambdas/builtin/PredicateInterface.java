package com.unity.lambdas.builtin;


import java.util.function.Predicate;

//bool predicate(condition) it takes an argument and return true or false value.
public class PredicateInterface {

    public static void main(String[] args) {

        Predicate<String> isLongerThan2AndLessThan5 = str -> str.length() > 2 && str.length() < 5;

        //System.out.println(isLongerThan2AndLessThan5.test("Java"));

        combiningPredicates("__Variable__",500);

    }

    public static void combiningPredicates(String msg, int length){

        Predicate<String> startsWith = str -> str.startsWith("__");
        Predicate<String> endsWith = str -> str.endsWith("__");
        Predicate<String> lengthwise = str -> str.length() > length;
        Predicate<String> startAndEndsWith = startsWith.and(endsWith).or(lengthwise);

        System.out.println(startAndEndsWith.test(msg));
    }


}
