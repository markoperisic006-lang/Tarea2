package es.iesmz.tests;

public class Vocales {

    public static int contarvocales(String cadena) {
        if (cadena == null) {
            return 0;
        }

        int contador = 0;
        String cadenaMinuscula = cadena.toLowerCase();

        for (int i = 0; i < cadenaMinuscula.length(); i++) {
            char caracter = cadenaMinuscula.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}