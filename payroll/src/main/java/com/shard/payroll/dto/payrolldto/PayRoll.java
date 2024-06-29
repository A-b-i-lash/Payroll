package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PayRoll {

    // Employee Details
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String employee_code;
    private String employee_name;
    private String doj;
    private String designation;
    private String department;
    private String work_location;


    // Working Details
    private String number_of_workingdays;
    private String number_of_leavedays;
    private String number_of_loss_of_pay;
    private String number_of_sufficient_leave;
    private String number_of_remaining_sufficient_leave_days;


    // Payment Details
    private String payment_mode;
    private String payment_bank_name;
    private String payment_bank_account_number;
    private String payment_bank_ifsc_code;


    // Salary Details
    // Earnings
    private int basic_salary;
    private int hra_allowance;
    private int medical_reimbursement;
    private int communication_allowance;
    private int lta_allowance;
    private int special_allowance;
    private int incentive_allowance;
    

    // Deductions
    private int advance_payment;
    private int damage_payment;

    // Scheme Deduction
    private int provident_fund;
    private int esi;
    private int professional_tax;
    private int welfare_fund;

    // Total
    private int total_earnings;
    private int total_deductons;
    private int net_salary;






    

    



}
