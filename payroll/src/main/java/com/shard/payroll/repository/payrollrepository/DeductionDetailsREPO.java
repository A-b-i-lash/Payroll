package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;

public interface DeductionDetailsREPO extends JpaRepository<DeductionDetailsDTO,Integer>{

}
