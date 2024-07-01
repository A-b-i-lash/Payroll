package com.shard.payroll.dao.payrolldao.employeedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

@Repository
public class DeleteEmployeeDetails {
    @Autowired
    private EmployeeDetailsREPO repo;

    public String Delete(@RequestBody int id){
        repo.deleteById(id);
        return "sucess";
    }


}
