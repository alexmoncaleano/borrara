package com.entorno.entornoDesarrollo.createEntorno.talent.values;


import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;

public class Name implements ValueObject<String> {

    private String name;

    public Name(String name) {this.name = name;}

    @Override
    public String value() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
