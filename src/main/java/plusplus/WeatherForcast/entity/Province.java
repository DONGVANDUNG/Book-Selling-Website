package plusplus.WeatherForcast.entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Province {
    int Id;
    String province_name;
    String max_temperature;
    String min_temperature;

    public Province(int id, String province_name, String max_temperature, String min_temperature) {
        Id = id;
        this.province_name = province_name;
        this.max_temperature = max_temperature;
        this.min_temperature = min_temperature;
    }
}
