package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WorkingDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String number_of_workingdays;
    private String number_of_leavedays;
    private String number_of_loss_of_pay;
    private String number_of_sufficient_leave;
    private String number_of_remaining_sufficient_leave_days;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber_of_workingdays() {
        return number_of_workingdays;
    }
    public void setNumber_of_workingdays(String number_of_workingdays) {
        this.number_of_workingdays = number_of_workingdays;
    }
    public String getNumber_of_leavedays() {
        return number_of_leavedays;
    }
    public void setNumber_of_leavedays(String number_of_leavedays) {
        this.number_of_leavedays = number_of_leavedays;
    }
    public String getNumber_of_loss_of_pay() {
        return number_of_loss_of_pay;
    }
    public void setNumber_of_loss_of_pay(String number_of_loss_of_pay) {
        this.number_of_loss_of_pay = number_of_loss_of_pay;
    }
    public String getNumber_of_sufficient_leave() {
        return number_of_sufficient_leave;
    }
    public void setNumber_of_sufficient_leave(String number_of_sufficient_leave) {
        this.number_of_sufficient_leave = number_of_sufficient_leave;
    }
    public String getNumber_of_remaining_sufficient_leave_days() {
        return number_of_remaining_sufficient_leave_days;
    }
    public void setNumber_of_remaining_sufficient_leave_days(String number_of_remaining_sufficient_leave_days) {
        this.number_of_remaining_sufficient_leave_days = number_of_remaining_sufficient_leave_days;
    }

}
