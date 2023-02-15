package sprintempresa;

import java.util.Scanner;
import java.lang.String;

/*
 * @author Luis Zenteno
 */
public class Usuario extends Validador{

    // Atributos propios de la clase
    String nombre;
    String fechaNacimiento;
    String rut;

    // Constructor vacío
    public Usuario() {
        super();
    }

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

    public String analizarUsuario(){

        return "\nNombre --> " + getNombre().toUpperCase() + "\nRut --> " + getRut();
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
}
