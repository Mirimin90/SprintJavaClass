package Ist;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapacitacionTest {
    @Test
    public void testMostrarDetalle() {
        int id = 1;
        String rut = "123456789";
        String dia = "2023-06-08";
        String hora = "10:00";
        String lugar = "Sala de conferencias";
        String duracion = "60";
        int cantidadAsistentes = 20;

        Capacitacion capacitacion = new Capacitacion(id, rut, dia, hora, lugar, duracion, cantidadAsistentes);

        // Redirigir la salida estándar para capturarla en una variable
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Llamar al método mostrarDetalle()
        capacitacion.mostrarDetalle();

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Obtener la salida generada por el método mostrarDetalle()
        String output = outputStream.toString().trim();

        // Verificar el resultado esperado
        String expectedOutput = "La capacitación será en Sala de conferencias a las 10:00 del día 2023-06-08, y durará 60 minutos";
        assertEquals(expectedOutput, output);
    }
}

