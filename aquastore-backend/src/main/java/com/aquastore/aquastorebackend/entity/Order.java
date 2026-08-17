package com.aquastore.aquastorebackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Long productId;

    @NonNull
    private Integer quantity;

    @NonNull
    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    @NonNull
    private OrderStatus status;
}