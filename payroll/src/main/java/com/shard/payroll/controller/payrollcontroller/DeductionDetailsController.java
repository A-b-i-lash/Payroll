package com.shard.payroll.controller.payrollcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.deductiondao.AddDeductionDetails;
import com.shard.payroll.dao.payrolldao.deductiondao.DeleteDeductionDetails;
import com.shard.payroll.dao.payrolldao.deductiondao.UpdateDeductionDetails;
import com.shard.payroll.dao.payrolldao.deductiondao.ViewAllDeductionDetails;
import com.shard.payroll.dao.payrolldao.deductiondao.ViewDeductionDetails;
import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/Api/Deduction")
public class DeductionDetailsController {

    @Autowired
    private AddDeductionDetails daoAdd;

    @Autowired
    private UpdateDeductionDetails daoUpdate;

    @Autowired
    private DeleteDeductionDetails daoDelete;

    @Autowired
    private ViewDeductionDetails daoView;

    @Autowired
    private ViewAllDeductionDetails daoViewAll;



    @PostMapping("Add")
    public DeductionDetailsDTO AddDeduction(@RequestBody DeductionDetailsDTO add) {
        
        return daoAdd.AddDeduction(add);
    }
    
    @PutMapping("Update/{id}")
    public DeductionDetailsDTO UpdateDeduction(@PathVariable Integer id, @RequestBody DeductionDetailsDTO update) {
    
        return daoUpdate.UpdateDeduction(id, update);
    }

    @DeleteMapping("Delete/{id}")
    public String DeleteDeduction(@PathVariable Integer id){

        return daoDelete.DeleteDeduction(id);
    }

    @GetMapping("View/{id}")
    public DeductionDetailsDTO ViewDeduction(@PathVariable Integer id) {
        return daoView.ViewDeduction(id);
    }

    @GetMapping("ViewAll")
    public List<DeductionDetailsDTO> ViewAllDeduction() {
        return daoViewAll.ViewAllDeduction();
    }
    
    
}
