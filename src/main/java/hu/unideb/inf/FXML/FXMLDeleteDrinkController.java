package hu.unideb.inf.FXML;

import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
import hu.unideb.inf.property.Drinks;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static hu.unideb.inf.FXML.FXMLNewDrinksController.osszeg;

public class FXMLDeleteDrinkController
{
    DrinkDAO drink = new JpaDrinkDAO();
    List<Drink> dri= drink.getDrinks();
    public void setModel() {

        for (Drink d: dri) {
            ComboBox.getItems().add(d.getName());
        }
    }
    @FXML
    private Button BackButton;

    @FXML
    private ChoiceBox<Drink> DrinkLista;

    @FXML
    private Button SaveButton;

    @FXML
    private javafx.scene.control.ComboBox<String> ComboBox;


    public void BackButtonPressed(javafx.event.ActionEvent actionEvent) throws IOException {
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLEditing.fxml"));
            Scene scene = new Scene(loader.load());
            Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
            ImageCursor cursor = new ImageCursor(img, 30, 30);
            scene.setCursor(cursor);
            Stage stage = (Stage) BackButton.getScene().getWindow();
            stage.setTitle("Bejelentkezés");
            stage.setScene(scene);
            stage.show();
    }

    public void SaveButtonPressed(javafx.event.ActionEvent actionEvent) {

        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan ki szeretnéd törölni?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                for (Drink d:dri) {
                    if(d.getName().equals(ComboBox.getValue())){
                        drink.deleteDrink(d);
                        drink.updateDrink(d);
                    }
                }
                setModel();
            }
        });
    }
}
