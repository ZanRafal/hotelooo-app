package model.objects;

import java.io.Serializable;

public class Hotel implements Serializable {
    private  Integer id;
    private String name;
    private Address address;
    private Contact contact;
    private Integer michelinStars;
    private HotelFacilities hotelFacilities;

    public Hotel() {
    }

    public Hotel(Integer id, String name, Address address, Contact contact, Integer michelinStars, HotelFacilities hotelFacilities) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.michelinStars = michelinStars;
        this.hotelFacilities = hotelFacilities;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setMichelinStars(Integer michelinStars) {
        this.michelinStars = michelinStars;
    }

    public void setHotelFacilities(HotelFacilities hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
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

//    public static class HotelBuilder {
//        private final Integer id;
//        private final String name;
//        private Address address;
//        private Contact contact;
//        private Integer michelinStars;
//        private HotelFacilities hotelFacilities;
//
//        public HotelBuilder(Integer id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        public HotelBuilder setAddress(Address address) {
//            this.address = address;
//            return this;
//        }
//
//        public HotelBuilder setContact(Contact contact) {
//            this.contact = contact;
//            return this;
//        }
//
//        public HotelBuilder setMichelinStars(Integer michelinStars) {
//            this.michelinStars = michelinStars;
//            return this;
//        }
//
//        public HotelBuilder setHotelFacilities(HotelFacilities hotelFacilities) {
//            this.hotelFacilities = hotelFacilities;
//            return this;
//        }
//
//        public Hotel build() {
//            return new Hotel(this);
//        }
//    }
}
