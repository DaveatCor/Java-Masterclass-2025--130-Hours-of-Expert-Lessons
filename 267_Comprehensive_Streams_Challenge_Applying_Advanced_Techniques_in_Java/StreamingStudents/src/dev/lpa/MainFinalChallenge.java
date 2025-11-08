package dev.lpa;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFinalChallenge {
    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python Masterclass", 50);
        Course jmc = new Course("JMC", "Java Masterclass", 100);
        Course jgames = new Course("JGAME", "Creating game in Java");

        int currentYear = LocalDate.now().getYear();
        List<Student> students = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc, jgames))
                .filter(s -> s.getYearEnrolled() >= (currentYear -4))
                .limit(1000)
                .toList();

        System.out.println(students.stream()
                .mapToInt(Student::getYearEnrolled)
                .summaryStatistics()
        );

        students.subList(0, 10).forEach(System.out::println);

        System.out.println(students.stream()
                .mapToInt(s -> s. getEngageementMap().size())
                .summaryStatistics()
        );

        var mappedActivity = students.stream()
                .flatMap(s -> s.getEngageementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngageement::getCourseCode, Collectors.counting()));

        mappedActivity.forEach((k, v) -> System.out.println(k + " " + v));

        var classCounts = students.stream()
                .collect(Collectors.groupingBy(s -> s.getEngageementMap().size(), Collectors.counting()));

        classCounts.forEach((k, v) -> System.out.println(k + " " + v));

        var percentages = students.stream()
                .flatMap(s -> s.getEngageementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngageement::getCourseCode, Collectors.summarizingDouble(
                        CourseEngageement::getPercentageComplete
                )));

        percentages.forEach((k, v) -> System.out.println(k + " " + v));

        var yearMap = students.stream()
                .flatMap(s -> s.getEngageementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngageement::getCourseCode, Collectors.groupingBy(CourseEngageement::getLastActivityMonth)));
        yearMap.forEach((k, v) -> System.out.println(k + " " + v));

        students.stream()
                .flatMap(s -> s.getEngageementMap().values().stream())
                .collect(Collectors.groupingBy(
                    CourseEngageement::getEnrollmentDateYear,
                    Collectors.groupingBy(CourseEngageement::getCourseCode, Collectors.counting())
                ))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }
}
