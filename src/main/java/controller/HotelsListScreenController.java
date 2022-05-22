package controller; /**
 * Sample Skeleton for 'hotels_list_screen.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import util.ScreenUtils;

public class HotelsListScreenController implements Initializable, ScreenController {

    ChangeStepController viewController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML // fx:id="app_logo"
    private ImageView app_logo;

    @FXML // fx:id="back_to_search_button"
    private Button back_to_search_button;

    @FXML // fx:id="hotels_list_screen"
    private Pane hotels_list_screen;

    @FXML // fx:id="items_list"
    private ListView<?> items_list;

    @FXML
    void goToHotelsListScreen(MouseEvent event) {

    }

    @FXML
    void goToSearchScreen(ActionEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }

    @FXML
    void initialize() {
        assert app_logo != null : "fx:id=\"app_logo\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert back_to_search_button != null : "fx:id=\"back_to_search_button\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert hotels_list_screen != null : "fx:id=\"hotels_list_screen\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert items_list != null : "fx:id=\"items_list\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
