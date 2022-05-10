package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotelRoom {
    private int id;
    private Integer numberOfBeds;
    private Boolean isMaritalBed;
    private Boolean isTelevision;
    private Boolean isBathroomInside;
    private Boolean isKitchenInside;
    private Client client;
    //TODO zrobić to jako enum
    private Boolean isOccupied;

    public void toggleOccupied() {
        this.isOccupied = !isOccupied;
    }
}
