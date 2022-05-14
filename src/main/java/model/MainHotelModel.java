package model;

import model.objects.Hotel;
import model.objects.HotelRoom;
import service.DatabaseServiceImpl;

import java.util.List;

public class MainHotelModel implements HotelModel {
    private final DatabaseServiceImpl hotelService = new DatabaseServiceImpl();
    private final HotelDataModel hotelDataModel = new HotelDataModel();

    @Override
    public HotelDataModel getHotelDataModel() {
        return hotelDataModel;
    }

    @Override
    public void loadHotels() {
        List<Hotel> hotels = hotelService.getAllHotels();
        hotelDataModel.setHotels(hotels);
    }

    @Override
    public void loadHotelById(int hotelId) {
        Hotel hotel = hotelService.getHotelById(hotelId);
        hotelDataModel.setActiveHotel(hotel);
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
