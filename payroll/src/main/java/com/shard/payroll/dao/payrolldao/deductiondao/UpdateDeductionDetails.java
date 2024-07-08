package com.shard.payroll.dao.payrolldao.deductiondao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;
import com.shard.payroll.repository.payrollrepository.DeductionDetailsREPO;

@Repository
public class UpdateDeductionDetails {

    @Autowired
    private DeductionDetailsREPO repo;

    public DeductionDetailsDTO UpdateDeduction(@RequestBody int id,DeductionDetailsDTO update){
        update.setId(id);
        return repo.save(update);
    }

}
