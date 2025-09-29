public class PrimarySchoolStudent extends Student1 {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent [parentName=" + parentName + ", toString()=" +
                super.toString() + "]";
    }

}
