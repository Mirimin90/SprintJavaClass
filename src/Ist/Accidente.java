package Ist;

public class Accidente {

    /**
     * Declaración de variables para uso de la clase Accidente
     */
    private int id;
    private String run;
    private String fechaAccidente;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    /**
     * Creación del constructor vacío
     */
    public Accidente() {
    }

    /**
     * Creación del constructor con todos los parámetros
     * @param id registra la id del accidente
     * @param run registra el RUN del accidentado
     * @param fechaAccidente registra fecha del accidente
     * @param hora registra la hora del accidente
     * @param lugar registra lugar del accidente
     * @param origen  registra origen del accidente
     * @param consecuencias registra las consecuencias del accidente
     */
    public Accidente(int id, String run, String fechaAccidente, String hora,
                     String lugar, String origen, String consecuencias) {
        this.id = id;
        this.run = run;
        this.fechaAccidente = fechaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    /**
     * Creacion de gettes and setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    /**
     * Creación del método ToString
     * @return
     */

    @Override
    public String toString() {
        return "Accidentes{" +
                "id=" + id +
                ", run='" + run + '\'' +
                ", fechaAccidente='" + fechaAccidente + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
