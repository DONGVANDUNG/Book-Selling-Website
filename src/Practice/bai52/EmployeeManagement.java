package Practice.bai52;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        Scanner sc = new Scanner(System.in);
        employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("-Nhan 1 de nhap Fulltime/Nhan 2 de nhap Parttime");
            System.out.print("-Nhap vao lua chon cua ban:\t");
            int choise = sc.nextInt();
            if (choise == 1) {
                System.out.println("-Moi ban nhap thong tin cho nhan vien Fulltime!!");
            }
            if (choise == 2) {
                System.out.println("-Moi ban nhap thong tin cho nhan vien Parttime!!");
            }
            System.out.print("\t+Ten nhan vien:\t");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("\t+Tuoi:\t");
            int age = sc.nextInt();
            System.out.print("\t+So CMND:\t");
            String CMND = sc.nextLine();
            sc.nextLine();
            if (choise == 1) {
                System.out.print("\t+So ngay lam viec:\t");
                int totalWorkingDay = sc.nextInt();
                sc.nextLine();
                System.out.print("\t+Luong theo ngay:\t");
                long dailysalary = sc.nextLong();
                employees[i] = new FulltimeEmployee(name, age, CMND, totalWorkingDay, dailysalary);
            }
            if (choise == 2) {
                System.out.print("\t+So ca lam viec:\t");
                int totalWorkingShift = sc.nextInt();
                System.out.print("\t+Luong theo ca:\t");
                long basesalary = sc.nextLong();
                employees[i] = new ParttimeEmployee(name, age, CMND, totalWorkingShift, basesalary);
            }
        }
    }

    public String BestEmployees() {
        Employee best = employees[0];
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].calculateSalary() > best.calculateSalary()) {
                best = employees[i];
            }
        }
        return best.toString();
    }
    public String WorstEmployees() {
        Employee worst = employees[0];
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].calculateSalary() < worst.calculateSalary()) {
                worst = employees[i];
            }
        }
        return worst.toString();
    }
    public void print(){
        for (int i = 0; i <employees.length-1 ; i++) {
            System.out.println("\t-Nhan vien thu "+(i+1)+":");
            System.out.println("\t\t+Ten nhan vien: "+employees[i].getName());
            System.out.println("\t\t+Tien luong: "+employees[i].calculateSalary());
        }
    }
}
