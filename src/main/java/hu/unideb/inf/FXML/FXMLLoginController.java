package hu.unideb.inf.FXML;

import hu.unideb.inf.entity.User;
import hu.unideb.inf.JpaDAO.JpaUserDAO;
import hu.unideb.inf.interfaces.UserDAO;
import hu.unideb.inf.MainApp;
import hu.unideb.inf.property.Drinks;
import hu.unideb.inf.property.Users;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLLoginController {
    private Users user;
    public void setModel(Users u) {
        this.user = u;
    }

    public UserDAO db(){
        UserDAO u = new JpaUserDAO();
        User user1 = new User("Admin1", "Admin1");
        User user2 = new User("Admin2","Admin2");

        u.saveUser(user1);
        u.saveUser(user2);

        return u;

    }

    UserDAO u = db();

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField PasswordText;

    @FXML
    private TextField UsernameText;

    @FXML
    private TextField wait;

    @FXML
    void LoginButtonPressed() throws IOException {

        wait.setText("Kérlek várj...");

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLDrinks.fxml"));
        Scene scene = new Scene(loader.load());
        ((FXMLDrinksController) loader.getController()).setModel(new Drinks());
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
        //UserDAO user = new JpaUserDAO();
        //User u1 = new User("Admin","Admin1");
        //for (User us : user.getUsers()){
        //if(us.getUsername()==UsernameText.getText() && us.getPasswd()==PasswordText.getText()){

        //}
        //}

    }

}
