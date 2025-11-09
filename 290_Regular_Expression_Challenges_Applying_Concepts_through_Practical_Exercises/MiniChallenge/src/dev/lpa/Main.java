package dev.lpa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        boolean matches = sentence.matches("Hello, World!");
        System.out.println(matches);

        String challenge2 = "[A-Z][a-z\\s]+[.]";

        for (String s : List.of(
            "The bike is red.",
            "I am a new student.",
            "hello world.",
            "How are you?"
        )) {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + ": " + s);
        }

        /// Challenge 3
        String challenge3 = "^[A-Z][\\p{all}]+[.?!]$";

        for (String s : List.of(
                "The bike is red, and has flat tires.",
                "I am being a new L.P.A student!",
                "Hello, friends and family: Welcome!",
                "How are you, Maray?"
        )) {
            boolean matched = s.matches(challenge3);
            System.out.println(matched + ": " + s);
        }
    }
}