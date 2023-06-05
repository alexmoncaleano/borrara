package com.entorno.entornoDesarrollo.createEntorno.talent.events;

import com.entorno.entornoDesarrollo.createEntorno.talent.Employee;
import com.entorno.entornoDesarrollo.createEntorno.talent.generic.DomainEvent;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.Account;


import java.util.List;

public class EmployeeProfileEvent extends DomainEvent {

    private Employee employee;
    private List<Account> accounts;

    public EmployeeProfileEvent() {
        super("EmployeeProfileEvent");
    }

    public EmployeeProfileEvent(Employee employee, List<Account> accounts){
        super("EmployeeProfileEvent");
        this.employee = employee;
        this.accounts = accounts;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public interface Props {
        Employee employee();
        List<Account> accounts();
    }

}
