package com.shard.payroll.dao.payrolldao.salarydao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import com.shard.payroll.repository.payrollrepository.SalaryDetailsREPO;

@Repository
public class DeleteSalaryDetails {

    @Autowired
    private SalaryDetailsREPO repo;

    public String DeleteSalary(@RequestBody int id ){
        repo.deleteById(id);
        return "sucess";
    }

}
