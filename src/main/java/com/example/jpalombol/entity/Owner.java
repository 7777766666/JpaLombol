//package com.example.jpalombol.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.Set;
//
//@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@Entity
//@Table(name = "owner")
//public class Owner {
//
//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @OneToMany(mappedBy = "owner")
//    private Set<Pet> pets;
//
//
//    public Owner(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    public Set<Pet> getPets() {
//        return pets;
//    }
//}
//
//
