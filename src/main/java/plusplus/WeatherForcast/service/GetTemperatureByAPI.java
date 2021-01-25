package plusplus.WeatherForcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plusplus.WeatherForcast.config.BeanConfig;
import plusplus.WeatherForcast.entity.DetailProvince;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class GetTemperatureByAPI {
    @Autowired
    BeanConfig beanConfig;

    public boolean vertifyprovince(String province) {
        String query = "SELECT* FROM province WHERE province_name='" + province + "';";
        try {
            Statement statement = beanConfig.getConnection().createStatement();
            ResultSet data = statement.executeQuery(query);
            if (data.next()) {
                return false;
            } else {
                System.out.println("Vertify access");
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    public DetailProvince getdetailprovince(String province) {
        DetailProvince detailProvince = null;
        if (vertifyprovince(province)) {
            System.out.println("Province not exist");
        } else {
            String query = "SELECT * FROM detail_province p join detail_province dt ON p.province_name=dt.province_name WHERE " +
                    "p.province_name='" + province + "';";
            try {
                Statement statement = beanConfig.getConnection().createStatement();
                ResultSet data = statement.executeQuery(query);
                if (data.next()) {
                    detailProvince = new DetailProvince(data.getString("province_name"),
                            data.getString("temperature_morning"),
                            data.getString("temperature_lunch"), data.getString("temperature_evening"),
                            data.getString("sunrise"), data.getString("sunset"), data.getString("wind_speed"),
                            data.getString("max_temperature_week"), data.getString("min_temperature_week"));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return detailProvince;
    }

    public List<DetailProvince> getAllprovincetemperature() {
        List<DetailProvince> detailProvinceList = new ArrayList<>();
        DetailProvince detailProvince = null;
        String query = "SELECT *FROM detail_province;";
        try {
            Statement statement = beanConfig.getConnection().createStatement();
            ResultSet data = statement.executeQuery(query);
            while (data.next()) {
                detailProvince = new DetailProvince(data.getString("province_name"),
                        data.getString("temperature_morning"),
                        data.getString("temperature_lunch"), data.getString("temperature_evening"),
                        data.getString("sunrise"), data.getString("sunset"), data.getString("wind_speed"),
                        data.getString("max_temperature_week"), data.getString("min_temperature_week"));
                detailProvinceList.add(detailProvince);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detailProvinceList;
    }
}
