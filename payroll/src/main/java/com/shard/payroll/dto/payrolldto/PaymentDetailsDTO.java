package com.shard.payroll.dto.payrolldto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentDetailsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String payment_mode;
    private String payment_bank_name;
    private String payment_bank_account_number;
    private String payment_bank_ifsc_code;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPayment_mode() {
        return payment_mode;
    }
    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }
    public String getPayment_bank_name() {
        return payment_bank_name;
    }
    public void setPayment_bank_name(String payment_bank_name) {
        this.payment_bank_name = payment_bank_name;
    }
    public String getPayment_bank_account_number() {
        return payment_bank_account_number;
    }
    public void setPayment_bank_account_number(String payment_bank_account_number) {
        this.payment_bank_account_number = payment_bank_account_number;
    }
    public String getPayment_bank_ifsc_code() {
        return payment_bank_ifsc_code;
    }
    public void setPayment_bank_ifsc_code(String payment_bank_ifsc_code) {
        this.payment_bank_ifsc_code = payment_bank_ifsc_code;
    }

}
