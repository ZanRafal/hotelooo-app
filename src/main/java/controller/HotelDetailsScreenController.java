package controller;
/**
 * Sample Skeleton for 'hotel_details_screen.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HotelDetailsScreenController implements ScreenController, Initializable {

    ChangeStepController controller;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="app_logo"
    private ImageView app_logo; // Value injected by FXMLLoader

    @FXML // fx:id="back_to_list_button"
    private Button back_to_list_button; // Value injected by FXMLLoader

    @FXML // fx:id="contacts_containter"
    private ListView<?> contacts_containter; // Value injected by FXMLLoader

    @FXML // fx:id="hotel_details_screen"
    private Pane hotel_details_screen; // Value injected by FXMLLoader

    @FXML // fx:id="hotel_info_container"
    private Pane hotel_info_container; // Value injected by FXMLLoader

    @FXML // fx:id="photo_container"
    private ImageView photo_container; // Value injected by FXMLLoader

    @FXML // fx:id="submib_reservation_button"
    private Button submib_reservation_button; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert app_logo != null : "fx:id=\"app_logo\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert back_to_list_button != null : "fx:id=\"back_to_list_button\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert contacts_containter != null : "fx:id=\"contacts_containter\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert hotel_details_screen != null : "fx:id=\"hotel_details_screen\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert hotel_info_container != null : "fx:id=\"hotel_info_container\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert photo_container != null : "fx:id=\"photo_container\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";
        assert submib_reservation_button != null : "fx:id=\"submib_reservation_button\" was not injected: check your FXML file 'hotel_details_screen.fxml'.";

    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        controller = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
