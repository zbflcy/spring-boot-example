package springboot.example.validate.springbootexamplevalidate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class SamplePropertiesValidator implements Validator {

    final Pattern pattern = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");


    @Override
    public boolean supports(Class<?> aClass) {
        return aClass == SampleProperties.class;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "host", "host.empty");
        ValidationUtils.rejectIfEmpty(errors, "port", "port.empty");
        SampleProperties sampleProperties = (SampleProperties) o;
        if (sampleProperties.getHost() != null && !this.pattern.matcher(sampleProperties.getHost()).matches()) {
            errors.rejectValue("host", "Invalide host");
        }
    }
}
