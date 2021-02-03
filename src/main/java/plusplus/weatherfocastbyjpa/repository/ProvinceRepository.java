package plusplus.weatherfocastbyjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.weatherfocastbyjpa.entity.ProvinceEntity;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity, Integer> {
    List<ProvinceEntity> findAll();

    List<ProvinceEntity> findAllByProvinceName(String name);

    List<ProvinceEntity> findAllByMaxTemperature(Integer max);

    List<ProvinceEntity> findAllByMinTemperature(Integer min);

    List<ProvinceEntity> findAllByMaxTemperatureGreaterThan(Integer max);

    List<ProvinceEntity> findAllByMaxTemperatureLessThan(Integer max);

    List<ProvinceEntity> findAllByMinTemperatureGreaterThan(Integer min);

    List<ProvinceEntity> findAllByMinTemperatureLessThan(Integer min);

    List<ProvinceEntity> findALlByMaxTemperatureBetween(Integer max, Integer min);

    List<ProvinceEntity> findALlByMinTemperatureBetween(Integer max, Integer min);

    ProvinceEntity findOneById(Integer id);
}
