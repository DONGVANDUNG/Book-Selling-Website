package plusplus.lesson31;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetUser {
    @GetMapping(value = "/user")
    public User getinformationUser() {
        User user = new User();
        return user;
    }

    @GetMapping(value = "/student")
    public List<User> getliststudent() {
        User user = new User();
        List<User> list = new ArrayList<>();
        list.add(new User("Van", "van032@gmail.com", "145353"));
        list.add(user);
        return list;
    }
}