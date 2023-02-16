package ActividadesEmpresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class validacionAbs {

    public String validarId(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.println("\n" + mensaje);
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

            System.out.println("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[\\d{2}.\\d{3}.\\d{3}]")) {
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

            System.out.println("\n" + mensaje);
            input = sc.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false); // establecer en falso para validación estricta

            try {
                format.parse(input);
                cond = false;

            } catch (ParseException e) {
                System.out.println(input + " no es una fecha válida, intentalo nuevamente");
            }

        }
        return input;
    }

    public String validarHora(String mensaje, Scanner sc){

        boolean condFecha = true;
        String input = "";

        while (condFecha) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("HH:MM");
            format.setLenient(false); // establecer en falso para validación estricta

            try {
                format.parse(input);
                condFecha = false;

            } catch (ParseException e) {
                System.out.println(input + " no es una fecha válida, intentalo nuevamente");
            }

        }
        return input;

    }

    public String validarLugar(String mensaje, Scanner sc){

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[a-z A-Z 0-9]{10,50}")){
                cond = false;
            }else{
                System.out.println("Dato ingresado no valido, intentalo nuevamente");
            }

        }
        return input;
    }

}
