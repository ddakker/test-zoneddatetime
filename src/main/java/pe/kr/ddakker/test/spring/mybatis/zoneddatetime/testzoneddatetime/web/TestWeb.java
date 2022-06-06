package pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.web;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.mapper.UserMapper;
import pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.vo.User;

@RestController
public class TestWeb {
  @Autowired
  UserMapper userMapper;

  @GetMapping("")
  public List<User> view() {
    ZonedDateTime now = ZonedDateTime.now();
    System.out.println("now: " + now);

    /* User user = new User("dk1", 10, LocalDateTime.of(1983, 3, 6, 1, 1), new Date(), now, now);
    List<User> users = new ArrayList<>();
    users.add(user); */

    List<User> users = userMapper.findAll();
    System.out.println("users: " + users);
    return users;
  }

  @GetMapping("create")
  public String test1() {
    ZonedDateTime now = ZonedDateTime.now();
    
    User user = new User("dk1", 10, LocalDateTime.of(1983, 3, 6, 1, 1), new Date(), now, now);
    System.out.println("user: " + user);
    userMapper.create(user);
    return "test1";
  }

  public static void main(String[] args) {
    ZonedDateTime now = ZonedDateTime.now();
    User user = new User("dk1", 10, LocalDateTime.of(1983, 3, 6, 1, 1), new Date(), now, now);
    List<User> users = new ArrayList<>();
    users.add(user);
    System.out.println("users: " + users);
  }
}