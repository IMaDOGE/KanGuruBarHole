package hu.unideb.inf.model;

import java.util.List;

public interface DrinkDAO extends AutoCloseable
{
    public void saveDrink(Drink d);
    public void deleteDrink(Drink d);
    public void updateDrink(Drink d);
    public List<Drink> getDrinks();
}
