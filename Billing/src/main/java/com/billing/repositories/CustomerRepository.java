package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.billing.jpa.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long>{

}
