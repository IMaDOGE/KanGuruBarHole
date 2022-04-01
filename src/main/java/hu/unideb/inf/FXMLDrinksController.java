package hu.unideb.inf;

import hu.unideb.inf.model.Drinks;
import hu.unideb.inf.model.JpaDrinkDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDrinksController {
    private Drinks drinks;

    public void setModel(Drinks drinks) {
        this.drinks = drinks;
    }

    @FXML
    private Button AranyalmaButton;

    @FXML
    private Button AranyalmaButton2;

    @FXML
    private Button BorsodiButton;

    @FXML
    private Button BorsodiButton2;

    @FXML
    private Button Coca33Button;

    @FXML
    private Button CocaButton;

    @FXML
    private Button CocaButton2;

    @FXML
    private Button Csapolt3Button;

    @FXML
    private Button Csapolt5Button;

    @FXML
    private Button CsatosButton;

    @FXML
    private Button FantaButton;

    @FXML
    private Button FantaButton2;

    @FXML
    private Button HeinekenButton;

    @FXML
    private Button HeinekenButton2;

    @FXML
    private Button HennessyButton;

    @FXML
    private Button HennessyButton2;

    @FXML
    private Button JackButton;

    @FXML
    private Button JackButton2;

    @FXML
    private Label KasszaLabel;

    @FXML
    private Label KasszaLabel2;

    @FXML
    private Button KobanyaiButton;

    @FXML
    private Button KobanyaiButton2;

    @FXML
    private TextArea ListaBox;

    @FXML
    private TextArea ListaBox2;

    @FXML
    private Label OsszegLabel;

    @FXML
    private Label OsszegLabel2;

    @FXML
    private Button Pepsi33Button;

    @FXML
    private Button PepsiButton;

    @FXML
    private Button PepsiButton2;

    @FXML
    private Button RendelButton;

    @FXML
    private Button RendelButton2;

    @FXML
    private Button RopiButton;

    @FXML
    private Button SajtosButton;

    @FXML
    private Button SierraButton;

    @FXML
    private Button SierraButton2;

    @FXML
    private Button SpriteButton;

    @FXML
    private Button SpriteButton2;

    @FXML
    private Button hagymasButton;

    @FXML
    private Button sosButton;


    public void HagymasPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Hagymás Lays Chips\t\t\t\t 1 cs.\n");
    }

    public void SosPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Sós Lays Chips\t\t\t\t\t\t 1 cs.\n");
    }

    public void SajtosPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Sajtos Lays Chips\t\t\t\t\t 1 cs.\n");
    }

    public void Csatolt3Pushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Csapolt sör \t\t\t\t\t\t 0,3l\n");
    }

    public void Csatolt5Pushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Csapol sör \t\t\t\t\t\t 0,5l\n");
    }

    public void Coca33Pushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Coca dob. \t\t\t\t\t\t 0,33l\n");
    }

    public void Pepsi33Pushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Pepsi dob. \t\t\t\t\t\t 0,33l\n");
    }

    public void CsatosPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Csatos szilva\t\t\t\t\t\t 0,5\n");
    }

    public void RopiPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Ropi \t\t\t\t\t\t\t 1 cs.\n");
    }

    public void JackPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"JackDaniels\t\t\t\t\t\t 5cl \n");
    }

    public void AranyPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Aranyalma\t\t\t\t\t\t 5cl\n");
    }

    public void SierraPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Sierra \t\t\t\t\t\t\t 5cl\n");
    }

    public void HennessyPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Hennessy\t\t\t\t\t\t\t 5cl\n");
    }

    public void HeinekenPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Heineken dob. \t\t\t\t\t 0,5l\n");
    }

    public void BorsodiPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Borsodi dob. \t\t\t\t\t\t 0,5l\n");
    }

    public void CocaPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Coca-Cola\t\t\t\t\t\t 0,5l\n");
    }

    public void KőbányaiPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Kőbányai dob. \t\t\t\t\t 0,5l\n");
    }

    public void FantaPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"FantaNarancs\t\t\t\t\t\t 0,5l\n");
    }

    public void PepsiPushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Pepsi\t\t\t\t\t\t\t 0,5l\n");
    }

    public void SpritePushed(javafx.event.ActionEvent actionEvent) {
        ListaBox.setText(ListaBox.getText()+"Sprite \t\t\t\t\t\t\t 0,5l\n");
    }

    public void SierraRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Sierra \t\t\t\t\t\t\t 5cl\n");
    }

    public void HennessyRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Hennessy\t\t\t\t\t\t\t 5cl\n");
    }

    public void HeinekenRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Heineken dob. \t\t\t\t\t 0,5l\n");
    }

    public void BorsodiRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Borsodi dob. \t\t\t\t\t\t 0,5l\n");
    }

    public void CocaRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Coca-Cola\t\t\t\t\t\t 0,5l\n");
    }

    public void KőbányaiRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Kőbányai dob. \t\t\t\t\t 0,5l\n");
    }

    public void FantaRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"FantaNarancs\t\t\t\t\t\t 0,5l\n");
    }

    public void PepsiRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Pepsi\t\t\t\t\t\t\t 0,5l\n");
    }

    public void SpriteRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Sprite \t\t\t\t\t\t\t 0,5l\n");
    }

    public void JackRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"JackDaniels\t\t\t\t\t\t 5cl \n");
    }

    public void AranyRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Aranyalma\t\t\t\t\t\t 5cl\n");
    }

    public void SosRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Sós Lays Chips\t\t\t\t\t\t 1 cs.\n");
    }

    public void HagymasRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Hagymás Lays Chips\t\t\t\t 1 cs.\n");
    }

    public void SajtosRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Sajtos Lays Chips\t\t\t\t\t 1 cs.\n");
    }

    public void Csatolt3RendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Csapolt sör \t\t\t\t\t\t 0,3l\n");
    }

    public void Csatolt5RendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Csapolt sör \t\t\t\t\t\t 0,5l\n");
    }

    public void Coca33RendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Coca-Cola\t\t\t\t\t\t 0,33l\n");
    }

    public void Pepsi33RendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Pepsi dob. \t\t\t\t\t\t 0,33l\n");
    }

    public void CsatosRendelPushed(ActionEvent actionEvent) {
        ListaBox2.setText(ListaBox2.getText()+"Csatos szilva\t\t\t\t\t\t 0,5\n");
    }

    public void RopiRendelPushed(ActionEvent actionEvent) throws Exception {
        ListaBox2.setText(ListaBox2.getText()+"Ropi \t\t\t\t\t\t\t 1 cs.\n");
//        JpaDrinkDAO.ropi_close();
    }

    public void RendelButtonPushed(ActionEvent actionEvent) {
        ListaBox.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Rendelés");
        alert.setHeaderText("A rendelés sikeresen megtörtént.");
        alert.setContentText("Sikeres fizetés után nyomd meg az OK gombot!");
        alert.showAndWait();


    }

    public void RendelButtonPushed2(ActionEvent actionEvent) {
        ListaBox2.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Beszerzés");
        alert.setHeaderText("A beszerzés sikeresen megtörtént.");
        alert.setContentText("Folytatáshoz nyomd meg az OK gombot!");
        alert.showAndWait();
    }
}
