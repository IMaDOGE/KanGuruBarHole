package hu.unideb.inf;

import hu.unideb.inf.FXML.FXMLLoginController;
import hu.unideb.inf.property.Users;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.ImageCursor;
import javafx.scene.image.Image;
import org.h2.tools.Server;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

import static com.sun.glass.ui.Cursor.setVisible;


public class MainApp extends Application {

    public void start(Stage stage) throws SQLException, IOException {
        startDatabase();

            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogin.fxml"));
            Scene scene = new Scene(loader.load());
            Image img = new Image(getClass().getResourceAsStream("/Pictures/cursor.png"));
            ImageCursor cursor = new ImageCursor(img, 30, 30);
            scene.setCursor(cursor);
            ((FXMLLoginController) loader.getController()).setModel(new Users());
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
        System.out.println("Az adatbazis elerheto az alabbi linken: http://localhost:8082/");

//        System.out.println("Open your browser and navigate to http://localhost:8082/");
//        System.out.println("JDBC URL: jdbc:h2:mem:my_database");
//        System.out.println("User Name: sa");
//        System.out.println("Password: ");

    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}



