package model.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotelFacilities {
    private Integer stars;
    private Integer numberOfRooms;
    private Boolean isPool;
    private Boolean isParkingLot;
    private Boolean isSpa;
}
