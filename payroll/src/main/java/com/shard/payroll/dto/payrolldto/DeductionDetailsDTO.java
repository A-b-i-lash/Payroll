package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeductionDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    // Deductions
    private int advance_payment;
    private int damage_payment;

    // Scheme Deduction
    private int provident_fund;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAdvance_payment() {
        return advance_payment;
    }
    public void setAdvance_payment(int advance_payment) {
        this.advance_payment = advance_payment;
    }
    public int getDamage_payment() {
        return damage_payment;
    }
    public void setDamage_payment(int damage_payment) {
        this.damage_payment = damage_payment;
    }
    public int getProvident_fund() {
        return provident_fund;
    }
    public void setProvident_fund(int provident_fund) {
        this.provident_fund = provident_fund;
    }
    public int getEsi() {
        return esi;
    }
    public void setEsi(int esi) {
        this.esi = esi;
    }
    public int getProfessional_tax() {
        return professional_tax;
    }
    public void setProfessional_tax(int professional_tax) {
        this.professional_tax = professional_tax;
    }
    public int getWelfare_fund() {
        return welfare_fund;
    }
    public void setWelfare_fund(int welfare_fund) {
        this.welfare_fund = welfare_fund;
    }
    private int esi;
    private int professional_tax;
    private int welfare_fund;
}
