package model.objects;

public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetName;

    private Address(AddressBuilder addressBuilder) {
        this.country = addressBuilder.country;
        this.city = addressBuilder.city;
        this.postalCode = addressBuilder.postalCode;
        this.streetName = addressBuilder.streetName;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", streetName='" + streetName + '\'' +
                '}';
    }

    public static class AddressBuilder {
        private String country;
        private String city;
        private String postalCode;
        private String streetName;

        public AddressBuilder() {}

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
