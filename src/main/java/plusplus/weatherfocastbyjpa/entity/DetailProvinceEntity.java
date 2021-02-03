package plusplus.weatherfocastbyjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detail_province")
@Getter @Setter
public class DetailProvinceEntity {
    @Id
     @Column(name = "province_name")
    private String provinceName;
     @Column(name = "temperature_morning")
    private Integer temperatureMorning;
     @Column(name = "temperature_lunch")
    private Integer temperatureLunch;
     @Column(name = "temperature_evening")
    private Integer temperatureEvening;
     @Column(name = "sunrise")
    private String sunRise;
     @Column(name = "sunset")
    private String sunSet;
     @Column(name = "wind_speed")
    private String windSpeed;
     @Column(name = "max_temperature_week")
    private Integer maxTemperatureWeek;
     @Column(name = "min_temperature_week")
    private Integer minTemperatureWeek;
}
