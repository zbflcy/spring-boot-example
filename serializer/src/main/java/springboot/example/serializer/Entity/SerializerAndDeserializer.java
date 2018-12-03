package springboot.example.serializer.Entity;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.text.DateFormat;

@JsonComponent
public class SerializerAndDeserializer {
    public static class UserSerializer extends JsonSerializer<User> {
        @Override
        public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("name", user.getFirstName() + " " + user.getLastName());
            jsonGenerator.writeObjectField("birth", DateFormat.getDateInstance(DateFormat.DEFAULT).format(user.getBirth()));
            jsonGenerator.writeObjectField("age", user.getAge());
            jsonGenerator.writeEndObject();
        }
    }

}
