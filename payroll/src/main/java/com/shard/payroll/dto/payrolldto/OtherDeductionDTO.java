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
}
