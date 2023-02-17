package sprintempresa;

import java.util.Scanner;
import ActividadesEmpresa.*;;

/**
 * @author Luis Zenteno
 * @author Maria-Fernanda Villalobos
 * @author Bárbara Carvajal
 */

//Crear clase USUARIO con constructor vacio y con paramentros, metodo toString y GETTERS & SETTERS.
//Crear metodo mostrarEdad() para la clase USUARIO el cual retorna el mensaje “El  usuario tiene X años”.
//Crear el metodo analizarUsuario que despliegue el nombre y el RUN. Considere que esta clase debeimplementar la interface Asesoría.

//Crear clase CLIENTE con constructor vacio y con paramentros, metodo toString y GETTERS & SETTERS.
//Crear el método obtenerNombre(), que retorna un String con el nombre completodel cliente (nombres + apellidos).
//TODO: Crear el método obtenerSistemaSalud()  que de acuerdo al valor registrado en el objeto despliega el tipo de sistema de salud,
//Crear el método analizarUsuario() que debe desplegar los datos del método del mismo nombre correspondiente a la clase padre y la dirección del cliente junto con la comuna.

//Crear interface ASESORIA que debe tener declarado el método analizarUsuario ().

//Crear clase ADMMINISTRATIVO con constructor vacio y con paramentros, metodo toString y GETTERS & SETTERS.
//Crear el método analizarUsuario() debe mostrar los datos del método del mismo nombre de la clase padre,junto con el área a la que pertenece y su experiencia previa.

//Crear clase PROFESIONAL, con constructor vacio y con parametros, metodo toString y GETTERS & SETTERS.
//Crear método analizarUsuario(), el que debe desplegar los datos del método del mismo nombre de la clase padre, y el título y fecha de ingreso.

//TODO: Crear clase CAPACITACION, con constructor vacio y con parametros, metodo toString y GETTERS & SETTERS.
//TODO Crear el método mostrarDetalle(), que retorna el mensaje “La capacitación será en A a las B del día C, y durará D minutos”.

//TODO: Crear clase ACCIDENTE, con constructor vacio y con parametros, metodo toString y GETTERS & SETTERS.
//TODO: Crear clase VISITA TERRENO, con constructor vacio y con parametros, metodo toString y GETTERS & SETTERS.
//TODO: Crear clase REVISION, con constructor vacio y con parametros, metodo toString y GETTERS & SETTERS.

//TODO: Crear la clase CONTENEDOR deberá tener declarado como atributos una lista de instancias de la interface Asesoria, y una lista de objetos de la clase Capacitacion.
//TODO: Crear metodo Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.
//TODO: Crear metodo Almacenar profesional: permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria.
//TODO: Crear metodo Almacenar administrativo: permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria.
//TODO: Crear metodo Almacenar capacitación: permite agregar una nueva capacitación a la lista de instancias de la clase Capacitación.
//TODO: Crear metodo Eliminar usuario: permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario.
//TODO: Crear metodo Listar usuarios: permite desplegar la lista completa de usuarios,independiente del tipo, solo se deben desplegar los datos de la clase usuario.
//TODO: Crear metodo Listar usuarios por tipo: recibe un tipo de usuario (cliente, administrador o profesional), y retorna los datos respectivos.
//TODO: Crear metodo Listar capacitaciones que despliega las capacitaciones registradas en la lista respectiva, junto con los datos del cliente al que está asociada la capacitación


//TODO: Crear clase Principal, donde se crea una instancia de la clase Contenedor, lo que creará con ello las dos listas que considera esta clase. 
//TODO: Crear un menú principal con nueve opciones: ocho para las acciones indicadas en el listado y una opción para salir del programa.


public class SprintEmpresa {

    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        Contenedor contenedor = new Contenedor();
        boolean condMenu = true;

        while (condMenu) {

            System.out.println("\nMENU PRINCIPAL");
            System.out.println("------------------------");
            System.out.println("(1).- ALMACENAR CLIENTE");
            System.out.println("(2).- ALMACENAR PROFESIONAL");
            System.out.println("(3).- ALMACENAR ADMINISTRATIVO");
            System.out.println("(4).- ALMACENAR CAPACITACION");
            System.out.println("(5).- ELIMIANR USUARIO");
            System.out.println("(6).- LISTAR USUARIOS");
            System.out.println("(7).- LISTAR USUARIOS POR TIPO");
            System.out.println("(8).- LISTAR CAPACITACIONES");
            System.out.println("(1).- >> SALIR");

            System.out.print("\nELIJA UNA OPCIÓN [1-2-3-4-5-6-7-8-9] --> ");
            int opc = sc.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("ALMACENAR CLIENTE");
                    contenedor.almacenarCliente();
                    // despues quitar
                    condMenu = false;
                    break;

                case 2:
                    System.out.println("ALMACENAR PROFESIONAL");
                    condMenu = false;
                    break;

                case 3:
                    System.out.println("ALMACENAR ADMINISTRATIVO");
                    condMenu = false;
                    break;

                case 4:
                    System.out.println("ALMACENAR CAPACITACION");
                    condMenu = false;
                    break;

                case 5:
                    System.out.println("ELIMINAR USUARIO");
                    condMenu = false;
                    break;

                case 6:
                    System.out.println("LISTAR USUARIOS");
                    condMenu = false;
                    break;

                case 7:
                    System.out.println("LISTAR USUARIOS POR TIPO");
                    condMenu = false;
                    break;

                case 8:
                    System.out.println("LISTAR CAPACITACIONES");

                case 9:
                    System.out.println("FIN DEL PROGRAMA");
                    condMenu = false;
                    break;

                default: {
                    System.out.println("Opcion ingresada no valida, intentalo nuevamente");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Menu();
    
    }
}
