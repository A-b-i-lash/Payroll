package com.shard.payroll.controller.payrollcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.earningdao.AddEarningDetails;
import com.shard.payroll.dao.payrolldao.earningdao.DeleteEarningDetails;
import com.shard.payroll.dao.payrolldao.earningdao.UpdateEarningDetails;
import com.shard.payroll.dao.payrolldao.earningdao.ViewAllEarningDetails;
import com.shard.payroll.dao.payrolldao.earningdao.ViewEarningDetails;
import com.shard.payroll.dto.payrolldto.EarningDetailsDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;






@RestController
@RequestMapping("/Api/Earning")

public class EarningDetailsController {
    @Autowired
    private AddEarningDetails daoAdd;

    @Autowired
    private UpdateEarningDetails daoUpdate;

    @Autowired
    private DeleteEarningDetails daoDelete;

    @Autowired
    private ViewEarningDetails daoView;

    @Autowired
    private ViewAllEarningDetails daoViewAll;



    @PostMapping("Add")
    public EarningDetailsDTO AddEarning(@RequestBody EarningDetailsDTO add) {
        
        return daoAdd.AddEarning(add);
    }

    @PutMapping("Update/{id}")
    public EarningDetailsDTO UpdateEarning(@PathVariable Integer id, @RequestBody EarningDetailsDTO update) {
        
        return daoUpdate.UpdateEarning(id, update);
    }

    @DeleteMapping("Delete/{id}")
    public String DeleteEarning(@PathVariable Integer id){

        return daoDelete.DeleteEarning(id);
    }

    @GetMapping("View/{id}")
    public EarningDetailsDTO ViewEarning(@PathVariable Integer id) {
        return daoView.ViewEarning(id);
    }

    @GetMapping("ViewAll")
    public List<EarningDetailsDTO> ViewAllEarning() {
        return daoViewAll.ViewAllEarning();
    }
    
    



}
