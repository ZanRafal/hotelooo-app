package controller.frontend;

import controller.ChangeStepController;
import controller.HotelController;
import controller.ScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.HotelDataModel;
import model.objects.*;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;
import validators.ReservationDetailsValidator;

import java.net.URL;
import java.util.*;

public class HotelReservationScreenController implements Initializable, ScreenController {
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private static final HotelController modelController = ApplicationModelInitializerService.getController();
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
        if(!credentials_field.getText().isEmpty() && !phone_number_field.getText().isEmpty()) {
            HotelRoom toUpdate = buildRoomToUpdate();
            model.getActiveHotel().setHotelRoom(toUpdate);
            viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
            fireConfirmationPopupWindow();
        } else
            viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
    }

    @FXML
    void goBackToSearch(MouseEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }

    @FXML
    void submit(ActionEvent event) {
        if(ReservationDetailsValidator.validReservationDetails(
                credentials_field.getText(),
                phone_number_field.getText(),
                email_field.getText(),
                number_of_people_field.getText(),
                reservation_time.getText()))
        {
            HotelRoom toUpdate = buildRoomToUpdate();
            toUpdate.setIsOccupied(Occupancy.OCCUPIED);
            model.getActiveHotel().setHotelRoom(toUpdate);
            modelController.onSaveHotelData(toUpdate);
            viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
        }
    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private HotelRoom buildRoomToUpdate() {
        return HotelRoom.builder()
                .client(buildClient())
                .numberOfPeople(Integer.parseInt(number_of_people_field.getText()))
                .build();
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
            reservation_time.setEditable(false);
        } else {
            reservation_time.setEditable(true);
            updateTotalCost();
        }
    }

    private void updateTotalCost() {
        int days = Integer.parseInt(reservation_time.getText());
        float price = model.getActiveHotel().getPrice();
        total_cost_field.setText(String.format("%.2f zł", price * days));
    }

    private void fireConfirmationPopupWindow() {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(ScreenUtils.FINALIZE_TRANSACTION_SCREEN)));
            Stage stage = new Stage();
            stage.setTitle("Dokończ transakcję");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}