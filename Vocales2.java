package es.iesmz.tests;

public class Vocales2 {

    public static String sinvocales(String cadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.replaceAll("[aeiouAEIOU]", "");
    }
}