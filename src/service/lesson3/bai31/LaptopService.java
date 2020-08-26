package service.lesson3.bai31;

import service.lesson3.bai31.LaptopEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LaptopService {
    private Connection connection;

    public LaptopService(Connection connection) {
        this.connection = connection;
    }

    public List<LaptopEntity> findlaptop(String Ram, String Maker) {
        List<LaptopEntity> latop = new ArrayList<>();
        String query = "SELECT * FROM store_cms_plusplus.laptop WHERE ram='" + Ram + "' AND maker='" + Maker + "'";
        try {
            Statement statement = connection.createStatement();
            ResultSet data = statement.executeQuery(query);
            while (data.next()) {
                LaptopEntity laptopEntity = new LaptopEntity(data.getInt(1), data.getString(2), data.getString(3), data.getString(4), data.getString(5), data.getString(6), data.getString(7), data.getString(8), data.getString(9), data.getLong(10), data.getString(11), data.getString(12), data.getFloat(13), data.getInt(14), data.getTimestamp(15), data.getTimestamp(16));
                latop.add(laptopEntity);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return latop;
    }

    public List<LaptopEntity> Findlaptopbyprice(long FromPrice, long ToPrice) {
        List<LaptopEntity> laptopEntities = new ArrayList<>();
        String query = "SELEC*FROM store_cms_plusplus.laptop WHERE price>" + FromPrice + " AND price<" + ToPrice;
        try {
            Statement statement = connection.createStatement();
            ResultSet data = statement.executeQuery(query);
            while (data.next()) {
                LaptopEntity laptopEntity = new LaptopEntity(data.getInt(1), data.getString(2), data.getString(3), data.getString(4), data.getString(5), data.getString(6), data.getString(7), data.getString(8), data.getString(9), data.getLong(10), data.getString(11), data.getString(12), data.getFloat(13), data.getInt(14), data.getTimestamp(15), data.getTimestamp(16));
                laptopEntities.add(laptopEntity);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopEntities;
    }

    public void showInfor(List<LaptopEntity> lap) {
        for (LaptopEntity l : lap) {
            System.out.println("-Thong tin laptop : ");
            System.out.println("\t+Name: " + l.getName());
            System.out.println("\t+Url: " + l.getUrl());
            System.out.println("\t+Maker: " + l.getMaker());
            System.out.println("\t+Type: " + l.getType());
            System.out.println("\t+Ram " + l.getRam());
            System.out.println("\t+CPU:  " + l.getCpu());
            System.out.println("\t+SSD:  " + l.getSsd());
            System.out.println("\t+HDD:  " + l.getHdd());
            System.out.println("\t+Price:  " + l.getPrice());
            System.out.println("\t+Card: " + l.getCard());
            System.out.println("\t+Screen_resolution:  " + l.getScreen_resolution());
            System.out.println("\t+Screen_size:  " + l.getScreen_size());
            System.out.println("\t+Sold:  " + l.getSold());
            System.out.println("\t+Created_timestamp:  " + l.getCreated_timestamp());
            System.out.println("\t+Last_updated_timestamp:  " + l.getLasted_updated_timestamp());
        }
    }
}

