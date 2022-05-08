package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Singular;
import model.objects.Hotel;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class JsonObjectWriter extends JsonObjectParser {
    private static volatile JsonObjectWriter INSTANCE;

    private JsonObjectWriter(){}

    public static JsonObjectWriter getInstance() {
        JsonObjectWriter result = INSTANCE;

        if(result != null) {
            return result;
        }

        synchronized (JsonObjectWriter.class) {
            if(INSTANCE == null) {
                INSTANCE = new JsonObjectWriter();
            }
        }
        return INSTANCE;
    }

    public static void writeJsonObject(Hotel object) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(PATH, true))){
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(printWriter, object);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void writeJsonObjects(List<Hotel> hotels) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(PATH))){
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(printWriter, hotels);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
