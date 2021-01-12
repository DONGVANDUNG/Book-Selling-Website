package plusplus.spring.controller;

import org.springframework.web.bind.annotation.*;
import plusplus.spring.lesson31.User;

@RestController
@RequestMapping(value = "/prefix")
public class GetAPIRest {
    @PostMapping(value = "/user2")
    public User getuser2(@RequestBody User user){
        user.setName("Huong");
        user.setEmail("Dung");
        return user;
    }
    @GetMapping(value = "/user2")
    public User getuser(){
        User user=new User();
        user.setName("Vandung");
        user.setEmail("Va");
        return user;
    }
    @PutMapping(value = "/user3")
    public String updsate(@RequestBody User user){
        user.
    }
}
