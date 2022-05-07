package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.objects.Hotel;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class JsonObjectWriter extends JsonObjectParser {

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
