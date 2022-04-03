package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.property.Users;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLRegistrationController {
    private Users user;
    public void setModel(Users u) {
        this.user = u; }

    @FXML
    private Button BackButton;

    @FXML
    private Label ErrorText;

    @FXML
    private TextField KerNevText;

    @FXML
    private TextField PwText;

    @FXML
    private Button RegButton;

    @FXML
    private TextField UserText;

    @FXML
    private TextField VeznevText;

    @FXML
    private TextField wait;
    public void RegButtonPressed(ActionEvent actionEvent) throws IOException {
        String kereszt = KerNevText.getText();
        String vezetek= VeznevText.getText();
        String pw = PwText.getText();
        String username = UserText.getText();
        if ( kereszt.isEmpty() || vezetek.isEmpty() || pw.isEmpty() || username.isEmpty()){
            ErrorText.setText("HIBA! Az összes mezőt kötelező kitölteni!");
        }
        else {
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogin.fxml"));
            Scene scene = new Scene(loader.load());
            ((FXMLLoginController) loader.getController()).setModel(new Users());
            Stage stage = (Stage) RegButton.getScene().getWindow();
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.setHeight(840);
            stage.setWidth(1550);
            Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
            stage.fullScreenProperty();
            stage.getFullScreenExitKeyCombination();
            stage.setFullScreen(true);

            stage.show();


            stage.setOnCloseRequest(event -> {
                System.out.println("GUI bezarva");
                Platform.exit();
                System.exit(0);

            });
        }
    }

    public void BackButtonPressed(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogin.fxml"));
        Scene scene = new Scene(loader.load());
        ((FXMLLoginController) loader.getController()).setModel(new Users());
        Stage stage = (Stage) BackButton.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setHeight(840);
        stage.setWidth(1550);
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
        stage.fullScreenProperty();
        stage.getFullScreenExitKeyCombination();
        stage.setFullScreen(true);

        stage.show();

        stage.setOnCloseRequest(event -> {
            System.out.println("GUI bezarva");
            Platform.exit();
            System.exit(0);

        });
    }
}
