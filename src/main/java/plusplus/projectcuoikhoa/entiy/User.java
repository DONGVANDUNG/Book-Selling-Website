package plusplus.projectcuoikhoa.entiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Integer id;
    @Column(name = "user_name")
    String userName;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "email")
    String email;
    @Column(name = "pass_word")
    String passWord;
    @Column(name = "gender")
    String gender;
    @Column(name = "nationality")
    String nationality;
    @Column(name = "age")
    Integer age;
    @Column(name = "birthday")
    String birthday;
}
