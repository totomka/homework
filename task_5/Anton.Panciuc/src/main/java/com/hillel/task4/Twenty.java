package com.hillel.task4;

import java.util.stream.IntStream;

public class Twenty {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i * 2)
                .limit(20)
                .forEach(e -> System.out.println(e));
    }
}
