package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SchemeDeductionDTO {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private int provident_fund;
    private int esi;
    private int professional_tax;
    private int welfare_fund;

}
