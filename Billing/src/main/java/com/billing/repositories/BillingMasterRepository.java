package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.BillingMaster;

public interface BillingMasterRepository extends JpaRepository<BillingMaster, Long>{

}
