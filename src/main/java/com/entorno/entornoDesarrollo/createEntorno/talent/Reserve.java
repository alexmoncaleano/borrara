package com.entorno.entornoDesarrollo.createEntorno.talent;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.Entity;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.ReserveId;


import java.util.Date;

public class Reserve extends Entity<ReserveId> {

    private String id;
    private String accountName;
    private String acoountId;
    private String profileName;
    private Date date;
    private Float fitPercentage;

    public Reserve(String id, String accountName, String acoountId, String profileName, Date date, Float fitPercentage) {
        super(ReserveId.of(id));
        this.id = id;
        this.accountName = accountName;
        this.acoountId = acoountId;
        this.profileName = profileName;
        this.date = date;
        this.fitPercentage = fitPercentage;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAcoountId() {
        return acoountId;
    }

    public void setAcoountId(String acoountId) {
        this.acoountId = acoountId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getFitPercentage() {
        return fitPercentage;
    }

    public void setFitPercentage(Float fitPercentage) {
        this.fitPercentage = fitPercentage;
    }


}
