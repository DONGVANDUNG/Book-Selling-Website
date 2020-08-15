package Practice.bai42;

import Miniproject.StudentMangement;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;
    Scanner sc = new Scanner(System.in);

    public StudentManagement(int n, Student[] students) {
        this.n = n;
        this.students = students;
    }

    public StudentManagement(int n) {
        this.n = n;
        System.out.println("-Moi ban nhap thong tin cho " + n + " sinh vien!!");
        students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\t-Nhap vao thong tin cho sinh vien thu " + (i + 1) + ":");
            System.out.print("\t\t+Ten sinh vien:\t");
            String name = sc.nextLine();
            System.out.print("\t\t+Diem gpa:\t");
            float gpa = sc.nextFloat();
            students[i] = new Student(name, gpa);
            sc.nextLine();
        }
        sc.close();
    }

    public int CountDo() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].check()) {
                count++;
            }
        }
        return count;
    }

    public int CountTruot() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!students[i].check()) {
                count++;
            }
        }
        return count;
    }

    public String BestStudent() {
        Student beststudent = students[0];
        for (int i = 0; i < n; i++) {
            if (students[i].getGpa() > beststudent.getGpa()) {
                beststudent = students[i];
            }
        }
        return beststudent.toString();
    }

    public String WorstStudent() {
        Student worststudent = students[0];
        for (int i = 0; i < n; i++) {
            if (students[i].getGpa() < worststudent.getGpa()) {
                worststudent = students[i];
            }
        }
        return worststudent.toString();
    }
}
