package model;

import model.objects.Client;

public interface RoomModel {
    RoomDataModel getRoomDataModel();

    void loadHotelRoomById(int roomId);

    void changeRoomData(Client newClient);

    void changeRoomOccupation();
}
