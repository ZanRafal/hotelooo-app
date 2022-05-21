package model;

import model.objects.Client;

@Deprecated
public interface RoomModel {
    RoomDataModel getRoomDataModel();

    void loadHotelRoomById(int roomId);

    void changeRoomData(Client newClient);

    void changeRoomOccupation();
}
