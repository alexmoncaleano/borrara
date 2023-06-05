package com.entorno.entornoDesarrollo.controller;


import com.entorno.entornoDesarrollo.createEntorno.talent.values.AccountProfile;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.BasicProfile;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.Technology;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/AcountsProfiles")
public class ControllerSkills {



    @GetMapping("/")
    public ResponseEntity<Flux<AccountProfile>> consultarPerfiles(@RequestHeader("Authorization") String valorHeader) {
        System.out.println("Skills");
        System.out.println(valorHeader);
        AccountProfile accountProfile1 = new AccountProfile("Sura",
                "1",
                Arrays.asList(new BasicProfile("BackEnd - Java",
                                "1", "Consultor", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", false, 2),
                                new Technology("GIT", true, 2))),
                        new BasicProfile("BackEnd - Java - Arquitecto",
                                "1", "Arquitecto", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", false, 2),
                                new Technology("GIT", true, 2),
                                new Technology("Devops", true, 2)))
                ));
        AccountProfile accountProfile2 =new AccountProfile("Bancolombia",
                "1",
                Arrays.asList(new BasicProfile("BackEnd - Java",
                                "1", "Consultor", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2))),
                        new BasicProfile("BackEnd - Java - Arquitecto",
                                "1", "Arquitecto", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2),
                                new Technology("Devops", true, 2))),
                        new BasicProfile("BackEnd - Java - Elixir",
                                "1", "Arquitecto", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2),
                                new Technology("ELIXIR", true, 2),
                                new Technology("PHOENIX", true, 2),
                                new Technology("Devops", true, 2)))
                ));
        AccountProfile accountProfile3 = new AccountProfile("Exito",
                "1",
                Arrays.asList(
                        new BasicProfile("BackEnd - Java",
                                "1", "Consultor", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2)
                        )),

                        new BasicProfile("BackEnd - Java - Arquitecto",
                                "1", "Arquitecto", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2),
                                new Technology("Devops", true, 2)
                        )),

                        new BasicProfile("BackEnd - Java - Elixir",
                                "1", "Arquitecto", Arrays.asList(
                                new Technology("Java", true, 2),
                                new Technology("SQL", true, 2),
                                new Technology("JENKINS", true, 2),
                                new Technology("GIT", true, 2),
                                new Technology("ELIXIR", true, 2),
                                new Technology("PHOENIX", true, 2),
                                new Technology("Devops", true, 2)
                        ))
                ));



        return new ResponseEntity<>(Flux.just(accountProfile1, accountProfile2, accountProfile3), HttpStatus.OK);
    }

}
