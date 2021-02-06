package plusplus.moviefavouritebyjpa.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter @Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "username")
    private String userName;
    @Column(name = "user_password")
    private String userPassWord;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private String birthDay;
    @Column(name = "avatar_link")
    private String avatarLink;
}
