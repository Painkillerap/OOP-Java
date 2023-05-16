package StudentDomen;

public class Emploee extends User {
    private int empId;

    public Emploee(String firstName, String secondName, int age, String address, int empId) {
        super(firstName, secondName, age, address);
        this.empId = empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

}
