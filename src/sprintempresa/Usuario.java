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
        return "DATOS USUARIO\nNombre --> " + nombre + "\nFecha Nacimiento --> " + fechaNacimiento + "\nRut --> " + rut;
    }

    
    public String validarNombreApellido(String mensaje, Scanner sc) {

        boolean condNombre = true;
        String input = "";

        while (condNombre) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{5,30}")) {

                condNombre = false;
            } else {

                System.out.println("Datos ingresados no validos, intentalo nuevamente");
            }

        }
        return input;
    }

    public String validarTelefono(String mensaje, Scanner sc) {

        boolean condTel = true;
        String input = "";

        while (condTel) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[0-9]{8}")) {

                condTel = false;
            } else {
                System.out.println("Numero de telefono no valido, intentalo nuevamente");
            }
        }
        return input;
    }



    public String validarDireccion(String mensaje, Scanner sc) {

		boolean condicion2 = true;
		String input = "";

		while (condicion2) {

			System.out.print("\n" + mensaje);
			input = sc.nextLine().toLowerCase();

			if (input.matches("[a-z A-Z 0-9]{2,70}")) {

				condicion2 = false;
			} else {

				System.out.println("Direccion ingresada no valida, intentelo nuevamente");
			}
		}
		return input;
	}

    public String validarComuna(String mensaje, Scanner sc) {

		boolean condicion2 = true;
		String input = "";

		while (condicion2) {

			System.out.print("\n" + mensaje);
			input = sc.nextLine().toLowerCase();

			if (input.matches("[a-z A-Z 0-9]{2,50}")) {

				condicion2 = false;
			} else {

				System.out.println("Direccion ingresada no valida, intentelo nuevamente");
			}
		}
		return input;
	}

    public String validarEdad(String mensaje, Scanner sc) {

		boolean condEdad = true;
		String input = "";

		while (condEdad) {

			System.out.print("\n" + mensaje);
			input = sc.nextLine();

			if (input.matches("[0-9]{1,3}")) {

                int edad1 = Integer.parseInt(input);

                if (edad1 >= 0 && edad1 <= 150){

                    condEdad = false;
                }else{
                    System.out.println("La edad no está dentro del rango estimado, intentalo nuevamente");
                }
			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
			}

		}
		return input;
	}

    public String validarNombre(String mensaje, Scanner sc) {

        boolean condNombre = true;
        String input = "";

        while (condNombre) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{10,50}")) {

                condNombre = false;
            } else {

                System.out.println("Datos ingresados no validos, intentalo nuevamente");
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
