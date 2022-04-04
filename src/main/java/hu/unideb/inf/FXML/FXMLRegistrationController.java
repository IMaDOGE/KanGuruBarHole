package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.User;
import hu.unideb.inf.interfaces.UserDAO;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.property.Users;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

import static hu.unideb.inf.FXML.FXMLLoginController.u;
import static java.lang.Character.*;

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
        boolean validLong = true;
        boolean validNum = true;
        boolean validupper = true;
        boolean validlower = true;
        for( char c : pw.toCharArray()) {
            if (isUpperCase(c)) {
                validupper = false;
            }
            if (isLowerCase(c)) {
                validlower = false;
            }
            if (isDigit(c)) {
                validNum = false;
            }
        }
        if ( kereszt.isEmpty() || vezetek.isEmpty() || pw.isEmpty() || username.isEmpty()){
            ErrorText.setText("HIBA! Az összes mezőt kötelező kitölteni!");
        }

        else if(pw.length()<8){
            ErrorText.setText("Jelszó hossza minimum 8 karakter kell legyen!");
        }
        else if(validNum){
            ErrorText.setText("A jelszónak tartalmaznia kell számot is!");
        }
        else if(validupper){
            ErrorText.setText("A jelszónak tartalmaznia kell nagybetűt is!");
        }
        else if(validlower){
            ErrorText.setText("A jelszónak tartalmaznia kell kisbetűt is!");
        }


        else {
            User registered = new User(kereszt, vezetek,username, pw);
            u.saveUser(registered);
            for(User u : u.getUsers())
                System.out.println(u.getUsername()+u.getPasswd());
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogin.fxml"));
            Scene scene = new Scene(loader.load());
            Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
            ImageCursor cursor = new ImageCursor(img, 30, 30);
            scene.setCursor(cursor);
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
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
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
