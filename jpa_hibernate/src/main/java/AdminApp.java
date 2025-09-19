package demo;

import entities.Person;
import entities.Product;
import models.PersonModel;
import models.ProductModel;

import java.time.LocalDate;
import java.util.List;

public class AdminApp {

    public static void main(String[] args) {
        System.out.println("=== Admin Application Started ===");
        
        ProductModel productModel = new ProductModel();
        PersonModel personModel = new PersonModel();

        System.out.println("\n=== TESTING PRODUCT OPERATIONS ===");
        
        Product p1 = new Product();
        p1.setName("TV");
        p1.setPrice(300.0);
        p1.setQuantity(100);
        p1.setStatus(true);
        productModel.create(p1);

        Product p2 = new Product();
        p2.setName("Smartphone");
        p2.setPrice(500.0);
        p2.setQuantity(50);
        p2.setStatus(true);
        productModel.create(p2);

        Product p3 = new Product();
        p3.setName("Laptop");
        p3.setPrice(1200.0);
        p3.setQuantity(25);
        p3.setStatus(false);
        productModel.create(p3);

        List<Product> products = productModel.findAll();
        System.out.println("Number of products found: " + products.size());
        for (Product product : products) {
            System.out.println("Product: " + product);
        }

        if (!products.isEmpty()) {
            Long firstProductId = products.get(0).getId();
            Product foundProduct = productModel.findById(firstProductId);
            
            if (foundProduct != null) {
                foundProduct.setPrice(350.0);
                foundProduct.setQuantity(90);
                productModel.update(foundProduct);
            }
        }

        System.out.println("\n=== TESTING PERSON OPERATIONS ===");
        
        Person person1 = new Person();
        person1.setName("João Silva");
        person1.setEmail("joao.silva@email.com");
        person1.setAge(30);
        person1.setCpf("123.456.789-00");
        person1.setBirthDate(LocalDate.of(1993, 5, 15));
        personModel.create(person1);

        Person person2 = new Person();
        person2.setName("Maria Santos");
        person2.setEmail("maria.santos@email.com");
        person2.setAge(25);
        person2.setCpf("987.654.321-00");
        person2.setBirthDate(LocalDate.of(1998, 12, 20));
        personModel.create(person2);

        Person person3 = new Person();
        person3.setName("Pedro Oliveira");
        person3.setEmail("pedro.oliveira@email.com");
        person3.setAge(35);
        person3.setCpf("456.789.123-00");
        person3.setBirthDate(LocalDate.of(1988, 8, 10));
        personModel.create(person3);

        List<Person> persons = personModel.findAll();
        System.out.println("Number of persons found: " + persons.size());
        for (Person person : persons) {
            System.out.println("Person: " + person);
        }

        if (!persons.isEmpty()) {
            Long firstPersonId = persons.get(0).getId();
            Person foundPerson = personModel.findById(firstPersonId);
            
            if (foundPerson != null) {
                foundPerson.setAge(31);
                foundPerson.setEmail("joao.silva.updated@email.com");
                personModel.update(foundPerson);
            }
        }

        System.out.println("\n=== TESTING DELETE OPERATIONS ===");
        
        products = productModel.findAll();
        persons = personModel.findAll();
        
        if (!products.isEmpty()) {
            Product lastProduct = products.get(products.size() - 1);
            System.out.println("Deleting product: " + lastProduct.getName());
            productModel.delete(lastProduct);
        }
        
        if (!persons.isEmpty()) {
            Person lastPerson = persons.get(persons.size() - 1);
            System.out.println("Deleting person: " + lastPerson.getName());
            personModel.delete(lastPerson);
        }

        System.out.println("\n=== FINAL COUNTS ===");
        products = productModel.findAll();
        persons = personModel.findAll();
        System.out.println("Final product count: " + products.size());
        System.out.println("Final person count: " + persons.size());
        
        System.out.println("\n=== Admin Application Finished ===");
    }
}
