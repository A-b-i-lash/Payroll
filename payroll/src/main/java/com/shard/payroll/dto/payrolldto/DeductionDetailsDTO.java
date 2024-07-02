package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class DeductionDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    // Deductions
    private int total_deduction;
    private int total_otherdeduction;

    @OneToOne(mappedBy = "deductionDetailsDTO")
    public SalaryDetailsDTO salaryDetailsDTO;


     // On Customer class:

    // @OneToOne(optional=false)
    // @JoinColumn(
    //     name="CUSTREC_ID", unique=true, nullable=false, updatable=false)
    // public CustomerRecord getCustomerRecord() { return customerRecord; }

    // // On CustomerRecord class:

    // @OneToOne(optional=false, mappedBy="customerRecord")
    // public Customer getCustomer() { return customer; }





    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTotal_deduction() {
        return total_deduction;
    }
    public void setTotal_deduction(int total_deduction) {
        this.total_deduction = total_deduction;
    }
    public int getTotal_otherdeduction() {
        return total_otherdeduction;
    }
    public void setTotal_otherdeduction(int total_otherdeduction) {
        this.total_otherdeduction = total_otherdeduction;
    }
    public SalaryDetailsDTO getSalaryDetailsDTO() {
        return salaryDetailsDTO;
    }
    public void setSalaryDetailsDTO(SalaryDetailsDTO salaryDetailsDTO) {
        this.salaryDetailsDTO = salaryDetailsDTO;
    }

}
