package com.meli.mutantes.services;

public class ServiceMutant {

    static String[][] adn = new String[6][6];

    public static boolean isMutan (String[] dna){
        String[] letra;
        String letras;

        for (int f= 0; f < dna.length; f++){
            letras = dna[f];
            letra = letras.split("");
            llenarMatriz(letra,f);
        }
        return validarAdn(adn);
    }

    public static void llenarMatriz(String[] caracter, int f){
        for(int c=0; c < adn[f].length;c++){
            adn[f][c] = caracter[c];
        }
    }

    public static boolean validarAdn(String[][] matriz){
        int contadorLetras, contadorCadena=0;

        for (int f = 0; f < matriz.length - 1; f++) {
            contadorLetras =0;
            for (int c = 0; c < matriz.length - 1; c++)
            {
                if (matriz[f][c].equals(matriz[f][c+1]) ) {
                    contadorLetras++;
                    if(contadorLetras == 3){
                        contadorCadena++;
                    }
                }
            }
            if(contadorCadena >= 2){
                return true;
            }
        }

        for (int f = 0; f < matriz.length-1; f++) {
            contadorLetras =0;
            for(int c =0; c<matriz.length-1; c++){
                if (matriz[c][f].equals(matriz[c+1][f])) {
                    contadorLetras++;
                    if(contadorLetras == 3){
                        contadorCadena++;
                    }
                }
            }
            if(contadorCadena >= 2) {
                return true;
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            contadorLetras =0;
            for(int c =0; c<matriz.length; c++){
                if (f < matriz.length-1 && c< matriz[f].length-1 && matriz[f][c].equals(matriz[f+1][c+1])) {
                    contadorLetras++;
                }
                if(contadorLetras == 3){
                    contadorCadena++;
                    if(contadorCadena >= 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

