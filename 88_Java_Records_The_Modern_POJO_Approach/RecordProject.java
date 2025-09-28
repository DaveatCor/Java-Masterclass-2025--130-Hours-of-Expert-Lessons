public class RecordProject {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Catrol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.err.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        pojoStudent.setClassList(null);

        System.err.println(pojoStudent);
        System.err.println(recordStudent);
    }
}
