package Ist;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Clase donde se implementa la interfaz asesoria
 */
public class Usuario implements Iasesoria{
    private String nombres;
    private String apellidos;
    private String fechaNac;
    private String run;
    private int tipo;

    /**
     * Creación del constructor vacío
     */

    public Usuario() {
    }

    /**
     * Creación del constructor con todos los parámetros
     * @param run recibe el run del usuario
     * @param nombre recibe el nombre del usuario
     * @param apellido recibe el apellido del usuario
     * @param fechaNac recibe la fecha de nacimiento del usuario
     * @param tipo recibe el tipo de usuario 1. Cliente,2 Profesional, 3 administrativo
     */
    public Usuario(String run,String nombre, String apellido,String fechaNac,int tipo) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.fechaNac = fechaNac;
        this.run = run;
        this.tipo = tipo;
    }

    /**
     * Creación de getters and setter
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fecha) {
        this.fechaNac = fecha;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int run) {
        this.tipo = run;
    }

    /**
     * Creación del método toString
     * @return
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombres + '\'' +
                ", apellido='" + apellidos + '\'' +
                ", fecha='" + fechaNac + '\'' +
                ", run='" + run + '\'' +
                ", run='" + tipo + '\'' +
                '}';
    }

   /**
     * Creación del metodo mostrar edad, la que calcula la fecha de nacimiento con
     * la fecha actual
     */
    public void mostrarEdad(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaNacimiento = getFechaNac();
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        int edad = periodo.getYears();
        System.out.println("La edad actual es: " + edad + " años.");
    }

=======
    /**
     * Metodo analizar usuario que muestra por pantalla nombre, Apellido, Run,
     * feha de nacimiento, se invoca ademas de las clases hijas
     */

    public void analizarUsuario() {
        System.out.println("RUN: " + run);
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }

}
