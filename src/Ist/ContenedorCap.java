package Ist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que manipula los datos relativos a las capacitaciones
 */
public class ContenedorCap {
    /**
     * Declaración de variables de tipo contador para las capacitaciones
     * Lista para almacenar las capacitaciones
     */
    private int cuentaCapacitacion = 1;
    private List<Capacitacion> capacitaciones;

    /**
     * creación de la lista capacitaciones
     */

     public ContenedorCap() {
        capacitaciones = new ArrayList<>();
    }

    /**
     * Método que lista las capacitaciones invocando al método mostrar detalle de la
     * clase capacitación
     */
    public void listarCapacitaciones(){
        for (Capacitacion capacitacion : capacitaciones) {
            capacitacion.mostrarDetalle();
        }
    }

    /**
     * Método que almacena las capacitaciones en la lista
     */
    public void almacenarCapacitacion(){

        Scanner entrada = new Scanner(System.in);
        Capacitacion capacitacion = new Capacitacion();

        capacitacion.setId(cuentaCapacitacion);

        /**
         * Ingreso de rut validando que no sea mayor a 99.999.999 y de caracter
         * obligatorio
         */

        String rut;
        do {
            System.out.println("Ingrese RUT de la empresa");
            rut = entrada.nextLine().trim();

            if (rut.isEmpty()) {
                System.out.println("El RUT es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            }
        } while (rut.isEmpty());

        capacitacion.setRut(rut);

        /**
         * Ingreso de día validando que sea de lunes a domingo
         */
        String dia;
        do {
            System.out.println("Ingrese día de la capacitación entre lunes y Domingo):");
            dia = entrada.nextLine().trim().toLowerCase();

            if (Validador.validaDia(dia)) {
                capacitacion.setDia(dia);
            } else {
                System.out.println("Día inválido. Intente nuevamente.");
            }
        } while (!Validador.validaDia(dia));


        /**
         * Ingreso de lugar validando que no sea un dato vacío y que sea mayor a 9
         * y menor que 51
         */
        String lugar;
        do {
            System.out.println("Ingrese lugar de la capacitación");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El lugar debe tener entre 10 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        capacitacion.setLugar(lugar);


        /**
         * Ingreso de la duración validando que no se ingresen mas de 70 caracteres.
         */
        String duracion;
        do {
            System.out.println("Ingrese duración de la capacitación");
            duracion = entrada.nextLine().trim();

            if (duracion.length() > 70) {
                System.out.println("La duración no debe sobrepasar los 70 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (duracion.length() > 70);


        /**
         * Ingreso de la hora validando el formato en HH:MM
         */

        String hora;
        do {
            System.out.println("Ingrese hora de la capacitación (formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                capacitacion.setHora(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));

        /**
         * Ingreso de cantidad de asistentes vaidando que sea un numero mayor a 0
         * y menor a 1001
         */
        int cantidad;
        do {
            System.out.println("Ingrese cantidad de asistentes a la capacitación\"");
            cantidad = entrada.nextInt();

            if (cantidad < 0  || cantidad > 1001) {
                System.out.println("La cantidad es obligatoria y debe ser entre 0 y 1000 asistentes");

            }
        } while (cantidad < 0  || cantidad > 1001);

        capacitacion.setCantidadAsistentes(cantidad);
        capacitaciones.add(capacitacion);

        cuentaCapacitacion = cuentaCapacitacion++;

    }


}
