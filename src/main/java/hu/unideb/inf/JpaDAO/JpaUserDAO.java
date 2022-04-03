package hu.unideb.inf.JpaDAO;

import hu.unideb.inf.entity.User;
import hu.unideb.inf.interfaces.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaUserDAO implements UserDAO {

        private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");

        private final EntityManager entityManager = entityManagerFactory.createEntityManager();

        @Override
        public void saveUser(User u)
        {
            entityManager.getTransaction().begin();
            entityManager.persist(u);
            entityManager.getTransaction().commit();
        }

        @Override
        public void deleteUser(User u)
        {
            entityManager.getTransaction().begin();
            entityManager.remove(u);
            entityManager.getTransaction().commit();
        }

        @Override
        public void updateUser(User u)
        {
            saveUser(u);
        }

        @Override
        public List<User> getUsers()
        {
            TypedQuery<User> query = entityManager.createQuery(
                    "SELECT u FROM User u", User.class);
            return query.getResultList();
        }

        @Override
        public void close()
        {
            entityManager.close();
            entityManagerFactory.close();
        }
}


