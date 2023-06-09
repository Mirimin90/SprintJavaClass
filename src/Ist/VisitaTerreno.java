package Ist;

public class VisitaTerreno {
    /**
     * Declaración de variables de la clase VisitaTerreno
     */
    private int id;
    private String run;
    private String fechaVisita;
    private String horaVisita;
    private String lugar;
    private String comentarios;

    /**
     * Creador del constructor vacío
     */
    public VisitaTerreno() {
    }

    /**
     * Creación del constructor con parámetros
     * @param id recibe identificador de visita a terreno
     * @param run recibe el run del visitador
     * @param fechaVisita recibe la fecha de visita a terreno
     * @param horaVisita recibe la hora de la visita a terreno
     * @param lugar recibe el lugar de la visita a terreno
     * @param comentarios recibe los comentarios de la visita a terreno
     */
    public VisitaTerreno(int id, String run, String fechaVisita, String horaVisita,
                         String lugar, String comentarios) {
        this.id = id;
        this.run = run;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    /**
     * Creación de los getters and setters
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

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Creación del método toString
     */
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", run='" + run + '\'' +
                ", fechaVisita='" + fechaVisita + '\'' +
                ", horaVisita='" + horaVisita + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
