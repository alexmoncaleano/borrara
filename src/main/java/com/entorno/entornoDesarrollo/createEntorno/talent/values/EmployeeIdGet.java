package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;

public class EmployeeIdGet implements ValueObject<String> {

    private String id;

    public EmployeeIdGet(String id){this.id=id;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String value() {
        return id;
    }
}
