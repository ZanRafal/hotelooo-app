package controller; /**
 * Sample Skeleton for 'MainAppContainter.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class MainAppContainerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="main_container"
    private StackPane main_container; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert main_container != null : "fx:id=\"main_container\" was not injected: check your FXML file 'MainAppContainter.fxml'.";

    }

}
