package service;

import model.objects.Hotel;
import model.objects.HotelRoom;
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

    private void addHotelToResult(List<Hotel> hotels, Hotel hotel) {
        Hotel clone = hotel.clone();

        if(clone != Hotel.NULL_HOTEL) {
            hotels.add(clone);
        }
    }

    @Override
    public Hotel getHotelById(int hotelId) {
        if(hotelId < 1) throw new IllegalArgumentException();

        List<Hotel> hotels = objectReader.readJsonObjects();
        for(Hotel hotel : hotels) {
            if(hotel.getId() == hotelId) {
                return hotel.clone();
            }
        }
        return Hotel.NULL_HOTEL;
    }

    @Override
    public Hotel getHotelByName(String hotelName) {
        if(hotelName.equals("")) {
            return Hotel.NULL_HOTEL;
        }

        List<Hotel> hotels = objectReader.readJsonObjects();
        for(Hotel hotel : hotels) {
            if(hotel.getName().equals(hotelName)) {
                return hotel.clone();
            }
        }

        return Hotel.NULL_HOTEL;
    }

    @Override
    public Hotel getHotelByLocation(String hotelLocation) {
        if(hotelLocation.equals("")) {
            return Hotel.NULL_HOTEL;
        }

        List<Hotel> hotels = objectReader.readJsonObjects();

        for(Hotel hotel : hotels) {
            if(hotel.getAddress().getCity().equals(hotelLocation)) {
                return hotel.clone();
            }
        }
        return Hotel.NULL_HOTEL;
    }

    @Override
    public void updateHotel(Hotel newHotel) {
        if(newHotel == null || newHotel == Hotel.NULL_HOTEL) {
            return;
        }

        List<Hotel> hotels = objectReader.readJsonObjects();
        for(Hotel hotel : hotels) {
            if(hotel.getId() == newHotel.getId()) {
                hotel.setHotelRooms(newHotel.getHotelRooms());
            }
        }
    }
}