package plusplus.MovieFavourite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plusplus.MovieFavourite.Entity.MovieEntity;
import plusplus.MovieFavourite.Repository.MovieRepository;

import java.util.List;

@RestController
@RequestMapping(name = "/jpa")
public class Jpatest {
    @Autowired
    MovieRepository movieRepository;
    @GetMapping(name = "/get/{id}")
    public List<MovieEntity> getid(@PathVariable(name = "id")Integer id){
        List<MovieEntity> respond=movieRepository.findOneByMovieid(id);
        return respond;
    }
}
