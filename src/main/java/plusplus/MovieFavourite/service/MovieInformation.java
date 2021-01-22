package plusplus.MovieFavourite.service;

import com.sun.xml.internal.fastinfoset.algorithm.BASE64EncodingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plusplus.MovieFavourite.Config.BeanConfig;
import plusplus.MovieFavourite.Entity.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieInformation {
    @Autowired
    BeanConfig connection;

    public boolean vertifymovieexist(int id, String name) throws Exception {
        String query = "SELECT*FROM moviefavourite.movie WHERE MoiveId=" + id + "AND MovieName='" + name + "';";
        Statement statement = connection.getConnection().createStatement();
        ResultSet getIDSameUsername = statement.executeQuery(query);
        if (getIDSameUsername.next()) {
            System.out.println("User existed");
            return false;
        } else {
            System.out.println("Vertify success");
            return true;
        }
    }

    public boolean vertifyMoviedisplay(int id) throws Exception {
        String query = "SELECT*FROM moviefavourite.movie WHERE MoiveId=" + id + ";";
        Statement statement = connection.getConnection().createStatement();
        ResultSet MovieNotExist = statement.executeQuery(query);
        if (MovieNotExist.next()) {
            return false;
        } else {
            System.out.println("This film not exist");
            return true;
        }
    }

    public boolean vertifyMovieDisplay(String name) throws Exception {
        String query = "SELECT*FROM moviefavourite.movie WHERE MovieName='" + name + "';";
        Statement statement = connection.getConnection().createStatement();
        ResultSet MovieNotExist = statement.executeQuery(query);
        if (MovieNotExist.next()) {
            return false;
        } else {
            System.out.println("This film not exist");
            return true;
        }
    }

    public void addMovie(int id, String movieName, String movieLink, int view, int movierank, int numberoffavourite, String releasedate, int score, String image) throws Exception {
        if (!vertifymovieexist(id, movieName)) {
            return;
        }
        String query = "INSERT INTO moviefavourite.movie(id,MoiveId,MovieName,MoveLink," +
                "View,MoveRank,Numberoffavourite,Releasedate,Score,Link_image)" +
                " VALUES(" + id + "," + movieName + "," + movieLink + "," + view +
                "," + movierank + "," + numberoffavourite + "," + releasedate + "," + score + "," + image + "');";
        Statement statement = connection.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public void Deletemoviebyid(int id) throws Exception {
        if (vertifyMoviedisplay(id)) {
            return;
        }
        String query = "DELETE FROM moviefavourite.movie WHERE MoiveId=" + id + ";";
        Statement statement = connection.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public void Deletemoviebyname(String name) throws Exception {
        if (vertifyMovieDisplay(name)) {
            return;
        }
        String query = "DELETE FROM moviefavourite.movie WHERE MovieName='" + name + "';";
        Statement statement = connection.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public void UpdateMovie(int id, String moviename, String movielink, int view, int movierank,
                            int numberoffavourite, String releasedate) throws Exception {
        if (vertifyMoviedisplay(id)) {
            return;
        }
        String query = "UPDATE Movie SET MoiveId=" + id;
        if (moviename != null) {
            query += ",MovieName='" + moviename + "'";
        }
        if (movielink != null) {
            query += ",MovieLink='" + movielink + "'";
        }
        if (view != -1) {
            query += ",View=" + view;
        }
        if (movierank != -1) {
            query += ",MovieRank=" + movierank;
        }
        if (numberoffavourite != -1) {
            query += ",Numberoffavourite=" + numberoffavourite;
        }
        if (releasedate != null) {
            query += ",Releasedate='" + releasedate + "'";
        }
        query += "WHERE MoiveId=" + id + ";";
        Statement statement = connection.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public List<Movie> getAllMovieList() throws Exception {
        List<Movie> movies = new ArrayList<>();
        String query = "SELECT * FROM movie;";
        Movie movie = null;
        Statement statement = connection.getConnection().createStatement();
        ResultSet allMovie = statement.executeQuery(query);
        while (allMovie.next()) {
            movie = new Movie(allMovie.getInt("MoiveId"),
                   allMovie.getString("MovieName"),
                    allMovie.getString("MovieLink"),
                    allMovie.getInt("View"),
                   allMovie.getInt("MovieRank"),
                    allMovie.getInt("Numberoffavourite"),
                    allMovie.getString("Release_date"),
                    allMovie.getInt("Score"),
                    allMovie.getString("Link_image"));
            movies.add(movie);
        }
        return movies;
    }

    public Movie getMoviebyname(String name) throws Exception {
        Movie movie = null;
        if (!vertifyMovieDisplay(name)) {
            System.out.println("MOVIE NOT EXIST");
        } else {
            String query = "SELECT * FROM moviefavourite.movie WHERE MoiveName='='" + name + "';";
            Statement statement = connection.getConnection().createStatement();
            ResultSet fullMovie = statement.executeQuery(query);
            if (fullMovie.next()) {
                movie = new Movie(fullMovie.getInt(1),
                        fullMovie.getString(2),
                        fullMovie.getString(3),
                        fullMovie.getInt(4),
                        fullMovie.getInt(5),
                        fullMovie.getInt(6),
                        fullMovie.getString(7),
                        fullMovie.getInt(8),
                        fullMovie.getString(9));
            }
        }
        return movie;
    }

    public List<String> getOnlyMoviebyName() throws Exception {
        String query = "SELECT Moviename FROM moviefavourite.movie;";
        List<String> listmoviename = new ArrayList<>();
        String movie = null;
        Statement statement = connection.getConnection().createStatement();
        ResultSet moviename = statement.executeQuery(query);
        while (moviename.next()) {
            movie = moviename.getString(1);
            listmoviename.add(movie);
        }
        return listmoviename;
    }
}
