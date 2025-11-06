package dev.lpa;

import java.time.LocalDate;

public enum Generation {
    GEN_Z,
    MILLENIAL(1981, 2000),
    GEN_X(1981, 2000),
    BABY_BOOMER(1965, 1980),
    SILENT_GENERATION(1946, 1964),
    GREATEST_GENERATION(1901, 1926);

    private final int startYear;
    private final int endYear;

    Generation() {
        this(2001, LocalDate.now().getYear());
    }

    Generation(int startYear, int endYear){
        this.startYear = startYear;
        this.endYear = endYear;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.name() + " " + startYear + " - " + endYear;
    }
}
