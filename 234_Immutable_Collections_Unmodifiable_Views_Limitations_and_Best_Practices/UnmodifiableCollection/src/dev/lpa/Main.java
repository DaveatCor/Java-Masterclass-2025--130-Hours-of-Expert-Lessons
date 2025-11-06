package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder bobsNotes = new StringBuilder();
        StringBuilder billsNotes = new StringBuilder("Bill struggles with generics");

        Student bob = new Student("Bob", bobsNotes);
        Student bill = new Student("Bill", billsNotes);

        List<Student> students = new ArrayList<>(List.of(bob, bill));
        List<Student> studentFirstCopy = new ArrayList<>(students);
        List<Student> studentSecondCopy = List.copyOf(students);
        List<Student> studentsThirdCopy = Collections.unmodifiableList(students);

        studentFirstCopy.add(new Student("Bonnie", new StringBuilder()));
//        studentSecondCopy.set(0, new Student("Bonnie", new StringBuilder()));
        studentFirstCopy.sort(Comparator.comparing(Student::getName));
        students.add(new Student("Bonnie", new StringBuilder()));
        bobsNotes.append("Bob was one of my first students.");

        StringBuilder bonniesNotes = studentFirstCopy.get(2).getStudentNotes();
        bonniesNotes.append("Bonnie is taking 3 of my course");

        students.forEach(System.out::println);
        System.out.println("-------------------");
        studentFirstCopy.forEach(System.out::println);
        System.out.println("-------------------");
        studentSecondCopy.forEach(System.out::println);
        System.out.println("-------------------");
        studentsThirdCopy.forEach(System.out::println);
        System.out.println("-------------------");
    }
}