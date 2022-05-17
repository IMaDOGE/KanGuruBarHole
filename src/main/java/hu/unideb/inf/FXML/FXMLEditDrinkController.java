package hu.unideb.inf.FXML;
import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
import javafx.application.Platform;
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
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static hu.unideb.inf.FXML.FXMLLoginController.f;
import static hu.unideb.inf.FXML.FXMLLoginController.fin;
import static hu.unideb.inf.FXML.FXMLNewDrinksController.bevetel;

public class FXMLEditDrinkController {
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
    private TextField BeAr;

    @FXML
    private javafx.scene.control.ComboBox<String> ComboBox;

    @FXML
    private TextField EladAr;

    @FXML
    private TextField Mennyiseg;

    @FXML
    private TextField NameTxt1;

    @FXML
    private Button SaveButton;
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

    public void SaviButtonPressed(ActionEvent actionEvent) {
        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan meg szeretnéd változtatni?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                for (Drink d:dri) {
                    if(d.getName().equals(ComboBox.getValue())){
                        d.setName(NameTxt1.getText());
                        d.setQuantity(Integer.parseInt(Mennyiseg.getText()));
                        d.setSellPrice(Integer.parseInt(EladAr.getText()));
                        d.setOrderPrice(Integer.parseInt(BeAr.getText()));
                        drink.updateDrink(d);
                    }
                }
                setModel();
            }
        });
        NameTxt1.setText("");
        Mennyiseg.setText("");
        EladAr.setText("");
        BeAr.setText("");
    }

    private Button LoadButton;
    public void LoadButtonClicked(ActionEvent actionEvent) {
        for (Drink d: dri){
            if(d.getName().equals(ComboBox.getValue())){
                NameTxt1.setText(d.getName());
                BeAr.setText(d.getOrderPrice()+"");
                EladAr.setText(d.getSellPrice()+"");
                Mennyiseg.setText(d.getQuantity()+"");
            }
        }

    }
}
