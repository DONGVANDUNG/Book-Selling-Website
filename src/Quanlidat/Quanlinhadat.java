package Quanlidat;

import java.util.Scanner;

public class Quanlinhadat {
    private Giaodichnha[]quanlinha;
    private Giaodichdat[]quanlidat;

    public Quanlinhadat() {
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-Ban muon nhap vao giao dich nha/dat?");
        System.out.println("\t-1:Giao dich nha:");
        System.out.println("\t-2:Giao dich dat:");
        System.out.print("\t\t+Lua chon cua ban la: ");
        int choise = sc.nextInt();
        if(choise==1){
            System.out.println("-Moi ban nhap vao thong tin cac hoa don giao dich nha!!!");
            System.out.print("\t-Ban muon nhap vao may hoa don: ");
            int select=sc.nextInt();
            quanlinha=new Giaodichnha[select];
            for (int i = 0; i <select ; i++) {
                System.out.println(" -Moi ban nhap thong tin cho hoa don thu " + (i + 1) + ": ");
                System.out.print("\t\t+Ma giao dich: ");
                sc.nextLine();
                String ma = sc.nextLine();
                System.out.print("\t\t+Ngay giao dich: ");
                String ngay = sc.nextLine();
                System.out.print("\t\t+Don gia: ");
                long dongia = sc.nextLong();
                System.out.print("\t\t+Loai dat(A/B/C): ");
                sc.nextLine();
                String loaidat = sc.nextLine();
                System.out.print("\t\t+Dia chi: ");
                String diachi = sc.nextLine();
                System.out.print("\t\t+Dien tich: ");
                float dientich = sc.nextFloat();
               this.quanlinha[i]=new Giaodichnha(ma,ngay,dongia,loaidat,diachi,dientich);
            }
        }
        else if(choise==2){
            System.out.println("-Moi ban nhap vao thong tin cac hoa don giao dich dat!!");
            System.out.print(" -Ban muon nhap vao bao nhieu hoa don: ");
            int select=sc.nextInt();
            quanlidat=new Giaodichdat[select];
            for (int i = 0; i <select ; i++) {
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
                this.quanlidat[i]=new Giaodichdat(ma,ngay,dongia,loaidat,dientich);
            }
        }
    }

    public Giaodichnha[] getQuanlinha() {
        return quanlinha;
    }

    public void setQuanlinha(Giaodichnha[] quanlinha) {
        this.quanlinha = quanlinha;
    }

    public Giaodichdat[] getQuanlidat() {
        return quanlidat;
    }

    public void setQuanlidat(Giaodichdat[] quanlidat) {
        this.quanlidat = quanlidat;
    }
    public void print() {
        for (int i = 0; i <=quanlinha.length-1 ; i++) {
            quanlinha[i].print(i+1);
        }
    }
    public void printf(){
        for (int i = 0; i <=quanlidat.length-1 ; i++) {
            quanlidat[i].print(i+1);
        }
    }

    public float TB() {
        float tong = 0;
        for (int i = 0; i <= quanlidat.length - 1; i++) {
            tong += quanlidat[i].Giaodichdat();
        }
        float TB = tong / (quanlidat.length);
        return TB;
    }
    public void Xuatgiaodich(String ngaythang){
        for (int i = 0; i <=quanlidat.length-1 ; i++) {
            if(quanlidat[i].getNgaygiaodich().equals(ngaythang)){
                System.out.println(quanlidat[i].toString());
            }
        }
    }
    public void XuatGiaodich(String ngaythang){
        for (int i = 0; i <=quanlinha.length-1 ; i++) {
            if(quanlinha[i].getNgaygiaodich().equals(ngaythang)){
                System.out.println(quanlinha[i].toString());
            }
        }
    }
}
