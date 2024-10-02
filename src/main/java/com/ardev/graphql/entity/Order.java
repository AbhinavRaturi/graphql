package com.ardev.graphql.entity;

import com.ardev.graphql.Enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDER_INFO")
public class Order {
    @Id
    @GeneratedValue
    private BigInteger orderId;
    private String orderName;
    private String orderDesc;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
