package com.shard.payroll.dao.payrolldao.salarydao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;
import com.shard.payroll.repository.payrollrepository.SalaryDetailsREPO;

@Repository
public class ViewSalaryDetails {
    @Autowired
    private SalaryDetailsREPO repo;

    public SalaryDetailsDTO ViewSalary(int id){
        return repo.findById(id).get();
    }

}
