package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
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

    public Hotel clone(int newId) {
        if(this == NULL_HOTEL) return NULL_HOTEL;

        return new Hotel(newId, name, address, contact, michelinStars, hotelFacilities, client, isVacant);
    }
}
