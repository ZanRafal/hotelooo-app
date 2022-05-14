package model;

import model.objects.Client;
import model.objects.HotelRoom;


//TODO przemyśleć i dokończyć logikę całości
//TODO IMPORTANT
public class MainRoomModel implements RoomModel {
    private final RoomDataModel roomDataModel = new RoomDataModel();

    @Override
    public RoomDataModel getRoomDataModel() {
        return roomDataModel;
    }

    @Override
    public void loadHotelRoomById(int roomId) {
        HotelRoom hotelRoom = roomDataModel.getActiveRoom();
        roomDataModel.setActiveRoom(hotelRoom);
    }

    @Override
    public void changeRoomData(Client newClient) {
        HotelRoom hotelRoom = roomDataModel.getActiveRoom();
        hotelRoom.setClient(newClient);
    }

    @Override
    public void changeRoomOccupation() {
        roomDataModel.getActiveRoom().toggleOccupied();
    }
}
