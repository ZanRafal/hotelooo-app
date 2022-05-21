package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensController extends Application {
    //TODO przenieść to do Utility
    public static String SEARCH_SCREEN = "/screens/hotel_search_screen.fxml";
    public static String SEARCH_SCREEN_ID = "search_screen";
    public static String HOTEL_LIST_SCREEN = "/screens/hotels_list_screen.fxml";
    public static String HOTEL_LIST_SCREEN_ID = "hotels_list";
    public static String HOTEL_DETAILS_SCREEN = "screens/hotel_details_screen.fxml";
    public static String HOTEL_DETAILS_SCREEN_ID = "hotel_details";
    public static String PARENT_SCREEN = "screens/MainAppContainter.fxml";
    public static String PARENT_SCREEN_ID = "parent_screen";


    @Override
    public void start(Stage stage) throws Exception {
        ChangeStepController mainContainer = new ChangeStepController();

        mainContainer.loadScreen(ScreensController.SEARCH_SCREEN_ID, ScreensController.SEARCH_SCREEN);
//        mainContainer.loadScreen(ScreensController.HOTEL_LIST_SCREEN_ID, ScreensController.HOTEL_LIST_SCREEN);
        //mainContainer.loadScreen(ScreensController.HOTEL_DETAILS_SCREEN_ID, ScreensController.HOTEL_DETAILS_SCREEN);

        mainContainer.setScreen(ScreensController.SEARCH_SCREEN_ID);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //TODO Dodać do propertasów albo utilki
        stage.setTitle("Hotelooo");
        stage.show();
    }

    public void run(String[] args) {
        launch(args);
    }
}
