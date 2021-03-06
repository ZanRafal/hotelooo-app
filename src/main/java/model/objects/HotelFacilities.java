package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HotelFacilities {
    private Integer stars;
    private Integer numberOfRooms;
    private Boolean isPool;
    private Boolean isParkingLot;
    private Boolean isSpa;
    private Boolean isMaritalBed;
    private Boolean isTelevision;
    private Boolean isBathroomInside;
    private Boolean isKitchenInside;

    public static final HotelFacilities NULL_FACILITIES = new HotelFacilities();

    public HotelFacilities() {
        this(0,0,false, false, false, false, false, false, false);
    }
}
