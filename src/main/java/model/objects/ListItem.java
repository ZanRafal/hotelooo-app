package model.objects;

import lombok.Getter;

public class ListItem {
    private final String name;
    private final String location;
    @Getter
    private final Hotel hotel;

    private final float price;

    public ListItem(Hotel hotel) {
        this.location = hotel.getAddress().getCity().isEmpty() ? "null" : hotel.getAddress().getCity();
        this.name = hotel.getName();
        this.price = hotel.getPrice();
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "          Nazwa hotelu:   " + name + " " +
                ",    lokalizacja:   " + location + ' ' +
                ",    cena za dobe:   " + price + " zł";
    }
}
