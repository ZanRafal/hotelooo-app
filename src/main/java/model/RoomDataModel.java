package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import model.objects.HotelRoom;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class RoomDataModel {
    private List<HotelRoom> hotelRooms;
    private HotelRoom activeRoom;
}
