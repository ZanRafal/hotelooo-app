/**
 * Sample Skeleton for 'HotelsListScreen.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PleaseProvideControllerClassName {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="app_logo"
    private ImageView app_logo; // Value injected by FXMLLoader

    @FXML // fx:id="back_to_search_button"
    private Button back_to_search_button; // Value injected by FXMLLoader

    @FXML // fx:id="hotels_list_screen"
    private Pane hotels_list_screen; // Value injected by FXMLLoader

    @FXML // fx:id="items_list"
    private ListView<?> items_list; // Value injected by FXMLLoader

    @FXML
    void goToHotelsListScreen(MouseEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert app_logo != null : "fx:id=\"app_logo\" was not injected: check your FXML file 'HotelsListScreen.fxml'.";
        assert back_to_search_button != null : "fx:id=\"back_to_search_button\" was not injected: check your FXML file 'HotelsListScreen.fxml'.";
        assert hotels_list_screen != null : "fx:id=\"hotels_list_screen\" was not injected: check your FXML file 'HotelsListScreen.fxml'.";
        assert items_list != null : "fx:id=\"items_list\" was not injected: check your FXML file 'HotelsListScreen.fxml'.";

    }

}
