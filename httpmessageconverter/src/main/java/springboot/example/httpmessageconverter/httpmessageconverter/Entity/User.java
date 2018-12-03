package springboot.example.httpmessageconverter.httpmessageconverter.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String username;

    private Integer age;

    private Integer phone;

    private String email;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }


}
