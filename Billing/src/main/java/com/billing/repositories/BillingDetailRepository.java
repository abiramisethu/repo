package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.BillingDetail;

public interface BillingDetailRepository extends JpaRepository<BillingDetail, Long>{

}
