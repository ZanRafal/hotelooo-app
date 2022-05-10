package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Hotel implements Serializable, Cloneable {
    private Integer id;
    private String name;
    private Address address;
    private HotelContact contact;
    private List<HotelRoom> hotelRooms;
    private HotelFacilities hotelFacilities;

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

        return new Hotel(newId, name, address, contact, hotelRooms, hotelFacilities);
    }
}
