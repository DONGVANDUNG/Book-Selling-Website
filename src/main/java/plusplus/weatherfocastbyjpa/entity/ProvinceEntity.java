package plusplus.weatherfocastbyjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "province")
@Getter @Setter
public class ProvinceEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "province_name")
    private String provinceName;
    @Column(name = "max_temperature")
    private Integer maxTemperature;
    @Column(name = "min_temperature")
    private Integer minTemperature;
}
