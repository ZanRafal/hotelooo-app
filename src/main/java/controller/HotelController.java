package controller;

import lombok.Setter;
import model.HotelModel;
import view.EditRoomView;
import view.HotelView;

@Setter
public class HotelController {
    private HotelModel hotelModel;
    private HotelView hotelView;
    private EditRoomView editRoomView;
}
