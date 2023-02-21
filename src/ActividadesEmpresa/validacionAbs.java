package ActividadesEmpresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * Clase abstracta que contiene los atributos y métodos básicos de validación de los objetos de capacitación.
*/
public abstract class ValidacionAbs {

    String id;
    String rutCliente;
    String dia;
    String hora;
    String lugar;

    /**
     * Constructor por defecto de la clase.
    */ 
    public ValidacionAbs(){}

    /**
     * Constructor de la clase con todos los atributos.
     *
     * @param id         Identificador de la capacitación.
     * @param rutCliente Rut del cliente que contrata la capacitación.
     * @param dia        Día en que se realizará la capacitación.
     * @param hora       Hora en que se realizará la capacitación.
     * @param lugar      Lugar donde se realizará la capacitación.
     * @param origen     Origen de la solicitud de la capacitación.
    */
    public ValidacionAbs(String id, String rutCliente, String dia, String hora, String lugar) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String validarId(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[0-9]{4}")) {

                cond = false;
            } else {
                System.out.println("Identificador no valido, intentalo nuevamente");
            }
        }
        return input;
    }

    public String validarRun(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();
            
                if (input.matches("\\d{2}.\\d{3}.\\d{3}")){
                cond = false;

            } else {
                System.out.println("Rut ingresado no valido, intentalo nuevamente");
            }
        }
        return input;
    }

    public String fechaDia(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false); // establecer en falso para validación estricta

            try {
                format.parse(input);
                cond = false;

            // Se intenta parsear la entrada del usuario con el formato definido
            } catch (ParseException e) {
                System.out.println(input + " no es una fecha válida, intentalo nuevamente");
            }

        }
        return input;
    }

    public String validarHora(String mensaje, Scanner sc) {

        boolean condFecha = true;
        String input = "";

        while (condFecha) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            // Creamos un formato para validar la hora
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            format.setLenient(false); // establecer en falso para validación estricta

            try {
                format.parse(input);
                condFecha = false;

             // Se intenta parsear la entrada del usuario con el formato definido
            } catch (ParseException e) {
                System.out.println(input + " no es una fecha válida, intentalo nuevamente");
            }

        }
        return input;

    }

    public String validarLugar_NombreRev(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z 0-9]{10,50}")) {
                cond = false;
            } else {
                System.out.println("Dato ingresado no valido, intentalo nuevamente");
            }

        }
        return input;
    }

    public String validarDetalleComentariosOrigen(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z 0-9]{1,100}")) {

                cond = false;
            } else {
                System.out.println("Datos ingresados no validos, intentelo nuevamente");
            }
        }
        return input;
    }
}
