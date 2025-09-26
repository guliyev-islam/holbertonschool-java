package models;

import entities.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CourseModel {

    private static final String PERSISTENCE_UNIT_NAME = "course-management-jpa";

    public void create(Course course) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting course creation transaction");
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
            System.out.println("Course created successfully!!!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error creating course!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Ending course creation transaction");
        }
    }

    public Course findById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        Course course = null;

        try {
            course = em.find(Course.class, id);
            if (course != null) {
                System.out.println("Course found: " + course);
            } else {
                System.out.println("Course with ID " + id + " not found");
            }
        } catch (Exception e) {
            System

// update
