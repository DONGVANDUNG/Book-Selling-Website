package plusplus.MovieFavourite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.MovieFavourite.Entity.Movie;
import plusplus.MovieFavourite.Entity.User;
import plusplus.MovieFavourite.service.MovieInformation;
import plusplus.MovieFavourite.service.UserInformation;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    UserInformation userInformation;
    @Autowired
    MovieInformation movieInformation;
    @PostMapping(value = "/register")
    public void adduser(@RequestBody User users)throws Exception{
        userInformation.adduser(users.getUserID(),users.getUsername(),users.getUserpassword(),users.getGender(),
                users.getDateofbirth(),users.getAvatarLink());
    }
    @PutMapping(value = "/update")
    public void updateuser(@RequestBody User user1) throws Exception{
        userInformation.updatuser(user1.getUserID(),user1.getUsername(),user1.getUserpassword(),
                user1.getGender(),user1.getDateofbirth(),user1.getAvatarLink());
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteuser(@PathVariable(name = "id")int id)throws Exception{
        userInformation.deleteUserbyId(id);
    }
    @PostMapping(value = "/adddMV")
    public void addmovie(@RequestBody Movie movie) throws Exception{
        movieInformation.addMovie(movie.getMoiveID(),movie.getMovieName(),
                movie.getMovieLink(),movie.getView(),movie.getMovieRank(),
                movie.getNumberoffavourite(),movie.getReleasedate(),
                movie.getScore(),movie.getLink_image());
    }
    @DeleteMapping(value = "/deleteMV/{id}")
    public void deletemovie(@PathVariable(name = "id")int id)throws Exception{
        movieInformation.Deletemoviebyid(id);
    }
    @DeleteMapping(value = "/deleteMV/{moviename}")
    public void deletemoviebyname(@PathVariable(name = "moviename") String moviename)throws Exception{
        movieInformation.Deletemoviebyname(moviename);
    }
    @PostMapping(value = "/updateMV")
    public void updatemovie(@RequestBody Movie movie)throws Exception{
        movieInformation.UpdateMovie(movie.getMoiveID(),movie.getMovieName(),
                movie.getMovieLink(),movie.getView(),
                movie.getMovieRank(),movie.getNumberoffavourite(),
                movie.getReleasedate());
    }
}
