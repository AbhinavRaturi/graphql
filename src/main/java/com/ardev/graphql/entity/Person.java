package com.ardev.graphql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSON_INFO")
public class Person {
    @Id
    @GeneratedValue
    private Long personId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;
}
