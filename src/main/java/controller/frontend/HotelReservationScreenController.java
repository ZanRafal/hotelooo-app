package controller.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.HotelDataModel;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class HotelReservationScreenController implements Initializable, ScreenController {
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private ChangeStepController viewController;

    @FXML
    private ImageView app_logo;


    @FXML
    private TextField credentials_field;

    @FXML
    private TextField number_of_people_field;

    @FXML
    private TextField phone_number_field;

    @FXML
    private Pane reservation_screen;

    @FXML
    private TextField reservation_time;

    @FXML
    private Button submit_button;

    @FXML
    private Button cancel_button;

    @FXML
    private Label total_cost_field;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void goBackToSearch(MouseEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }

    @FXML
    void submit(ActionEvent event) {

    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
