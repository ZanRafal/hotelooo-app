package controller;

import lombok.Setter;
import model.MainHotelModel;
import model.objects.HotelRoom;
import service.ApplicationModelInitializerService;

@Setter
public class HotelController {
    private MainHotelModel model = ApplicationModelInitializerService.getMainModel();

    public void onLoadAllHotels() {
        model.loadHotels();
    }

    public void onLoadAllHotelsFromMatchingCity(String cityName) {
        model.loadAllHotelsFromMatchingCity(cityName);
    }

    public void onSaveHotelData(HotelRoom hotelRoom) {
        model.changeHotelData(hotelRoom);
    }
}
