package plusplus.weatherfocastbyjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.weatherfocastbyjpa.entity.DetailProvinceEntity;
import plusplus.weatherforcast.entity.DetailProvince;

import java.util.List;

@Repository
public interface DetailProvinceRepository extends JpaRepository<DetailProvinceEntity, String> {
    List<DetailProvinceEntity> findAll();

  DetailProvinceEntity findAllByProvinceName(String name);

    List<DetailProvinceEntity> findALlByTemperatureMorning(Integer temp_mor);

    List<DetailProvinceEntity> findAllByTemperatureLunch(Integer temp_lunch);

    List<DetailProvinceEntity> findAllByTemperatureEvening(Integer temp_eve);

    List<DetailProvinceEntity> findALlBySunSet(String sunset);

    List<DetailProvinceEntity> findAllBySunRise(String sunrise);

    List<DetailProvinceEntity> findAllByWindSpeed(Integer wind_speed);

    List<DetailProvinceEntity> findAllByMaxTemperatureWeek(Integer max);

    List<DetailProvinceEntity> findAllByMinTemperatureWeek(Integer min);

    List<DetailProvinceEntity> findAllBySunSetGreaterThan(String sunset);
}
