package model;

import model.objects.Hotel;
import model.objects.HotelRoom;

import java.util.ArrayList;

public interface HotelModel {
    HotelDataModel getHotelDataModel();

    void loadHotels();

    void loadHotelById(int hotelId);

    void loadHotelByName(String hotelName);

    void loadHotelByLocation(String location);

    void changeHotelData(HotelRoom newHotelRoom);

    void loadAllHotelsFromMatchingCity(String cityName);
}
