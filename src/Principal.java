import Ist.Contenedor;
import java.util.Scanner;

public class Principal {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }
    public static void menu() {
        int op;
        Contenedor contenedor = new Contenedor();
        do {
            muestraMenu();
            System.out.println("Selecciona la opción del menú: ");
            op = opcionDeMenu();
            switch (op) {
                case 1: {
                    contenedor.almacenarCliente();
                    break;
                }
                case 2: {
                    contenedor.almacenarProfesional();
                    break;
                }
                case 3: {
                    contenedor.almacenarAdministrativo();
                    break;
                }
                case 4: {
                    contenedor.almacenarCapacitacion();
                    break;
                }
                case 5: {
                    contenedor.eliminarUsuario();
                    break;

                }
                case 6: {
                    contenedor.listarUsuarios();
                    break;
                }
                case 7: {
                    contenedor.listarUsuarioTipo();
                    break;
                }
                case 8: {
                    contenedor.listarCapacitaciones();
                    break;
                }
                case 0: {
                    contenedor.mostrarEdad();
                    System.out.println("Ud. ha salido del sistema");
                    //break;
                }
                default: {
                    System.out.println("Debe ingresar una opción del menú");
                }
            }
        } while (op != 0);
    }
    public static void muestraMenu() {
        System.out.println("===========================");
        System.out.println(" MENÚ PRINCIPAL");
        System.out.println("---------------------------");
        System.out.println("1. Almacenar cliente");
        System.out.println("2. Almacenar Profesional");
        System.out.println("3. Almacenar administrativo");
        System.out.println("4. Almacenar capacitación");
        System.out.println("5. Eliminar usuario");
        System.out.println("6. Listar usuario");
        System.out.println("7. Listar usuarios por tipo");
        System.out.println("8. Listar capacitaciones");
        System.out.println("0. Salir");
        System.out.println("---------------------------");
    }

    public static int opcionDeMenu() {
        return entrada.nextInt();
    }

}