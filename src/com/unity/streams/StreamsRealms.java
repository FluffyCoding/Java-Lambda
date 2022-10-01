package com.unity.streams;

import java.util.stream.Stream;

public class StreamsRealms {

    private StreamsRealms() {
    }

    public static Stream<String> randomString() {
        return Stream.of("Berry", "Waste", "Laugh", "Indoor", "Universe", "Likely", "Simple", "Marriage", "Furnish", "Often");
    }

    public static Stream<Integer> randomNumbers() {
        return Stream.of(14, 17, 12, 14, 1, 9, 18, 2, 13, 6);
    }

    public static Stream<Words> wordsStream() {

        return Stream.of(
                new Words(1, "Indoor"),
                new Words(2, "Waste"),
                new Words(3, "Berry"),
                new Words(5, "Laugh"),
                new Words(6, "Universe"),
                new Words(9, "Likely"),
                new Words(7, "Simple"),
                new Words(4, "Marriage"));
    }


}

class Words {

    public Words(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}