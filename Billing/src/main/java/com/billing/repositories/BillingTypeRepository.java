package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.BillingType;

public interface BillingTypeRepository extends JpaRepository<BillingType, Long>{

}
