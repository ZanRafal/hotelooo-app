package service;

import model.objects.Hotel;
import util.JsonObjectReader;
import util.JsonObjectWriter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseServiceImpl implements DatabaseService{
    private final JsonObjectReader objectReader = JsonObjectReader.getInstance();
    private final JsonObjectWriter objectWriter = JsonObjectWriter.getInstance();


    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> result = new ArrayList<>();

        for(Hotel item : objectReader.readJsonObjects()) {
            addHotelToResult(result, item);
        }

        return result;
    }

    private void addHotelToResult(List<Hotel> hotels, Hotel hotel) {
        Hotel clone = hotel.clone();

        if(clone != Hotel.NULL_HOTEL) {
            hotels.add(clone);
        }
    }

    @Override
    public Hotel getHotelByName(String hotelName) {
        return null;
    }

    @Override
    public Hotel getHotelByLocation(String hotelLocation) {
        return null;
    }

    @Override
    public void updateHotelVacancy(Hotel hotel) {

    }
}
