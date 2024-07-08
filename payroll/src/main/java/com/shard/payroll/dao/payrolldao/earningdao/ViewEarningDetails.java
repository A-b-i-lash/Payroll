package com.shard.payroll.dao.payrolldao.earningdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.EarningDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EarningDetailsREPO;

@Repository
public class ViewEarningDetails {
    @Autowired
    private EarningDetailsREPO repo;

    public EarningDetailsDTO ViewEarning(int id){
        return repo.findById(id).get();
    }

}
