package hu.unideb.inf.FXML;

import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
import hu.unideb.inf.property.Drinks;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.naming.Name;
import java.io.IOException;

public class FXMLAddNewDrinkController {

    @FXML
    private Button AddItemButton;

    @FXML
    private Button BackButton;

    @FXML
    private TextField Br;

    @FXML
    private TextField NameTxt;

    @FXML
    private TextField Netto;

    @FXML
    private TextField QuantityTxt;

    public void AddItemButtonPressed(ActionEvent actionEvent) {
        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan hozzá szeretnéd adni?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                DrinkDAO drink = new JpaDrinkDAO();
                Drink newDrink = new Drink("*"+NameTxt.getText(),Integer.parseInt(QuantityTxt.getText()), Integer.parseInt(Br.getText()),Integer.parseInt(Netto.getText()));
                drink.saveDrink(newDrink);
            }
        });

    }

    public void BackButtonPressed(ActionEvent actionEvent) throws IOException {
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
}
