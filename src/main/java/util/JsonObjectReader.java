package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.objects.Hotel;

import java.io.File;
import java.util.ArrayList;

public class JsonObjectReader extends JsonObjectParser {

    public static ArrayList<Hotel> readJsonObjects() {
        ArrayList<Hotel> objects = new ArrayList<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objects = objectMapper.readValue(new File(PATH), new TypeReference<ArrayList<Hotel>>(){});
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return objects;
    }

}
