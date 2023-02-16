package sprintempresa;

import java.util.Scanner;

public class Cliente extends Usuario {

    String nombres;
    String apellidos;
    String telefono;
    String afp;
    String sistemaSalud;
    String direccion;
    String comuna;
    String edad;

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String fechaNacimiento, String rut, String nombres, String apellidos,
            String telefono, String afp, String sistemaSalud, String direccion, String comuna, String edad) {
        super(nombre, fechaNacimiento, rut);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "\nDATOS CLIENTE\n\nNombres --> " + nombres + "\napellidos --> " + apellidos + "\nrut --> " + rut
                + "\ntelefono --> " + telefono
                + "\nafp --> " + afp + "\nsistemaSalud --> " + sistemaSalud + "\ndireccion --> " + direccion
                + "\ncomuna --> " + comuna
                + "\nedad --> " + edad;
    }

    public String validarNombreApellido(String mensaje, Scanner sc) {

        boolean condNombre = true;
        String input = "";

        while (condNombre) {

            System.out.println("\n" + mensaje);
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

    public String validarAfp(String mensaje, Scanner sc) {

        boolean condAfp = true;
        String input = "";

        while (condAfp) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{3,9}")) {

                if (input.equals("uno") || input.equals("provida") || input.equals("habitat") || input.equals("cuprum")
                        || input.equals("capital") || input.equals("planvital")) {

                    condAfp = false;
                } else {
                    System.out.println("AFP no existente, intentalo nuevamente");
                }
            } else {
                System.out.println("Dato ingresado no valido, intentalo nuevamente");
            }
        }
        return input;
    }

    public String validarSalud(String mensaje, Scanner sc) {

		boolean condSalud = true;
		String input = "fonasa";

		while (condSalud) {

			System.out.print("\n" + mensaje);
			input = sc.nextLine().toLowerCase();

			if (input.matches("[1-2]+")) {

				if (input.equals("1") || input.equals("2")) {
					condSalud = false;
				} else {
					System.out.println("Sistema de salud no existente, intentalo nuevamente");
				}

			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public void analizarUsuario() {
        // TODO Auto-generated method stub
        super.analizarUsuario();
        System.out.println("\nDireccion --> " + getDireccion() + "\nComuna --> " + getComuna());
    }

}
