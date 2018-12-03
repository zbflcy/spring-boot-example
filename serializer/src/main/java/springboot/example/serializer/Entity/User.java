package springboot.example.serializer.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;
    private int age;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date birth;

    public User(String firstName, String lastName, int age, Date birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birth = birth;
    }
}
