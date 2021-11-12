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
    
    // Hiển thị danh sách nhân viên. 
    public static void showsStaff() {
        for(int i = 0; i<listStaff.size(); i++) {
            listStaff.get(i).displayInformation();
        }
    }
    // Hiển thị các bộ phận trong công ty.
    public static void showsDepartment() {
        for(int i = 0; i < listDepartment.size(); i++) {
            System.out.println(listDepartment.get(i).toString());
        }
    }
    // Hiện trị nhân viên theo từng bộ phận.
    public static void showsDepartmentStaff () {
        for (int i = 0; i < listDepartment.size(); i++){
            System.out.println();
            System.out.println("  " + listDepartment.get(i).getDepartmentName());
            System.out.println("MNV | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
            for (int j = 0; j < listStaff.size(); j++) {
                if(listStaff.get(j).getDepartment().equalsIgnoreCase(listDepartment.get(i).getDepartmentName())){
                    listStaff.get(j).displayInformation();
                }
            }
        }
    }
    // Thêm nhân viên mới vào công ty.
    public static void addStaff() {
        int choseNumber = input.nextInt();
        
        
            if(choseNumber == 1) {
                System.out.println("Mã nhân viên: ");
                int employeeID = input.nextInt();
                input.nextLine();
                System.out.println("Tên nhân viên: ");
                String employeeName = input.nextLine();
                System.out.println("Tuổi nhân viên: ");
                int employeeAge = input.nextInt();
                System.out.println("Hệ số lương: ");
                double employeeCoefficients = input.nextDouble();
                System.out.println("Ngày vào làm: ");
                String employeeDate = input.next();
                System.out.println("Bộ phận: ");
                String department = input.next();
                System.out.println("Số ngày nghỉ phép: ");
                int employeeOff = input.nextInt();
                System.out.println("Số giờ làm thêm: ");
                int overtimeHours = input.nextInt();

                System.out.println();
                System.out.println("MNV |   Tên nhân viên   |  Tuổi  |   HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên");
                Employee newStaff = new Employee(employeeID, employeeName, employeeAge, employeeCoefficients, employeeDate, department, employeeOff, overtimeHours);
                newStaff.salaryStaff();
                newStaff.displayInformation();
                listStaff.add(newStaff);
                System.out.println();
                
            } else if (choseNumber == 2) {
                System.out.println("Mã nhân viên:");
                    int employeeID = input.nextInt();
                System.out.println("Tên nhân viên:");
                    input.nextLine();
                    String employeeName = input.nextLine();
                System.out.println("Tuổi nhân viên:");
                    int employeeAge = input.nextInt();
                System.out.println("Hệ số lương:");
                    double employeeCoefficients = input.nextDouble();
                System.out.println("Ngày vào làm:");
                    String employeeDate = input.next();
                System.out.println("Bộ phận:");
                    String department = input.next();
                System.out.println("Số ngày nghỉ phép");
                    int employeeOff = input.nextInt();
                System.out.println("Chức danh:");
                    input.nextLine();
                    String title = input.nextLine();

                System.out.println();
                System.out.println("MNV |   Tên nhân viên   |  Tuổi |  HSL  |   Ngày vào làm   |   Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                Manager newManage = new Manager(employeeID, employeeName, employeeAge, employeeCoefficients, employeeDate, department, employeeOff, title);
                newManage.salaryStaff();
                newManage.displayInformation();
                listStaff.add(newManage);
                System.out.println();
            }
    }
    // Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.
    public static void searchStaff() {
        System.out.println("Chọn 1: Tìm nhân viên theo tên // chọn 2: Tìm nhân viên theo Mã nhân viên");
        int choseSearch = input.nextInt();
        boolean check = false;

        if(choseSearch == 1){
            System.out.println("Vui lòng nhập tên nhân viên:");
            input.nextLine();   
            String searchName = input.nextLine();
            for (int i = 0; i < listStaff.size(); i++){
                if(searchName.equalsIgnoreCase(listStaff.get(i).getEmployeeName())){
                    System.out.println("MNV | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                    listStaff.get(i).displayInformation();
                    check = true;
                    System.out.println();
                }
            }
            if(check == false){
                System.out.println("Tên nhân viên không tồn tại");
                System.out.println();
            }
        } else if(choseSearch == 2){
            System.out.println("Vui lòng nhập mã nhân viên:");
            int searchId = input.nextInt();
            for (int i = 0; i < listStaff.size(); i++) {
                if (searchId == listStaff.get(i).getEmployeeID()) {
                    System.out.println("MNV | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                    listStaff.get(i).displayInformation();
                    check = true;
                    System.out.println();
                }
            } 
            if(check == false) {
                System.out.println("Mã nhân viên không tồn tại!");
                System.out.println();
            }
        }
    }
    // Bảng lương.
    public static void salaryPayroll() {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i) instanceof Employee) {
                ((Employee) listStaff.get(i)).salaryStaff();
            } else {
                ((Manager) listStaff.get(i)).salaryStaff();
            }
        }
    }
    // Bảng lương tăng dần
    public static void salaryUp() {
        Comparator<Staff> up = Comparator.comparingInt(Staff::getEmployeeSalary);
        listStaff.sort(up);
        for (int i = listStaff.size() - 1; i > -1; i--) {
            listStaff.get(i).displayInformation();
        }
    }
    // Bảng lương giảm dần
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
            System.out.println("--- Danh sách các chức năng của ứng dụng ---");
            System.out.println("1 - Hiển thị danh sách nhân viên hiện có trong công ty.");
            System.out.println("2 - Hiển thị các bộ phận trong công ty.");
            System.out.println("3 - Hiển thị các nhân viên theo từng bộ phận.");
            System.out.println("4 - Thêm nhân viên mới vào công ty.");
            System.out.println("5 - Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
            System.out.println("6 - Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
            System.out.println("7 - Hiển thị bảng lương của nhân viên theo thứ tự giảm dần.");
            System.out.println("8 - Thoát ứng dụng.");
            System.out.print("Hãy chọn chức năng mà bạn muốn? ");
            chose = input.nextInt();
            System.out.println("__________________________________________________________________________________");

        switch (chose) {
            case 1:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng hiển thị danh sách nhân viên hiện có.");
                System.out.println("MNV | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                showsStaff();
                System.out.println("__________________________________________________________________________________");
                break;
            case 2:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng hiển thị các bộ phận trong công ty.");
                System.out.println();
                System.out.println("Mã bộ phận |    Tên Bộ phận    |   Số nhân viên  |");
                showsDepartment(); 
                System.out.println("__________________________________________________________________________________");
                break;
            case 3:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng Hiển thị nhân viên theo từng bộ phận.");
                showsDepartmentStaff();
                System.out.println("__________________________________________________________________________________");
                break;
            case 4:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng Thêm nhân viên mới vào công ty.");
                System.out.println("Chọn 1 nếu bạn muốn thêm nhân viên // Chọn 2 nếu bạn muốn thêm Quản lý");
                addStaff();
                break;
            case 5:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng Tìm kiếm thông tin nhân viên.");
                searchStaff();
                break;
            case 6:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
                System.out.println("MNV  | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                salaryDown();
                break;
            case 7:
                System.out.println("THÔNG BÁO: Bạn đã chọn chức năng Hiển thị bảng lương của nhân viên theo thứ tự giảm dần.");
                System.out.println("MNV  | Tên nhân viên   | Tuổi |  HSL  |  Ngày vào làm   |    Tên Bộ phận    |  Nghỉ phép  | Giờ làm thêm |  Lương nhân viên |    Chức danh");
                salaryUp();
            break;
            case 8:
                System.out.println("Cảm ơn bạn đã sử dụng ứng dụng này.");
                break;
            default:
                System.out.println("bạn đã nhập sai, vui lòng nhập lại");
        }
    }
    while(chose != 8);

    }
}
