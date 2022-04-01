package hu.unideb.inf;

import hu.unideb.inf.model.Drink;
import hu.unideb.inf.model.DrinkDAO;
import hu.unideb.inf.model.Drinks;
import hu.unideb.inf.model.*;
import javafx.application.Application;
import javafx.application.Platform;
import org.h2.tools.Server;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;


public class MainApp extends Application {

    public void start(Stage stage) throws SQLException {
        startDatabase();

        try (DrinkDAO dDAO = new JpaDrinkDAO()) {

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
            Drink d11 = new Drink("Henessy", 100, 12000, 690);
            Drink d12 = new Drink("Sierra tequilla", 100, 4700, 650);
            Drink d13 = new Drink("Jack Daniels", 100, 11000, 650);
            Drink d14 = new Drink("Aranyalma", 100, 8000, 580);
            Drink d15 = new Drink("Csatos", 100, 3900, 360);
            Drink d16 = new Drink("Lays-Só", 100, 250, 400);
            Drink d17 = new Drink("Lays-Hagy", 100, 250, 400);
            Drink d18 = new Drink("Lays-Sajt", 100, 250, 400);
            Drink d19 = new Drink("Ropi", 100, 100, 210);

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

            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLDrinks.fxml"));
            Scene scene = new Scene(loader.load());
            ((FXMLDrinksController) loader.getController()).setModel(new Drinks());
            stage.setTitle("Students Register");
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                System.out.println("GUI bezarva");
                Platform.exit();
                System.exit(0);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

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



