package Practice.bai53;

import java.util.Scanner;

public class Apptest {
    public static void main(String[] args) {
        StoreManagement storeManagement = new StoreManagement(2);
        System.out.println("----------------------------------------------------");
        System.out.println("-Tong so dien thoai co Wifi la: " + storeManagement.hasWifi());
        System.out.println("-Tong so dien thoai co 5G la: " + storeManagement.has5G());
        System.out.println("-Tong so dien thoai co Bluetooth la: " + storeManagement.hasBluetooth());
        System.out.println("---------------------------------------------------");
        System.out.println("-Cua hang co doan thu cao nhat la: " + storeManagement.MaxRevenue());
        System.out.println("----------------------------------------------------");
        System.out.println("-Cua hang co doanh thu thap nhat la: " + storeManagement.MinRevenue());
        System.out.println("-----------------------------------------------------");
        System.out.println("Cua hang ban duoc nhieu dien thoai nhat la: " + storeManagement.MaxTotalSold());
        System.out.println("------------------------------------------------------");
        System.out.println("Cua hang ban duoc it dien thoai nhat la: " + storeManagement.MinTotalSold());
        System.out.println("----------------------------------------------------");
        storeManagement.print();
    }
}
