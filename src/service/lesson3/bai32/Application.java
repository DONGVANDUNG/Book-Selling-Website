package service.lesson3.bai32;

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
            LaptopService laptopService=new LaptopService(connection);
            System.out.println("-Nhap vao nhung thong so ma ban muon tim kiem :");
            System.out.println("\t+Price: ");
            System.out.print("\t\t+FromPrice(if not can input space): ");
            Long fromprice = sc.nextLong();
            if (fromprice.equals(" ")) {
                fromprice = null;
                System.out.print("Toprice(if not can input space) : ");
                Long toprice = sc.nextLong();
                if (toprice.equals(" ")) {
                    toprice = null;
                }
                System.out.print("\t+Maker(if not can input space) : ");
                String maker = sc.nextLine();
                if (maker.equals(" ")) {
                    maker = null;
                }
                System.out.print("\t+Screen_size(if not can input space: ");
                String screen_size = sc.nextLine();
                if (screen_size.equals(" ")) {
                    screen_size = null;
                }
                System.out.print("\t+Ram(if not can input space) : ");
                String ram = sc.nextLine();
                if (ram.equals(" ")) {
                    ram = null;
                }
                System.out.print("\t+Cpu(if not can input space) : ");
                String cpu = sc.nextLine();
                if (cpu.equals("")) {
                    cpu = null;
                }
                System.out.print("\t+Type(if not can input space) : ");
                String type = sc.nextLine();
                if (type.equals(" ")) {
                    type = null;
                }
                System.out.print("\t+Sort (increase/decrease) : ");
                String sort = sc.nextLine();
                System.out.print("\t+Card: ");
                String card = sc.nextLine();
                if (card.equals("")) {
                    card = null;
                }
                LaptopEntity laptopEntity = new LaptopEntity(fromprice, toprice, maker, screen_size, ram, cpu, type, card);
                laptopService.FindLaptop(laptopEntity);
            }
        } catch (Exception e) {
            System.out.println("Connection  Failed!Check output console" + e);
            return;
        }
    }
}
