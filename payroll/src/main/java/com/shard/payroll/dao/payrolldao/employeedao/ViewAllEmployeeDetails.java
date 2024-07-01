package com.shard.payroll.dao.payrolldao.employeedao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EmployeeDetailsREPO;

@Repository
public class ViewAllEmployeeDetails {
    @Autowired
    private EmployeeDetailsREPO repo;

    public List<EmployeeDetailsDTO> ViewAllEmployee(){
        return repo.findAll();
    }

}
