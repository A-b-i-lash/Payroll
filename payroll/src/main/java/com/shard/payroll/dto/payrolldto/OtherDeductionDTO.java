package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OtherDeductionDTO {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    // Deductions
    private int advance_payment;
    private int damage_payment;
}