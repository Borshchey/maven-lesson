import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static java.util.Objects.isNull;

public  class JacksonTest extends JsonSerializer<LocalDateTime> {

    ObjectMapper objectMapper = new ObjectMapper();

    void ReadJsonFile() throws IOException {
        File file = new File("src/test/cat.json");
        Cat cat01 = objectMapper.readValue(file, Cat.class);
    }


    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (isNull(localDateTime)) {
            return;
        }
        OffsetDateTime timeUtc = localDateTime.atOffset(ZoneOffset.systemDefault().getRules().getOffset(LocalDateTime.now()));
        jsonGenerator.writeString(timeUtc.toString());
    }
}

