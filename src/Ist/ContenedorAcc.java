package Ist;

import java.util.Scanner;

/**
 * Clase que manipula los datos relativos al accidente
 */

public class ContenedorAcc {
    /**
     * Variable cuentaAccidente que es un contador para los accidentes
     */
    private int cuentaAccidente = 1;
    /**
     * Variable cuentaAccidente que es un contador para los las visitas a terreno
     */
    private int cuentaVisitaTerreno = 1;
    /**
     * Variable cuentaAccidente que es un contador para las revisiones
     */
    private int cuentaRevision = 1;

    /**
     * Método que que manipula el guardado de datos de una visita a terreno
     */
    public void almacenarVisitaTerreno(){
        Scanner entrada = new Scanner(System.in);
        VisitaTerreno visitaTerreno = new VisitaTerreno();

        visitaTerreno.setId(cuentaVisitaTerreno);

        /**
         * Ingreso de rut y valida que no sea mayor a 99.999.999
         */
        String rut;
        do {
            System.out.println("Ingrese RUT del visitador:");
            rut = entrada.nextLine().trim();

            if (Validador.validaRun(rut)) {
                visitaTerreno.setRun(rut);
            } else {
                System.out.println("RUT inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(rut));


        /**
         * Ingreso de fecha validando que sea el formato correcto y que no este vacía.
         */
        String fecha;
        do {
            System.out.println("Ingrese fecha de la visita (formato DD/MM/AAAA):");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha de visita es obligatoria. Por favor, " +
                        "ingrese una fecha válida.");
            } else if (!Validador.validaFecha(fecha)) {
                System.out.println("Fecha inválida. Por favor, ingrese una fecha " +
                        "en formato DD/MM/AAAA.");
            }
        } while (fecha.isEmpty() || ! Validador.validaFecha(fecha));

        visitaTerreno.setFechaVisita(fecha);

        /**
         * Ingreso de hora validando que formato de hora sea en HH:MM
         */

        String hora;
        do {
            System.out.println("Ingrese hora de la visita (formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                visitaTerreno.setHoraVisita(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));


        /**
         * Ingreso del lugar de la visita a terreno  validando que no sea un dato vacío y
         * que la cantidad de caracteres sea mayor que 9 y menor que 51
         */
        String lugar;
        do {
            System.out.println("Ingrese el lugar de la visita");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar de visita es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El dato lugar de visita debe tener entre 5 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        visitaTerreno.setLugar(lugar);

        /**
         * Ingreso del comentarios de la visita a terreno  validando que la
         * cantidad de caracteres no sea mayor a 100
         */

        String comentarios;
        do {
            System.out.println("Ingrese comentarios de la visita");
            comentarios = entrada.nextLine().trim();
            if (comentarios.length() > 100) {
                System.out.println("Los comentarios no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (comentarios.length() > 100);
        visitaTerreno.setComentarios(comentarios);
        cuentaAccidente = cuentaAccidente++;
    }


    /**
     * Método que que manipula el guardado de datos de una revision
     */
    public void almacenarRevision(){
        Scanner entrada = new Scanner(System.in);
        Revision revision = new Revision();

        revision.setId(cuentaRevision);
        revision.setId_visita(cuentaVisitaTerreno);

        /**
         * Ingreso del nombre de la revisión que no sea un dato vacio y
         * que la cantidad de caracteres sea mayor que 9 y menor que 51
         */
        String nombre;
        do {
            System.out.println("Ingrese un nombre alusivo a la revisión");
            nombre = entrada.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("El nombre alusivo a la revisión es obligatorio. " +
                        "Por favor, ingrese un dato válido.");
            } else if (nombre.length() < 10 || nombre.length() > 50) {
                System.out.println("El nombre alusivo a la revisión debe tener " +
                        "entre 5 y 50 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (nombre.isEmpty() || nombre.length() < 10 || nombre.length() > 50);
        revision.setNomRevision(nombre);


        /**
         * Ingreso del detalle de la revisión validando
         * que la cantidad de caracteres no sea mayor 100
         */
        String detalle;
        do {
            System.out.println("Ingrese detalle de la revisión");
            detalle = entrada.nextLine().trim();
            if (detalle.length() > 100) {
                System.out.println("El detalle no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (detalle.length() > 100);
        revision.setDetRevision(detalle);
        cuentaRevision = cuentaRevision++;
    }

    /**
     * Método que que manipula el guardado de datos de un accidente
     */
    public void almacenarAccidente(){
        Scanner entrada = new Scanner(System.in);
        Accidente accidente = new Accidente();

        accidente.setId(cuentaAccidente);

        /**
         * Ingreso de rut, valida que no sea mayor a 99.999.999
         */

        String run;
        do {
            System.out.println("Ingrese el RUN del accidentado:");
            run = entrada.nextLine().trim();

            if (Validador.validaRun(run)) {
                accidente.setRun(run);
            } else {
                System.out.println("RUN inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(run));

        /**
         * Ingreso de fecha validando que sea el formato correcto y que no este vacía.
         */

        String fecha;
        do {
            System.out.println("Ingrese fecha del accidente (formato DD/MM/AAAA):");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha de ingreso es obligatoria. Por favor, ingrese una fecha válida.");
            } else if (!Validador.validaFecha(fecha)) {
                System.out.println("Fecha inválida. Por favor, ingrese una fecha en formato DD/MM/AAAA.");
            }
        } while (fecha.isEmpty() || !Validador.validaFecha(fecha));

        accidente.setFechaAccidente(fecha);

        /**
         * Ingreso de hora validando que formato de hora en HH:MM
         */
        String hora;
        do {
            System.out.println("Ingrese la hora del accidente (formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                accidente.setHora(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));

        /**
         * Ingreso del lugar del accidente validando que nos ea un dato vacio y
         * que la cantidad de caracteres sea mayor 9 y menor que 51
         */

        String lugar;
        do {
            System.out.println("Ingrese lugar del accidente");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El dato el lugar  debe tener entre 5 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        accidente.setLugar(lugar);


        /**
         * Ingreso de origen del accidente vbalidando que no sean mas de 100 caracteres
         */
        String origen;
        do {
            System.out.println(" Explique el origen del accidente");
            origen = entrada.nextLine().trim();
            if (origen.length() > 100) {
                System.out.println("El origen no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, modifique su respuesta.");
            }

        } while (origen.length() > 100);
        accidente.setOrigen(origen);

        /**
         * Ingreso de las consecuencias del accidente validando que no sean más
         * de 100 caracteres
         */

        String consecuencia;
        do {
            System.out.println("Ingrese las consecuencias del accidente");
            consecuencia = entrada.nextLine().trim();
            if (consecuencia.length() > 100) {
                System.out.println("La información ingresada no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, modifique su respuesta.");
            }

        } while (consecuencia.length() > 100);
        cuentaAccidente = cuentaAccidente++;
    }
}
