package plusplus.MovieFavourite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.MovieFavourite.Entity.MovieEntity;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
    List<MovieEntity> findOneByMovieid(Integer id);
    List<MovieEntity> findAllByMoviename(String name);
}
