package model;

import model.objects.HotelRoom;

public interface HotelModel {
    HotelDataModel getHotelDataModel();

    void loadHotels();

    void loadHotelById(int hotelId);

    void loadHotelByName(String hotelName);

    void loadHotelByLocation(String location);

    //TODO przemyśleć i przetestować
    void changeHotelData(HotelRoom newHotelRoom);
}
