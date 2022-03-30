package com.unity;

import com.unity.lambdas.Printer;

public class Main {

    public static void print(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        // write your code here

        greet(print -> System.out.println(print));
        greet(Main::print);
    }

    public static void greet(Printer printer){
       printer.print("Hello Lambda");
    }

}
