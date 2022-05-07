package model.objects;

public class HotelFacilities extends AbstractBuilding{
    private final Integer numberOfRooms;
    private final Integer numberOfBeds;
    private final Boolean isMaritalBed;
    private final Boolean isTelevision;
    private final Boolean isBathroomInside;
    private final Boolean isKitchenInside;
    private final Boolean isPoolAvailable;
    private final Boolean isParkingLotAvailable;

    private HotelFacilities(HotelFacilitiesBuilder hotelFacilitiesBuilder) {
        this.numberOfRooms = hotelFacilitiesBuilder.numberOfRooms;
        this.numberOfBeds = hotelFacilitiesBuilder.numberOfBeds;
        this.isMaritalBed = hotelFacilitiesBuilder.isMaritalBed;
        this.isTelevision = hotelFacilitiesBuilder.isTelevision;
        this.isBathroomInside = hotelFacilitiesBuilder.isBathroomInside;
        this.isKitchenInside = hotelFacilitiesBuilder.isKitchenInside;
        this.isPoolAvailable = hotelFacilitiesBuilder.isPoolAvailable;
        this.isParkingLotAvailable = hotelFacilitiesBuilder.isParkingLotAvailable;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public Boolean getMaritalBed() {
        return isMaritalBed;
    }

    public Boolean getTelevision() {
        return isTelevision;
    }

    public Boolean getBathroomInside() {
        return isBathroomInside;
    }

    public Boolean getKitchenInside() {
        return isKitchenInside;
    }

    public Boolean getPoolAvailable() {
        return isPoolAvailable;
    }

    public Boolean getParkingLotAvailable() {
        return isParkingLotAvailable;
    }

    @Override
    public String toString() {
        return "HotelFacilities{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfBeds=" + numberOfBeds +
                ", isMaritalBed=" + isMaritalBed +
                ", isTelevision=" + isTelevision +
                ", isBathroomInside=" + isBathroomInside +
                ", isKitchenInside=" + isKitchenInside +
                ", isPoolAvailable=" + isPoolAvailable +
                ", isParkingLotAvailable=" + isParkingLotAvailable +
                '}';
    }

    public static class HotelFacilitiesBuilder {
        private Integer numberOfRooms;
        private Integer numberOfBeds;
        private Boolean isMaritalBed;
        private Boolean isTelevision;
        private Boolean isBathroomInside;
        private Boolean isKitchenInside;
        private Boolean isPoolAvailable;
        private Boolean isParkingLotAvailable;

        public HotelFacilitiesBuilder setNumberOfRooms(Integer numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public HotelFacilitiesBuilder setNumberOfBeds(Integer numberOfBeds) {
            this.numberOfBeds = numberOfBeds;
            return this;
        }

        public HotelFacilitiesBuilder setMaritalBed(Boolean maritalBed) {
            isMaritalBed = maritalBed;
            return this;
        }

        public HotelFacilitiesBuilder setTelevision(Boolean television) {
            isTelevision = television;
            return this;
        }

        public HotelFacilitiesBuilder setBathroomInside(Boolean bathroomInside) {
            isBathroomInside = bathroomInside;
            return this;
        }

        public HotelFacilitiesBuilder setKitchenInside(Boolean kitchenInside) {
            isKitchenInside = kitchenInside;
            return this;
        }

        public HotelFacilitiesBuilder setPoolAvailable(Boolean poolAvailable) {
            isPoolAvailable = poolAvailable;
            return this;
        }

        public HotelFacilitiesBuilder setParkingLotAvailable(Boolean parkingLotAvailable) {
            isParkingLotAvailable = parkingLotAvailable;
            return this;
        }

        public HotelFacilities build() {
            return new HotelFacilities(this);
        }
    }
}
