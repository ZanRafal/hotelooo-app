package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.ScreenUtils;

public class ScreensController extends Application {

    @Override
    public void start(Stage stage) {
        ChangeStepController mainContainer = new ChangeStepController();

        mainContainer.loadScreen(ScreenUtils.SEARCH_SCREEN_ID, ScreenUtils.SEARCH_SCREEN);
        mainContainer.loadScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID, ScreenUtils.HOTEL_LIST_SCREEN);
        mainContainer.loadScreen(ScreenUtils.HOTEL_DETAILS_SCREEN_ID, ScreenUtils.HOTEL_DETAILS_SCREEN);
        mainContainer.loadScreen(ScreenUtils.HOTEL_RESERVATION_SCREEN_ID, ScreenUtils.HOTEL_DETAILS_SCREEN);
        mainContainer.loadScreen(ScreenUtils.FINALIZE_TRANSACTION_SCREEN_ID, ScreenUtils.FINALIZE_TRANSACTION_SCREEN);

        mainContainer.setScreen(ScreenUtils.SEARCH_SCREEN_ID);

        Group root = new Group();
        stage.setResizable(false);
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/screens/application_stylesheet.css");
        stage.setScene(scene);
        stage.setTitle("Hotelooo");
        stage.show();
    }

    public void run(String[] args) {
        launch(args);
    }
}
