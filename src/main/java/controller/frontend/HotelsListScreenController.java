package controller.frontend; /**
 * Sample Skeleton for 'hotels_list_screen.fxml' Controller Class
 */

import controller.HotelController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.HotelDataModel;
import model.objects.Hotel;
import model.objects.ListItem;
import model.objects.ListItemBuilder;
import service.ApplicationModelInitializerService;
import util.ScreenUtils;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HotelsListScreenController implements Initializable, ScreenController {
    private static final HotelController controller = ApplicationModelInitializerService.getController();
    private static final HotelDataModel model = ApplicationModelInitializerService.getDataModel();
    private ChangeStepController viewController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView app_logo;

    @FXML
    private Button back_to_search_button;

    @FXML
    private Pane hotels_list_screen;

    @FXML
    private ListView<ListItem> items_list;

    @FXML
    void goToHotelsListScreen(MouseEvent event) {
    }

    @FXML
    void goToSearchScreen(ActionEvent event) {
        viewController.setScreen(ScreenUtils.SEARCH_SCREEN_ID);
    }

    @FXML
    void selectHotel(ListView.EditEvent<Hotel> event) {
    }

    @FXML
    void initialize() {
        assert app_logo != null : "fx:id=\"app_logo\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert back_to_search_button != null : "fx:id=\"back_to_search_button\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert hotels_list_screen != null : "fx:id=\"hotels_list_screen\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";
        assert items_list != null : "fx:id=\"items_list\" was not injected: check your FXML file 'hotels_list_screen.fxml'.";

    }

    @Override
    public void setScreenParent(ChangeStepController screenParent) {
        this.viewController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List<ListItem> itemList = ListItemBuilder.buildItemList(model.getHotels());
        items_list.setItems(FXCollections.observableList(itemList));
        items_list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        items_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ListItem>() {
            @Override
            public void changed(ObservableValue<? extends ListItem> observableValue, ListItem listItem, ListItem t1) {
                Hotel currentHotel = items_list.getSelectionModel().getSelectedItem().getHotel();
                model.setActiveHotel(currentHotel);
                viewController.setScreen(ScreenUtils.HOTEL_DETAILS_SCREEN_ID);
                System.out.println(model.getActiveHotel().toString());
            }
        });
    }

    private ListView<ListItem> ofListView(List<ListItem> list) {
        ObservableList<ListItem> thisList = FXCollections.observableList(list);
        return new ListView<>(thisList);
    }
}
