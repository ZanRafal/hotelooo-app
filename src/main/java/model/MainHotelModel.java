package model;

import model.objects.HotelRoom;
import service.DatabaseServiceImpl;

public class MainHotelModel implements HotelModel {
    private final DatabaseServiceImpl hotelService = new DatabaseServiceImpl();
    private final HotelDataModel hotelDataModel = new HotelDataModel();

    @Override
    public HotelDataModel getHotelDataModel() {
        return hotelDataModel;
    }

    @Override
    public void loadHotels() {

    }

    @Override
    public void loadHotelById(int hotelId) {

    }

    @Override
    public void loadHotelByName(String hotelName) {

    }

    @Override
    public void loadHotelByLocation(String location) {

    }

    @Override
    public void changeHotelData(HotelRoom newHotelRoom) {

    }
}
