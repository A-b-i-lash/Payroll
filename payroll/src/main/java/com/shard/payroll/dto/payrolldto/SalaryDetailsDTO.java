package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SalaryDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private int total_earnings;
    private int total_deductons;
    private int net_salary;
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
    public int getTotal_deductons() {
        return total_deductons;
    }
    public void setTotal_deductons(int total_deductons) {
        this.total_deductons = total_deductons;
    }
    public int getNet_salary() {
        return net_salary;
    }
    public void setNet_salary(int net_salary) {
        this.net_salary = net_salary;
    }
}
