package controller;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import model.HotelModel;
import model.MainHotelModel;
import view.EditRoomView;
import view.HotelView;

@Setter
public class HotelController {
    private HotelModel hotelModel = new MainHotelModel();
    private HotelView hotelView;
    private EditRoomView editRoomView;

    public void onLoadAllUsers() {
        hotelModel.loadHotels();
        System.out.println(hotelModel.getHotelDataModel().getHotels());
    }

    public void onLoadAllHotelsFromMatchingCity(String cityName) {
        hotelModel.loadAllHotelsFromMatchingCity(cityName);
        System.out.println(hotelModel.getHotelDataModel().getHotels());
    }
}
