package hu.unideb.inf.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaDrinkDAO implements DrinkDAO
{
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");

    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveDrink(Drink d)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(d);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteDrink(Drink d)
    {
        entityManager.getTransaction().begin();
        entityManager.remove(d);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateDrink(Drink d)
    {
        saveDrink(d);
    }

    @Override
    public List<Drink> getDrinks() {
        TypedQuery<Drink> query = entityManager.createQuery(
                "SELECT d FROM Drink d", Drink.class);
        List<Drink> drinks = query.getResultList();
        return drinks;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}

