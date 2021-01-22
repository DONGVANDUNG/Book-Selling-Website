package plusplus.MovieFavourite.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Movie {
    int MoiveID;
    String MovieName;
    String MovieLink;
    int View;
    int MovieRank;
    int Numberoffavourite;
    String Releasedate;
    int Score;
    String Link_image;

    public Movie(int movieID, String movieName, String movieLink, int view, int movieRank, int numberoffavourite,
                 String releasedate, int score, String link_image) {
        MoiveID = movieID;
        MovieName = movieName;
        MovieLink = movieLink;
        View = view;
        MovieRank = movieRank;
        Numberoffavourite = numberoffavourite;
        Releasedate = releasedate;
        Score = score;
        Link_image = link_image;
    }
}
