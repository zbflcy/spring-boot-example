package springboot.example.log.springbootexamplelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootexamplelogApplication {

    @RequestMapping("/show")
    public String fuck() {
        String s=null;
        s.length();
        return "index";

    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootexamplelogApplication.class, args);
    }
}
