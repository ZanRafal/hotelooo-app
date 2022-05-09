package util;

import model.objects.Hotel;

import java.util.List;

public interface WriteJson {

    void writeJsonObject(Hotel object);

    void writeJsonObjects(List<Hotel> hotels);
}
