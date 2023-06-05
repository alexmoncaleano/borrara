package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.Identity;


public class ReserveId extends Identity {


    public ReserveId(String uuid) {
        super(uuid);
    }
    public ReserveId(){}

    public static ReserveId of(String uuid) {return new ReserveId(uuid);}

}
