package service.lesson3.bai32;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopService {
    private Connection connection;

    public LaptopService(Connection connection) {
        this.connection = connection;
    }

    public List<LaptopEntity> FindLaptop(LaptopEntity laptopEntity) {
        List<LaptopEntity> laptopEntities = new ArrayList<>();
        String query = "SELECT *FROM store_cms_plusplus";
        if (laptopEntity.getFromPrice() != null) {
            query = query + " WHERE price>=" + laptopEntity.getFromPrice();
        }
        if (laptopEntity.getToPrice() != null) {
            query = query + " AND price<=" + laptopEntity.getToPrice();
        }
        if (laptopEntity.getMaker() != null) {
            query = query + " AND maker='" + laptopEntity.getMaker() + "'";
        }
        if (laptopEntity.getScreen_size() != null) {
            query = query + " AND screen_size='" + laptopEntity.getScreen_size() + "'";
        }
        if (laptopEntity.getRam() != null) {
            query = query + " AND ram='" + laptopEntity.getRam() + "'";
        }
        if (laptopEntity.getType() != null) {
            query = query + " AND type='" + laptopEntity.getType() + "'";
        }
        if (laptopEntity.getSort().equals("increase")) {
            query = query + " AND ORDER BY " + laptopEntity.getSort() + " ASC";
        }
        if (laptopEntity.getSort().equals("decrease")) {
            query = query + " AND ORDER BY " + laptopEntity.getSort() + " DESC";
        }
        if (laptopEntity.getCard() != null) {
            query = query + " AND card='" + laptopEntity.getCard() + "'";
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet data = statement.executeQuery(query);
            while (data.next()) {
                LaptopEntity LT = new LaptopEntity(data.getInt(1), data.getString(2), data.getString(3), data.getString(4), data.getString(5), data.getString(6), data.getString(7), data.getString(8), data.getString(9), data.getLong(10), data.getString(11), data.getString(12), data.getInt(13), data.getTimestamp(14), data.getTimestamp(15), data.getString(16));
                laptopEntities.add(LT);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopEntities;
    }

    public LaptopEntity Input() {
        List<LaptopEntity> lap=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
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
        }
        return
    }
}

