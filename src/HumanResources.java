import java.util.*;
import java.util.Scanner;

public abstract class HumanResources {
    final static Scanner input = new Scanner(System.in);
    public static ArrayList<Staff> listStaff = new ArrayList<>();
    public static ArrayList<Department> listDepartment = new ArrayList<>();
    
    public static void list() {
        Manager manager1 = new Manager(10, "Nguyen Van A", 30, 1.5, "03-07-2010", "Business", 4, "Business Leader");
        Manager manager2 = new Manager(11, "Nguyen Van B", 31, 1.5, "04-07-2010", "Project", 4, "Project Leader");
        Manager manager3 = new Manager(12, "Nguyen Van C", 32, 1.5, "05-07-2010", "Technical", 4, "Technical Leader");

        Employee security1 = new Employee(13, "Nguyen Van D", 40, 1.0, "06-07-2020", "Security", 2, 8);
        Employee security2 = new Employee(14, "Nguyen Van E", 41, 1.0, "07-07-2020", "Security", 2, 8);
        Employee accountant1 = new Employee(15, "Nguyen Van F", 25, 1.1, "08-07-2020", "Accountant", 2, 8);
        Employee accountant2 = new Employee(16, "Nguyen Van G", 25, 1.1, "09-07-2020", "Accountant", 2, 8);
        Employee business1 = new Employee(17, "Nguyen Van H", 25, 1.2, "10-07-2020", "Business", 2, 8);
        Employee business2 = new Employee(18, "Nguyen Van K", 25, 1.2, "11-07-2020", "Business", 2, 8);
        Employee project1 = new Employee(19, "Nguyen Van J", 26, 1.2, "12-07-2020", "Project", 2, 8);
        Employee project2 = new Employee(20, "Nguyen Van L", 24, 1.2, "13-07-2020", "Project", 2, 8);
        Employee project3 = new Employee(21, "Nguyen Van M", 27, 1.2, "14-07-2020", "Project", 2, 8);
        Employee technical1 = new Employee(22, "Nguyen Van N", 24, 1.2, "15-07-2020", "Technical", 2, 8);
        Employee technical2 = new Employee(23, "Nguyen Van Q", 25, 1.2, "16-07-2020", "Technical", 2, 8);
        Employee technical3 = new Employee(24, "Nguyen Van R", 26, 1.2, "17-07-2020", "Technical", 2, 8);

        Department security = new Department("S000", "Security", 2);
        Department accountant = new Department("A000", "Accountant", 2);
        Department business = new Department("B000", "Business", 2);
        Department project = new Department("P000", "Project", 4);
        Department technical = new Department("T000", "Technical", 4);

        listStaff.add(manager1);    
        listStaff.add(manager2);    
        listStaff.add(manager3);    
        listStaff.add(security1);    
        listStaff.add(security2);    
        listStaff.add(accountant1);    
        listStaff.add(accountant2);    
        listStaff.add(business1);    
        listStaff.add(business2);    
        listStaff.add(project1);    
        listStaff.add(project2);    
        listStaff.add(project3);    
        listStaff.add(technical1);    
        listStaff.add(technical2);    
        listStaff.add(technical3);    
        listDepartment.add(security);    
        listDepartment.add(accountant);    
        listDepartment.add(business);    
        listDepartment.add(project);    
        listDepartment.add(technical);    
        salaryPayroll();

    }
    
