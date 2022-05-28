package controller.frontend;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.HotelDataModel;
import model.objects.Hotel;
import model.objects.LabelValueBuilder;
import model.objects.Occupancy;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.ResourceBundle;

public class HotelDetailsScreenController implements ScreenController, Initializable {
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private ChangeStepController viewController;

    @FXML
    public Label facilities_field1;

    @FXML
    public Label facilities_field4;

    @FXML
    public Label facilities_field2;

    @FXML
    public Label facilities_field5;

    @FXML
    public Label facilities_field3;

    @FXML
    public Label facilities_field6;

    @FXML
    private Label occupancy_field;

    @FXML
    public Label price_field;

    @FXML
    private Label number_of_stars_field;

    @FXML
    private Label number_of_rooms_field;

    @FXML
    private Label location_field;

    @FXML
    private Label hotel_name_field;

    @FXML
    private ImageView app_logo;

    @FXML
    private ListView<String> contacts_container;

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Hotel hotel = initializeHotel(model.getActiveHotel());
        initializeFieldsWithValues(hotel);
    }

    public void goBackToList(ActionEvent event) {
        viewController.setScreen(ScreenUtils.HOTEL_LIST_SCREEN_ID);
    }

    public void goBackToSearch(MouseEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }


    public void submitReservation(ActionEvent event) {
        if (model.getActiveHotel().getHotelRoom().getIsOccupied() != null) {
            if(model.getActiveHotel().getHotelRoom().getIsOccupied().equals(Occupancy.OCCUPIED)) {
                return;
            }
        }
        nextStep();
    }

    private void initializeFieldsWithValues(Hotel hotel) {
        this.hotel_name_field.setText("Hotel: " + hotel.getName()); //nazwa
        this.location_field.setText(hotel.getAddress().getCity() + ", " + hotel.getAddress().getStreetName());
        this.number_of_rooms_field.setText(hotel.getHotelFacilities().getNumberOfRooms().toString());
        this.number_of_stars_field.setText(buildStarsString(hotel.getHotelFacilities().getStars()));
        this.price_field.setText(hotel.getPrice().toString());
        contacts_container.setItems(FXCollections.observableList(hotel.getContactFields()));
        occupancy_field.setText(hotel.getHotelRoom().getIsOccupied().getValue());
        LabelValueBuilder valueBuilder = new LabelValueBuilder(hotel.getHotelFacilities());
        valueBuilder.mapValuesToFields(buildLabelsArray());
    }

    private String buildStarsString(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(Character.toString(9733))
                    .append(" ");
        }
        return sb.toString();
    }

    private ArrayList<Label> buildLabelsArray() {
        return  new ArrayList<>(
            Arrays.asList(facilities_field1,
                    facilities_field4,
                    facilities_field2,
                    facilities_field5,
                    facilities_field3,
                    facilities_field6
            ));
    }

    private Hotel initializeHotel(Hotel hotel) {
        return Objects.requireNonNullElse(hotel, Hotel.NULL_HOTEL);
    }

    private void nextStep() {
        viewController.loadScreen(ScreenUtils.HOTEL_RESERVATION_SCREEN_ID, ScreenUtils.HOTEL_RESERVATION_SCREEN);
        viewController.setScreen(ScreenUtils.HOTEL_RESERVATION_SCREEN_ID);
    }
}
