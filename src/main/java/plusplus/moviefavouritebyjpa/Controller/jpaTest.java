package plusplus.MovieFavourite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plusplus.MovieFavourite.Entity.MovieEntity;
import plusplus.MovieFavourite.Repository.MovieRepository;

import javax.management.MBeanOperationInfo;
import javax.management.MalformedObjectNameException;
import java.util.List;

@RestController
@RequestMapping(value = "/jpa")
public class jpaTest {
    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/get/{id}")
    public MovieEntity getId(@PathVariable(name = "id") Integer id) {
        MovieEntity respond = movieRepository.findOneByMovieId(id);
        return respond;
    }
    @GetMapping(value = "/movie/{name}")
     public List<MovieEntity> getMovieByName(@PathVariable(name = "name")String name){
        return movieRepository.findAllByMovieName(name);
    }
    @GetMapping(value = "/all")
    public List<MovieEntity> getAllMovie(){
        return movieRepository.findAll();
    }
    @GetMapping(value = "score/{score}")
    public List<MovieEntity> getMovie(@PathVariable(name = "score")Integer score){
        return movieRepository.findAllByScore(score);
    }
    @GetMapping(value = "rank/{rank}")
    public MovieEntity getALlByRank(@PathVariable(name = "rank")Integer rank){
        return movieRepository.findAllByRank(rank);
    }
    @GetMapping(value = "/view/{view}")
    public List<MovieEntity> getALlByView(@PathVariable(name = "view")Integer view){
        return movieRepository.findAllByView(view);
    }
    @GetMapping(value = "/date/{date}")
    public List<MovieEntity> getALlByDate(@PathVariable(name = "date")String date){
        return movieRepository.findALlByDate(date);
    }
   @GetMapping(value = "get/greater/movie/{view}")
    public List<MovieEntity> getMovieByView(@PathVariable(name = "view")Integer view){
        return movieRepository.findAllByViewGreaterThan(view);
   }
   @GetMapping(value = "/get/greater/score/{score}")
    public List<MovieEntity> getMovieGreaterThanScore(@PathVariable(name = "score")Integer score){
        return movieRepository.findAllByScoreGreaterThan(score);
   }
   @GetMapping(value = "get/less/than/score/{score}")
    public List<MovieEntity> getMovieLessThanScore(@PathVariable(name = "score")Integer score){
        return movieRepository.findAllByScoreLessThan(score);
   }
   @GetMapping(value = "get/less/than/view/{view}")
    public List<MovieEntity> getMovieLessThanView(@PathVariable(name = "view")Integer view){
        return movieRepository.findAllByViewLessThan(view);
   }
   @GetMapping(value = "get/movie/greater/rank/{rank}")
    public List<MovieEntity> getMovieGreaterThanByRank(@PathVariable(name = "rank")Integer rank){
        return movieRepository.findAllByRankGreaterThan(rank);
   }
   @GetMapping(value = "get/movie/less/than/rank/{rank}")
    public List<MovieEntity> getMovieLessThanByRank(@PathVariable(name = "rank")Integer rank){
        return movieRepository.findAllByRankLessThan(rank);
   }
}
