package springboot.example.serializer.Error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomErrorType {
    private int value;
    private String message;


    public CustomErrorType(int value, String message) {
        this.value = value;
        this.message = message;
    }
}
