public class Manager extends Staff implements ICalculator {
    String title;

    Manager() {}
    Manager(int employeeID, String employeeName, int employeeAge, double employeeCoefficients, 
    String employeeDate, String department, int employeeOff, String title) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeCoefficients = employeeCoefficients;
        this.employeeDate = employeeDate;
        this.department = department;
        this.employeeOff = employeeOff;
        this.title = title;
    }

    public void displayInformation() {
        System.out.print(employeeID + "     ");
        System.out.print(employeeName + "      ");
        System.out.print(employeeAge + "     ");
        System.out.print(employeeCoefficients + "       ");
        System.out.print(employeeDate + "        ");
        if(department.length() == 7) {
            System.out.print(department + "              ");
        } else if (department.length() < 9) {
            System.out.print(department + "             ");
        } else {
            System.out.print(department + "            ");
        }
        System.out.print(employeeOff + "                              ");
        System.out.print(employeeSalary + "              ");
        System.out.println(title);
    }

    public double salaryStaff() {
        if(title.equalsIgnoreCase("Business Leader")) {
            employeeSalary = (int) (employeeCoefficients * 5000000 + 8000000);
        } else if(title.equalsIgnoreCase("Project Leader")) {
            employeeSalary = (int) (employeeCoefficients * 5000000 + 5000000);
        }  else if(title.equalsIgnoreCase("Technical Leader")) {
            employeeSalary = (int) (employeeCoefficients * 5000000 + 6000000);
        }
        return employeeSalary;
    }
}
