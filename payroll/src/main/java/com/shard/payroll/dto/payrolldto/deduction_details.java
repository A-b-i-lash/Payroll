package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class deduction_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    // Deductions
    private int advance_payment;
    private int damage_payment;

    // Scheme Deduction
    private int provident_fund;
    private int esi;
    private int professional_tax;
    private int welfare_fund;
}
