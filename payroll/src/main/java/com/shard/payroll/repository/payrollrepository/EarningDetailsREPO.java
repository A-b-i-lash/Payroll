package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.EarningDetailsDTO;

public interface EarningDetailsREPO extends JpaRepository<EarningDetailsDTO ,Integer>{

}
