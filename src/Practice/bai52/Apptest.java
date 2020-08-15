package Practice.bai52;

public class Apptest {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement=new EmployeeManagement(3);
        System.out.println("-Nhan vien co luong cao nhat:\n"+employeeManagement.BestEmployees());
        System.out.println("-Nhan vien co luong thap nhat:\n"+employeeManagement.WorstEmployees());
        employeeManagement.print();
    }
}
