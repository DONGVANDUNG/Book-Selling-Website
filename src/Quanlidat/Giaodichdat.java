package Quanlidat;

import java.util.Arrays;
import java.util.Scanner;

public class Giaodichdat {
    private String magiaodich;
    private String ngaygiaodich;
    private float dongia;
    private String loaidat;
    private float dientich;
    private Giaodichdat[] giaodichdats;

    public Giaodichdat(String magiaodich, String ngaygiaodich, float dongia, String loaidat, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.loaidat = loaidat;
        this.dientich = dientich;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("-Ban muon nhap vao may giao dich dat: ");
        int seclect = sc.nextInt();
        giaodichdats = new Giaodichdat[seclect];
        for (int i = 0; i < seclect; i++) {
            System.out.println(" -Moi ban nhap thong tin cho hoa don thu " + (i + 1) + ": ");
            System.out.print("\t+Ma giao dich: ");
            sc.nextLine();
            String ma = sc.nextLine();
            System.out.print("\t+Ngay giao dich: ");
            String ngay = sc.nextLine();
            System.out.print("\t+Don gia: ");
            long dongia = sc.nextLong();
            System.out.print("\t+Loai dat(A/B/C): ");
            sc.nextLine();
            String loaidat = sc.nextLine();
            System.out.print("\t+Dien tich: ");
            float dientich = sc.nextFloat();
            giaodichdats[i]=new Giaodichdat(ma,ngay,dongia,loaidat,dientich);
        }
    }
    public Giaodichdat() {
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public float getDonggia() {
        return dongia;
    }

    public void setDonggia(float donggia) {
        this.dongia = donggia;
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public double Giaodichdat() {
        double thanhtien = 0;
        if (loaidat.equals("B") || loaidat.equals("C")) {
            thanhtien = (double) (dongia * dientich);
        } else if (loaidat.equals("A")) {
            thanhtien = dongia * dientich * 1.5;
        }
        return thanhtien;
    }

    public void showInfo() {
        System.out.println("-Giao dich dat:");
        for (int i = 0; i < giaodichdats.length-1; i++) {
            System.out.println("\t-Hoa don giao dich thu " + (i + 1) + ": ");
            System.out.println("\t\t+Ma giao dich: " + magiaodich);
            System.out.println("\t\t+Ngay giao dich: " + ngaygiaodich);
            System.out.println("\t\t+Don gia: " + dongia);
            System.out.println("\t\t+Loai dat: " + loaidat);
            System.out.println("\t\t+Dien tich: " + dientich);
            System.out.println("-------------------------------------------");
        }
    }

    public float TB() {
        float tong = 0;
        for (int i = 0; i < giaodichdats.length - 1; i++) {
            tong += giaodichdats[i].Giaodichdat();
        }
        float TB = tong / (giaodichdats.length);
        return TB;
    }

    public void Xuatgiaodich(String ngaythang) {
        for (int i = 0; i < giaodichdats.length - 1; i++) {
            if (giaodichdats[i].getNgaygiaodich().equals(ngaythang)) {
                giaodichdats[i].showInfo();
            }
        }
    }

    @Override
    public String toString() {
        return "Giaodichdat{" +
                "magiaodich='" + magiaodich + '\'' +
                ", ngaygiaodich='" + ngaygiaodich + '\'' +
                ", dongia=" + dongia +
                ", loaidat='" + loaidat + '\'' +
                ", dientich=" + dientich +
                ", giaodichdats=" + Arrays.toString(giaodichdats) +
                '}';
    }
}
