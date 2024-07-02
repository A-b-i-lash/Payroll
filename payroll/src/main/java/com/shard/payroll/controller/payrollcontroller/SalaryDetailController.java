package com.shard.payroll.controller.payrollcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.salarydao.AddSalaryDetails;
import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin
@RequestMapping("/Api/Salary")
public class SalaryDetailController {

    @Autowired
    private AddSalaryDetails daoAdd;


    @PostMapping("Add")
    public SalaryDetailsDTO AddSalary(@RequestBody SalaryDetailsDTO add) {
        
        return daoAdd.SaveSalary(add);
    }
    

}
