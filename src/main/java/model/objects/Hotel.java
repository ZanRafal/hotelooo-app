package model.objects;

import java.io.Serializable;

public class Hotel implements Serializable {
    private final Integer id;
    private final String name;
    private final Address address;
    private final Contact contact;
    private final Integer michelinStars;
    private final HotelFacilities hotelFacilities;

    private Hotel(HotelBuilder hotelBuilder) {
        this.id = hotelBuilder.id;
        this.name = hotelBuilder.name;
        this.address = hotelBuilder.address;
        this.contact = hotelBuilder.contact;
        this.michelinStars = hotelBuilder.michelinStars;
        this.hotelFacilities = hotelBuilder.hotelFacilities;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public Integer getMichelinStars() {
        return michelinStars;
    }

    public HotelFacilities getHotelFacilities() {
        return hotelFacilities;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", michelinStars=" + michelinStars +
                ", hotelFacilities=" + hotelFacilities +
                '}';
    }

    public static class HotelBuilder {
        private final Integer id;
        private final String name;
        private Address address;
        private Contact contact;
        private Integer michelinStars;
        private HotelFacilities hotelFacilities;

        public HotelBuilder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public HotelBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public HotelBuilder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public HotelBuilder setMichelinStars(Integer michelinStars) {
            this.michelinStars = michelinStars;
            return this;
        }

        public HotelBuilder setHotelFacilities(HotelFacilities hotelFacilities) {
            this.hotelFacilities = hotelFacilities;
            return this;
        }

        public Hotel build() {
            return new Hotel(this);
        }
    }
}
