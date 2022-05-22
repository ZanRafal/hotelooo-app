package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import util.ScreenUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchScreenController implements ScreenController, Initializable {
    private static final HotelController controller = new HotelController();
    private ChangeStepController changeStepController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField citySearchBar;

    @FXML
    private Pane mainFrame;

    @FXML
    private Button searchButton;


    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.changeStepController = screenParent;
    }

    @FXML
    protected void onSearchButtonClicked() {
        controller.onLoadAllHotelsFromMatchingCity(citySearchBar.getText());
        changeStepController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
    }

    @FXML
    protected void getCitySearchBarInput() {
        controller.onLoadAllHotelsFromMatchingCity(citySearchBar.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public ChangeStepController getChangeStepController() {
        return changeStepController;
    }

    public void setChangeStepController(ChangeStepController changeStepController) {
        this.changeStepController = changeStepController;
    }

    @FXML
    void initialize() {
        assert citySearchBar != null : "fx:id=\"citySearchBar\" was not injected: check your FXML file 'search_page_screen.fxml'.";
        assert mainFrame != null : "fx:id=\"mainFrame\" was not injected: check your FXML file 'search_page_screen.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'search_page_screen.fxml'.";
    }
}