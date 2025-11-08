package dev.lpa;

import java.time.LocalDate;
import java.time.Period;

public class CourseEngageement {
    private final Course course;
    private final LocalDate enrollmentDate;
    private String engagementType;
    private int lastLecture;
    private LocalDate lastActivityDate;

    public CourseEngageement(Course course, LocalDate enrollmentDate, String engagementType) {
        this.course = course;
        this.enrollmentDate = this.lastActivityDate = enrollmentDate;
        this.engagementType = engagementType;
    }

    public String getCourseCode() {
        return course.courseCode();
    }

    public int getEnrollmentDateYear() {
        return enrollmentDate.getYear();
    }

    public String getEngagementType() {
        return engagementType;
    }

    public int getLastLecture() {
        return lastLecture;
    }

    public int getLastActivityDateYear() {
        return lastActivityDate.getYear();
    }

    public String getLastActivityMonth(){
        return "%tb".formatted(lastActivityDate);
    }

    public double getPercentageComplete(){
        return lastLecture * 100.0 / course.lectureCount();
    }

    public int getMonthSinceActive(){
        LocalDate now = LocalDate.now();
        var months = Period.between(lastActivityDate, now).toTotalMonths();
        return (int) months;
    }

    void watchLecture(int lectureNumber, LocalDate currentDate){
        lastLecture = Math.max(lectureNumber, lastLecture);
        lastActivityDate = currentDate;
        engagementType = "Lecture " + lastLecture;
    }

    @Override
    public String toString() {
        return "%s: %s %d %s [%d]".formatted(
            course.courseCode(),
            getLastActivityMonth(),
            getLastActivityDateYear(),
            engagementType,
            getMonthSinceActive()
        );
    }
}
