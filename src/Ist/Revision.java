package Ist;

public class Revision {

    /**
     * Declaración de variables de la clase revision
     */
    private int id;
    private int id_visita;
    private String nomRevision;
    private String detRevision;
    private int estado;

    /**
     * Creación del constructor vavío
     */
    public Revision() {
    }

    /**
     * Creación del constructor con todos los métodos
     * @param id Identificador de la revisión
     * @param id_visita Identificador de la visita a terreno
     * @param nomRevision Nombre de la revisión
     * @param detRevision Detalle de la revisión
     * @param estado estado de la revisión
     */
    public Revision(int id, int id_visita, String nomRevision, String detRevision, int estado) {
        this.id = id;
        this.id_visita = id_visita;
        this.nomRevision = nomRevision;
        this.detRevision = detRevision;
        this.estado = estado;
    }

    /**
     * Creación de getters a setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public String getNomRevision() {
        return nomRevision;
    }

    public void setNomRevision(String nomRevision) {
        this.nomRevision = nomRevision;
    }

    public String getDetRevision() {
        return detRevision;
    }

    public void setDetRevision(String detRevision) {
        this.detRevision = detRevision;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Creación del método toString
     * @return
     */
    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", id_visita=" + id_visita +
                ", nomRevision='" + nomRevision + '\'' +
                ", detRevision='" + detRevision + '\'' +
                ", estado=" + estado +
                '}';
    }
}
