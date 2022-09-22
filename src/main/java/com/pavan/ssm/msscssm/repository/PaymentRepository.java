package com.pavan.ssm.msscssm.repository;

import com.pavan.ssm.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
