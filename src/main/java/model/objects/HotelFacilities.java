package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotelFacilities extends AbstractBuilding{
    private Integer numberOfRooms;
    private Integer numberOfBeds;
    private Boolean isMaritalBed;
    private Boolean isTelevision;
    private Boolean isBathroomInside;
    private Boolean isKitchenInside;
    private Boolean isPoolAvailable;
    private Boolean isParkingLotAvailable;
}
