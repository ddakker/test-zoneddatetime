package pe.kr.ddakker.test.spring.mybatis.zoneddatetime.testzoneddatetime.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

// @ToString
// @Data
public class User implements Serializable {
    private String name;
    private int age;

    private LocalDateTime birthday;
    private Date since;

    private ZonedDateTime created;
    private ZonedDateTime updated;
    public User(String name, int age, LocalDateTime birthday, Date since, ZonedDateTime created,
            ZonedDateTime updated) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.since = since;
        this.created = created;
        this.updated = updated;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDateTime getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    public Date getSince() {
        return since;
    }
    public void setSince(Date since) {
        this.since = since;
    }
    public ZonedDateTime getCreated() {
        return created;
    }
    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }
    public ZonedDateTime getUpdated() {
        return updated;
    }
    public void setUpdated(ZonedDateTime updated) {
        this.updated = updated;
    }
    @Override
    public String toString() {
        return "User [age=" + age + ", birthday=" + birthday + ", created=" + created + ", name=" + name + ", since="
                + since + ", updated=" + updated + "]";
    }

    
}
