package com.shard.payroll.dao.payrolldao.deductiondao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;
import com.shard.payroll.repository.payrollrepository.DeductionDetailsREPO;

@Repository
public class ViewDeductionDetails {

    @Autowired
    private DeductionDetailsREPO repo;

    public DeductionDetailsDTO ViewDeduction(int id){
        return repo.findById(id).get();
    }

}
