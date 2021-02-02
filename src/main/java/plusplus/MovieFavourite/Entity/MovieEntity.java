package plusplus.MovieFavourite.Entity;

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
    @Column(name = "MoiveId")
    private String movieid;
    @Column(name = "MovieName")
    private String moviename;
    @Column(name = "MovieLink")
    private String movielink;
    @Column(name = "View")
    private int view;
    @Column(name = "MovieRank")
    private Integer rank;
    @Column(name = "Numberoffavourite")
    private int favourite;
    @Column(name = "Release_date")
    private String date;
    @Column(name = "Score")
    private Integer score;
    @Column(name = "Link_image")
    private String linkimage;
}
