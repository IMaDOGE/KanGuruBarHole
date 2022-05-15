package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.property.Users;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class FXMLEditingController {
    @FXML
    private Button AddNewItemButton;

    @FXML
    private Button DeleteItemButton;

    @FXML
    private Button EditItemButton;

    @FXML
    private Button BackButton;


    public void DeleteItemButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLDeleteDrink.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        ((FXMLDeleteDrinkController) loader.getController()).setModel();
        Stage stage = (Stage) DeleteItemButton.getScene().getWindow();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
        stage.show();
    }

    public void EditItemButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLEditDrink.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        Stage stage = (Stage) EditItemButton.getScene().getWindow();
        ((FXMLEditDrinkController) loader.getController()).setModel();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
        stage.show();
    }

    public void BackButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLNewDrinks.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        ((FXMLNewDrinksController) loader.getController()).setModel(new Drinks());
        Stage stage = (Stage) BackButton.getScene().getWindow();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
        stage.show();
    }

    public void AddNewItemButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLAddNewDrink.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        Stage stage = (Stage) AddNewItemButton.getScene().getWindow();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
        stage.show();
    }
}
