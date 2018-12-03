package springboot.example.validate.springbootexamplevalidate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;

@SpringBootApplication
public class SpringbootexamplevalidateApplication implements CommandLineRunner {


    private final SampleProperties properties;

    public SpringbootexamplevalidateApplication(SampleProperties properties) {
        this.properties = properties;
    }

    @Bean
    public static Validator configurationPropertiesValidator() {
        return new SamplePropertiesValidator();
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========================================");
        System.out.println("Sample host: " + this.properties.getHost());
        System.out.println("Sample port: " + this.properties.getPort());
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexamplevalidateApplication.class, args);
    }
}
