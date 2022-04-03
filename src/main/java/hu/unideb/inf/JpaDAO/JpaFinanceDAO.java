package hu.unideb.inf.JpaDAO;

import hu.unideb.inf.entity.Finance;
import hu.unideb.inf.interfaces.FinanceDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaFinanceDAO implements FinanceDAO
{
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");

    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveFinance(Finance f)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(f);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteFinance(Finance f)
    {
        entityManager.getTransaction().begin();
        entityManager.remove(f);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateFinance(Finance f)
    {
        saveFinance(f);
    }

    @Override
    public List<Finance> getFinances() {
        TypedQuery<Finance> query = entityManager.createQuery(
                "SELECT f FROM Finance f", Finance.class);
        return query.getResultList();
    }

    @Override
    public void close()
    {
        entityManager.close();
        entityManagerFactory.close();
    }
}
