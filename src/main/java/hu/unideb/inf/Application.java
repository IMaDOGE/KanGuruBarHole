package hu.unideb.inf;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hu.unideb.inf.model.*;
import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
//        startDatabase();
//
//        try(DrinkDAO dDAO = new JpaDrinkDAO())
//        {
//            Drink d = new Drink();
//            d.setName("Coca Cola");
//            d.setOrderPrice(150);
//            d.setSellPrice(250);
//            d.setQuantity(10);
//
//            dDAO.saveDrink(d);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        System.out.println("Open your browser and navigate to http://localhost:8082/");
//        System.out.println("JDBC URL: jdbc:h2:mem:my_database");
//        System.out.println("User Name: sa");
//        System.out.println("Password: ");

    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
