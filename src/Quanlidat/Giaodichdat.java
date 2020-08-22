package Quanlidat;

import java.util.Arrays;
import java.util.Scanner;

public class Giaodichdat {
    private String magiaodich;
    private String ngaygiaodich;
    private float dongia;
    private String loaidat;
    private float dientich;

    public Giaodichdat(String magiaodich, String ngaygiaodich, float dongia, String loaidat, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.loaidat = loaidat;
        this.dientich = dientich;
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
    public void print(int i) {
        System.out.println("-Giao dich nha: ");
        System.out.println("\t-Hoa don giao dich thu " + (i + 1) + ": ");
        System.out.println("\t\t+Ma giao dich: " + magiaodich);
        System.out.println("\t\t+Ngay giao dich: " + ngaygiaodich);
        System.out.println("\t\t+Don gia: " + dongia);
        System.out.println("\t\t+Loai dat: " + loaidat);
        System.out.println("\t\t+Dien tich: " + dientich);
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        return "Giaodichdat{" +
                "magiaodich='" + magiaodich + '\'' +
                ", ngaygiaodich='" + ngaygiaodich + '\'' +
                ", dongia=" + dongia +
                ", loaidat='" + loaidat + '\'' +
                ", dientich=" + dientich +
                '}';
    }
}