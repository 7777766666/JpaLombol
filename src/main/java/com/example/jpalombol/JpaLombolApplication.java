//package com.example.jpalombol;
//
//import com.example.jpalombol.entity.Owner;
//import com.example.jpalombol.entity.Pet;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class JpaLombolApplication {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testLombok");
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//
//
//            // Создание хозяинов
//            Owner owner1 = new Owner(1L, "John");
//            Owner owner2 = new Owner(2L, "Alice");
//
//            // Создание питомцев
//            Pet pet1 = new Pet(1L, "Max", owner1);
//            Pet pet2 = new Pet(2L, "Bella", owner2);
//
//            // Установка связей между хозяинами и питомцами
//            owner1.getPets().add(pet1);
//            owner2.getPets().add(pet2);
//
//            // Сохранение хозяинов и питомцев в базу данных
//            em.persist(owner1);
//            em.persist(owner2);
//            em.persist(pet1);
//            em.persist(pet2);
//
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//            emf.close();
//        }
//
//        SpringApplication.run(JpaLombolApplication.class, args);
//    }
//
//}
