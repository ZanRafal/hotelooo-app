package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import model.objects.Hotel;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
public class HotelDataModel {
    private List<Hotel> hotels;
    private Hotel activeHotel;
}
