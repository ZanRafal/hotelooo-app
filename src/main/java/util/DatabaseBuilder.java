package util;

import lombok.experimental.UtilityClass;
import model.objects.*;

import java.util.List;

@UtilityClass
public class DatabaseBuilder {
    JsonObjectWriter objectWriter = JsonObjectWriter.getInstance();
    JsonObjectReader objectReader = JsonObjectReader.getInstance();

    //pamiętać o prawidłowym formacie
    Address address = Address.builder()
            .city()
            .country()
            .postalCode()
            .streetName()
            .build();

    //pamiętać o prawidłowym formacie
    HotelContact hotelContact = HotelContact.builder()
            .email()
            .email()
            .fax()
            .nip()
            .phoneNumber()
            .regon()
            .build();

    HotelRoom hotelRoom = HotelRoom.builder()
            .client(null)
            .isOccupied(Occupancy.AVAILABLE)
            .numberOfPeople(0)
            .build();

    //true lub false
    HotelFacilities hotelFacilities = HotelFacilities.builder()
            .isBathroomInside()
            .isKitchenInside()
            .isMaritalBed()
            .isParkingLot()
            .isPool()
            .isSpa()
            .isTelevision()
            .numberOfRooms()
            .stars()
            .build();


    Hotel hotel = Hotel.builder()
            .name()
            .address(address)
            .contact(hotelContact)
            .hotelRoom(hotelRoom)
            .hotelFacilities(hotelFacilities)
            .price() //float
            .imgUrl() //string
            .build();


    public static void initializeDatabase() {
        List<Hotel> hotelList = objectReader.readJsonObjects();
        int id = hotelList.get(hotelList.size() - 1).getId();
        hotel.setId(id + 1);
        hotelList.add(hotel);
        objectWriter.writeJsonObjects(hotelList);
    }
}
