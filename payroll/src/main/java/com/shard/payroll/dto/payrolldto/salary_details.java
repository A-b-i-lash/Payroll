package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class salary_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private int total_earnings;
    private int total_deductons;
    private int net_salary;
}
