package models;

import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class PersonModel {

    public void create(Person person) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting person creation transaction");
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            System.out.println("Person created successfully!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error creating person: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Person creation transaction completed");
        }
    }

    public void update(Person person) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting person update transaction");
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
            System.out.println("Person updated successfully!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error updating person: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Person update transaction completed");
        }
    }

    public void delete(Person person) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting person delete transaction");
            em.getTransaction().begin();
            Person managedPerson = em.find(Person.class, person.getId());
            if (managedPerson != null) {
                em.remove(managedPerson);
                em.getTransaction().commit();
                System.out.println("Person deleted successfully!");
            } else {
                System.out.println("Person not found for deletion");
                em.getTransaction().rollback();
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error deleting person: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Person delete transaction completed");
        }
    }

    public Person findById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        Person person = null;

        try {
            person = em.find(Person.class, id);
            if (person != null) {
                System.out.println("Person found: " + person);
            } else {
                System.out.println("Person not found with ID: " + id);
            }
        } catch (Exception e) {
            System.err.println("Error finding person: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return person;
    }

    public List<Person> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        List<Person> persons = new ArrayList<>();

        try {
            TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
            persons = query.getResultList();
            System.out.println("Found " + persons.size() + " persons");
        } catch (Exception e) {
            System.err.println("Error finding all persons: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return persons;
    }
}
