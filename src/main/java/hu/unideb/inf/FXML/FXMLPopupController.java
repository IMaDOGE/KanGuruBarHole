package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLPopupController {
    @FXML
    private Button CancelButton;

    @FXML
    private Button OKButton;

    @FXML
    private TextField szovegText;
    public static String result;



    public void OkButtonClicked(ActionEvent actionEvent) {
        result="OK";
    }

    public void CancelButtonClicked(ActionEvent actionEvent) {
        result="Cancel";
    }
}
