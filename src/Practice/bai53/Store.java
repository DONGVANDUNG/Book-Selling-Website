package Practice.bai53;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    private String name;
    ;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store(int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Nhap thong tin cho cua hang thu " + index + ":");
        System.out.print("\t+Ten cua hang: ");
        this.name = sc.nextLine();
        System.out.print("\t+Dia chi cua hang: ");
        this.address = sc.nextLine();
        System.out.print("\t+Tong so dien thoai ban duoc: ");
        this.n = sc.nextInt();
        phones = new SmartPhone[n];
        for (int i = 0; i < getN(); i++) {
            System.out.println("\t\t-Nhap thong tin cho dien thoai thu " + index + ":");
            System.out.print("\t\t\t+Ten hang dien thoai: ");
            sc.nextLine();
            String brand = sc.nextLine();
            System.out.print("\t\t\t+Co bluetooth hay khong? : ");
            boolean hasbluetooth = sc.nextBoolean();
            System.out.print("\t\t\t+Co 5G hay khong? :  ");
            boolean has5G = sc.nextBoolean();
            System.out.print("\t\t\t+Co Wifi hay khong? : ");
            boolean haswifi = sc.nextBoolean();
            System.out.print("\t\t\t+He dieu hanh: ");
            sc.nextLine();
            String os = sc.nextLine();
            System.out.print("\t\t\t+Dung luong bo nho: ");
            float memory = sc.nextFloat();
            System.out.print("\t\t\t+Mau sac: ");
            sc.nextLine();
            String color = sc.nextLine();
            System.out.print("\t\t\t+Gia ban: ");
            long price = sc.nextLong();
            System.out.print("\t\t\t+Tong so da ban duoc: ");
            int totalSold = sc.nextInt();
            this.phones[i] = new SmartPhone(brand, hasbluetooth, has5G, haswifi, os, memory, color, price, totalSold);
        }
    }

    public long revenue() {
        long revenue = 0;
        for (int i = 0; i < phones.length - 1; i++) {
            revenue += phones[i].getTotalSold() * phones[i].getPrice();
        }
        return revenue;
    }

    public Store(String name, String address, int n, SmartPhone[] phones) {
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int totalSold() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += phones[i].getTotalSold();
        }
        return count;
    }

    public void print(int index) {
        System.out.println("-Thong tin cua hang thu " + (index + 1) + ":");
        System.out.println("\t+Ten cua hang: " + name);
        System.out.println("\t+Dia chi: " + address);
        System.out.println("\t+Tong so dien thoai ban duoc:" + n);
        for (int i = 0; i < n; i++) {
            System.out.println("\t\t-Dien thoai thu " + (i + 1) + ":");
            System.out.println("\t\t\t+Brand: " + phones[i].getBrand());
            System.out.println("\t\t\t+Co bluetooth hay khong?: " + phones[i].isHasBluetooth());
            System.out.println("\t\t\t+Co 5G hay khong?: " + phones[i].isHas5G());
            System.out.println("\t\t\t+Co Wifi hay khong?: " + phones[i].isHasWifi());
            System.out.println("\t\t\t+He dieu hanh: " + phones[i].getOs());
            System.out.println("\t\t\t+Dung luong bo nho: " + phones[i].getMemory());
            System.out.println("\t\t\t+Gia ca: " + phones[i].getPrice());
            System.out.println("\t\t\t+Mau sac: " + phones[i].getColor());
            System.out.println("\t\t\t+Tong so da ban duoc:  " + phones[i].getTotalSold());
            System.out.println("------------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}
