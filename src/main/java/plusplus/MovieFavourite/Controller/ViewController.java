package plusplus.MovieFavourite.Controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.MovieFavourite.Entity.Movie;
import plusplus.MovieFavourite.Entity.User;
import plusplus.MovieFavourite.service.MovieInformation;
import plusplus.MovieFavourite.service.UserInformation;

import java.util.List;

@RestController
@RequestMapping(value = "/view")
public class ViewController {
    @Autowired
    MovieInformation movie;
    @Autowired
    UserInformation user;
    @GetMapping(value = "/alluser")
    public List<User> getUser() throws Exception {
        return user.getAlluser();
    }
    @GetMapping(value = "/findbyname/{name}")
    public User finduserbyname(@PathVariable(name = "name")String name)throws Exception{
        return user.finduserbyname(name);
    }
    @GetMapping(value = "/findbyid/{id}")
    public User finduserbyid(@PathVariable(name = "id")int id)throws Exception{
        return user.findUserbyID(id);
    }
    @GetMapping(value = "/allfilm")
    public List<Movie> getallMovie()throws Exception{
        return movie.getAllMovieList();
    }
    @GetMapping(value = "/moviename/{name}")
    public Movie findmoviebyname(@PathVariable(name = "name")String name)throws Exception{
        return movie.getMoviebyname(name);
    }
    @GetMapping(value = "moviename")
    public List<String> getOnlyMovieName()throws Exception{
        return movie.getOnlyMoviebyName();
    }
    @GetMapping(value = "username")
    public List<String> getOnlyusername()throws Exception{
        return user.getOnlyUsername();
    }
}
