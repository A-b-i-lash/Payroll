package com.shard.payroll.dao.payrolldao.deductiondao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.repository.payrollrepository.DeductionDetailsREPO;

@Repository
public class DeleteDeductionDetails {
    private DeductionDetailsREPO repo;

    public String DeleteDeduction(@RequestBody int id){
        repo.deleteById(id);
        return "Sucess";
    }

}
