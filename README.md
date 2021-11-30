# MercadoLibre_mutant

Ruta para realizar las peticiones: http://localhost:8090/api/mutant

POST[/mutant]
En caso de obtener una respuesta afirmativa.
Headers:

Content-Type: application/json

Body{
   "dna":["STGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
   }


- Response 

Headers

 Content-Type: application/json

Body{
 "String": "es mutante"   
 }

- En caso de obtener una respuesta negativa, No es mutante.

{
    "String": "No es mutante"
}
