public class Department {
    private String departmentID;
    private String departmentName;
    private int employeesNumber;

    Department() {}
    Department(String departmentID, String departmentName, int employeesNumber) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.employeesNumber = employeesNumber;
    }
    @Override 
    public String toString() {
        // trả về chuỗi đại diện của Department.
        return departmentID + "             " + departmentName + "              " + employeesNumber;
    }
    public String getDepartmentName() {
        return departmentName;
    }
}
    