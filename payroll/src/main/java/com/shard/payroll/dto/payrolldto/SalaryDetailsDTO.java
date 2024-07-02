package com.shard.payroll.dto.payrolldto;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SalaryDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private int total_earnings;
    public int total_deductions;
    private int net_salary;
    private String month;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private EmployeeDetailsDTO employeeDetailsDTO;

    public EmployeeDetailsDTO getEmployeeDetailsDTO() {
        return employeeDetailsDTO;
    }
    public void setEmployeeDetailsDTO(EmployeeDetailsDTO employeeDetailsDTO) {
        this.employeeDetailsDTO = employeeDetailsDTO;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTotal_earnings() {
        return total_earnings;
    }
    public void setTotal_earnings(int total_earnings) {
        this.total_earnings = total_earnings;
    }
    public  int getTotal_deductions() {
        return total_deductions;
    }
    public void setTotal_deductions(int total_deductions) {
        this.total_deductions = total_deductions;
    }
    public int getNet_salary() {
        return net_salary;
    }
    public void setNet_salary(int net_salary) {
        this.net_salary = net_salary;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    
    
}
