package hu.unideb.inf;

import hu.unideb.inf.model.Drinks;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class FXMLDrinksController {
    private Drinks drinks;

    public void setModel(Drinks drinks) {
        this.drinks = drinks;
    }
    @FXML
    private TextArea MennyLista;

    @FXML
    private TextArea MennyLista2;

    @FXML
    private TextArea NevLista;

    @FXML
    private TextArea NevLista2;
    @FXML
    private TextArea ArLista;

    @FXML
    private TextArea ArLista2;

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

    @FXML
    private Button SzerkesztButton;

    @FXML
    private Label Dolgozo;

    @FXML
    void SzerkesztButtonPushed(ActionEvent event) {

    }

    @FXML
    private Label VegosszegLabel;
    @FXML
    private Label VegosszegLabel2;

    public void SumVegosszeg1(){
        String s[] = ArLista.getText().split("\n");
        int result=0;
        for(int i = 0; i<s.length; i++){
            result+=Integer.parseInt(s[i]);
        }
        VegosszegLabel.setText(result+"");
    }

    //Megnézzük, milyen néven van bejelentkezve az eladó,   ha admin, akkor elérheti a szerkesztés gombot, másképp nem!


    public void SumVegosszeg2(){
        String s[] = ArLista2.getText().split("\n");
        int result=0;
        for(int i = 0; i<s.length; i++){
            result+=Integer.parseInt(s[i]);
        }
        VegosszegLabel2.setText(result+"");
    }

    public void HagymasPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Lays Hagymás chips\n");
        MennyLista.setText(MennyLista.getText()+"1 csomag\n");
        ArLista.setText(ArLista.getText()+"400\n");
        SumVegosszeg1();

    }

    public void SosPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Lays Sós chips\n");
        MennyLista.setText(MennyLista.getText()+"1 csomag\n");
        ArLista.setText(ArLista.getText()+"400\n");
        SumVegosszeg1();
    }

    public void SajtosPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Lays Sajtos chips\n");
        MennyLista.setText(MennyLista.getText()+"1 csomag\n");
        ArLista.setText(ArLista.getText()+"400\n");
        SumVegosszeg1();
    }

    public void Csatolt3Pushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Csapolt sör\n");
        MennyLista.setText(MennyLista.getText()+"pohár\n");
        ArLista.setText(ArLista.getText()+"300\n");
        SumVegosszeg1();
    }

    public void Csatolt5Pushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Csapolt sör\n");
        MennyLista.setText(MennyLista.getText()+"korsó\n");
        ArLista.setText(ArLista.getText()+"450\n");
        SumVegosszeg1();
    }

    public void Coca33Pushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Coca-cola (dob.)\n");
        MennyLista.setText(MennyLista.getText()+"0,33l\n");
        ArLista.setText(ArLista.getText()+"240\n");
        SumVegosszeg1();
    }

    public void Pepsi33Pushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Pepsi (dob.)\n");
        MennyLista.setText(MennyLista.getText()+"0,33l\n");
        ArLista.setText(ArLista.getText()+"240\n");
        SumVegosszeg1();
    }

    public void CsatosPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Csatos szilva\n");
        MennyLista.setText(MennyLista.getText()+"0,05l\n");
        ArLista.setText(ArLista.getText()+"360\n");
        SumVegosszeg1();
    }

    public void RopiPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Ropi\n");
        MennyLista.setText(MennyLista.getText()+"1 csomag\n");
        ArLista.setText(ArLista.getText()+"210\n");
        SumVegosszeg1();
    }

    public void JackPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"JackDaniels\n");
        MennyLista.setText(MennyLista.getText()+"0,05l\n");
        ArLista.setText(ArLista.getText()+"650\n");
        SumVegosszeg1();
    }

    public void AranyPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Aranyalma\n");
        MennyLista.setText(MennyLista.getText()+"0,05l\n");
        ArLista.setText(ArLista.getText()+"580\n");
        SumVegosszeg1();
    }

    public void SierraPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Sierra Tequila\n");
        MennyLista.setText(MennyLista.getText()+"0,05l\n");
        ArLista.setText(ArLista.getText()+"650\n");
        SumVegosszeg1();
    }

    public void HennessyPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Hennessy\n");
        MennyLista.setText(MennyLista.getText()+"0,05l\n");
        ArLista.setText(ArLista.getText()+"690\n");
        SumVegosszeg1();
    }

    public void HeinekenPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Heineken\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"320\n");
        SumVegosszeg1();
    }

    public void BorsodiPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Borsodi\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"290\n");
        SumVegosszeg1();
    }

    public void CocaPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Coca-Cola\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"450\n");
        SumVegosszeg1();
    }

    public void KőbányaiPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Kőbányai(AKCIÓS)\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"210\n");
        SumVegosszeg1();
    }

    public void FantaPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Fanta\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"450\n");
        SumVegosszeg1();
    }

    public void PepsiPushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Pepsi\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"450\n");
        SumVegosszeg1();
    }

    public void SpritePushed(javafx.event.ActionEvent actionEvent) {
        NevLista.setText(NevLista.getText()+"Sprite\n");
        MennyLista.setText(MennyLista.getText()+"0,5l\n");
        ArLista.setText(ArLista.getText()+"450\n");
        SumVegosszeg1();
    }

    public void SierraRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Sierra Tequila\n");
        MennyLista2.setText(MennyLista2.getText()+"0,7l\n");
        ArLista2.setText(ArLista2.getText()+"4700\n");
        SumVegosszeg2();
    }

    public void HennessyRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Hennessy\n");
        MennyLista2.setText(MennyLista2.getText()+"0,7l\n");
        ArLista2.setText(ArLista2.getText()+"12000\n");
        SumVegosszeg2();
    }

    public void HeinekenRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Heineken\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"180\n");
        SumVegosszeg2();
    }

    public void BorsodiRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Borsodi\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"170\n");
        SumVegosszeg2();
    }

    public void CocaRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Coca-Cola\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"300\n");
        SumVegosszeg2();
    }

    public void KőbányaiRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Kőbányai(AKCIÓS)\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"120\n");
        SumVegosszeg2();
    }

    public void FantaRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Fanta\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"300\n");
        SumVegosszeg2();
    }

    public void PepsiRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Pepsi\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"300\n");
        SumVegosszeg2();
    }

    public void SpriteRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Sprite\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"300\n");
        SumVegosszeg2();
    }

    public void JackRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"JackDaniels\n");
        MennyLista2.setText(MennyLista2.getText()+"1l\n");
        ArLista2.setText(ArLista2.getText()+"11000\n");
        SumVegosszeg2();
    }

    public void AranyRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Aranyalma\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"8000\n");
        SumVegosszeg2();
    }

    public void SosRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Lays Sós chips\n");
        MennyLista2.setText(MennyLista2.getText()+"1 csomag\n");
        ArLista2.setText(ArLista2.getText()+"250\n");
        SumVegosszeg2();
    }

    public void HagymasRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Lays Hagymás chips\n");
        MennyLista2.setText(MennyLista2.getText()+"1 csomag\n");
        ArLista2.setText(ArLista2.getText()+"250\n");
        SumVegosszeg2();
    }

    public void SajtosRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Lays Sajtos chips\n");
        MennyLista2.setText(MennyLista2.getText()+"1 csomag\n");
        ArLista2.setText(ArLista2.getText()+"250\n");
        SumVegosszeg2();
    }

    public void Csatolt3RendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Csapolt sör\n");
        MennyLista2.setText(MennyLista2.getText()+"50l\n");
        ArLista2.setText(ArLista2.getText()+"28000\n");
        SumVegosszeg2();
    }

    public void Csatolt5RendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Csapolt sör\n");
        MennyLista2.setText(MennyLista2.getText()+"50l\n");
        ArLista2.setText(ArLista2.getText()+"28000\n");
        SumVegosszeg2();
    }

    public void Coca33RendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Coca-cola (dob.)\n");
        MennyLista2.setText(MennyLista2.getText()+"0,33l\n");
        ArLista2.setText(ArLista2.getText()+"150\n");
        SumVegosszeg2();
    }

    public void Pepsi33RendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Pepsi (dob.)\n");
        MennyLista2.setText(MennyLista2.getText()+"0,33l\n");
        ArLista2.setText(ArLista2.getText()+"150\n");
        SumVegosszeg2();
    }

    public void CsatosRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Csatos szilva\n");
        MennyLista2.setText(MennyLista2.getText()+"0,5l\n");
        ArLista2.setText(ArLista2.getText()+"3900\n");
        SumVegosszeg2();
    }

    public void RopiRendelPushed(ActionEvent actionEvent) {
        NevLista2.setText(NevLista2.getText()+"Ropi\n");
        MennyLista2.setText(MennyLista2.getText()+"1 csomag\n");
        ArLista2.setText(ArLista2.getText()+"100\n");
        SumVegosszeg2();

    }

    public void RendelButtonPushed(ActionEvent actionEvent) {
        NevLista.setText("");
        MennyLista.setText("");
        ArLista.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Rendelés");
        alert.setHeaderText("A rendelés sikeresen megtörtént.");
        alert.setContentText("Sikeres fizetés után nyomd meg az OK gombot!");
        alert.showAndWait();
        int kassza = Integer.parseInt(OsszegLabel.getText());
        int bevetel = Integer.parseInt(VegosszegLabel.getText());
        int vegleges = kassza+bevetel;
        OsszegLabel.setText(vegleges+"");
        OsszegLabel2.setText(vegleges+"");
        VegosszegLabel.setText("0");


    }

    public void RendelButtonPushed2(ActionEvent actionEvent) {
        NevLista2.setText("");
        MennyLista2.setText("");
        ArLista2.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Beszerzés");
        alert.setHeaderText("A beszerzés sikeresen megtörtént.");
        alert.setContentText("Folytatáshoz nyomd meg az OK gombot!");
        alert.showAndWait();
        int kassza = Integer.parseInt(OsszegLabel2.getText());
        int kiadas = Integer.parseInt(VegosszegLabel2.getText());
        int vegleges = kassza-kiadas;
        OsszegLabel.setText(vegleges+"");
        OsszegLabel2.setText(vegleges+"");
        VegosszegLabel2.setText("0");
    }

    public void ExitDatabase(ActionEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }


}
