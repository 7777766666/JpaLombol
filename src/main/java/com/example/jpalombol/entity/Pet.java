//package com.example.jpalombol.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
////@AllArgsConstructor
//@Setter
//@Getter
//@Entity
//@Table(name = "pet")
//public class Pet {
//
//    @Id
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToOne
//    @JoinColumn(name = "owner_id")
//    private Owner owner;
//
//    // Добавьте этот конструктор
//    public Pet(Long id, String name, Owner owner) {
//        this.id = id;
//        this.name = name;
//        this.owner = owner;
//    }
//
//}
