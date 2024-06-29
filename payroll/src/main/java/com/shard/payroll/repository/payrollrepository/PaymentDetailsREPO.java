package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.PaymentDetailsDTO;

public interface PaymentDetailsREPO extends JpaRepository<PaymentDetailsDTO,Integer>{

}
