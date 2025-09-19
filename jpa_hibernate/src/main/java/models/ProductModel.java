package models;

import entities.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    public void create(Product p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting transaction");
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Product created successfully!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error creating product: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Transaction completed");
        }
    }

    public void update(Product p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting update transaction");
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            System.out.println("Product updated successfully!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error updating product: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Update transaction completed");
        }
    }

    public void delete(Product p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting delete transaction");
            em.getTransaction().begin();
            Product managedProduct = em.find(Product.class, p.getId());
            if (managedProduct != null) {
                em.remove(managedProduct);
                em.getTransaction().commit();
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("Product not found for deletion");
                em.getTransaction().rollback();
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error deleting product: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Delete transaction completed");
        }
    }

    public Product findById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        Product product = null;

        try {
            product = em.find(Product.class, id);
            if (product != null) {
                System.out.println("Product found: " + product);
            } else {
                System.out.println("Product not found with ID: " + id);
            }
        } catch (Exception e) {
            System.err.println("Error finding product: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return product;
    }

    public List<Product> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        List<Product> products = new ArrayList<>();

        try {
            TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p", Product.class);
            products = query.getResultList();
            System.out.println("Found " + products.size() + " products");
        } catch (Exception e) {
            System.err.println("Error finding all products: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return products;
    }
}
