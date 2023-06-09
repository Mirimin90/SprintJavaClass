package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    public void testMostrarEdad() {
        Usuario usuario = new Usuario("12345678-9", "John", "Doe", "01-01-1990", 1);

        // Ejecutar el método a probar
        usuario.mostrarEdad();
    }

    @Test
    public void testAnalizarUsuario() {
        Usuario usuario = new Usuario("12345678-9", "John", "Doe", "01-01-1990", 1);

        // Ejecutar el método a probar
        usuario.analizarUsuario();

        // Verificar los resultados esperados utilizando assertions de JUnit
        Assert.assertEquals("12345678-9", usuario.getRun());
        Assert.assertEquals("John", usuario.getNombres());
        Assert.assertEquals("Doe", usuario.getApellidos());
        Assert.assertEquals("01-01-1990", usuario.getFechaNac());
    }

}
