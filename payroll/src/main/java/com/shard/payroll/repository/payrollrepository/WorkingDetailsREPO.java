package com.shard.payroll.repository.payrollrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shard.payroll.dto.payrolldto.WorkingDetailsDTO;

public interface WorkingDetailsREPO extends JpaRepository<WorkingDetailsDTO,Integer>{

}