    // Hi???n th??? danh s??ch nh??n vi??n. 
    public static void showsStaff() {
        for(int i = 0; i<listStaff.size(); i++) {
            listStaff.get(i).displayInformation();
        }
    }
    // Hi???n th??? c??c b??? ph???n trong c??ng ty.
    public static void showsDepartment() {
        for(int i = 0; i < listDepartment.size(); i++) {
            System.out.println(listDepartment.get(i).toString());
        }
    }
    // Hi???n tr??? nh??n vi??n theo t???ng b??? ph???n.
    public static void showsDepartmentStaff () {
        for (int i = 0; i < listDepartment.size(); i++){
            System.out.println();
            System.out.println("  " + listDepartment.get(i).getDepartmentName());
            System.out.println("MNV | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
            for (int j = 0; j < listStaff.size(); j++) {
                if(listStaff.get(j).getDepartment().equalsIgnoreCase(listDepartment.get(i).getDepartmentName())){
                    listStaff.get(j).displayInformation();
                }
            }
        }
    }
    // Th??m nh??n vi??n m???i v??o c??ng ty.
    public static void addStaff() {
        int choseNumber = input.nextInt();
        
        
            if(choseNumber == 1) {
                System.out.println("M?? nh??n vi??n: ");
                int employeeID = input.nextInt();
                input.nextLine();
                System.out.println("T??n nh??n vi??n: ");
                String employeeName = input.nextLine();
                System.out.println("Tu???i nh??n vi??n: ");
                int employeeAge = input.nextInt();
                System.out.println("H??? s??? l????ng: ");
                double employeeCoefficients = input.nextDouble();
                System.out.println("Ng??y v??o l??m: ");
                String employeeDate = input.next();
                System.out.println("B??? ph???n: ");
                String department = input.next();
                System.out.println("S??? ng??y ngh??? ph??p: ");
                int employeeOff = input.nextInt();
                System.out.println("S??? gi??? l??m th??m: ");
                int overtimeHours = input.nextInt();

                System.out.println();
                System.out.println("MNV |   T??n nh??n vi??n   |  Tu???i  |   HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n");
                Employee newStaff = new Employee(employeeID, employeeName, employeeAge, employeeCoefficients, employeeDate, department, employeeOff, overtimeHours);
                newStaff.salaryStaff();
                newStaff.displayInformation();
                listStaff.add(newStaff);
                System.out.println();
                
            } else if (choseNumber == 2) {
                System.out.println("Ma?? nh??n vi??n:");
                    int employeeID = input.nextInt();
                System.out.println("T??n nh??n vi??n:");
                    input.nextLine();
                    String employeeName = input.nextLine();
                System.out.println("Tu????i nh??n vi??n:");
                    int employeeAge = input.nextInt();
                System.out.println("H???? s???? l????ng:");
                    double employeeCoefficients = input.nextDouble();
                System.out.println("Nga??y va??o la??m:");
                    String employeeDate = input.next();
                System.out.println("B???? ph????n:");
                    String department = input.next();
                System.out.println("S??? ng??y nghi?? phe??p");
                    int employeeOff = input.nextInt();
                System.out.println("Ch????c danh:");
                    input.nextLine();
                    String title = input.nextLine();

                System.out.println();
                System.out.println("MNV |   T??n nh??n vi??n   |  Tu???i |  HSL  |   Ng??y v??o l??m   |   T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                Manager newManage = new Manager(employeeID, employeeName, employeeAge, employeeCoefficients, employeeDate, department, employeeOff, title);
                newManage.salaryStaff();
                newManage.displayInformation();
                listStaff.add(newManage);
                System.out.println();
            }
    }
    // T??m ki???m th??ng tin nh??n vi??n theo t??n ho???c m?? nh??n vi??n.
    public static void searchStaff() {
        System.out.println("Ch???n 1: T??m nh??n vi??n theo t??n // ch???n 2: T??m nh??n vi??n theo M?? nh??n vi??n");
        int choseSearch = input.nextInt();
        boolean check = false;

        if(choseSearch == 1){
            System.out.println("Vui lo??ng nh????p t??n nh??n vi??n:");
            input.nextLine();   
            String searchName = input.nextLine();
            for (int i = 0; i < listStaff.size(); i++){
                if(searchName.equalsIgnoreCase(listStaff.get(i).getEmployeeName())){
                    System.out.println("MNV | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                    listStaff.get(i).displayInformation();
                    check = true;
                    System.out.println();
                }
            }
            if(check == false){
                System.out.println("T??n nh??n vi??n kh??ng t???n t???i");
                System.out.println();
            }
        } else if(choseSearch == 2){
            System.out.println("Vui lo??ng nh????p ma?? nh??n vi??n:");
            int searchId = input.nextInt();
            for (int i = 0; i < listStaff.size(); i++) {
                if (searchId == listStaff.get(i).getEmployeeID()) {
                    System.out.println("MNV | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                    listStaff.get(i).displayInformation();
                    check = true;
                    System.out.println();
                }
            } 
            if(check == false) {
                System.out.println("M?? nh??n vi??n kh??ng t???n t???i!");
                System.out.println();
            }
        }
    }
    // B???ng l????ng.
    public static void salaryPayroll() {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i) instanceof Employee) {
                ((Employee) listStaff.get(i)).salaryStaff();
            } else {
                ((Manager) listStaff.get(i)).salaryStaff();
            }
        }
    }
    // B???ng l????ng t??ng d???n
    public static void salaryUp() {
        Comparator<Staff> up = Comparator.comparingInt(Staff::getEmployeeSalary);
        listStaff.sort(up);
        for (int i = listStaff.size() - 1; i > -1; i--) {
            listStaff.get(i).displayInformation();
        }
    }
    // B???ng l????ng gi???m d???n
    public static void salaryDown() {
        Comparator<Staff> down = Comparator.comparingInt(Staff::getEmployeeSalary);
        listStaff.sort(down);
        for (int i = 0; i < listStaff.size(); i++) {
            listStaff.get(i).displayInformation();
        }
    }
    
    public static void main(String[] args) {
        int chose;
        list();
        do {
            System.out.println("--- Danh s??ch c??c ch???c n??ng c???a ???ng d???ng ---");
            System.out.println("1 - Hi???n th??? danh s??ch nh??n vi??n hi???n c?? trong c??ng ty.");
            System.out.println("2 - Hi???n th??? c??c b??? ph???n trong c??ng ty.");
            System.out.println("3 - Hi???n th??? c??c nh??n vi??n theo t???ng b??? ph???n.");
            System.out.println("4 - Th??m nh??n vi??n m???i v??o c??ng ty.");
            System.out.println("5 - T??m ki???m th??ng tin nh??n vi??n theo t??n ho???c m?? nh??n vi??n.");
            System.out.println("6 - Hi???n th??? b???ng l????ng c???a nh??n vi??n theo th??? t??? t??ng d???n.");
            System.out.println("7 - Hi???n th??? b???ng l????ng c???a nh??n vi??n theo th??? t??? gi???m d???n.");
            System.out.println("8 - Tho??t ???ng d???ng.");
            System.out.print("H??y ch???n ch???c n??ng m?? b???n mu???n? ");
            chose = input.nextInt();
            System.out.println("__________________________________________________________________________________");

        switch (chose) {
            case 1:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng hi???n th??? danh s??ch nh??n vi??n hi???n c??.");
                System.out.println("MNV | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                showsStaff();
                System.out.println("__________________________________________________________________________________");
                break;
            case 2:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng hi???n th??? c??c b??? ph???n trong c??ng ty.");
                System.out.println();
                System.out.println("M?? b??? ph???n |    T??n B??? ph???n    |   S??? nh??n vi??n  |");
                showsDepartment(); 
                System.out.println("__________________________________________________________________________________");
                break;
            case 3:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng Hi???n th??? nh??n vi??n theo t???ng b??? ph???n.");
                showsDepartmentStaff();
                System.out.println("__________________________________________________________________________________");
                break;
            case 4:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng Th??m nh??n vi??n m???i v??o c??ng ty.");
                System.out.println("Ch???n 1 n???u b???n mu???n th??m nh??n vi??n // Ch???n 2 n???u b???n mu???n th??m Qu???n l??");
                addStaff();
                break;
            case 5:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng T??m ki???m th??ng tin nh??n vi??n.");
                searchStaff();
                break;
            case 6:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng Hi???n th??? b???ng l????ng c???a nh??n vi??n theo th??? t??? t??ng d???n.");
                System.out.println("MNV  | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                salaryDown();
                break;
            case 7:
                System.out.println("TH??NG B??O: B???n ???? ch???n ch???c n??ng Hi???n th??? b???ng l????ng c???a nh??n vi??n theo th??? t??? gi???m d???n.");
                System.out.println("MNV  | T??n nh??n vi??n   | Tu???i |  HSL  |  Ng??y v??o l??m   |    T??n B??? ph???n    |  Ngh??? ph??p  | Gi??? l??m th??m |  L????ng nh??n vi??n |    Ch???c danh");
                salaryUp();
            break;
            case 8:
                System.out.println("C???m ??n b???n ???? s??? d???ng ???ng d???ng n??y.");
                break;
            default:
                System.out.println("b???n ???? nh???p sai, vui l??ng nh???p l???i");
        }
    }
    while(chose != 8);

    }
}
