package controller;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
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

}
