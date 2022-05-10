package service;

import model.objects.Hotel;

import java.util.List;

public interface DatabaseService {

    List<Hotel> getAllHotels();

    Hotel getHotelById(int hotelId);

    Hotel getHotelByName(String hotelName);

    Hotel getHotelByLocation(String hotelLocation);

    void updateAndSaveHotel(Hotel newHotel);

}
