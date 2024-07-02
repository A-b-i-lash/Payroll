package com.shard.payroll.dao.payrolldao.employeedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

@Repository
public class UpdateEmployeeDetails {
    @Autowired
    private  EmployeeDetailsREPO repo;

    public EmployeeDetailsDTO UpdateEmployee(@RequestBody  int id , EmployeeDetailsDTO update){
        update.setId(id);
        return repo.save(update);
    }



}
