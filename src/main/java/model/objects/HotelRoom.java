package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HotelRoom {
    private Integer numberOfPeople;
    private Client client;
    private Occupancy isOccupied;

    public static final HotelRoom NULL_ROOM = new HotelRoom();

    public HotelRoom() {
        this(0,Client.NULL_CLIENT,Occupancy.OCCUPIED);
    }

    public void toggleOccupied() {
        if (this.isOccupied.equals(Occupancy.OCCUPIED)) isOccupied = Occupancy.AVAILABLE;
        else isOccupied = Occupancy.OCCUPIED;
    }
}
