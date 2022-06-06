package pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.vo.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select name, age, birthday, created, since, updated from users")
    List<User> findAll();

    @Select("select name, age, birthday, created, since, updated from users where name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into users (name, age, birthday, since, created, updated) values (#{name}, #{age}, #{birthday}, #{since}, #{created}, #{updated})")
    void create(User user);
}
