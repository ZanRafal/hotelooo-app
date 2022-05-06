package model.objects;

public class HotelFacilities {
    private Integer numberOfRooms;
    private Integer numberOfBeds;
    private Boolean isMaritalBed;
    private Boolean isTelevision;
    private Boolean isBathroomInside;
    private Boolean isKitchenInside;

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean getMaritalBed() {
        return isMaritalBed;
    }

    public void setMaritalBed(Boolean maritalBed) {
        isMaritalBed = maritalBed;
    }

    public Boolean getTelevision() {
        return isTelevision;
    }

    public void setTelevision(Boolean television) {
        isTelevision = television;
    }

    public Boolean getBathroomInside() {
        return isBathroomInside;
    }

    public void setBathroomInside(Boolean bathroomInside) {
        isBathroomInside = bathroomInside;
    }

    public Boolean getKitchenInside() {
        return isKitchenInside;
    }

    public void setKitchenInside(Boolean kitchenInside) {
        isKitchenInside = kitchenInside;
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
                '}';
    }
}
