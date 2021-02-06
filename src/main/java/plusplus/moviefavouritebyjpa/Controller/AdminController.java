package plusplus.moviefavouritebyjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.moviefavouritebyjpa.Entity.MovieEntity;
import plusplus.moviefavouritebyjpa.Entity.UserEntity;
import plusplus.moviefavouritebyjpa.Repository.MovieRepository;
import plusplus.moviefavouritebyjpa.Repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/adm")
public class AdminController {
    @Autowired
    MovieRepository movieRepository;

    /// Movie Application
    @PostMapping(value = "/addOneMovie")
    public MovieEntity addMovie(@RequestBody MovieEntity request) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setMovieName(request.getMovieName());
        movieEntity.setMovieLink(request.getMovieLink());
        movieEntity.setView(request.getView());
        movieEntity.setRank(request.getRank());
        movieEntity.setFavourite(request.getFavourite());
        movieEntity.setDate(request.getDate());
        movieEntity.setScore(request.getScore());
        movieEntity.setLinkImage(request.getLinkImage());
        movieEntity = movieRepository.save(movieEntity);
        return movieEntity;
    }

    @PutMapping(value = "/updateOne/{movieid}")
    public MovieEntity updateOneMovie(@RequestBody MovieEntity request, @PathVariable(name = "movieid") Integer movieid) {
        MovieEntity movieEntity = movieRepository.findOneByMovieId(movieid);
        if (movieEntity == null) {
            System.out.println("Movie has id " + movieid + " not exist");
            return null;
        }
        movieEntity.setMovieName(request.getMovieName());
        movieEntity.setMovieLink(request.getMovieLink());
        movieEntity.setView(request.getView());
        movieEntity.setRank(request.getRank());
        movieEntity.setFavourite(request.getFavourite());
        movieEntity.setDate(request.getDate());
        movieEntity.setScore(request.getScore());
        movieEntity.setLinkImage(request.getLinkImage());
        movieEntity = movieRepository.save(movieEntity);
        movieEntity = movieRepository.save(movieEntity);
        return movieEntity;
    }

    @DeleteMapping(value = "/deleteOne/{movieid}")
    public String deleteOne(@PathVariable(name = "movieid") Integer movieid) {
        MovieEntity movieEntity = movieRepository.findOneByMovieId(movieid);
        if (movieEntity == null) {
            System.out.println("Movie has id " + movieid + " not exist");
            return null;
        }
        movieRepository.delete(movieEntity);
        return "Success";
    }

    //// User Application
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/addOneUser")
    public UserEntity addOneUser(@RequestBody UserEntity request) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(request.getUserName());
        userEntity.setUserPassWord(request.getUserPassWord());
        userEntity.setGender(request.getGender());
        userEntity.setBirthDay(request.getBirthDay());
        userEntity.setAvatarLink(request.getAvatarLink());
        userEntity = userRepository.save(userEntity);
        return userEntity;
    }

    @PutMapping(value = "/updateOne/{userid}")
    public UserEntity updateOneUser(@RequestBody UserEntity request, @PathVariable(name = "userid") Integer userid) {
        UserEntity userEntity = userRepository.findOneByUserId(userid);
        if (userEntity == null) {
            System.out.println("Id " + userEntity + " not exsit");
            return null;
        }
        userEntity.setUserName(request.getUserName());
        userEntity.setUserPassWord(request.getUserPassWord());
        userEntity.setGender(request.getGender());
        userEntity.setBirthDay(request.getBirthDay());
        userEntity.setAvatarLink(request.getAvatarLink());
        userEntity = userRepository.save(userEntity);
        return userEntity;
    }
    @DeleteMapping(value = "deleteOne/{id}")
    public String deleteOneUser(@PathVariable(name = "id")Integer id){
        UserEntity userEntity=userRepository.findOneByUserId(id);
        if(userEntity==null){
            System.out.println("Id "+id+" not exsit");
            return "fail";
        }
        userRepository.delete(userEntity);
        return "Success";
    }
}
