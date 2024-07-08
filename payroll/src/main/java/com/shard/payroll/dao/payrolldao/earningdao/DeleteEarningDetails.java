package com.shard.payroll.dao.payrolldao.earningdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shard.payroll.repository.payrollrepository.EarningDetailsREPO;

@Repository
public class DeleteEarningDetails {

    @Autowired
    private EarningDetailsREPO repo;

    public String DeleteEarning(@RequestBody int id){
        repo.deleteById(id);
        return "Success";
    }

}