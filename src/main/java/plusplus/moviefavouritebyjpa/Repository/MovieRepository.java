package plusplus.moviefavouritebyjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.moviefavouritebyjpa.Entity.MovieEntity;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    MovieEntity findOneByMovieId(Integer id);
    List<MovieEntity> findAllByMovieName(String name);
    List<MovieEntity> findAll();
    List<MovieEntity> findAllByScore(Integer score);
    MovieEntity findAllByRank(Integer rank);
    List<MovieEntity> findAllByView(Integer view);
    List<MovieEntity> findALlByDate(String date);
    List<MovieEntity> findAllByViewGreaterThan(Integer view);
    List<MovieEntity> findAllByScoreGreaterThan(Integer score);
    List<MovieEntity> findAllByViewLessThan(Integer view);
    List<MovieEntity> findAllByScoreLessThan(Integer score);
    List<MovieEntity> findAllByRankGreaterThan(Integer rank);
    List<MovieEntity> findAllByRankLessThan(Integer rank);
}
