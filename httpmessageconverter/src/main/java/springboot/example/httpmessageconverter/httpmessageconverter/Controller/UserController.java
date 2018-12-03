package springboot.example.httpmessageconverter.httpmessageconverter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.example.httpmessageconverter.httpmessageconverter.Entity.User;

@Controller
public class UserController {

    @RequestMapping(value = "/users")
    @ResponseBody
    public User getUser() {
        User user = new User("name", 18);
        return user;
    }


    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(@RequestBody String  param) {
        return "param:" + param;
    }

}
