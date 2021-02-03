package plusplus.weatherfocastbyjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.web.bind.annotation.*;
import plusplus.weatherfocastbyjpa.entity.DetailProvinceEntity;
import plusplus.weatherfocastbyjpa.entity.ProvinceEntity;
import plusplus.weatherfocastbyjpa.repository.DetailProvinceRepository;
import plusplus.weatherfocastbyjpa.repository.ProvinceRepository;
import plusplus.weatherforcast.entity.DetailProvince;

import javax.lang.model.type.DeclaredType;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "/province")
public class JpaController {
    //    Province generality
    @Autowired
    ProvinceRepository provinceRepository;

    @GetMapping(value = "/all")
    public List<ProvinceEntity> getAllProvince() {
        return provinceRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public List<ProvinceEntity> getProvinceByName(@PathVariable(name = "name") String name) {
        return provinceRepository.findAllByProvinceName(name);
    }

    @GetMapping(value = "/max/{temp}")
    public List<ProvinceEntity> getProvinceByMaxTemp(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMaxTemperature(temp);
    }

    @GetMapping(value = "/min/{temp}")
    public List<ProvinceEntity> getProvinceByMinTemp(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMinTemperature(temp);
    }

    @GetMapping(value = "/max/greater/{temp}")
    public List<ProvinceEntity> getProvinceByMaxTempGreater(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMaxTemperatureGreaterThan(temp);
    }

    @GetMapping(value = "/min/greater/{temp}")
    public List<ProvinceEntity> getProvinceByMinTempGreater(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMinTemperatureGreaterThan(temp);
    }

    @GetMapping(value = "/max/less/{temp}")
    public List<ProvinceEntity> getProvinceByMaxTempLess(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMaxTemperatureLessThan(temp);
    }

    @GetMapping(value = "/min/less/{temp}")
    public List<ProvinceEntity> getProvinceByMinTempLess(@PathVariable(name = "temp") Integer temp) {
        return provinceRepository.findAllByMinTemperatureLessThan(temp);
    }

    @GetMapping(value = "/temp/between/{min}/{max}")
    public List<ProvinceEntity> getPronvinceByTemp(@PathVariable(name = "min") Integer min, @PathVariable(name =
            "max") Integer max) {
        return provinceRepository.findALlByMaxTemperatureBetween(min, max);
    }

    @GetMapping(value = "/temp/between/{max}/{min}")
    public List<ProvinceEntity> getProvinceByTem(@PathVariable(name = "max") Integer max,
                                                 @PathVariable(name = "min") Integer min) {
        return provinceRepository.findALlByMinTemperatureBetween(max, min);
    }

    @GetMapping(value = "/id/{id}")
    public ProvinceEntity getProvinceById(@PathVariable(name = "id") Integer id) {
        return provinceRepository.findOneById(id);
    }

    //    Detail province
    @Autowired
    DetailProvinceRepository detailProvinceRepository;

    @GetMapping(value = "/detail/all")
    public List<DetailProvinceEntity> getALLProvinceDetail() {
        return detailProvinceRepository.findAll();
    }

    @GetMapping(value = "/province/name/{name}")
    public List<DetailProvinceEntity> getProvinceByProvinceName(@PathVariable(name = "name") String name) {
        return detailProvinceRepository.findAllByProvinceName(name);
    }

    @GetMapping(value = "/temp/morning/{temp}")
    public List<DetailProvinceEntity> getProvinceByTempMorning(@PathVariable(name = "temp") Integer temp) {
        return detailProvinceRepository.findALlByTemperatureMorning(temp);
    }

    @GetMapping(value = "/temp/lunch/{temp}")
    public List<DetailProvinceEntity> getProvinceByTempLunch(@PathVariable(name = "temp") Integer temp) {
        return detailProvinceRepository.findAllByTemperatureLunch(temp);
    }

    @GetMapping(value = "/temp/evening/{temp}")
    public List<DetailProvinceEntity> getProvinceTempEvening(@PathVariable(name = "temp") Integer temp) {
        return detailProvinceRepository.findAllByTemperatureEvening(temp);
    }

    @GetMapping(value = "sunset/{h}")
    public List<DetailProvinceEntity> getProvinceBySunSet(@PathVariable(name = "h") String h) {
        return detailProvinceRepository.findALlBySunSet(h);
    }

    @GetMapping(value = "/sunrise/{h}")
    public List<DetailProvinceEntity> getProvinceBySunRise(@PathVariable(name = "h") String h) {
        return detailProvinceRepository.findAllBySunRise(h);
    }

    @GetMapping(value = "wind/{speed}")
    public List<DetailProvinceEntity> getProvinceByWindSpeed(@PathVariable(name = "speed") Integer speed) {
        return detailProvinceRepository.findAllByWindSpeed(speed);
    }

    @GetMapping(value = "max/week/{temp}")
    public List<DetailProvinceEntity> getProvinceByMaxTempWeek(@PathVariable(name = "temp") Integer temp) {
        return detailProvinceRepository.findAllByMaxTemperatureWeek(temp);
    }

    @GetMapping(value = "min/week/{temp}")
    public List<DetailProvinceEntity> getProvinceByMinTempWeek(@PathVariable(name = "temp") Integer temp) {
        return detailProvinceRepository.findAllByMinTemperatureWeek(temp);
    }

    @GetMapping(value = "sunset/greater/{h}")
    public List<DetailProvinceEntity> getProvinceBySunSetGreater(@PathVariable(name = "h") String h) {
        return detailProvinceRepository.findAllBySunSetGreaterThan(h);
    }
}
