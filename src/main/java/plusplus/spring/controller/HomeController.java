package plusplus.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @RequestMapping(value = "/get-detail-music")
    public List<String> Getlistmusic() {
        List<String> music = new ArrayList<>();
        music.add("Dom dom");
        music.add("Luat doi");
        music.add("Chung ta cua hien tai");
        return music;
    }
}
