package com.aquastore.aquastorebackend.repository;

import com.aquastore.aquastorebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}