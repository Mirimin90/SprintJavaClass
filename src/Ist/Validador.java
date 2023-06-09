package Ist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que manipula y validad metodos comunes
 */
public class Validador {

    /**
     * Método de tipo booleano que devuelve un true si el formato es el correto y
     * false si es incorrecto
     * @param fecha recibe la fecha a evaluar
     * @return Verdadeo o falso
     */
    public static boolean validaFecha(String fecha) {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(fecha, formato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Método de tipo booleano que devuelve un true si:
     * la variable es mayor a 10 caracteres
     * Valida si son solo dígitos
     * Valida si el numero es mayor a 0 y menor a 99999999
     * false si es incorrecto
     * @param rut recibe rut a evaluar
     * @return Verdadeo o falso
     */
    public static boolean validaRun(String rut) {


        String rutNumberString = rut.split("-")[0];

        if (rut.length() > 10){
            return false;
        }
        if (!rutNumberString.matches("\\d+")) {
            return false;
        }
        int rutNumber = Integer.parseInt(rutNumberString);

        if (rutNumber >= 0 && rutNumber <= 99999999) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Método de tipo booleano: valida
     * El largo de la variable es disitinto de 5 HH:MM
     * Si el formato dividido por el caracter : se separa en 2 grupos de 2 caracteres
     * Lo separa en horas y minutos
     * Valida que la hora sea entre 0 y 23 y los minutos entre 0 y 59
     * false si es incorrecto
     * @param hora recibe hora a evaluar
     * @return Verdadeo o falso
     */
    public static boolean validaHora(String hora) {
        if (hora.length() != 5) {
            return false;
        }
        String[] partes = hora.split(":");
        if (partes.length != 2) {
            return false;
        }
        int horas, minutos;
        horas = Integer.parseInt(partes[0]);
        minutos = Integer.parseInt(partes[1]);
        return horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
    }

    /**
     * Metodo que valida si es un dia se semana entre lunes y domingo
     * @param dia
     * @return
     */
    public static boolean validaDia(String dia) {
        return dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") ||
                dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado") ||
                dia.equals("domingo");
    }


}
