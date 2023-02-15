package sprintempresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validador {

    String fecha,rut;

    public Validador() {
    }

    public String validarFecha(String mensaje, Scanner sc) {

        boolean condFecha = true;
        String input = "";

        while (condFecha) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
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

    public String validarRut(String mensaje, Scanner sc) {

        boolean condRut = true;
        String input = "";

        while (condRut) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("\\d{2}.\\d{3}.\\d{3}")) {

                condRut = false;
            } else {

                System.out.println("Rut ingresado no valido, intentalo nuevamente");
            }
        }
        return input;
    }
}