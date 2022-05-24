package model.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

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

    public Hotel(){
        this(0, "",
                Address.NULL_ADDRESS,
                HotelContact.NULL_HOTEL_CONTACT,
                HotelFacilities.NULL_FACILITIES,
                HotelRoom.NULL_ROOM,
                0f,
                "");
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

        return new Hotel(newId, name, address, contact, hotelFacilities, hotelRoom, price, imgUrl);
    }

    public List<String> getContactFields() {
        return List.of(contact.getEmail(),
                contact.getFax(),
                contact.getNip(),
                contact.getRegon(),
                contact.getPhoneNumber());
    }
}
