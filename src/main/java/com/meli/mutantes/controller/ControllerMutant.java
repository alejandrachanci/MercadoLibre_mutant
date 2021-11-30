package com.meli.mutantes.controller;

import com.meli.mutantes.domain.Mutant;
import com.meli.mutantes.services.ServiceMutant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerMutant {

    @PostMapping("/mutant")
    public ResponseEntity<String> mutant(@RequestBody Mutant mutant){

       if(ServiceMutant.isMutan(mutant.getDna())){
          return new ResponseEntity<>("es mutante", HttpStatus.OK);
       }
       return new ResponseEntity<>("No es mutante",HttpStatus.FORBIDDEN);
    }
}
