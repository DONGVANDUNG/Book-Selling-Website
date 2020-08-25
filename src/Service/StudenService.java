package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudenService {
    private Connection connection;

    public StudenService(Connection connection) {
        this.connection = connection;
    }

    public void findlaptop(String Ram, String Maker) {
        String query = "SELECT *FROM store_cms_plusplus.laptop WHERE ram='" + Ram + "' AND maker='" + Maker + "'";
        try {
            Statement statement = connection.createStatement();
            ResultSet data = statement.executeQuery(query);
            while (data.next()) {
                String name = data.getString(2);
                String url = data.getString(3);
                String maker = data.getString(4);
                String type = data.getString(5);
                String ram = data.getString(6);
                 String CPU = data.getString(7);
                int ssd = data.getInt(8);
                String hdd = data.getString(9);
                long price = data.getLong(10);
                String card = data.getString(11);
                String screen_resolution = data.getString(12);
                Float screen_size = data.getFloat(13);
                int sold = data.getInt(14);
                String created_timestamp = data.getString(15);
                String last_updated_timestamp = data.getString(16);
                System.out.println("-Thong tin may tinh: ");
                System.out.println("\t+Name:  " + name);
                System.out.println("\t+Url:  " + url);
                System.out.println("\t+Maker: " + maker);
                System.out.println("\t+Type: " + type);
                System.out.println("\t+Ram:  " + ram);
                System.out.println("\t+CPU:  " + CPU);
                System.out.println("\t+SSD:  " + ssd);
                System.out.println("\t+HDD: " + hdd);
                System.out.println("\t+Price: " + price);
                System.out.println("\t+Card: " + card);
                System.out.println("\t+Screen_resolution:  " + screen_resolution);
                System.out.println("\t+Screen_size: " + screen_size);
                System.out.println("\t+Sold: " + sold);
                System.out.println("\t+Created_timestamp: " + created_timestamp);
                System.out.println("\t+Last_updated_timestamp:  " + last_updated_timestamp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
        public void Findlaptopbyprice(long FromPrice,long ToPrice){
            String query="SELEC*FROM store_cms_plusplus.laptop WHERE price>"+FromPrice+" AND price<"+ToPrice;
            try {
                Statement statement = connection.createStatement();
                ResultSet laptop = statement.executeQuery(query);
                while (laptop.next()) {
                    int id=laptop.getInt(1);
                    String name = laptop.getString(2);
                    String url = laptop.getString(3);
                    String maker = laptop.getString(4);
                    String type = laptop.getString(5);
                    String ram = laptop.getString(6);
                    String CPU = laptop.getString(7);
                    int ssd = laptop.getInt(8);
                    String hdd = laptop.getString(9);
                    long price = laptop.getLong(10);
                    String card = laptop.getString(11);
                    String screen_resolution = laptop.getString(12);
                    Float screen_size = laptop.getFloat(13);
                    int sold = laptop.getInt(14);
                    String created_timestamp =laptop.getString(15);
                    String last_updated_timestamp =laptop.getString(16);
                    System.out.println("-Thong tin laptop thu "+id+": ");
                    System.out.println("\t+Name: " + name);
                    System.out.println("\t+Url: " + url);
                    System.out.println("\t+Maker: " + maker);
                    System.out.println("\t+Type: " + type);
                    System.out.println("\t+Ram " + ram);
                    System.out.println("\t+CPU:  " + CPU);
                    System.out.println("\t+SSD:  " + ssd);
                    System.out.println("\t+HDD:  " + hdd);
                    System.out.println("\t+Price:  " + price);
                    System.out.println("\t+Card: " + card);
                    System.out.println("\t+Screen_resolution:  " + screen_resolution);
                    System.out.println("\t+Screen_size:  " + screen_size);
                    System.out.println("\t+Sold:  " + sold);
                    System.out.println("\t+Created_timestamp:  " + created_timestamp);
                    System.out.println("\t+Last_updated_timestamp:  " + last_updated_timestamp);
                }
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
