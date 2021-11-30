package com.meli.mutantes.services;

public class ServiceMutant {

    static String[][] adn = new String[6][6];

    public static boolean isMutan ( String[] dna){
        String[] letra;
        String letras;

        for (int i= 0; i < dna.length; i++){
            letras = dna[i];
            letra = letras.split("");
            llenarMatriz(letra,i);
        }
        return validarAdn(adn);
    }

    public static void llenarMatriz( String[] caracter,int f){
        for(int c=0; c < adn[f].length;c++){
            adn[f][c] = caracter[c];
        }
    }

    public static boolean validarAdn(String[][] matriz){
        int contadorLetras, contadorCadena=0;

        for (int i = 0; i < matriz.length - 1; i++) {
            contadorLetras =0;
            for (int k = 0; k < matriz.length - 1; k++)
            {
                if (matriz[i][k].equals(matriz[i][k+1]) ) {
                    contadorLetras++;
                    if(contadorLetras == 3){
                        contadorCadena++;
                    }
                }
            }
            if(contadorCadena >= 2){
                System.out.println(contadorCadena);
                return true;
            }
        }

        for (int i = 0; i < matriz.length-1; i++) {
            contadorLetras =0;
            for(int k =0; k<matriz.length-1; k++){
                if (matriz[k][i].equals(matriz[k+1][i])) {
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

        for (int i = 0; i < matriz.length; i++) {
            contadorLetras =0;
            for(int k =0; k<matriz.length; k++){
                if (i < matriz.length-1 && k< matriz[i].length-1 && matriz[i][k].equals(matriz[i+1][k+1])) {
                    contadorLetras++;
                }
                if(contadorLetras == 3){
                    contadorCadena++;
                    if(contadorCadena >= 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void mostrarMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }

}

