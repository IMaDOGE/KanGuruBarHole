package hu.unideb.inf.FXML;

import hu.unideb.inf.JpaDAO.JpaFinanceDAO;
import hu.unideb.inf.entity.Finance;
import hu.unideb.inf.entity.User;
import hu.unideb.inf.JpaDAO.JpaUserDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.interfaces.FinanceDAO;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FXMLLoginController {
    private Users user;
    public void setModel(Users u) {

        this.user = u;
        users = new JpaUserDAO();
        userlist=users.getUsers();
    }

    /*public static UserDAO db(){
        UserDAO u = new JpaUserDAO();
        User user1 = new User("Admin","","admin", "admin");
        u.saveUser(user1);
        return u;
    }*/

    //static UserDAO u = db();

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField PasswordText;

    @FXML
    private TextField UsernameText;

    @FXML
    private TextField wait;
    @FXML
    private Button RegButton;

    @FXML
    private Label ErrorText;
    static User aktivuser;


    public static FinanceDAO f = new JpaFinanceDAO();

    public static Finance fin = new Finance();

    public static UserDAO users;
    public static List<User> userlist;

    @FXML
    void LoginButtonPressed() throws IOException {

        for(User us : userlist){
            if(UsernameText.getText().equals(us.getUsername()) && PasswordText.getText().equals(us.getPasswd())){
                wait.setText("Kérlek várj...");
                aktivuser=us;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                Date date = new Date();
                System.out.println(formatter.format(date));
                fin.setStartSession(formatter.format(date));
                fin.setUser(aktivuser.getFirstName()+" "+aktivuser.getLastName());
                fin.setMoneyBeforeSession(0);
                f.updateFinance(fin);
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLNewDrinks.fxml"));
                Scene scene = new Scene(loader.load());
                ((FXMLNewDrinksController) loader.getController()).setModel(new Drinks());
                Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
                ImageCursor cursor = new ImageCursor(img, 30, 30);
                scene.setCursor(cursor);
                Stage stage = (Stage) LoginButton.getScene().getWindow();
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
            else{
                ErrorText.setText("Felhasználónév vagy jelszó hibás!");
            }
        }


        //UserDAO user = new JpaUserDAO();
        //User u1 = new User("Admin","Admin1");
        //for (User us : user.getUsers()){
        //if(us.getUsername()==UsernameText.getText() && us.getPasswd()==PasswordText.getText()){

        //}
        //}

    }

    public void RegButtonPressed(ActionEvent actionEvent) throws IOException {
        wait.setText("Kérlek várj...");

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLRegistration.fxml"));
        Scene scene = new Scene(loader.load());
        Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
        ImageCursor cursor = new ImageCursor(img, 30, 30);
        scene.setCursor(cursor);
        ((FXMLRegistrationController) loader.getController()).setModel(new Users());
        Stage stage = (Stage) RegButton.getScene().getWindow();
        stage.setTitle("Registration");
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

    public void ExitButtonPressed(ActionEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }


}
