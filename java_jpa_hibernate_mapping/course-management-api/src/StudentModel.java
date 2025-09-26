package models;

import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentModel {

    private static final String PERSISTENCE_UNIT_NAME = "course-management-jpa";

    public void create(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting transaction");
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            System.out.println("Student created successfully!!!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error creating student!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Ending transaction");
        }
    }

    public Student findById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        Student student = null;

        try {
            student = em.find(Student.class, id);
            if (student != null) {
                System.out.println("Student found: " + student);
            } else {
                System.out.println("Student with ID " + id + " not found");
            }
        } catch (Exception e) {
            System.err.println("Error finding student!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return student;
    }

    public List<Student> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        List<Student> students = null;

        try {
            TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s", Student.class);
            students = query.getResultList();
            System.out.println("Found " + students.size() + " students");
        } catch (Exception e) {
            System.err.println("Error finding all students!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }

        return students;
    }

    public void update(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting update transaction");
            em.getTransaction().begin();
            Student managedStudent = em.find(Student.class, student.getId());
            if (managedStudent != null) {
                managedStudent.setFirstName(student.getFirstName());
                managedStudent.setLastName(student.getLastName());
                managedStudent.setEmail(student.getEmail());
                em.merge(managedStudent);
                em.getTransaction().commit();
                System.out.println("Student updated successfully!!!");
            } else {
                em.getTransaction().rollback();
                System.out.println("Student not found for update");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error updating student!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Ending update transaction");
        }
    }

    public void delete(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Starting delete transaction");
            em.getTransaction().begin();
            Student managedStudent = em.find(Student.class, student.getId());
            if (managedStudent != null) {
                em.remove(managedStudent);
                em.getTransaction().commit();
                System.out.println("Student deleted successfully!!!");
            } else {
                em.getTransaction().rollback();
                System.out.println("Student not found for deletion");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error deleting student!!! " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            System.out.println("Ending delete transaction");
        }
    }
}
