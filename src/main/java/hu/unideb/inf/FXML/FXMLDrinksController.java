package hu.unideb.inf.FXML;

import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
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


    public void SumVegosszeg2(){
        String s[] = ArLista2.getText().split("\n");
        int result=0;
        for(int i = 0; i<s.length; i++){
            result+=Integer.parseInt(s[i]);
        }
        VegosszegLabel2.setText(result+"");
    }
    public DrinkDAO db(){
        DrinkDAO dDAO = new JpaDrinkDAO();
        Drink d1 = new Drink("Coca Cola 0.5", 100, 300, 450);
        Drink d2 = new Drink("Pepsi 0.5", 100, 300, 450);
        Drink d3 = new Drink("Sprite", 100, 300, 450);
        Drink d4 = new Drink("Fanta", 100, 300, 450);
        Drink d5 = new Drink("Coca Cola 0.3", 100, 150, 240);
        Drink d6 = new Drink("Pepsi 0.3", 100, 150, 240);
        Drink d7 = new Drink("Kőbányai", 100, 120, 210);
        Drink d8 = new Drink("Heineken", 100, 170, 290);
        Drink d9 = new Drink("Csapolt sör 0.3", 100, 180, 300);
        Drink d10 = new Drink("Csapolt sör 0.5", 100, 28000, 450);
        Drink d11 = new Drink("Hennessy", 100, 12000, 690);
        Drink d12 = new Drink("Sierra tequila", 100, 4700, 650);
        Drink d13 = new Drink("Jack Daniels", 100, 11000, 650);
        Drink d14 = new Drink("Aranyalma", 100, 8000, 580);
        Drink d15 = new Drink("Csatos", 100, 3900, 360);
        Drink d16 = new Drink("Lays-Sos", 100, 250, 400);
        Drink d17 = new Drink("Lays-Hagy", 100, 250, 400);
        Drink d18 = new Drink("Lays-Sajt", 100, 250, 400);
        Drink d19 = new Drink("Ropi", 100, 100, 210);
        Drink d20 = new Drink("Borsodi", 100, 170,300);

        dDAO.saveDrink(d1);
        dDAO.saveDrink(d2);
        dDAO.saveDrink(d3);
        dDAO.saveDrink(d4);
        dDAO.saveDrink(d5);
        dDAO.saveDrink(d6);
        dDAO.saveDrink(d7);
        dDAO.saveDrink(d8);
        dDAO.saveDrink(d9);
        dDAO.saveDrink(d10);
        dDAO.saveDrink(d11);
        dDAO.saveDrink(d12);
        dDAO.saveDrink(d13);
        dDAO.saveDrink(d14);
        dDAO.saveDrink(d15);
        dDAO.saveDrink(d16);
        dDAO.saveDrink(d17);
        dDAO.saveDrink(d18);
        dDAO.saveDrink(d19);
        dDAO.saveDrink(d20);
        return dDAO;
    }
    DrinkDAO d = db();

    public void rendel(String s){
        for(Drink dd : d.getDrinks()){
            if(dd.getName() == s){
                NevLista.setText(NevLista.getText()+dd.getName()+"\n");
                MennyLista.setText(MennyLista.getText()+dd.getQuantity()+"\n");
                ArLista.setText(ArLista.getText()+dd.getSellPrice()+"\n");
                dd.setQuantity(dd.getQuantity()-1);
                d.updateDrink(dd);
            }
        }
        SumVegosszeg1();

    }
    public void HagymasPushed() {
        rendel("Lays-Hagy");
    }

    public void SosPushed() {
        rendel("Lays-Sos");
    }

    public void SajtosPushed() {
        rendel("Lays-Sajt");
    }

    public void Csatolt3Pushed() {
        rendel("Csapolt sör 0.3");
    }

    public void Csatolt5Pushed() {
        rendel("Csapolt sör 0.5");
    }

    public void Coca33Pushed() {
        rendel("Coca Cola 0.3");
    }

    public void Pepsi33Pushed() {
        rendel("Pepsi 0.3");
    }

    public void CsatosPushed() {
        rendel("Csatos");
    }

    public void RopiPushed() {
        rendel("Ropi");
    }

    public void JackPushed() {
        rendel("Jack Daniels");
    }

    public void AranyPushed() {
        rendel("Aranyalma");
    }

    public void SierraPushed() {
        rendel("Sierra tequila");
    }

    public void HennessyPushed() {
        rendel("Hennessy");
    }

    public void HeinekenPushed() {
        rendel("Heineken");
    }

    public void BorsodiPushed() {
        rendel("Borsodi");
    }

    public void CocaPushed() {
        rendel("Coca Cola 0.5");
    }

    public void KőbányaiPushed() {
        rendel("Kőbányai");
    }

    public void FantaPushed() {
        rendel("Fanta");
    }

    public void PepsiPushed() {
        rendel("Pepsi 0.5");
    }

    public void SpritePushed() {
        rendel("Sprite");
    }

    public void rendel2(String s){
        for(Drink dd : d.getDrinks()){
            if(dd.getName() == s){
                NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                ArLista2.setText(ArLista2.getText()+dd.getOrderPrice()+"\n");
                dd.setQuantity(dd.getQuantity()+1);
                d.updateDrink(dd);
            }
        }
        SumVegosszeg2();
    }
    public void SierraRendelPushed(ActionEvent actionEvent) {
        rendel2("Sierra tequila");
    }

    public void HennessyRendelPushed(ActionEvent actionEvent) {
        rendel2("Hennessy");
    }

    public void HeinekenRendelPushed(ActionEvent actionEvent) {
        rendel2("Heineken");
    }

    public void BorsodiRendelPushed(ActionEvent actionEvent) {
        rendel2("Borsodi");
    }

    public void CocaRendelPushed(ActionEvent actionEvent) {
        rendel2("Coca Cola 0.5");
    }

    public void KőbányaiRendelPushed(ActionEvent actionEvent) {
        rendel2("Kőbányai");
    }

    public void FantaRendelPushed(ActionEvent actionEvent) {
        rendel2("Fanta");
    }

    public void PepsiRendelPushed(ActionEvent actionEvent) {
        rendel2("Pepsi 0.5");
    }

    public void SpriteRendelPushed(ActionEvent actionEvent) {
        rendel2("Sprite");
    }

    public void JackRendelPushed(ActionEvent actionEvent) {
        rendel2("Jack Daniels");
    }

    public void AranyRendelPushed(ActionEvent actionEvent) {
        rendel2("Aranyalma");
    }

    public void SosRendelPushed(ActionEvent actionEvent) {
        rendel2("Lays-Sos");
    }

    public void HagymasRendelPushed(ActionEvent actionEvent) {
        rendel2("Lays-Hagy");
    }

    public void SajtosRendelPushed(ActionEvent actionEvent) {
        rendel2("Lays-Sajt");
    }

    public void Csatolt3RendelPushed(ActionEvent actionEvent) {
        rendel2("Csapolt sör 0.3");
    }

    public void Csatolt5RendelPushed(ActionEvent actionEvent) {
        rendel2("Csapolt sör 0.5");
    }

    public void Coca33RendelPushed(ActionEvent actionEvent) {
        rendel2("Coca Cola 0.3");
    }

    public void Pepsi33RendelPushed(ActionEvent actionEvent) {
        rendel2("Pepsi 0.3");
    }

    public void CsatosRendelPushed(ActionEvent actionEvent) {
        rendel2("Csatos");
    }

    public void RopiRendelPushed(ActionEvent actionEvent) {
        rendel2("Ropi");

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
