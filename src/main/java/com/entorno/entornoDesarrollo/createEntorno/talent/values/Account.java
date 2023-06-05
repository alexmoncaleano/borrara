package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


import java.util.List;

public class Account implements ValueObject<Account.Props> {

    private String accountName;
    private String accountId;
    private List<SelectProfile> profileSelectList;

    public Account(String accountName, String accountId, List<SelectProfile> profileSelectList) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.profileSelectList = profileSelectList;
    }
    public Account(){}


    @Override
    public Props value() {
        return new Props() {
            @Override
            public String accountName() {
                return accountName;
            }

            @Override
            public String accountId() {
                return accountId;
            }

            @Override
            public List<SelectProfile> profileSelectProfiles() {
                return profileSelectList;
            }
        };
    }

    public interface Props {
        String accountName();
        String accountId();
        List<SelectProfile> profileSelectProfiles();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<SelectProfile> getProfileSelectList() {
        return profileSelectList;
    }

    public void setProfileSelectList(List<SelectProfile> profileSelectList) {
        this.profileSelectList = profileSelectList;
    }
}
