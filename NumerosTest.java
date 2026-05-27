package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class NumerosTest {
    @Test
    void testSonigualesTodosDiferentesCaso1() {
        assertEquals(2, Numeros.soniguales(4, 55, 7));
    }
    @Test
    void testSonigualesTodosDiferentesCaso2() {
        assertEquals(2, Numeros.soniguales(14, 23, 27));
    }
    @Test
    void testSonigualesPrimeroYUltimoIguales() {
        assertEquals(1, Numeros.soniguales(14, 55, 14));
    }
    @Test
    void testSonigualesDosPrimerosIguales() {
        assertEquals(1, Numeros.soniguales(14, 14, 33));
    }
    @Test
    void testSonigualesDosUltimosIguales() {
        assertEquals(1, Numeros.soniguales(32, 55, 55));
    }
    @Test
    void testSonigualesTodosIguales() {
        assertEquals(0, Numeros.soniguales(329, 329, 329));
    }
}