package hu.unideb.inf.FXML;

import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static hu.unideb.inf.FXML.FXMLLoginController.f;
import static hu.unideb.inf.FXML.FXMLLoginController.fin;
import static hu.unideb.inf.FXML.FXMLNewDrinksController.bevetel;
import static hu.unideb.inf.FXML.FXMLNewDrinksController.osszeg;

public class FXMLNewDrinks2Controller {
    public void setModel(Drinks drinks) {
        OsszegLabel2.setText(osszeg+"");
    }
    @FXML
    private TextArea ArLista2;

    @FXML
    private Button AranyalmaRendelButton;

    @FXML
    private Button BorsodiRendelButton;

    @FXML
    private Button Coca33RendelButton;

    @FXML
    private Button CocaRendelButton;

    @FXML
    private Button Csapolt3RendelButton;

    @FXML
    private Button Csapolt5RendelButton;

    @FXML
    private Button CsatosRendelButton;

    @FXML
    private Button DBExiting;

    @FXML
    private Label Dolgozo;

    @FXML
    private Button FantaRendelButton;

    @FXML
    private Button HeinekenRendelButton;

    @FXML
    private Button HennessyRendelButton;

    @FXML
    private Button JackRendelButton;

    @FXML
    private Label KasszaLabel;

    @FXML
    private Label KasszaLabel2;

    @FXML
    private Button KobanyaiRendelButton;

    @FXML
    private Button LogoutButton;

    @FXML
    private TextArea MennyLista2;

    @FXML
    private TextArea NevLista2;

    @FXML
    private Label OsszegLabel2;

    @FXML
    private Button Pepsi33RendelButton;

    @FXML
    private Button PepsiRendelButton;

    @FXML
    private Button RendelButton2;

    @FXML
    private Button RopiRendelButton;

    @FXML
    private Button SajtosRendelButton;

    @FXML
    private Button SierraRendelButton;

    @FXML
    private Button SpriteRendelButton;

    @FXML
    private Button SzerkesztButton;

    @FXML
    private Button VasarButton;

    @FXML
    private Label VegosszegLabel2;

    @FXML
    private Button hagymasRendelButton;

    @FXML
    private Button sosRendelButton;


    public void SumVegosszeg2(){


        String s[] = ArLista2.getText().split("\n");
        int result=0;
        for(int i = 0; i<s.length; i++){
            result+=Integer.parseInt(s[i]);
        }
        VegosszegLabel2.setText(result+"");
    }

    public void rendel2(String s){

        DrinkDAO ddao = new JpaDrinkDAO();
        for(Drink dd : ddao.getDrinks()){
            if(dd.getName().equals(s)){
                if(s.equals("Csapolt sör 0.3")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*166)+"\n");
                    dd.setQuantity(dd.getQuantity()+166);
                    ddao.updateDrink(dd);
                }
                if(s.equals("Csapolt sör 0.5")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*100)+"\n");
                    dd.setQuantity(dd.getQuantity()+100);
                    ddao.updateDrink(dd);

                }
                if(s.equals("Hennessy")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                    dd.setQuantity(dd.getQuantity()+20);
                    ddao.updateDrink(dd);

                }
                if(s.equals("Sierra tequila")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                    dd.setQuantity(dd.getQuantity()+20);
                    ddao.updateDrink(dd);

                }
                if(s.equals("Jack Daniels")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                    dd.setQuantity(dd.getQuantity()+20);
                    ddao.updateDrink(dd);

                }
                if(s.equals("Aranyalma")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                    dd.setQuantity(dd.getQuantity()+20);
                    ddao.updateDrink(dd);

                }
                if(s.equals("Csatos")){
                    NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                    MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                    ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                    dd.setQuantity(dd.getQuantity()+20);
                    ddao.updateDrink(dd);

                }
                NevLista2.setText(NevLista2.getText()+dd.getName()+"\n");
                MennyLista2.setText(MennyLista2.getText()+dd.getQuantity()+"\n");
                ArLista2.setText(ArLista2.getText()+(dd.getOrderPrice()*20)+"\n");
                dd.setQuantity(dd.getQuantity()+1);
                ddao.updateDrink(dd);
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
    static int osszeg2;
    public void RendelButtonPushed2(ActionEvent actionEvent) throws IOException {
        /*FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLInfo.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) RendelButton2.getScene().getWindow();
        stage.setTitle("KanGuruBarHole");
        stage.setScene(scene);
        stage.showAndWait();*/

        NevLista2.setText("");
        MennyLista2.setText("");
        ArLista2.setText("");
        int kassza = Integer.parseInt(OsszegLabel2.getText());
        int kiadas = Integer.parseInt(VegosszegLabel2.getText());
        int vegleges = kassza-kiadas;
        OsszegLabel2.setText(vegleges+"");
        VegosszegLabel2.setText("0");
        osszeg2=vegleges;
    }

    public void ExitDatabase(ActionEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }


    public void SzerkesztButtonPushed(ActionEvent actionEvent) {

        // szerkesztés...
    }

    public void LogoutButtonPushed(ActionEvent actionEvent) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date date = new Date();
        fin.setEndSession(formatter.format(date));
        fin.setGrossIncome(bevetel);
        fin.setNetIncome((int)(bevetel/1.27));
        fin.setMoneyAfterSession(Integer.parseInt(OsszegLabel2.getText()));
        f.updateFinance(fin);

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLInfo.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        Stage stage = (Stage) LogoutButton.getScene().getWindow();
        stage.setTitle("Bejelentkezés");
        stage.setScene(scene);
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

    public void VasarButtonPushed(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLNewDrinks.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        ((FXMLNewDrinksController) loader.getController()).setModel(new Drinks());
        Stage stage = (Stage) LogoutButton.getScene().getWindow();
        stage.setTitle("KanGuruBarHole");
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
