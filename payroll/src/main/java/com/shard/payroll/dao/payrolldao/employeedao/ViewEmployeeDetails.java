package com.shard.payroll.dao.payrolldao.employeedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

@Repository
public class ViewEmployeeDetails {
    @Autowired
    private EmployeeDetailsREPO repo;

    public EmployeeDetailsDTO View(int id){
        return repo.findById(id).get();
    }

}
