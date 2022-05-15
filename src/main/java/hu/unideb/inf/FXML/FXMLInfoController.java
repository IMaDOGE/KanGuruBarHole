package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.property.Users;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

import static hu.unideb.inf.FXML.FXMLNewDrinksController.*;

public class FXMLInfoController {
    @FXML
    private Button OpenCassa;

    @FXML
    void OpenCassaClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogin.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        ((FXMLLoginController) loader.getController()).setModel(new Users());
        Stage stage = (Stage) OpenCassa.getScene().getWindow();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
        stage.show();
    }
}
