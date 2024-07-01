package com.shard.payroll.dao.payrolldao.employeedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

public class UpdateEmployeeDetails {
        @Autowired
    private  EmployeeDetailsREPO repo;

    public EmployeeDetailsDTO save(@RequestBody EmployeeDetailsDTO add){
        return repo.save(add);
    }


}
