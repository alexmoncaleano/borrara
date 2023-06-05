package com.entorno.entornoDesarrollo.createEntorno.talent;



import com.entorno.entornoDesarrollo.createEntorno.talent.events.EmployeeCreatedEvent;
import com.entorno.entornoDesarrollo.createEntorno.talent.events.ReserveAddedEvent;
import com.entorno.entornoDesarrollo.createEntorno.talent.generic.AggregateRoot;
import com.entorno.entornoDesarrollo.createEntorno.talent.generic.DomainEvent;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Employee {



    protected String name;

    protected String id;
    protected ContactDetails contactDetails;
    protected Profile profile;



}
