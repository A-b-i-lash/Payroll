package com.shard.payroll.controller.payrollcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shard.payroll.dao.payrolldao.employeedao.AddEmployeeDetails;
import com.shard.payroll.dao.payrolldao.employeedao.DeleteEmployeeDetails;
import com.shard.payroll.dao.payrolldao.employeedao.UpdateEmployeeDetails;
import com.shard.payroll.dao.payrolldao.employeedao.ViewAllEmployeeDetails;
import com.shard.payroll.dao.payrolldao.employeedao.ViewEmployeeDetails;
import com.shard.payroll.dto.payrolldto.EmployeeDetailsDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@CrossOrigin
@RequestMapping("/Api/Employee")
public class EmployeeDetailsController {

    @Autowired
    private AddEmployeeDetails daoAdd;

    @Autowired
    private UpdateEmployeeDetails daoUpdate;

    @Autowired
    private DeleteEmployeeDetails daoDelete;

    @Autowired
    private ViewEmployeeDetails daoView;

    @Autowired
    private ViewAllEmployeeDetails daoViewAll;

    @PostMapping("Add")
    public EmployeeDetailsDTO SaveEmployee(@RequestBody EmployeeDetailsDTO add) {  
        return daoAdd.SaveEmployee(add);
    }

    @PutMapping("Update/{id}")
    public EmployeeDetailsDTO UpdateEmployee(@PathVariable Integer id, @RequestBody EmployeeDetailsDTO update ) {
        return daoUpdate.update(id , update);
    }
    
    @DeleteMapping("Delete/{id}")
    public String DeleteEmployee(@PathVariable Integer id){
        return daoDelete.Delete(id);
    }

    @GetMapping("View/{id}")
    public EmployeeDetailsDTO ViewEmployee(@PathVariable Integer id) {
        return daoView.View(id);
    }

    @GetMapping("ViewAll")
    public List<EmployeeDetailsDTO> ViewAllEmployee() {
        return daoViewAll.ViewAllEmployee();
    }
    
    

}
