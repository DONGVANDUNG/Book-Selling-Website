package Miniproject;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentMangement studentMangement = new StudentMangement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao lua chon ma ban chon ma ban muon!!");
        System.out.println("1:Them sinh vien moi");
        System.out.println("2:Tim kiem sinh vien theo ten");
        System.out.println("3:TIm kiem sinh vien theo MSSV");
        System.out.println("4:Tim kiem sinh vien theo que quan");
        System.out.println("5:Tim kiem sinh vien theo gioi tinh");
        System.out.println("6:Tim kiem sinh vien theo lop MH");
        System.out.print("Nhap vao lua chon cua ban:  ");
        int choice = sc.nextInt();
        while (true) {
            if (choice == 1) {
                Student student = new Student();
                if (studentMangement.verifyAge(student.getAge())){
                    studentMangement.verifygioitinh(student.getGioitinh());
                }
                studentMangement.saveinfo(student);
                studentMangement.AddStudent(student);
            }
            if (choice == 2) {
                System.out.print("Nhap vao ten sinh vien ban muon tra cuu: ");
                String name = sc.nextLine();
                studentMangement.findStudentByname(name);
            }
            if (choice == 3) {
                System.out.print("Nhap vao ma so sinh vien ma ban muon tim kiem:  ");
                String MSSV = sc.nextLine();
                studentMangement.findStudentByMSSV(MSSV);
            }
            if (choice == 4) {
                System.out.println("Nhap vao que quan ma ban muon tim kiem: ");
                String quequan = sc.nextLine();
                studentMangement.findStudentByquequan(quequan);
            }
            if (choice == 5) {
                System.out.print("Nhap vao gioi tinh ma ban muon tim kiem: ");
                String gender = sc.nextLine();
                studentMangement.findStudentByGioiTinh(gender);
            }
            if (choice == 6) {
                System.out.print("Nhap vao lop MH ma ban muon tim kiem: ");
                String lopmh = sc.nextLine();
                studentMangement.findStudentByLopMH(lopmh);
            }
        }
    }
}