package Ist;

public class Capacitacion {

    /**
     * Declaración de variables para uso de la clase Capacitación
     */
    private int id;
    private String rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    /**
     * Creación del constructor vacío
     */
    public Capacitacion() {
    }

    /**
     * Creación del constructor con todos los parámetros
     * @param id Registra id de identificación de la capacitación
     * @param rut Registra el rut de la empresa
     * @param dia Resgitra el día de la capacitación
     * @param hora Registra la hora de la capacitación
     * @param lugar Registra el lugar de la capacitación
     * @param duracion Registra la duración de la capacitación
     * @param cantidadAsistentes Registra la cantidad de asistentes de la capacitación
     */

    public Capacitacion(int id, String rut, String dia, String hora, String lugar,
                        String duracion, int cantidadAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Creación de los métodos getters and setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Creación del método Tostring
     * @return
     */
    @Override
    public String toString() {
        return "Capacitación{" +
                "ID=" + id +
                ", RUT='" + rut + '\'' +
                ", Día='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Duración='" + duracion + '\'' +
                ", Cantidad de Asistentes=" + cantidadAsistentes +
                '}';
    }

    /**
     * Creación del método mostrar detalle, que entrega la información relativa
     * a la capacitación
     */
    public void mostrarDetalle(){
        System.out.println("La capacitación será en " + lugar + " a las " + hora + " del día " + dia +
                ", y durará " + duracion + " minutos");
    }
}
