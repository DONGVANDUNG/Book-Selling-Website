package Miniproject;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String mssv;
    private String lopMh;
    private String quequan;
    private String gioitinh;

    public Student() {
        Scanner sc=new Scanner(System.in);
        System.out.println("MOI NHAP VAO THONG TIN CHO SINH VIEN!");
        System.out.print("Nhap vao ten sinh vien: ");
        this.name=sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        this.age=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao MSSV: ");
        this.mssv=sc.nextLine();
        System.out.print("Nhap vao Lop MH: ");
        this.lopMh=sc.nextLine();
        System.out.print("Nhap vao gioi tinh: ");
        this.gioitinh=sc.nextLine();
        System.out.print("Nhap vao que quan: ");
        this.quequan=sc.nextLine();
         Student student=new Student(name,age,mssv,lopMh,gioitinh,quequan);
    }

    public Student(String name, int age, String mssv, String lopMh, String gioitinh, String quequan) {
        this.name = name;
        this.age = age;
        this.mssv = mssv;
        this.lopMh = lopMh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getLopMh() {
        return lopMh;
    }

    public void setLopMh(String lopMh) {
        this.lopMh = lopMh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
}
