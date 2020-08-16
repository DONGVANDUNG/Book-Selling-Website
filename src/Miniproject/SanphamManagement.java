package Miniproject;

import java.util.Scanner;

public class SanphamManagement {
    private Sanpham[] sanphams;
    private int n;

    public SanphamManagement(Sanpham[] sanphams, int n) {
        this.sanphams = sanphams;
        this.n = n;
    }

    public SanphamManagement(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Moi ban nhap vao thong tin cua 3 san pham!!");
        sanphams = new Sanpham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\t-Nhap thong tin san pham thu " + (i + 1) + ":");
            System.out.print("\t\t+Ten san pham: \t");
            String name = sc.nextLine();
            System.out.print("\t\t+Gia san pham: \t");
            long price = sc.nextLong();
            sc.nextLine();
            System.out.print("\t\t+Hang san pham:\t");
            String hang = sc.nextLine();
            sanphams[i] = new Sanpham(name, price, hang);
        }
    }

    public void Check() {
        for (int i = 0; i <sanphams.length-1; i++) {
            if (sanphams[i].getName().equals("Nokia")) {
                System.out.println(sanphams[i].toString());
            }
        }
    }
}
