package service.lesson3.bai31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("---------- MySQL JBDC Conection Demo-----------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registersed!");
        Connection connection = null;
        try {
            Scanner sc = new Scanner(System.in);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus?characterEncoding=utf8", "root", "372001dung");
            System.out.println("SQP Conection to database established!");
            LaptopService laptopService = new LaptopService(connection);
            System.out.println("\t-Laptop ban muon tim kiem co: ");
            System.out.print("\t\t+Ram la: ");
            String Ram = sc.nextLine();
            System.out.print("\t\t+Hang san xuat la: ");
            String Maker = sc.nextLine();
            System.out.println("------------------------------------------------------------");
            laptopService.showInfor(laptopService.findlaptop(Ram, Maker));
            System.out.println("------------------------------------------------------------");
            System.out.println("\t-Ban muon tim kiem laptop co gia: ");
            System.out.print("\t\t+FromPrice: ");
            long fromprice = sc.nextLong();
            System.out.print("\t\t+ToPrice: ");
            long toprice = sc.nextLong();
            laptopService.showInfor(laptopService.Findlaptopbyprice(fromprice, toprice));

        } catch (Exception e) {
            System.out.println("Connection  Failed!Check output console" + e);
            return;
        }
    }
}
