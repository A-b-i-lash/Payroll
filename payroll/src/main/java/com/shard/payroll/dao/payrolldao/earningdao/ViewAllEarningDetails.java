package com.shard.payroll.dao.payrolldao.earningdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shard.payroll.dto.payrolldto.EarningDetailsDTO;
import com.shard.payroll.repository.payrollrepository.EarningDetailsREPO;

@Repository
public class ViewAllEarningDetails {
    
    @Autowired
    private EarningDetailsREPO repo;

    public List <EarningDetailsDTO> ViewAllEarning(){
        return repo.findAll();
    }


}
