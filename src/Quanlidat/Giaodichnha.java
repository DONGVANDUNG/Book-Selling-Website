package Quanlidat;

import java.util.Arrays;
import java.util.Scanner;

public class Giaodichnha {
    private String magiaodich;
    private String ngaygiaodich;
    private long dongia;
    private String loainha;
    private String diachi;
    private float dientich;

    public Giaodichnha(String magiaodich, String ngaygiaodich, long dongia, String loainha, String diachi, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.loainha = loainha;
        this.diachi = diachi;
        this.dientich = dientich;
    }

    public Giaodichnha() {
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

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public double Giaodichnha() {
        double thanhtien = 0;
        if (loainha.equals("Cao Cap")) {
            thanhtien = dongia * dientich;
        } else if (loainha.equals("Thuong")) {
            thanhtien = dongia * dientich * 0.9;
        }
        return thanhtien;
    }

    public void print(int i) {
        System.out.println("-Giao dich nha: ");
        System.out.println("\t-Hoa don giao dich thu " + (i + 1) + ": ");
        System.out.println("\t\t+Ma giao dich: " + magiaodich);
        System.out.println("\t\t+Ngay giao dich: " + ngaygiaodich);
        System.out.println("\t\t+Don gia: " + dongia);
        System.out.println("\t\t+Loai dat: " + loainha);
        System.out.println("\t\t+Dia chi: " + diachi);
        System.out.println("\t\t+Dien tich: " + dientich);
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        return "\t\t+Giaodichnha{" +
                "magiaodich='" + magiaodich + '\'' +
                ", ngaygiaodich='" + ngaygiaodich + '\'' +
                ", dongia=" + dongia +
                ", loainha='" + loainha + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dientich=" + dientich +
                '}';
    }
}
