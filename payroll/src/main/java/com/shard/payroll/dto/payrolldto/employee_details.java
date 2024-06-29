package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

}
