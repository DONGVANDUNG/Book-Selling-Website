package plusplus.moviefavouritebyjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.moviefavouritebyjpa.Entity.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findAll();
    List<UserEntity> findAllByUserName(String name);
    List<UserEntity> findALlByGender(String gender);
    UserEntity findOneByUserId(Integer id);
    UserEntity findOneByUserNameAndUserPassWord(String username,String password);
    UserEntity findOneByAvatarLink(String avt);
    List<UserEntity> findAllByBirthDay(String birthday);
}
