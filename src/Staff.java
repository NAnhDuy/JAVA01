public abstract class Staff {
    public int employeeID;
    public String employeeName;
    public int employeeAge;
    public double employeeCoefficients;
    public String employeeDate;
    public String department;
    public int employeeOff;
    public int employeeSalary;

    public abstract void displayInformation();
    public String getDepartment(){
        return department;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public int getEmployeeSalary(){
        return employeeSalary;
    }
}
    

