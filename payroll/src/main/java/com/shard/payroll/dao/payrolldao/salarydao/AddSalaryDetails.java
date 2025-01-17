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



    public SalaryDetailsDTO AddSalary(@RequestBody SalaryDetailsDTO add){
        int Sum = add.getTotal_deductions() - add.getTotal_earnings();
        add.setNet_salary(Sum);
        System.out.println(Sum);

        return repo.save(add);
    }



}
