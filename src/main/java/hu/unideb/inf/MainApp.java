package hu.unideb.inf;

import hu.unideb.inf.model.Drink;
import hu.unideb.inf.model.DrinkDAO;
import hu.unideb.inf.model.Drinks;
import hu.unideb.inf.model.*;
import javafx.application.Application;
import org.h2.tools.Server;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLDrinks.fxml"));
        Scene scene = new Scene(loader.load());
        ((FXMLDrinksController)loader.getController()).setModel(new Drinks());
        stage.setTitle("Students Register");
        stage.setScene(scene);
        stage.show();
        /*Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();*/
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        launch(args);
        startDatabase();

        try(DrinkDAO dDAO = new JpaDrinkDAO())
        {
            Drink d = new Drink();
            d.setName("Coca Cola");
            d.setOrderPrice(150);
            d.setSellPrice(250);
            d.setQuantity(10);

            dDAO.saveDrink(d);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("JDBC URL: jdbc:h2:mem:my_database");
        System.out.println("User Name: sa");
        System.out.println("Password: ");

    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
    }


