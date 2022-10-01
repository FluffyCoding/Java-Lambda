package com.unity.streams;

public class Main {
    public static void main(String[] args) {

        StreamsRealms.wordsStream().filter(words -> words.getId() > 5)
                .skip(1)
                .limit(2)
                .forEach(words -> System.out.println(words.getName()));

        StreamsRealms.randomString().filter(w -> w.equals("Indoor"))
                .forEach(System.out::println);

        StreamsRealms.randomString().forEach(w -> System.out.println(w.toUpperCase()));

        StreamsRealms.wordsStream()
                .filter(words ->
                        StreamsRealms.randomNumbers().anyMatch(i -> i == words.getId()))
                .forEach(words -> System.out.println(words.getName()));


    }

}
