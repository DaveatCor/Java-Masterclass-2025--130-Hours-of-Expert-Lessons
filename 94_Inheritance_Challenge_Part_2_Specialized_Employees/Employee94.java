public class Employee94 extends Worker94 {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee94(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee94.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate
                + ", toString()=" + super.toString()
                + "]";
    }

}
