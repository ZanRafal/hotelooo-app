package model.objects;

import java.util.ArrayList;
import java.util.List;

public class ListItemBuilder {
    
    public static List<ListItem> buildItemList(List<Hotel> hotels) {
        List<ListItem> result = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if(hotel == Hotel.NULL_HOTEL) continue;
            result.add(new ListItem(hotel));
        }
        return result;
    }
}
