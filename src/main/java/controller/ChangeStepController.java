package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class ChangeStepController extends StackPane {

    private Map<String, Node> screens = new HashMap<>();

    public ChangeStepController() {
        super();
    }

    public void addScreen(String name, Node node) {
        screens.put(name, node);
    }

    public Node getScreen(String name) {
        return screens.get(name);
    }

    public boolean loadScreen(String name, String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) loader.load();
            ScreenController controlledScreen = ((ScreenController) loader.getController());
            controlledScreen.setScreenParent(this);
            addScreen(name, loadScreen);
            return true;
        } catch (Exception exception) {
            log.error(exception.getMessage());
            return false;
        }
    }

    //TODO dadać custom wyjątek
    public boolean setScreen(String name) throws Exception {
        if(name == null) {
            throw new Exception("Error");
        }

        if (!getChildren().isEmpty()) {
            getChildren().add(screens.get(name));
            return true;
        } else {
            return false;
        }
    }
}
