package util;

import model.objects.Hotel;

import java.util.List;

public interface WriteJson {

    void writeAndAppendJsonObject(Hotel object);

    void writeJsonObjects(List<Hotel> hotels);
}
