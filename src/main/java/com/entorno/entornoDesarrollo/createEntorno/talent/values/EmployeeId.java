package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.Identity;


public class EmployeeId extends Identity {

    private EmployeeId(String uuid) {
        super(uuid);
    }
    public EmployeeId(){}

    public static EmployeeId of(String uuid) {return new EmployeeId(uuid);}
}
