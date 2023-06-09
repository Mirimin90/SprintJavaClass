package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ValidadorTest {
    @Test
    public void testValidaFecha() {
        // Caso de prueba válido
        Assert.assertTrue(Validador.validaFecha("31/12/2022"));

        // Caso de prueba inválido
        Assert.assertFalse(Validador.validaFecha("31/12/22"));
        Assert.assertFalse(Validador.validaFecha("31-12-2022"));
        Assert.assertFalse(Validador.validaFecha("2022/12/31"));
        Assert.assertFalse(Validador.validaFecha("31/13/2022"));
        Assert.assertFalse(Validador.validaFecha("31/12/abcd"));
    }

    @Test
    public void testValidaRun() {
        // Caso de prueba válido
        Assert.assertTrue(Validador.validaRun("12345678-9"));

        // Caso de prueba inválido
        Assert.assertFalse(Validador.validaRun("12345678-91"));
        Assert.assertFalse(Validador.validaRun("12345678-ab"));
        Assert.assertFalse(Validador.validaRun("123456789-0"));
    }

    @Test
    public void testValidaHora() {
        // Caso de prueba válido
        Assert.assertTrue(Validador.validaHora("12:00"));

        // Caso de prueba inválido
        Assert.assertFalse(Validador.validaHora("12:60"));
        Assert.assertFalse(Validador.validaHora("24:00"));
        Assert.assertFalse(Validador.validaHora("12:0"));
        Assert.assertFalse(Validador.validaHora("abcde"));
    }

    @Test
    public void testValidaDia() {
        // Caso de prueba válido
        Assert.assertTrue(Validador.validaDia("lunes"));

        // Caso de prueba inválido
        Assert.assertFalse(Validador.validaDia("domingo1"));
        Assert.assertFalse(Validador.validaDia("Martes"));
        Assert.assertFalse(Validador.validaDia("JUEVES"));
        Assert.assertFalse(Validador.validaDia("sabad0"));
    }

}
