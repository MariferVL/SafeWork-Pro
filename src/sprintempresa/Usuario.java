package sprintempresa;

import java.util.Scanner;
import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Luis Zenteno
 */
public class Usuario implements Asesoria{

    // Atributos propios de la clase
    String nombre;
    String fechaNacimiento;
    String rut;

    // Constructor vacío
    public Usuario() {}

    // Constructor con parametros
    public Usuario(String nombre, String fechaNacimiento, String rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "DATOS USUARIO\nNombre --> " + nombre + "\nfechaNacimiento --> " + fechaNacimiento + "\nrut --> " + rut;
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

    public String validarNombreTitulo(String mensaje, Scanner sc){

        boolean cond = true;
        String input = "";

        while (cond){

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{10,50}")){

                cond = false;
            }else{
                System.out.println("Datos ingresados no validos, ingresa un nombre nuevamente");
            }
        }

        return input;
    }

    public String mostrarEdad(){

        String fecha = this.getFechaNacimiento();
		String[] elementos = fecha.split("/");

		int anio = Integer.parseInt(elementos[2]);
		int edad = 2023 - anio;

			return "\nEl usuario " + this.nombre.toUpperCase() + " tiene " + edad + " años";
    }
    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public void analizarUsuario() {
        // TODO Auto-generated method stub

        System.out.println("\nNombre --> " + getNombre() + "\nRut --> " + getRut());
        

    }
}
