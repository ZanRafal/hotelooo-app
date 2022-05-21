package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SearchScreenController implements ScreenController {
    private static final HotelController controller = new HotelController();
    ChangeStepController changeStepController;

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

    }

    @FXML
    protected void getCitySearchBarInput() {
        controller.onLoadAllHotelsFromMatchingCity(citySearchBar.getText());
    }
}
