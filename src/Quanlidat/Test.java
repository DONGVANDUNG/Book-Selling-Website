package Quanlidat;

import Quanlidat.Giaodichdat;
import Quanlidat.Giaodichnha;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanlinhadat quanlinhadat = new Quanlinhadat();
        while (true) {
            quanlinhadat.Input();
            System.out.println("--------------------------------------");
            System.out.println("-Ban muon tim hoa don giao dich cua: ");
            System.out.println("\t+1:Nha!!");
            System.out.println("\t+2:Dat!!");
            System.out.println("\t+3: Xuat ra trung binh cac giao dich dat!!");
            System.out.print(" -Lua chon cua ban la: ");
            int choise = sc.nextInt();
            if (choise == 1) {
                System.out.print("-Nhap vao ngay thang nam cua hoa don (ngay/thang/nam): ");
                String ngaythang = sc.next();
                quanlinhadat.XuatGiaodich(ngaythang);
                System.out.println("------------------------------------------");
            }
            if (choise == 2) {
                System.out.print("-Nhap vao ngay thang nam cua hoa don (ngay/thang/nam): ");
                String ngaythang = sc.next();
                quanlinhadat.Xuatgiaodich(ngaythang);
                System.out.println("------------------------------------------");
            }
            if(choise==3){
                System.out.println("\t\t+Trung binh cua cac giao dich dat la: "+quanlinhadat.TB());
                System.out.println("-----------------------------------------");
            }
        }
    }
}