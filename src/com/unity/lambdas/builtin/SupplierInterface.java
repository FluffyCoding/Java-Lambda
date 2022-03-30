package com.unity.lambdas.builtin;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

//obj supply() - it takes no input but returns a value.
public class SupplierInterface {

    public static void main(String[] args) {
        // Lazy Evaluation.
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());

        // Reduces Autoboxing Cost.
        IntSupplier getIntRandom = () -> (int) (Math.random() * 1000) + 1;
        DoubleSupplier getDoubleRandom = () -> (Math.random() * 1000) + 1;

        System.out.println(getDoubleRandom.getAsDouble());

    }

}
