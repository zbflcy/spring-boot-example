package springboot.example.serializer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.example.serializer.Entity.User;

import java.util.Date;

@Controller
public class UserController {
    @RequestMapping(value = "/users")
    @ResponseBody
    public User user() {
        User user = new User("curry", "Stephen", 20, new Date(System.currentTimeMillis()));
        return user;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testt() {
        String s = null;
        s.length();
        return s;
    }


}
