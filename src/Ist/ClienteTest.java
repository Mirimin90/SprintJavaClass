package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    public void testAnalizarUsuario() {
        Cliente cliente = new Cliente("123456789", "AFP1", 1, "Dirección 123",
                "Comuna A", 30);

        // Ejecutar el método a probar
        cliente.analizarUsuario();

        // Verificar los resultados esperados utilizando assertions de JUnit
        Assert.assertEquals("123456789", cliente.getTelefono());
        Assert.assertEquals("AFP1", cliente.getAfp());
        Assert.assertEquals(1, cliente.getSistemaSalud());
        Assert.assertEquals("Dirección 123", cliente.getDireccion());
        Assert.assertEquals("Comuna A", cliente.getCadena());
        Assert.assertEquals(30, cliente.getEdad());
    }
}
