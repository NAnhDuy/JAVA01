public class Employee extends Staff implements ICalculator {
    // Employee kế thừa từ Staff và Icalculator.
    int overtimeHours;
    Employee() {}
    Employee(int employeeID, String employeeName, int employeeAge, double employeeCoefficients, 
    String employeeDate, String department, int employeeOff, int overtimeHours) {
        // this được dùng để tham chiếu tới biến instance của class Staff.
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeCoefficients = employeeCoefficients;
        this.employeeDate = employeeDate;
        this.department = department;
        this.employeeOff = employeeOff;
        this.overtimeHours = overtimeHours;
    }

    public void displayInformation() {
        System.out.print(employeeID + "     ");
        System.out.print(employeeName + "      ");
        System.out.print(employeeAge + "     ");
        System.out.print(employeeCoefficients + "       ");
        System.out.print(employeeDate + "        ");

        if(department.length() < 9) {
            System.out.print(department + "              ");
        } else {
            System.out.print(department + "           ");
        }
        System.out.print(employeeOff + "             ");
        System.out.print(overtimeHours + "               ");
        System.out.println(employeeSalary);
    }

    public double salaryStaff() {
        employeeSalary = (int) (employeeCoefficients * 3000000 + overtimeHours * 200000);
        return employeeSalary;
    }
}
