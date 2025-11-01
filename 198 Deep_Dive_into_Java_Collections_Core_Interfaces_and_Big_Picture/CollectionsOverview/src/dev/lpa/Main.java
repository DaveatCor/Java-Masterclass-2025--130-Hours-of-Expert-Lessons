package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();
        String[] named = { "Anna", "Bob", "Carol", "David", "Edna" };
        list.addAll(Arrays.asList(named));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list?" + list.contains("Gary"));
        // list.sort();
    }
}
