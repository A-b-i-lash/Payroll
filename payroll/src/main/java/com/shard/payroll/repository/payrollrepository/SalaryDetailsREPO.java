package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;

public interface SalaryDetailsREPO extends JpaRepository<SalaryDetailsDTO,Integer>{

}
