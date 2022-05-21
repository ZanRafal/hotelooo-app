package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensController extends Application {
    //TODO przenieść to do Utility
    private static final String SEARCH_SCREEN = "SearchPageScreen.fxml";
    private static final String SEARCH_SCREEN_ID = "search_screen";
    private static final String HOTEL_LIST_SCREEN = "HotelsListScreen.fxml";
    private static final String HOTEL_LIST_SCREEN_ID = "hotels_list";
    private static final String HOTEL_DETAILS_SCREEN = "HotelDetailsScreen.fxml";
    private static final String HOTEL_DETAILS_SCREEN_ID = "hotel_details";
    private static final String PARENT_SCREEN = "MainAppContainter.fxml";
    private static final String PARENT_SCREEN_ID = "parent_screen";


    @Override
    public void start(Stage stage) throws Exception {
        ChangeStepController mainContainer = new ChangeStepController();

        mainContainer.loadScreen(SEARCH_SCREEN, SEARCH_SCREEN_ID);
        mainContainer.loadScreen(HOTEL_LIST_SCREEN, HOTEL_LIST_SCREEN_ID);
        mainContainer.loadScreen(HOTEL_DETAILS_SCREEN, HOTEL_DETAILS_SCREEN_ID);

        mainContainer.setScreen(PARENT_SCREEN);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
