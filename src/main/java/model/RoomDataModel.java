package model;

import lombok.Getter;
import lombok.Setter;
import model.objects.HotelRoom;

import java.util.List;

@Getter
@Setter
public class RoomDataModel {
    private List<HotelRoom> hotelRooms;
    private HotelRoom activeRoom;
}
