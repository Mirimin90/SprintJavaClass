package Ist;



public class Usuario implements Iasesoria{
    private String nombres;
    private String apellidos;
    private String fechaNac;
    private String run;
    private int tipo;

    public Usuario() {
    }

    public Usuario(String run,String nombre, String apellido,String fechaNac,int tipo) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.fechaNac = fechaNac;
        this.run = run;
        this.tipo = tipo;
    }

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

    public void mostrarEdad(){
        Contenedor contenedor = new Contenedor();
        contenedor.mostrarEdad();
    }

    public void analizarUsuario() {
        System.out.println("RUN: " + run);
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }

}
