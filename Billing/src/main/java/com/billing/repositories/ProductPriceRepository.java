package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long>{

}
