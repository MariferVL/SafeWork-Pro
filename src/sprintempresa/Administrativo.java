package sprintempresa;

import java.util.Scanner;

public class Administrativo extends Usuario {

    String area;
    String experiencia;

    public Administrativo(){}

    public Administrativo(String nombre, String fechaNacimiento, String rut, String area, String experiencia) {
        super(nombre, fechaNacimiento, rut);
        this.area = area;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "DATOS ADMINISTRATIVO\n* Area --> " + area + "\n* Experiencia --> " + experiencia;
    }

    public String validarExperiencia(String mensaje, Scanner sc){
        
        boolean cond1 = true;
        String input = "";

        while (cond1){
            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[0-9]{1,100}")){
                cond1 = false;
            }else{
                System.out.println("Datos ingresados no validos, ingrese año de experiencia correctamente porfavor");
            }
        }
        return input;
    }

    public String validarArea(String mensaje, Scanner sc){
        
        boolean cond1 = true;
        String input = "";

        while (cond1){
            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{5,20}")){
                cond1 = false;
            }else{
                System.out.println("Datos ingresados no validos, ingrese un nombre para área correctamente porfavor");
            }
        }
        return input;
    }



    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    } 
}
