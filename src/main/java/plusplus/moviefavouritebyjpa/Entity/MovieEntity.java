package plusplus.moviefavouritebyjpa.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Getter
@Setter
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "movie_link")
    private String movieLink;
    @Column(name = "view")
    private int view;
    @Column(name = "movie_rank")
    private Integer rank;
    @Column(name = "number_of_favourite")
    private int favourite;
    @Column(name = "release_date")
    private String date;
    @Column(name = "score")
    private Integer score;
    @Column(name = "link_image")
    private String linkImage;
}
