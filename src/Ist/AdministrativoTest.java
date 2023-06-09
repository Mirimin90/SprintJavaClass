package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AdministrativoTest {
    @Test
    public void testAnalizarUsuario() {
        Administrativo administrativo = new Administrativo("Administración", "10 años de experiencia");

        // Ejecutar el método a probar
        administrativo.analizarUsuario();

        // Verificar los resultados esperados utilizando assertions de JUnit
        Assert.assertEquals("Administración", administrativo.getArea());
        Assert.assertEquals("10 años de experiencia", administrativo.getExperiencia());
    }
}
