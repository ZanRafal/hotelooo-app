package model;

import lombok.Getter;
import lombok.Setter;
import model.objects.Hotel;

import java.util.List;


@Getter
@Setter
public class DataModel {
    private List<Hotel> hotels;
    private Hotel activeHotel;
}
