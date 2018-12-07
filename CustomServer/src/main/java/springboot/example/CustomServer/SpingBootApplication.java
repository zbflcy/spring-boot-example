package springboot.example.CustomServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpingBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpingBootApplication.class, args);
    }
}
