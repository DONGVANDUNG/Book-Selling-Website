package Quanlidat;

import java.util.Arrays;
import java.util.Scanner;

public class Giaodichnha extends Giaodichdat {
    private String magiaodich;
    private String ngaygiaodich;
    private long dongia;
    private String loainha;
    private String diachi;
    private float dientich;
    private Giaodichnha[] giaodichnha;

    public Giaodichnha(String magiaodich, String ngaygiaodich, long dongia, String loainha, String diachi, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.loainha = loainha;
        this.diachi = diachi;
        this.dientich = dientich;
    }

public void Input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("-Ban muon nhap vao may hoa don giao dich nha: ");
    int select = sc.nextInt();
    giaodichnha = new Giaodichnha[select];
    for (int i = 0; i < select; i++) {
        System.out.println(" -Nhap thong tin cho hoa don thu " + (i + 1) + ": ");
        System.out.print("\t+Ma giao dich: ");
        String ma = sc.nextLine();
        sc.nextLine();
        System.out.print("\t+Ngay giao dich: ");
        String ngay = sc.nextLine();
        System.out.print("\t+Don gia: ");
        long dongia = sc.nextLong();
        System.out.print("\t+Loai dat(A/B/C): ");
        String loaidat = sc.nextLine();
        sc.nextLine();
        System.out.print("\t+Dia chi: ");
        String diachi = sc.nextLine();
        System.out.print("\t+Dien tich: ");
        float dientich = sc.nextFloat();
        giaodichnha[i]=new Giaodichnha(ma,ngay,dongia,loainha,diachi,dientich);
    }
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

    public double Giaodichnah() {
        double thanhtien = 0;
        if (loainha.equals("Cao Cap")) {
            thanhtien = dongia * dientich;
        } else if (loainha.equals("Thuong")) {
            thanhtien = dongia * dientich * 0.9;
        }
        return thanhtien;
    }

    public void showInform() {
        System.out.println("-Giao dich nha: ");
        for (int i = 0; i < giaodichnha.length - 1; i++) {
            System.out.println("\t-Hoa don giao dich thu " + (i + 1) + ": ");
            System.out.println("\t\t+Ma giao dich: " + magiaodich);
            System.out.println("\t\t+Ngay giao dich: " + ngaygiaodich);
            System.out.println("\t\t+Don gia: " + dongia);
            System.out.println("\t\t+Loai dat: " + loainha);
            System.out.println("\t\t+Dia chi: " + diachi);
            System.out.println("\t\t+Dien tich: " + dientich);
            System.out.println("---------------------------------------------");
        }
    }

    public void Xuatgiaodich(String ngaythang) {
        for (int i = 0; i < giaodichnha.length - 1; i++) {
            if (giaodichnha[i].getNgaygiaodich().equals(ngaythang)) {
                giaodichnha[i].showInfo();
            }
        }
    }

    @Override
    public String toString() {
        return "Giaodichnha{" +
                "magiaodich='" + magiaodich + '\'' +
                ", ngaygiaodich='" + ngaygiaodich + '\'' +
                ", dongia=" + dongia +
                ", loainha='" + loainha + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dientich=" + dientich +
                ", giaodichnha=" + Arrays.toString(giaodichnha) +
                '}';
    }
}