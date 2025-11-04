package dev.lpa;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//        NavigableSet<Contact> sorted = new TreeSet<>(phones);
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justName = new TreeSet<>();
        phones.forEach(c -> justName.add(c.getName()));
        System.out.println(justName);

        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("--------------------------");
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.min(fullSet, fullSet.comparator());

        Contact first = fullSet.first();
        Contact last = fullSet.last();
        System.out.println("--------------------------");
        System.out.printf("min = %s, first=%s, %n", min.getName(), first.getName());
        System.out.printf("max = %s, last=%s, %n", max.getName(), last.getName());
        System.out.println("--------------------------");

        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);
        System.out.println("--------------------------");
    }
}
