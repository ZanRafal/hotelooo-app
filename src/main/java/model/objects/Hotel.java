package model.objects;

public class Hotel {
    private Integer id;
    private String name;
    private Address address;
    private Contact contact;
    private Integer michelinStars;
    private HotelFacilities hotelFacilities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Integer getMichelinStars() {
        return michelinStars;
    }

    public void setMichelinStars(Integer michelinStars) {
        this.michelinStars = michelinStars;
    }

    public HotelFacilities getHotelFacilities() {
        return hotelFacilities;
    }

    public void setHotelFacilities(HotelFacilities hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "address=" + address +
                ", contact=" + contact +
                ", michelinStars=" + michelinStars +
                '}';
    }
}
