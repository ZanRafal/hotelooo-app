package controller.frontend;

import controller.ChangeStepController;
import controller.ScreenController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.HotelDataModel;
import service.ApplicationModelInitializerService;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class FinalizeTransactionScreenController implements Initializable, ScreenController {
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private int count = 30;
    private ChangeStepController viewController;

    @FXML
    private Pane finalize_transaction_screen;

    @FXML
    private Label phone_number_field;

    @FXML
    private Label credentials_field;

    @FXML
    private Label timer_field;

    @FXML
    private Button reservation_button;

    @FXML
    void goBackToList(ActionEvent event) {
        Stage thisStage = (Stage) finalize_transaction_screen.getScene().getWindow();
        thisStage.close();
    }

    @FXML
    void submitReservation(ActionEvent event) {
        Stage thisStage = (Stage) finalize_transaction_screen.getScene().getWindow();
        thisStage.close();
    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(model.getActiveHotel() != null) {
            initializeFields();
            fireTimer();
        }
    }

    private void fireTimer() {
        Thread thread = new Thread(() -> {
            Runnable updateView = this::decrementCount;

            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(updateView);
            }
        });
        thread.start();
    }

    private void decrementCount() {
        if (count > 0) {
            count--;
        }
        timer_field.setText(Integer.toString(count));
    }

    private void initializeFields() {
        String name = model.getActiveHotel().getHotelRoom().getClient().getFirstName();
        String lastName = model.getActiveHotel().getHotelRoom().getClient().getLastName();
        String phoneNumber = model.getActiveHotel().getHotelRoom().getClient().getContact().getPhoneNumber();
        credentials_field.setText(name + " " + lastName);
        phone_number_field.setText(phoneNumber);
    }
}
