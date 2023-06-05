package com.entorno.entornoDesarrollo.controller;

import com.entorno.entornoDesarrollo.createEntorno.talent.values.ServiceToken;
import com.entorno.entornoDesarrollo.createEntorno.talent.values.Token;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authorization")
public class ControllerAutorizacion {

    @PostMapping("/")
    public ResponseEntity<Token> autorizar(@RequestHeader("Authorization") String valorHeader, @RequestBody ServiceToken autorizacion){
        System.out.println("autorizacion");
        System.out.println(valorHeader);
        return new ResponseEntity<>(new Token("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFsZXhAc29ma2EuY29tLmNvIiwiYXV0aCI6dHJ1ZX0.22ZzAgmZpT2J1NCTHhVtQiSY8mWnYuQgUd1KIkmp_tM"), HttpStatus.ACCEPTED);
        //return new ResponseEntity<>(new Token("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFsZXhAc29ma2EuY29tLmNvIiwiYXV0aCI6ZmFsc2V9.eED14SswjbPE1dJGZlwNcGiIpz11Xja-EOi_YQXl0eM"), HttpStatus.ACCEPTED);


    }
}
