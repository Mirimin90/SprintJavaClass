package Ist;

/**
 * Clase administrativo, extiende de usuario
 */
public class Administrativo extends Usuario{

    /**
     * Declaración de variables para uso de la clase Administrativo
     */
    private String area;
    private String experiencia;

    /**
     * Creación del constructor vacío
     */
    public Administrativo() {
    }

    /**
     * Creación del constructor con todos los parámetros
     * @param area Registra el area del administrativo
     * @param experiencia registra la experiencia del administrativo
     */
    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }

    /**
     * Creación de métodos getters and setters
     * @return
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Creación del método ToString
     * @return
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "Área='" + area + '\'' +
                ", Experiencia='" + experiencia + '\'' +
                '}';
    }

    /**
     * Creación del método analizar usuario
     */
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Area: " + area);
        System.out.println("Experiencia: " + experiencia);

    }
}
