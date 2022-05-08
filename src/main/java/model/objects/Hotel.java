package model.objects;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Hotel implements Serializable, Cloneable {
    private Integer id;
    private String name;
    private Address address;
    private HotelContact contact;
    private Integer michelinStars;
    private HotelFacilities hotelFacilities;
    private Client client;
    private Boolean isVacant = Boolean.TRUE;

    public static final Hotel NULL_HOTEL = new Hotel();

    public Hotel(){}

    public void toggleVacant() {
        this.isVacant = !isVacant;
    }

    public Hotel clone() {
        try {
            return (Hotel) super.clone();
        } catch (CloneNotSupportedException exception) {
            return NULL_HOTEL;
        }
    }
}
