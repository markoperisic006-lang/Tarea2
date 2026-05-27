package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VocalesTest {

    @Test
    public void testContarVocalesHolaMundo() {
        int resultado = Vocales.contarvocales("Hola Mundo");
        assertEquals(4, resultado);
    }
    @Test
    public void testContarVocalesEstoEsUnaCadena() {
        int resultado = Vocales.contarvocales("Esto Es una cadenA");
        assertEquals(8, resultado);
    }
    @Test
    public void testContarVocalesJavaMolaMogollon() {
        int resultado = Vocales.contarvocales("Java mola MogollOn");
        assertEquals(7, resultado);
    }
    @Test
    public void testContarVocalesConNumeros() {
        int resultado = Vocales.contarvocales("4h0r4 s0n num3r0s");
        assertEquals(1, resultado);
    }
    @Test
    public void testContarVocalesCadenaS1nVocales() {
        int resultado = Vocales.contarvocales("Cadena S1n Vocales");
        assertEquals(6, resultado);
    }
}