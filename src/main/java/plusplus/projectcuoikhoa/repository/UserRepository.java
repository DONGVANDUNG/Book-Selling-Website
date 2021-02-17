package plusplus.projectcuoikhoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.projectcuoikhoa.entiy.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    User findOneByUserName(String name);

    User findOneById(Integer id);

    User findOneByUserNameAndPassWord(String username, String password);

    User findOneByEmail(String email);

    List<User> findAllByGender(String gender);

    List<User> findAllByAge(Integer age);

    List<User> findAllByAgeGreaterThan(Integer age);

    List<User> findAllByAgeLessThan(Integer age);
}
