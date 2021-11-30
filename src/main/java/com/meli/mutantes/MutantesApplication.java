package com.meli.mutantes;

import com.meli.mutantes.services.ServiceMutant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MutantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutantesApplication.class, args);
	/*	String[] dna= {"ATCCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};

		ServiceMutant ADN = new ServiceMutant();
		System.out.print(ADN.isMutan(dna));*/
	}

}
