package Ist;

public class Cliente extends Usuario {
    private String telefono;
    private String afp;
    private int SistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(String telefono, String afp, int sistemaSalud, String direccion,
                   String comuna, int edad) {
        this.telefono = telefono;
        this.afp = afp;
        SistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return SistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        SistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCadena() {
        return comuna;
    }

    public void setComuna(String cadena) {
        this.comuna = cadena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", SistemaSalud=" + SistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Teléfono: " + telefono);
        System.out.println("Afp: " + afp);
        System.out.println("Sistema de Salud: " + SistemaSalud);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Edad: " + edad);
    }

    private void obtenerNombre(){}
    private void obtenerSistemaSalud(){}
}
