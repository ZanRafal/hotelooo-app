package view;

import controller.HotelController;
import model.HotelDataModel;

public interface HotelsView {
    void refresh(HotelDataModel dataModel);

    void setController(HotelController controller);
}
