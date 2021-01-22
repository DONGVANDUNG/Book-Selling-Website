package plusplus.MovieFavourite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import plusplus.MovieFavourite.Config.BeanConfig;
import plusplus.MovieFavourite.Entity.Movie;
import plusplus.MovieFavourite.Entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserInformation {
    @Autowired
    BeanConfig config;

    public boolean vertifyUserExistId(int id) throws Exception {
        String query = "SELECT*FROM user WHERE UserID=" + id + ";";
        Statement statement = config.getConnection().createStatement();
        ResultSet userexisted = statement.executeQuery(query);
        if (userexisted.next()) {
            return false;
        } else {
            System.out.println("Vertify Success");
            return true;
        }
    }

    public boolean vertifyUserExistName(String name) throws Exception {
        String query = "SELECT*FROM user WHERE Username='" + name + "';";
        Statement statement = config.getConnection().createStatement();
        ResultSet userexisted = statement.executeQuery(query);
        if (userexisted.next()) {
            return false;
        } else {
            System.out.println("Vertify Success");
            return true;
        }
    }

    public void adduser(int id, String username, String password, String gender, String dateofbirth, String avatar) throws Exception {
        if (!vertifyUserExistId(id)) {
            return;
        }
        String query = "INSER INTO user(UserID,Username,Userpassword,Gender,Dateofbirth,AvatarLink) VALUES" +
                " (" + id + "," + username + "," + password + "," + gender + "," + dateofbirth + "," + avatar + ");";
        Statement statement = config.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public void deleteUserbyId(int id) throws Exception {
        if (!vertifyUserExistId(id)) {
            return;
        }
        String query = "DELETE FROM user WHERE UserID=" + id + ";";
        Statement statement = config.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public void updatuser(int id, String name, String pass, String gender, String dateofbirth, String avatar_link) throws Exception {
        if (!vertifyUserExistId(id)) {
            return;
        }
        String query = "UPDATE user SET UserID=" + id;
        if (name != null) {
            query += ", Username='" + name + "'";
        }
        if (pass != null) {
            query += ",Userpassword='" + pass + "'";
        }
        if (gender != null) {
            query += ",Gender='" + gender + "'";
        }
        if (dateofbirth != null) {
            query += ",Dateofbirth='" + dateofbirth + "'";
        }
        if (avatar_link != null) {
            query += ",AvatarLink='" + avatar_link + "'";
        }
        query += " WHERE UserID=" + id + ";";
        Statement statement = config.getConnection().createStatement();
        statement.executeQuery(query);
    }

    public String login(String username, String pass) throws Exception {
        String query = "SELECT UserID FROM user WHERE Username='" + username + "' AND Userpassword='" + pass + "';";
        Statement statement = config.getConnection().createStatement();
        ResultSet data = statement.executeQuery(query);
        if (data.next()) {
            return "Login success";
        }
        else {
            return "Login failed";
        }
    }

    public List<User> getAlluser() throws Exception {
        String query = "SELECT*FROM user;";
        List<User> all = new ArrayList<>();
        Statement statement = config.getConnection().createStatement();
        ResultSet alluser = statement.executeQuery(query);
        User user = null;
        while (alluser.next()) {
            user = new User(alluser.getInt(1),
                    alluser.getString(2),
                    alluser.getString(3),
                    alluser.getString(4),
                    alluser.getString(5),
                    alluser.getString(6));
            all.add(user);
        }
        return all;
    }

    public List<String> getOnlyUsername() throws Exception {
        String query = "SELECT Username FROM user;";
        List<String> all = new ArrayList<>();
        Statement statement = config.getConnection().createStatement();
        ResultSet alluser = statement.executeQuery(query);
        String user = null;
        while (alluser.next()) {
            user=alluser.getString(1);
            all.add(user);
        }
        return all;
    }
    public User finduserbyname(String name) throws Exception {
        User user1 = null;
        if (!vertifyUserExistName(name)) {
            System.out.println("User not exsit");
        } else {
            String query = "SELECT*FROM user WHERE Username='" + name + "';";
            Statement statement = config.getConnection().createStatement();
            ResultSet user = statement.executeQuery(query);
            if (user.next()) {
                user1 = new User(user.getInt(1),
                        user.getString(2),
                        user.getString(3),
                        user.getString(4),
                        user.getString(5),
                        user.getString(6));
            }
        }
        return user1;
    }
    public User findUserbyID(int id)throws Exception{
        User user1=null;
        if(!vertifyUserExistId(id)){
            System.out.println("User not exist");
        }
        else {
            String query="SELECT*FROM user WHERE UserID="+id+";";
            Statement statement=config.getConnection().createStatement();
            ResultSet user=statement.executeQuery(query);
            if(user.next()){
                user1=user1 = new User(user.getInt(1),
                        user.getString(2),
                        user.getString(3),
                        user.getString(4),
                        user.getString(5),
                        user.getString(6));
            }
        }
        return user1;
    }
}
