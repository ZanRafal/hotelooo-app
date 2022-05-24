package controller;

import lombok.Setter;
import model.MainHotelModel;
import service.ApplicationModelInitializerService;
import view.HotelView;

@Setter
public class HotelController {
    private MainHotelModel model = ApplicationModelInitializerService.getMainModel();
    private HotelView hotelView;

    public void onLoadAllHotels() {
        model.loadHotels();
    }

    public void onLoadAllHotelsFromMatchingCity(String cityName) {
        model.loadAllHotelsFromMatchingCity(cityName);
    }
}
