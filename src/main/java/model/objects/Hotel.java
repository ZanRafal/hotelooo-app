package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class Hotel extends AbstractBuilding implements Serializable, Cloneable {
    private int id;
    private String name;
    private Address address;
    private HotelContact contact;
    private HotelFacilities hotelFacilities;
    private HotelRoom hotelRoom;
    private float price;
    private String imgUrl;

    public static final Hotel NULL_HOTEL = new Hotel();

    public Hotel(){}

    public Hotel clone() {
        try {
            return (Hotel) super.clone();
        } catch (CloneNotSupportedException exception) {
            return NULL_HOTEL;
        }
    }

    public Hotel clone(int newId) {
        if(this == NULL_HOTEL) return NULL_HOTEL;

        return new Hotel(newId, name, address, contact, hotelFacilities, hotelRoom, price, imgUrl);
    }
}
