package com.entorno.entornoDesarrollo.createEntorno.talent.events;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.DomainEvent;


public class EmployeeCreatedEvent extends DomainEvent {

    private String name;
    private String id;

    private String city;

    private String telephone;

    private String email;

    public EmployeeCreatedEvent() {
        super("EmployeeCreated");
    }

    public EmployeeCreatedEvent(String name, String id, String city, String telephone, String email) {
        super("EmployeeCreated");
        this.name = name;
        this.id = id;
        this.city = city;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
