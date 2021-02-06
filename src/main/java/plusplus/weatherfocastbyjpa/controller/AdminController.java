package plusplus.weatherfocastbyjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.weatherfocastbyjpa.entity.DetailProvinceEntity;
import plusplus.weatherfocastbyjpa.entity.ProvinceEntity;
import plusplus.weatherfocastbyjpa.repository.DetailProvinceRepository;
import plusplus.weatherfocastbyjpa.repository.ProvinceRepository;
import plusplus.weatherforcast.entity.DetailProvince;

import java.util.List;

@RestController
@RequestMapping(value = "/adm")
public class AdminController {
    @Autowired
    ProvinceRepository provinceRepository;
    @Autowired
    DetailProvinceRepository detailProvinceRepository;

    @PostMapping(value = "/addOne")
    public ProvinceEntity addOneProvince(@RequestBody ProvinceEntity request) {
        ProvinceEntity provinceEntity = new ProvinceEntity();
        provinceEntity.setProvinceName(request.getProvinceName());
        provinceEntity.setMaxTemperature(request.getMaxTemperature());
        provinceEntity.setMinTemperature(request.getMinTemperature());
        provinceEntity = provinceRepository.save(provinceEntity);
        return provinceEntity;
    }

    @PostMapping(value = "/addOneDetail")
    public DetailProvinceEntity addOneDetailProvince(@RequestBody DetailProvinceEntity request) {
        DetailProvinceEntity detailProvince = new DetailProvinceEntity();
        detailProvince.setProvinceName(request.getProvinceName());
        detailProvince.setTemperatureMorning(request.getTemperatureMorning());
        detailProvince.setTemperatureLunch(request.getTemperatureLunch());
        detailProvince.setTemperatureEvening(request.getTemperatureEvening());
        detailProvince.setSunRise(request.getSunRise());
        detailProvince.setSunSet(request.getSunSet());
        detailProvince.setWindSpeed(request.getWindSpeed());
        detailProvince.setMaxTemperatureWeek(request.getMaxTemperatureWeek());
        detailProvince.setMinTemperatureWeek(request.getMinTemperatureWeek());
        detailProvince = detailProvinceRepository.save(detailProvince);
        return detailProvince;
    }
    @PutMapping(value = "/updateOne/{id}")
    public ProvinceEntity updateOneProvince(@RequestBody ProvinceEntity request,@PathVariable(name = "id")
                                            Integer id){
        ProvinceEntity provinceEntity=provinceRepository.findOneById(id);
        if(provinceEntity==null){
            System.out.println("Id "+id+" not exist");
            return null;
        }
        provinceEntity.setProvinceName(request.getProvinceName());
        provinceEntity.setMaxTemperature(request.getMaxTemperature());
        provinceEntity.setMinTemperature(request.getMinTemperature());
        provinceEntity = provinceRepository.save(provinceEntity);
        return provinceEntity;
    }
    @PutMapping(value = "/updateDetailOne/{name}")
    public DetailProvinceEntity updateDetailOneProvince(@RequestBody DetailProvinceEntity request,@PathVariable(name = "name")
                                                        String name){
        DetailProvinceEntity detailProvince=detailProvinceRepository.findAllByProvinceName(name);
        if(detailProvince==null){
            System.out.println("Province "+name+" not exits");
            return null;
        }
        detailProvince.setProvinceName(request.getProvinceName());
        detailProvince.setTemperatureMorning(request.getTemperatureMorning());
        detailProvince.setTemperatureLunch(request.getTemperatureLunch());
        detailProvince.setTemperatureEvening(request.getTemperatureEvening());
        detailProvince.setSunRise(request.getSunRise());
        detailProvince.setSunSet(request.getSunSet());
        detailProvince.setWindSpeed(request.getWindSpeed());
        detailProvince.setMaxTemperatureWeek(request.getMaxTemperatureWeek());
        detailProvince.setMinTemperatureWeek(request.getMinTemperatureWeek());
        detailProvince = detailProvinceRepository.save(detailProvince);
        return detailProvince;
    }
    @DeleteMapping(value = "/deleteOne/{id}")
    public String deleteOneProvince(@PathVariable(name = "id")Integer id){
        ProvinceEntity provinceEntity=provinceRepository.findOneById(id);
        if(provinceEntity==null){
            System.out.println("Id province "+id+" not exist");
        }
        provinceRepository.delete(provinceEntity);
        return "Success";
    }
    @DeleteMapping(value = "deleteDetailOne/{name}")
    public String deleteDetailOneProvince(@PathVariable(name = "name")String name){
        DetailProvinceEntity detailProvinceEntity=detailProvinceRepository.findAllByProvinceName(name);
        if(detailProvinceEntity==null){
            System.out.println("Province "+name+ " not exsit");
            return null;
        }
        detailProvinceRepository.delete(detailProvinceEntity);
        return "Success";
    }
}
