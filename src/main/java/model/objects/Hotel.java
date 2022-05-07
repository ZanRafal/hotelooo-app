package model.objects;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Hotel implements Serializable {
    private Integer id;
    private String name;
    private Address address;
    private HotelContact contact;
    private Integer michelinStars;
    private HotelFacilities hotelFacilities;
    private Client client;
    private Boolean isVacant = Boolean.TRUE;

    public void toggleVacant() {
        this.isVacant = !isVacant;
    }
}
