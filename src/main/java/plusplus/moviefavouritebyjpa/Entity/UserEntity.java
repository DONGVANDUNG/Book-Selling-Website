package plusplus.MovieFavourite.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter @Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int userid;
    @Column(name = "Username")
    private String username;
    @Column(name = "Userpassword")
    private String password;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Dateofbirth")
    private String birthday;
    @Column(name = "AvatarLink")
    private String avatar;
}
