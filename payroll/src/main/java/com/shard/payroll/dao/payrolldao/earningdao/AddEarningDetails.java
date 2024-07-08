package com.shard.payroll.dao.payrolldao.earningdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.dto.payrolldto.EarningDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EarningDetailsREPO;

@Repository
public class AddEarningDetails {

    @Autowired
    private EarningDetailsREPO repo;

    public EarningDetailsDTO AddEarning(@RequestBody EarningDetailsDTO add){
        return repo.save(add);
    }

}
