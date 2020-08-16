package Sanpham;

import java.util.Scanner;

public class Sanpham {
    String name;
    long price;
    String hang;

    public Sanpham(String name, long price, String hang) {
    }

    public Sanpham() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "Sanpham{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", hang='" + hang + '\'' +
                '}';
    }
}