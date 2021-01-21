package plusplus.bai4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/prefix")
public class GetUserbyAPI {
    @Autowired
    Config connection;

    @PostMapping(value = "/user")
    public void addusertoDB(@RequestBody User InforUser) {
        String query1 = " INSERT INTO user (username,password,fullname,email,address,number) VALUES " +
                "( " + InforUser.username +
                "," + InforUser.password + "," + InforUser.fullname + ","
                + InforUser.email + "," + InforUser.address + "," + InforUser.number + ")";
        try {
            Statement statement = connection.getConnection().createStatement();
            statement.executeQuery(query1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @GetMapping(value = "/list")
    public List<User> getInforuser() {
        String query2 = "SELECT*FROM user ORDER BY fullname ASC";
        List<User> users = new ArrayList<>();
        User user;
        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet getInfor = statement.executeQuery(query2);
            while (getInfor.next()) {
                user = new User(getInfor.getInt(1), getInfor.getString(2),
                        getInfor.getString(3), getInfor.getString(4),
                        getInfor.getString(5),
                        getInfor.getString(6), getInfor.getString(7));
                users.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    @PutMapping(value = "/user/{user_id}")
    public void UpdateUser(@PathVariable(name = "user_id") int id, @RequestBody User user) {
        String query3 = "UPDATE user SET id=" + id;
        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet update = statement.executeQuery(query3);
            while (update.next()) {
                if (user.getUsername() != null) {
                    query3 += ",username='" + user.username + "'";
                }
                if (user.getPassword() != null) {
                    query3 += ",password='" + user.password + "'";
                }
                if (user.getFullname() != null) {
                    query3 += ",fullname='" + user.fullname + "'";
                }
                if (user.getAddress() != null) {
                    query3 += ",address='" + user.address + "'";
                }
                if (user.getEmail() != null) {
                    query3 += ",email='" + user.email + "'";
                }
                if (user.getNumber() != null) {
                    query3 += ",number='" + user.number + "'";
                }
                query3 += ";";
            }
            statement.executeQuery(query3);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @DeleteMapping(value = "/user")
    public void deleteuser(@RequestParam(name = "user_id") int userId) {
        String query = "DELETE FROM user WHERE id=" + userId + ";";
        try {
            Statement statement = connection.getConnection().createStatement();
            statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

