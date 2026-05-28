package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Vocales2Test {

    @Test
    public void testSinvocalesHolaMundo() {
        String resultado = Vocales2.sinvocales("Hola Mundo");
        assertEquals("Hl Mnd", resultado);
    }
    @Test
    public void testSinvocalesEstoEsUnaCadenaA() {
        String resultado = Vocales2.sinvocales("Esto Es una cadenA");
        assertEquals("st s n cdn", resultado);
    }
    @Test
    public void testSinvocalesJavaMolaMogollon() {
        String resultado = Vocales2.sinvocales("Java mola MogollOn");
        assertEquals("Jv ml Mglln", resultado);
    }
    @Test
    public void testSinvocalesNumeros() {
        String resultado = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        assertEquals("4h0r4 s0n nm3r0s", resultado);
    }
    @Test
    public void testSinvocalesCadenaSinVocales() {
        String resultado = Vocales2.sinvocales("Cadena Sin Vocales");
        assertEquals("Cdn Sn Vcls", resultado);
    }
}