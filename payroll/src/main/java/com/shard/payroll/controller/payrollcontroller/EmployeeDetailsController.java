package com.shard.payroll.controller.payrollcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.employeedao.AddEmployeeDetails;
import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeDetailsController {

    @Autowired
    private AddEmployeeDetails dao;

    @PostMapping("add")
    public EmployeeDetailsDTO save(@RequestBody EmployeeDetailsDTO employee) {
        
        return dao.save(employee);
    }
    

}
