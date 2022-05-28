package controller.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.HotelDataModel;
import model.objects.Client;
import model.objects.Contact;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

import java.net.URL;
import java.util.*;

public class HotelReservationScreenController implements Initializable, ScreenController {
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private ChangeStepController viewController;

    @FXML
    private ImageView app_logo;

    @FXML
    private TextField credentials_field;

    @FXML
    private TextField phone_number_field;

    @FXML
    private TextField email_field;

    @FXML
    private Pane reservation_screen;

    @FXML
    private TextField number_of_people_field;

    @FXML
    private TextField reservation_time;

    @FXML
    private Label total_cost_field;

    @FXML
    private Button submit_button;

    @FXML
    private Button cancel_button;

    @FXML
    private ToggleButton edit_button;

    @FXML
    void cancel(ActionEvent event) {
        viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
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

    private Client buildClient() {
        Map<String, String> valuesMap = splitCredentialsFromString();

        Contact contact = Contact.builder()
                .phoneNumber(phone_number_field.getText())
                .email(email_field.getText())
                .build();

        return Client.builder()
                .firstName(valuesMap.get("name"))
                .lastName(valuesMap.get("lastName"))
                .contact(contact)
                .build();
    }

    private Map<String, String> splitCredentialsFromString() {
        String[] val = credentials_field.getText().split(" ");
        return Map.of("name", val[0], "lastName", val[1]);
    }

    public void toggleEdit(ActionEvent event) {
        if (edit_button.isSelected()) {
            reservation_time.setEditable(true);
        } else {
            reservation_time.setEditable(false);
            updateTotalCost();
        }
    }

    private void updateTotalCost() {
        int days = Integer.parseInt(reservation_time.getText());
        float price = model.getActiveHotel().getPrice();
        total_cost_field.setText(String.format("%.2f zł", price * days));
    }
}