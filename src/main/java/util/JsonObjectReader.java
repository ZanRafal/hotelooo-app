package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.objects.Hotel;

import java.io.File;
import java.util.ArrayList;

public class JsonObjectReader extends JsonObjectParser implements ReadJson {
    private static volatile JsonObjectReader INSTANCE;

    private JsonObjectReader() {}

    public static JsonObjectReader getInstance() {
        JsonObjectReader result = INSTANCE;

        if(result != null) {
            return result;
        }

        synchronized (JsonObjectReader.class) {
            if(INSTANCE == null) {
                INSTANCE = new JsonObjectReader();
            }
        }
        return INSTANCE;
    }

    @Override
    public ArrayList<Hotel> readJsonObjects() {
        ArrayList<Hotel> objects = new ArrayList<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objects = objectMapper.readValue(FILE, new TypeReference<>(){});
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return objects;
    }

}
