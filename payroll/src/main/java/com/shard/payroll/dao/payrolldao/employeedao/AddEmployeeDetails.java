package com.shard.payroll.dao.payrolldao.employeedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

@Repository
public class AddEmployeeDetails {
    @Autowired
    private  EmployeeDetailsREPO repo;

    public EmployeeDetailsDTO AddEmployee(@RequestBody EmployeeDetailsDTO add){
        return repo.save(add);
    }

}
