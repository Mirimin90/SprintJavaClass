package Ist;

public class Profesional extends Usuario{
    /**
     * Declaración de variables de la clase
     */
    private String titulo;
    private String fechaIngreso;

    /**
     * Creación del constructor vacío
     */
    public Profesional() {
    }

    /**
     * Creación del constructor con todas las variables
     * @param titulo String que recibe el título del profesional
     * @param fechaIngreso String que recibe fecha de ingreso del profesional
     */
    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Creación de getters and setters
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Creación del método toString
     * @return
     */
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override

    /**
     * Creación del método analizar usuario invocando a la super clase
     */
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Titulo: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);

    }
}
