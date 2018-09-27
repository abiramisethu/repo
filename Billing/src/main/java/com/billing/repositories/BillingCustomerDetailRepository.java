package com.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billing.jpa.BillingCustomerDetail;

public interface BillingCustomerDetailRepository extends JpaRepository<BillingCustomerDetail, Long>{

}
