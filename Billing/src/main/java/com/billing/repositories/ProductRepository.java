package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
