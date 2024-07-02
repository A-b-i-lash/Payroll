package com.shard.payroll.dao.payrolldao.salarydao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;
import com.shard.payroll.repository.payrollrepository.SalaryDetailsREPO;

@Repository
public class ViewAllSalaryDetails {
    @Autowired
    private SalaryDetailsREPO repo;

    public List<SalaryDetailsDTO> ViewAllSalary(){
        return repo.findAll();
    }

}
