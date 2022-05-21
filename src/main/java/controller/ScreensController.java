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

        mainContainer.setScreen(ScreenUtils.SEARCH_SCREEN_ID);

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
