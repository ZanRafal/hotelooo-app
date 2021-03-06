package model;

import model.objects.Hotel;
import model.objects.HotelRoom;
import service.ApplicationModelInitializerService;
import service.DatabaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainHotelModel implements HotelModel {
        private final DatabaseServiceImpl hotelService = new DatabaseServiceImpl();
        private final HotelDataModel hotelDataModel = ApplicationModelInitializerService.getDataModel();

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
        Hotel hotel = hotelService.getHotelByName(hotelName);
        hotelDataModel.setActiveHotel(hotel);
    }

    @Override
    public void loadHotelByLocation(String location) {
        Hotel hotel = hotelService.getHotelByLocation(location);
        hotelDataModel.setActiveHotel(hotel);
    }

    @Override
    public void loadAllHotelsFromMatchingCity(String cityName) {
        List<Hotel> hotels = hotelService.getAllHotels();
        List<Hotel> result = new ArrayList<>();

        for(Hotel hotel : hotels) {
            if(hotel.getAddress().getCity().equals(cityName)) {
                result.add(hotel);
            }
        }
        hotelDataModel.setHotels(result);
    }

    @Override
    public void changeHotelData(HotelRoom newHotelRoom) {
        Hotel toUpdate = hotelDataModel.getActiveHotel();
        toUpdate.setHotelRoom(newHotelRoom);
        hotelService.updateAndSaveHotel(toUpdate);

        List<Hotel> hotels = hotelService.getAllHotels();
        hotelDataModel.setHotels(hotels);
    }
}
