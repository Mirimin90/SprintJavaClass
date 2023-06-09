package Ist;

/**
 * Clase Cliente que extiende de usuario
 */
public class Cliente extends Usuario {
    private String telefono;
    private String afp;
    private String SistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    /**
     * Creación del constructor vacío
     */
    public Cliente() {
    }

    /**
     * Creación del constructor con todos los parámetros
     * @param telefono Registra el teléfono del cliente
     * @param afp Registra la AFP del cliente
     * @param sistemaSalud Resgistra el sistema de salud del cliente 1. Fonasa.
     *                     2. Isapre
     * @param direccion Registra la dirección del cliente
     * @param comuna Registra la comuna del cliente
     * @param edad Resgitra la edad del cliente
     */
    public Cliente(String telefono, String afp, String sistemaSalud, String direccion,
                   String comuna, int edad) {
        this.telefono = telefono;
        this.afp = afp;
        this.SistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * Creación de los métodos getters and setters
     * @return
     */
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

    public String getSistemaSalud() {
        return SistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
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

    /**
     * Creación del método ToString
     * @return
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "Teléfono='" + telefono + '\'' +
                ", AFP='" + afp + '\'' +
                ", Sistema de Salud=" + SistemaSalud +
                ", Dirección='" + direccion + '\'' +
                ", Comuna='" + comuna + '\'' +
                ", Edad=" + edad +
                '}';
    }

    /**
     * Creación del método analizar usuario
     */
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Teléfono: " + telefono);
        System.out.println("Afp: " + afp);
        System.out.println("Sistema de Salud: " + SistemaSalud);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Edad: " + edad);
    }

    /**
     * Metodo obtener nombre que llama a super usuario para recuperarlo
     */
    public void obtenerNombre() {
        System.out.println("Nombre:: " + super.getNombres() + " " +
                super.getApellidos());
    }

    /**
     * Creación del método sistemaSalud que recibe parámetros integer y devuelve
     * Fonasa o Isapre de acuerdo al caso
     * @param sistemaSalud integer para analizar
     * @return un String dato de Fonasa o Isapre
     */
    private String obtenerSistemaSalud(int sistemaSalud) {
        String salud;

        if (sistemaSalud == 1);{
            salud = "Fonasa";
        }
        if (sistemaSalud == 2);{
            salud="Isapre";
        }
        return salud;
    };
}
