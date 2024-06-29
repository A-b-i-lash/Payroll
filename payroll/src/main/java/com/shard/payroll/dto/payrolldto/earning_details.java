package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class earning_details {
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
}
