package Ist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ContenedorAccTest {
    @Test
    public void testAlmacenarVisitaTerreno() {
        String input = "12345678-9\n31/12/2022\n12:00\nLugar de visita\nComentarios";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ContenedorAcc contenedorAcc = new ContenedorAcc();
        contenedorAcc.almacenarVisitaTerreno();

        // Verificar que se haya almacenado correctamente la visita a terreno
        // Puedes agregar aserciones adicionales según lo necesario
        // Por ejemplo, verificar el tamaño de la lista de visitas a terreno almacenadas

        // Assert.assertEquals(expectedSize, contenedorAcc.getVisitasTerreno().size());
    }

    @Test
    public void testAlmacenarRevision() {
        String input = "Nombre revisión\nDetalle revisión";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ContenedorAcc contenedorAcc = new ContenedorAcc();
        contenedorAcc.almacenarRevision();

        // Verificar que se haya almacenado correctamente la revisión
        // Puedes agregar aserciones adicionales según lo necesario
        // Por ejemplo, verificar el tamaño de la lista de revisiones almacenadas

        // Assert.assertEquals(expectedSize, contenedorAcc.getRevisiones().size());
    }

    @Test
    public void testAlmacenarAccidente() {
        String input = "12345678-9\n31/12/2022\n12:00\nLugar del accidente\nOrigen del accidente\nConsecuencias del accidente";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ContenedorAcc contenedorAcc = new ContenedorAcc();
        contenedorAcc.almacenarAccidente();

        // Verificar que se haya almacenado correctamente el accidente
        // Puedes agregar aserciones adicionales según lo necesario
        // Por ejemplo, verificar el tamaño de la lista de accidentes almacenados

        // Assert.assertEquals(expectedSize, contenedorAcc.getAccidentes().size());
    }

}
