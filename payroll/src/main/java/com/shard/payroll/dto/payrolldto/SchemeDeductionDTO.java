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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

}
