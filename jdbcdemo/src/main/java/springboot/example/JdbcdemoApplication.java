package springboot.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcdemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(JdbcdemoApplication.class, args);
    }
}
