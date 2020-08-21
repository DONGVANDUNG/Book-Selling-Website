package Quanlidat;

import Quanlidat.Giaodichdat;
import Quanlidat.Giaodichnha;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-Ban co cac lua chon sau: ");
            System.out.println("\t+ 1: Thao tac giao dich dat!!");
            System.out.println("\t+ 2: Thao tac giao dich nha!!");
            System.out.print("-Lua chon cua ban la: ");
            int choise = sc.nextInt();
            if (choise == 1) {
                while (true) {
                Giaodichdat giaodichdat = new Giaodichdat();
                System.out.println("-1: Nhap thong tin cho hoa don giao dich dat!!");
                System.out.println("-2: In ra thong tin cac hoa don giao dich dat!!");
                System.out.println("-3: In ra hoa don can tim theo ngay thang!!");
                System.out.print("\t-Lua chon cua ban la: ");
                int select = sc.nextInt();

                    if (select == 1) {
                        giaodichdat.Input();
                    } else if (select == 2) {
                        giaodichdat.showInfo();
                    } else if (select == 3) {
                        System.out.print("Moi ban nhap ngay thang cua hoa don can tim (ngay/thang/nam):  ");
                        String ngaythang = sc.nextLine();
                        giaodichdat.Xuatgiaodich(ngaythang);
                    }
                }
            }

                if (choise == 2) {
                    while (true) {
                    Giaodichnha giaodichnha = new Giaodichnha();
                    System.out.println("-1: Nhap thong tin cho hoa don giao dich nha!!");
                    System.out.println("-2: In ra thong tin cac hoa don giao dich nha!!");
                    System.out.println("-3: In ra hoa don can tim theo ngay thang!!");
                    System.out.print("\t-Lua chon cua ban la: ");
                    int select = sc.nextInt();
                    if (select == 1) {
                        giaodichnha.Input();
                    } else if (select == 2) {
                        giaodichnha.showInfo();
                    } else if (select == 3) {
                        System.out.print("Moi ban nhap ngay thang cua hoa don can tim (ngay/thang/nam):  ");
                        String ngaythang = sc.nextLine();
                        giaodichnha.Xuatgiaodich(ngaythang);
                    }
                }
            }
        }
    }
}