package util;

import lombok.experimental.UtilityClass;
import model.objects.*;

import java.util.List;

@UtilityClass
//@Deprecated
public class DatabaseBuilder {
    JsonObjectWriter objectWriter = JsonObjectWriter.getInstance();
    JsonObjectReader objectReader = JsonObjectReader.getInstance();

    //pamiętać o prawidłowym formacie
    Address address = Address.builder()
            .city("Warszawa")
            .country("Poland")
            .postalCode("12-331")
            .streetName("Ulicowa")
            .build();

    //pamiętać o prawidłowym formacie
    HotelContact hotelContact = HotelContact.builder()
            .email("mock123@wp.pl")
            .fax("1-658-663-7779")
            .nip("7610259065")
            .phoneNumber("123-231-123")
            .regon("710621971")
            .build();

    HotelRoom hotelRoom = HotelRoom.builder()
            .client(null)
            .isOccupied(Occupancy.AVAILABLE)
            .numberOfPeople(0)
            .build();

    //true lub false
    HotelFacilities hotelFacilities = HotelFacilities.builder()
            .isBathroomInside(true)
            .isKitchenInside(false)
            .isMaritalBed(true)
            .isParkingLot(false)
            .isPool(true)
            .isSpa(false)
            .isTelevision(false)
            .numberOfRooms(6)
            .stars(3)
            .build();


    Hotel hotel = Hotel.builder()
            .id(1)
            .name("Zielona dolina")
            .address(address)
            .contact(hotelContact)
            .hotelRoom(hotelRoom)
            .hotelFacilities(hotelFacilities)
            .price(123.3f) //float
            .imgUrl("Hooootuwa.jpg") //string
            .build();


    public static void initializeDatabase() {
        List<Hotel> hotelList = objectReader.readJsonObjects();
        hotelList.add(hotel);
        objectWriter.writeJsonObjects(hotelList);
    }
}
