package controller.frontend;

import controller.HotelController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class HotelSearchScreenController implements Initializable, ScreenController {
    private static final HotelController controller = ApplicationModelInitializerService.getController();
    private ChangeStepController changeStepController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField citySearchBar;

    @FXML
    private Pane hotel_search_screen;

    @FXML
    private Button searchButton;

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.changeStepController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void getCitySearchBarInput(ActionEvent event) {
    }

    @FXML
    void onSearchButtonClicked(ActionEvent event) {
        controller.onLoadAllHotelsFromMatchingCity(citySearchBar.getText());
        nextStep();
    }

    @FXML
    void initialize() {
        assert citySearchBar != null : "fx:id=\"citySearchBar\" was not injected: check your FXML file 'hotel_search_screen.fxml'.";
        assert hotel_search_screen != null : "fx:id=\"hotel_search_screen\" was not injected: check your FXML file 'hotel_search_screen.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'hotel_search_screen.fxml'.";
    }

    private void nextStep() {
        changeStepController.loadScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID, ScreenUtils.HOTEL_LIST_SCREEN);
        changeStepController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
    }
}
