package com.aquastore.aquastorebackend.repository;

import com.aquastore.aquastorebackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}