package com.shard.payroll.controller.payrollcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.salarydao.AddSalaryDetails;
import com.shard.payroll.dao.payrolldao.salarydao.DeleteSalaryDetails;
import com.shard.payroll.dao.payrolldao.salarydao.UpdateSalaryDetails;
import com.shard.payroll.dao.payrolldao.salarydao.ViewAllSalaryDetails;
import com.shard.payroll.dao.payrolldao.salarydao.ViewSalaryDetails;

import com.shard.payroll.dto.payrolldto.SalaryDetailsDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin
@RequestMapping("/Api/Salary")
public class SalaryDetailController {

    @Autowired
    private AddSalaryDetails daoAdd;

    @Autowired
    private UpdateSalaryDetails daoUpdate;

    @Autowired
    private DeleteSalaryDetails daoDelete;

    @Autowired
    private ViewSalaryDetails daoView;

    @Autowired
    private ViewAllSalaryDetails daoViewAll;


    @PostMapping("Add")
    public SalaryDetailsDTO AddSalary(@RequestBody SalaryDetailsDTO add) {
        
        return daoAdd.AddSalary(add);
    }

    @PutMapping("Update/{id}")
    public SalaryDetailsDTO UpdateSalary(@PathVariable Integer id, SalaryDetailsDTO update ) {
        return daoUpdate.UpdateSalary(id , update);
    }

    @DeleteMapping("Delete/{id}")
    public String DeleteSalary(@PathVariable Integer id){
        return daoDelete.DeleteSalary(id);
    }

    @GetMapping("View/{id}")
    public SalaryDetailsDTO ViewSalary(@PathVariable Integer id) {
        return daoView.ViewSalary(id);
    }

    @GetMapping("ViewAll")
    public List<SalaryDetailsDTO> ViewAllSalary() {
        return daoViewAll.ViewAllSalary();
    }
    
    

}
