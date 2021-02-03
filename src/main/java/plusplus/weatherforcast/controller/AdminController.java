package plusplus.WeatherForcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.WeatherForcast.entity.DetailProvince;
import plusplus.WeatherForcast.service.GetTemperatureByAPI;

import java.util.List;

@RestController
@RequestMapping(value = "/weather")
public class AdminController {
    @Autowired
    GetTemperatureByAPI getdetailprovince;

    @GetMapping(value = "/gettemp/{province}")
    public DetailProvince gettemperatureprovince(@PathVariable(name = "province") String province) {
        return getdetailprovince.getdetailprovince(province);
    }
    @GetMapping(value = "/all")
    public List<DetailProvince> getallprovince(){
         return getdetailprovince.getAllprovincetemperature();
    }
}

