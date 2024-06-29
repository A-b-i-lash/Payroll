package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.SchemeDeductionDTO;

public interface SchemeDeductionREPO extends JpaRepository<SchemeDeductionDTO,Integer>{

}
