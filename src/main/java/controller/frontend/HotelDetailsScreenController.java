package controller.frontend;
/**
 * Sample Skeleton for 'hotel_details_screen.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import controller.HotelController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.HotelDataModel;
import model.objects.Hotel;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

public class HotelDetailsScreenController implements ScreenController, Initializable {
    private static final HotelController controller = ApplicationModelInitializerService.getController();
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
//    private Hotel activeHotel = model.getActiveHotel();
    ChangeStepController viewController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView app_logo;

    @FXML
    private Button back_to_list_button;

    @FXML
    private ListView<?> contacts_containter;

    @FXML
    private Pane hotel_details_screen;

    @FXML
    private Pane hotel_info_container;

    @FXML
    private ImageView photo_container;

    @FXML
    private Button submib_reservation_button;

    @FXML
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
        viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        hotel_info_container.setAccessibleText(model.getActiveHotel().toString());
    }

    public void goBackToList(ActionEvent event) {
        viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
    }

    public void goBackToSearch(MouseEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }

    public void goToReservationScreen(ActionEvent event) {
    }
}
