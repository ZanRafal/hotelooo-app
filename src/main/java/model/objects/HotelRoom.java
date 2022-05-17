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

    public HotelRoom() {
    }

//    public void toggleOccupied() {
//        this.isOccupied = !isOccupied;
//    }
}
