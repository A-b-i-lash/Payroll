package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class working_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String number_of_workingdays;
    private String number_of_leavedays;
    private String number_of_loss_of_pay;
    private String number_of_sufficient_leave;
    private String number_of_remaining_sufficient_leave_days;

}
