package model.objects;

import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Collections;

public class LabelValueBuilder {
    private final HotelFacilities items;

    public LabelValueBuilder(HotelFacilities items) {
        this.items = items;
    }

    public void mapValuesToFields(ArrayList<Label> labels) {
        if(getNonFalseFacilities().isEmpty()) return;
        int i = 0;

        for(Label label : labels) {
            if(i > 6) break;
            label.setText(getNonFalseFacilities().get(i));
            i++;
        }
    }

    private ArrayList<String> getNonFalseFacilities() {
        ArrayList<String> result = new ArrayList<>();

        if (items.getIsBathroomInside()) result.add("Łazienka w pokoju");
        else result.add("");
        if (items.getIsKitchenInside()) result.add("Kuchnia w pokoju");
        else result.add("");
        if (items.getIsMaritalBed()) result.add("Łóżko małżeńskie");
        else result.add("");
        if (items.getIsParkingLot()) result.add("Parking");
        else result.add("");
        if (items.getIsSpa()) result.add("Spa");
        else result.add("");
        if (items.getIsPool()) result.add("Basen");
        else result.add("");
        if (items.getIsTelevision()) result.add("Telewizor");
        else result.add("");

        Collections.sort(result);
        Collections.reverse(result);

        return result;
    }
}
