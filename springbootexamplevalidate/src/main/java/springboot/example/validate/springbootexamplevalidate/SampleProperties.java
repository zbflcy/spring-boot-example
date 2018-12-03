package springboot.example.validate.springbootexamplevalidate;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix = "sample")
@Validated
@Getter
@Setter
public class SampleProperties {
    private String host;
    private Integer port = 8080;


}
