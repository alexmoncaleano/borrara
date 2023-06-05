package com.entorno.entornoDesarrollo.controller;

import com.entorno.entornoDesarrollo.createEntorno.talent.Employee;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/assesment")
public class ControllerAssesment {

    @GetMapping("/")
    public ResponseEntity<Flux<Employee>> empleados(@RequestHeader("Authorization") String valorHeader){
        System.out.println("Assessment");
        System.out.println(valorHeader);
        Employee employee1 = new Employee("Alex Moncaleano",
                "1024505917",
                new ContactDetails("Bogotá", "3155732954", "alex.moncaleano@sofka.com.co"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Python",  3),
                                new Skill("SQL",  3),
                                new Skill("Test",  9),
                                new Skill("GIT", 3))));

        Employee employee2 = new Employee(
                "Alexander Hernandez",
                "1024505913",
                new ContactDetails("Villa Chica", "3132332332", "alexander.hernandez@sofka.com.co "),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Python",  3),
                                new Skill("SQL",  3),
                                new Skill("GIT", 3))));

        Employee employee3 = new Employee(
                "Juan Ruiz",
                "1024123456",
                new ContactDetails("New York", "3132222222", "juan.ruiz@sofka.com.co"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Test",  3),
                                new Skill("SQL",  3),
                                new Skill("GIT", 3))));

        Employee employee4 = new Employee("Steve Rogers",
                "1021123456",
                new ContactDetails("New York", "3133333333", "steve@gmail.com"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Sql",  3),
                                new Skill("Jenkins",  3),
                                new Skill("GIT", 3))));

        Employee employee5 = new Employee("Bruce Banner",
                "1031223456",
                new ContactDetails("New York", "3144444444", "bruce@gmail.com"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Sql",  3),
                                new Skill("Jenkins",  3),
                                new Skill("Devops",  3),
                                new Skill("GIT", 3))));

        Employee employee6 = new Employee("Scott Lang",
                "1044234234",
                new ContactDetails("New York", "3155555555", "Scott@gmail.com"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Sql",  3),
                                new Skill("AWS",  3),
                                new Skill("Devops",  3),
                                new Skill("GIT", 3))));

        Employee employee7 = new Employee("Natasha Romanoff",
                "1055555555",
                new ContactDetails("New York", "3166666666", "natasha@gmail.com"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Sql",  3),
                                new Skill("AWS",  3),
                                new Skill("Devops",  3),
                                new Skill("GIT", 3))));

        Employee employee8 = new Employee("Carol Danvers",
                "1066666666",
                new ContactDetails("New York", "3177777777", "carol@gmail.com"),
                new Profile("BackEnd",
                        Arrays.asList(new Skill("Java", 3),
                                new Skill("Sql",  3),
                                new Skill("AWS",  3),
                                new Skill("Devops",  3),
                                new Skill("GIT", 3))));



        return new ResponseEntity<>(Flux.just(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8), HttpStatus.OK);
    }


}
