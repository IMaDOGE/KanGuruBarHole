package hu.unideb.inf.FXML;

import hu.unideb.inf.MainApp;
import hu.unideb.inf.entity.Drink;
import hu.unideb.inf.interfaces.DrinkDAO;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.JpaDAO.JpaDrinkDAO;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import hu.unideb.inf.JpaDAO.JpaUserDAO;
import hu.unideb.inf.entity.User;
import hu.unideb.inf.property.Users;
import javafx.scene.image.Image;
import javafx.scene.layout.TilePane;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static hu.unideb.inf.FXML.FXMLLoginController.*;
import static hu.unideb.inf.FXML.FXMLNewDrinks2Controller.osszeg2;


public class FXMLNewDrinksController {
    private Drinks drinks;

    DrinkDAO drinkek = new JpaDrinkDAO();
    public static int bevetel;
    public void setModel(Drinks drinks) {
        this.drinks = drinks;
        Dolgozo.setText("Bejelentkezve: "+aktivuser.getFirstName()+aktivuser.getLastName());
        if(aktivuser.getLastName().equals("Admin")){
            SzerkesztButton.setVisible(true);
        }
        else{
            SzerkesztButton.setVisible(false);
        }
        DrinkDAO drink = new JpaDrinkDAO();
        List<Drink> dri= drink.getDrinks();
        for (Drink d: dri) {
            if(d.getName().charAt(0)=='*'){
            ComboBox.getItems().add(d.getName());
            }
        }
        OsszegLabel.setText(osszeg2+"");

    }
    @FXML
    public TextArea MennyLista;

    @FXML
    private Button LogoutButton;

    @FXML
    public TextArea MennyLista2;

    @FXML
    public TextArea NevLista;

    @FXML
    private TextArea NevLista2;
    @FXML
    public TextArea ArLista;

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
    private TextArea ListaBox;

    @FXML
    public Label OsszegLabel;

    @FXML
    private Button Pepsi33Button;

    @FXML
    private Button PepsiButton;

    @FXML
    private Button PepsiButton2;

    @FXML
    private Button RendelButton;


    @FXML
    private Button RopiButton;

    @FXML
    private Button SajtosButton;

    @FXML
    private Button SierraButton;


    @FXML
    private Button SpriteButton;



    @FXML
    private Button hagymasButton;

    @FXML
    private Button sosButton;

    @FXML
    private Button SzerkesztButton;

    @FXML
    private Label Dolgozo;

    @FXML
    public Label VegosszegLabel;




    public void SumVegosszeg1(){
        String arak[] = ArLista.getText().split("\n");
        int result=0;
        for(int i = 0; i<arak.length; i++){
            result+=Integer.parseInt(arak[i]);
        }
        VegosszegLabel.setText(""+result);

    }



    /*public int aktiv(){

        for(User users : Loginu.getUsers()){
            System.out.println(users.getUsername()+users.getLastName()+users.isActive());
            if(users.isActive()){
                Dolgozo.setText("Bejelentkezve:"+users.getFirstName()+" "+users.getLastName());
            }
        }
        return 0;
    }*/
    /*public static DrinkDAO db(){
        //aktiv();
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
    }*/
    //int i = aktiv();
    public void rendel(String s){
        DrinkDAO ddao = new JpaDrinkDAO();
        List<Drink> drink = ddao.getDrinks();
        for (Drink drinksss: drink) {
            System.out.println(drinksss.getName()+" "+drinksss.getQuantity()+" "+drinksss.getSellPrice());
        }
        for(Drink dd : drink){
            if(dd.getName().equals(s)){
                NevLista.setText(NevLista.getText()+dd.getName()+"\n");
                MennyLista.setText(MennyLista.getText()+dd.getQuantity()+"\n");
                ArLista.setText(ArLista.getText()+dd.getSellPrice()+"\n");
                bevetel+=dd.getSellPrice()-dd.getOrderPrice();
                dd.setQuantity(dd.getQuantity()-1);
                ddao.updateDrink(dd);
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

    static int osszeg;
    public static boolean returnvalue;
    public void RendelButtonPushed(ActionEvent actionEvent) throws IOException {
        /*FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLInfo.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) RendelButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(600);
        stage.showAndWait();*/
        NevLista.setText("");
        MennyLista.setText("");
        ArLista.setText("");

            int kassza = Integer.parseInt(OsszegLabel.getText());
            int bevetel = Integer.parseInt(VegosszegLabel.getText());
            int vegleges = kassza + bevetel;
            OsszegLabel.setText(vegleges + "");
            VegosszegLabel.setText("0");
            osszeg = vegleges;

    }


    public void RendelesButtonPushed(ActionEvent actionEvent) throws IOException {
        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan tovább lépsz a beszerzés módba?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLNewDrinks2.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(loader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
                ImageCursor cursor = new ImageCursor(img, 30, 30);
                scene.setCursor(cursor);
                ((FXMLNewDrinks2Controller) loader.getController()).setModel(new Drinks());
                Stage stage = (Stage) LogoutButton.getScene().getWindow();
                stage.setTitle("KanGuruBarHole");
                stage.setScene(scene);
                stage.setHeight(840);
                stage.setWidth(1550);
                stage.show();
                stage.setOnCloseRequest(event -> {
                    System.out.println("GUI bezarva");
                    Platform.exit();
                    System.exit(0);
                });
            }
        });
    }
    public void ExitDatabase(ActionEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }

    public void SzerkesztButtonPushed(ActionEvent actionEvent) throws IOException {
        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan tovább lépsz a szerkesztés módba?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLEditing.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(loader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
                ImageCursor cursor = new ImageCursor(img, 30, 30);
                scene.setCursor(cursor);
                Stage stage = (Stage) LogoutButton.getScene().getWindow();
                stage.setTitle("Bejelentkezés");
                stage.setScene(scene);
                stage.show();
            }
        });
    }



    public void LogoutButtonPushed(ActionEvent actionEvent) throws IOException {

        ButtonType tovabb = new ButtonType("Tovább");
        ButtonType megse = new ButtonType("Mégse");
        Alert a = new Alert(Alert.AlertType.NONE, "Folytatáshoz válassz:", tovabb, megse);
        a.setTitle("Megerősítés");
        a.setHeaderText("Biztosan ki szeretnél jelentkezni?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == tovabb) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                Date date = new Date();
                fin.setEndSession(formatter.format(date));
                fin.setGrossIncome(bevetel);
                fin.setNetIncome((int)(bevetel/1.27));
                fin.setMoneyAfterSession(Integer.parseInt(OsszegLabel.getText()));
                f.updateFinance(fin);
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLInfo.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(loader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
                ImageCursor cursor = new ImageCursor(img, 30, 30);
                scene.setCursor(cursor);
                Stage stage = (Stage) LogoutButton.getScene().getWindow();
                stage.setTitle("Bejelentkezés");
                stage.setScene(scene);
                stage.show();
                stage.setOnCloseRequest(event -> {
                    System.out.println("GUI bezarva");
                    Platform.exit();
                    System.exit(0);
                });
            }
        });
    }


    @FXML
    private ComboBox<String> ComboBox;

    public void HozzaadButtonClicked(ActionEvent actionEvent) {
        rendel(ComboBox.getValue());
    }
}
