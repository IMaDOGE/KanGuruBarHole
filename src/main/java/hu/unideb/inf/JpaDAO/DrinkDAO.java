package hu.unideb.inf.JpaDAO;

import hu.unideb.inf.entity.Drink;

import java.util.List;

public interface DrinkDAO extends AutoCloseable
{
    void saveDrink(Drink d);
    void deleteDrink(Drink d);
    void updateDrink(Drink d);
    List<Drink> getDrinks();
}
