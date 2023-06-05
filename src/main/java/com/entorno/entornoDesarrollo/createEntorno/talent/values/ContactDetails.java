package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


public class ContactDetails implements ValueObject<ContactDetails.Props> {
    private String city;
    private String telephone;
    private String email;


    public ContactDetails(String city, String telephone, String email) {
        this.city = city;
        this.telephone = telephone;
        this.email = email;
    }

    public ContactDetails(){}

    public void setCity(String city) {
        this.city = city;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getCity() {
        return city;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String city() {
                return city;
            }

            @Override
            public String telephone() {
                return telephone;
            }

            @Override
            public String email() {
                return email;
            }
        };
    }


    public interface Props {
        String city();
        String telephone();
        String email();

    }


}
