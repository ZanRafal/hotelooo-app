package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
public class ChangeStepController extends StackPane {

    @Getter
    private Map<String, Node> screens = new HashMap<>();

    public ChangeStepController() {
        super();
    }

    private void addScreen(String name, Node node) {
        screens.put(name, node);
    }

    //TODO dadać custom wyjątek
    public void setScreen(final String name) {
        if (screens.get(name) != null) {
            if (!getChildren().isEmpty()) {
                getChildren().remove(0);
                getChildren().add(0, screens.get(name));
            } else {
                getChildren().add(screens.get(name));
            }
        } else {
            System.out.println("screen hasn't been loaded!!! \n");
        }
    }

    public void loadScreen(String name, String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) loader.load();
            ScreenController screenController = (ScreenController) loader.getController();
            System.out.println(screenController);
            screenController.setScreenParent(this);
            addScreen(name, loadScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
