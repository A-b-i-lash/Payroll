package com.shard.payroll.controller.payrollcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.deductiondao.AddDeductionDetails;
import com.shard.payroll.dto.payrolldto.DeductionDetailsDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/Api/Deduction")
public class DeductionDetailsController {

    @Autowired
    private AddDeductionDetails daoAdd;

    @PostMapping("Add")
    public DeductionDetailsDTO AddDeduction(@RequestBody DeductionDetailsDTO add) {
        
        return daoAdd.AddDeduction(add);
    }
    

}
