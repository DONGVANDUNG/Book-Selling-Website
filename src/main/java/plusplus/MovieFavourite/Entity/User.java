package plusplus.MovieFavourite.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
    int UserID;
    String Username;
    String Userpassword;
    String Gender;
    String Dateofbirth;
    String AvatarLink;

    public User(int userID, String username, String userpassword, String gender, String dateofbirth, String avatarLink) {
        UserID = userID;
        Username = username;
        Userpassword = userpassword;
        Gender = gender;
        Dateofbirth = dateofbirth;
        AvatarLink = avatarLink;
    }
}
