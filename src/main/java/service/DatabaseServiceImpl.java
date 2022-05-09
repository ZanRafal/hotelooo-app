package service;

import model.objects.Hotel;
import util.JsonObjectReader;
import util.JsonObjectWriter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseServiceImpl implements DatabaseService {
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

    @Override
    public Hotel getHotelById(int hotelId) {
        if(hotelId < 1) throw new IllegalArgumentException();

        List<Hotel> hotels = objectReader.readJsonObjects();
        for(Hotel hotel : hotels) {
            if(hotel.getId() == hotelId) {
                return hotel;
            }
        }
        return Hotel.NULL_HOTEL;
    }

    private void addHotelToResult(List<Hotel> hotels, Hotel hotel) {
        Hotel clone = hotel.clone();

        if(clone != Hotel.NULL_HOTEL) {
            hotels.add(clone);
        }
    }

    //TODO pomyśleć nad sprawdzającym ifem oraz clone
    @Override
    public Hotel getHotelByName(String hotelName) {
        List<Hotel> hotels = objectReader.readJsonObjects();
        for(Hotel hotel : hotels) {
            if(hotel.getName().equals(hotelName)) {
                return hotel;
            }
        }

        return Hotel.NULL_HOTEL;
    }

    //TODO pomyśleć nad sprawdzającym ifem oraz clone
    @Override
    public Hotel getHotelByLocation(String hotelLocation) {
        List<Hotel> hotels = objectReader.readJsonObjects();

        for(Hotel hotel : hotels) {
            if(hotel.getAddress().getCity().equals(hotelLocation)) {
                return hotel;
            }
        }
        return Hotel.NULL_HOTEL;
    }

    @Override
    public void updateHotelVacancy(Hotel hotel) {

    }
}
