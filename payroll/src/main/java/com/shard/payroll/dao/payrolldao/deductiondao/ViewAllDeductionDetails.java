package com.shard.payroll.dao.payrolldao.deductiondao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;
import com.shard.payroll.repository.payrollrepository.DeductionDetailsREPO;

@Repository
public class ViewAllDeductionDetails {

    @Autowired
    private DeductionDetailsREPO repo;

    public List<DeductionDetailsDTO>  ViewAllDeduction(){
        return repo.findAll();
    }

}
