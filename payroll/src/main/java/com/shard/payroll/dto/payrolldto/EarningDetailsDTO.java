package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EarningDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    // Earnings
    private int basic_salary;
    private int hra_allowance;
    private int medical_reimbursement;
    private int communication_allowance;
    private int lta_allowance;
    private int special_allowance;
    private int incentive_allowance;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBasic_salary() {
        return basic_salary;
    }
    public void setBasic_salary(int basic_salary) {
        this.basic_salary = basic_salary;
    }
    public int getHra_allowance() {
        return hra_allowance;
    }
    public void setHra_allowance(int hra_allowance) {
        this.hra_allowance = hra_allowance;
    }
    public int getMedical_reimbursement() {
        return medical_reimbursement;
    }
    public void setMedical_reimbursement(int medical_reimbursement) {
        this.medical_reimbursement = medical_reimbursement;
    }
    public int getCommunication_allowance() {
        return communication_allowance;
    }
    public void setCommunication_allowance(int communication_allowance) {
        this.communication_allowance = communication_allowance;
    }
    public int getLta_allowance() {
        return lta_allowance;
    }
    public void setLta_allowance(int lta_allowance) {
        this.lta_allowance = lta_allowance;
    }
    public int getSpecial_allowance() {
        return special_allowance;
    }
    public void setSpecial_allowance(int special_allowance) {
        this.special_allowance = special_allowance;
    }
    public int getIncentive_allowance() {
        return incentive_allowance;
    }
    public void setIncentive_allowance(int incentive_allowance) {
        this.incentive_allowance = incentive_allowance;
    }
}
