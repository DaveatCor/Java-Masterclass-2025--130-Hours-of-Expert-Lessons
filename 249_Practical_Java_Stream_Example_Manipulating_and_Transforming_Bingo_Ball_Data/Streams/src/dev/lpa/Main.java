package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);
        for (int i = 0; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("------------------------------");

//        List<String> firstOne = bingoPool.subList(0, 15);
        List<String> firstOne = new ArrayList<>(bingoPool.subList(0, 15));
        firstOne.sort((Comparator.naturalOrder()));;
        firstOne.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0){
                String updated = s.charAt(0) +  "-" + s.substring(1);
                System.out.println(updated + " ");
                return updated;
            }
            return  s;
        });
        System.out.println("------------------------------");

        for (int i = 0; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("------------------------------");

        bingoPool.stream().limit(15)
        .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
        .map(s -> s.charAt(0) + "-" + s.substring(1))
        .sorted()
        .forEach(s -> System.out.print(s + " "));


        for (int i = 0; i < 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("------------------------------");
    }
}