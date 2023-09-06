package sprintempresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import ActividadesEmpresa.*;;

/**
 * @author Luis Zenteno
 * @author Maria-Fernanda Villalobos
 * @author Bárbara Carvajal
 */



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
            System.out.println("(5).- ELIMINAR USUARIO");
            System.out.println("(6).- LISTAR USUARIOS");
            System.out.println("(7).- LISTAR USUARIOS POR TIPO");
            System.out.println("(8).- LISTAR CAPACITACIONES");
            System.out.println("(9).- >> SALIR");

            System.out.print("\nELIJA UNA OPCIÓN [1-2-3-4-5-6-7-8-9] --> ");
            String opc = sc.nextLine();

            if (opc.matches("[1-9]{1}")){
                
            switch (opc) {

                case "1":
                    System.out.println("ALMACENAR CLIENTE");
                    contenedor.almacenarCliente();
                    break;

                case "2":
                    System.out.println("ALMACENAR PROFESIONAL");
                    contenedor.almacenarProfesional();
                    break;

                case "3":
                    System.out.println("ALMACENAR ADMINISTRATIVO");
                    contenedor.almacenarAdministrativo();
                    break;

                case "4":
                    System.out.println("ALMACENAR CAPACITACION");
                    contenedor.almacenarCapacitacion();
                    break;

                case "5":
                    System.out.println("ELIMINAR USUARIO");
                    contenedor.eliminarUsuario();
                    break;

                case "6":
                    System.out.println("LISTAR USUARIOS");
                    contenedor.listarUsuarios();
                    break;

                case "7":
                    System.out.println("LISTAR USUARIOS POR TIPO");
                    contenedor.listarUsuariosPorTipo();
                    break;

                case "8":
                    System.out.println("LISTAR CAPACITACIONES");
                    contenedor.listarCapacitaciones();
                    break;

                case "9":
                    System.out.println("FIN DEL PROGRAMA");
                    condMenu = false;
                    break;

                default: {
                    System.out.println("Opcion ingresada no valida, intentalo nuevamente");
                }
            }
            }else{
                System.out.println("Opcion ingresada no valida");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
    
    }
}
