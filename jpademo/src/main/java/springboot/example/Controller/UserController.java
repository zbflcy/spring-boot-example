package springboot.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.example.entity.User;
import springboot.example.Repository.UserRepository;

import java.util.List;

/**
 * Created by curry on 18-12-8.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }


    @GetMapping("/user/{page}/{pageSize}")
    public Page<User> userPage(@PathVariable("page") Integer page, @PathVariable("pageSize") Integer pageSize) {
        return userRepository.findAll(new PageRequest(page, pageSize));
    }


    @GetMapping("/user")
    public User addUser(User user) {
        return userRepository.save(user);
    }


}
