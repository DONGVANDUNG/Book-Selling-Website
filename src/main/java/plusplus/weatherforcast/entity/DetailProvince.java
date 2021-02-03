package plusplus.WeatherForcast.entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class DetailProvince {
    String province_name;
    String temperature_morning;
    String temperature_lunch;
    String temperature_evening;
    String sunrise;
    String sunset;
    String wind_speed;
    String max_temperature_week;
    String min_temperature_week;

    public DetailProvince(String province_name, String temperature_morning,
                          String temperature_lunch, String temperature_evening,
                          String sunrise, String sunset, String wind_speed,
                          String max_temperature_week, String min_temperature_week) {
        this.province_name = province_name;
        this.temperature_morning = temperature_morning;
        this.temperature_lunch = temperature_lunch;
        this.temperature_evening = temperature_evening;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.wind_speed = wind_speed;
        this.max_temperature_week = max_temperature_week;
        this.min_temperature_week = min_temperature_week;
    }
}
