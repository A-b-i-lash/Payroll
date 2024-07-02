package com.shard.payroll.dao.payrolldao.salarydao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;
import com.shard.payroll.repository.payrollrepository.SalaryDetailsREPO;
@Repository
public class AddSalaryDetails {
    @Autowired
    private SalaryDetailsREPO repo;

    public SalaryDetailsDTO SaveSalary(@RequestBody SalaryDetailsDTO add){
        return repo.save(add);
    }

}
