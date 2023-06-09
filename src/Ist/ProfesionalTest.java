package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProfesionalTest {
    @Test
    public void testAnalizarUsuario() {
        Profesional profesional = new Profesional("Ingeniero");
        profesional.setFechaIngreso("2022-01-01");

        // Ejecutar el método a probar
        profesional.analizarUsuario();

        // Verificar los resultados esperados utilizando assertions de JUnit
        Assert.assertEquals("Ingeniero", profesional.getTitulo());
        Assert.assertEquals("2022-01-01", profesional.getFechaIngreso());
    }
}
