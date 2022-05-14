package model;

import model.objects.Client;

public class MainRoomModel implements RoomModel {
    private final RoomDataModel roomDataModel = new RoomDataModel();


    @Override
    public RoomDataModel getRoomDataModel() {
        return roomDataModel;
    }

    @Override
    public void loadHotelRoomById(int roomId) {

    }

    @Override
    public void changeRoomData(Client newClient) {

    }

    @Override
    public void changeRoomOccupation() {

    }
}
