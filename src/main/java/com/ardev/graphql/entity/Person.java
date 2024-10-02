package com.ardev.graphql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
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
    private BigInteger personId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
