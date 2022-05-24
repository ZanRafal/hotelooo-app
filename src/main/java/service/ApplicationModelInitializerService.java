package service;

import controller.HotelController;
import model.HotelDataModel;
import model.MainHotelModel;

public class ApplicationModelInitializerService {
    public static final HotelDataModel dataModel = new HotelDataModel();
    public static final MainHotelModel mainModel = new MainHotelModel();
    public static final HotelController controller = new HotelController();

    public static ApplicationModelInitializerService INSTANCE;

    private ApplicationModelInitializerService() {}

    public static ApplicationModelInitializerService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationModelInitializerService();
        }
        return INSTANCE;
    }

    public static HotelDataModel getDataModel() {
        return dataModel;
    }

    public static MainHotelModel getMainModel() {
        return mainModel;
    }

    public static HotelController getController() {
        return controller;
    }

    public void initialize() {
        controller.setModel(mainModel);
        mainModel.loadHotels();
//        System.out.println(mainModel.getHotelDataModel().getHotels());
    }
}
