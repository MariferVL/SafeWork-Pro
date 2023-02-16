package ActividadesEmpresa;

import java.util.Scanner;

public class Revision extends ValidacionAbs {

    private String estadoRevision;

    public Revision(){
        super();
    }

    public Revision(String id, String rutCliente, String dia, String hora, String lugar, String origen,
            String estadoRevision) {
        super(id, rutCliente, dia, hora, lugar, origen);
        this.estadoRevision = estadoRevision;
    }

    public String validarEstado(String mensaje, Scanner sc){

        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[1-3]{1}")){

                if (input.equals("1")){
                    input = "sin problemas";

                    cond = false;

                }else if (input.equals("2")){
                    input = "con observaciones";

                    cond = false;

                }else {
                    input = "no aprueba";

                    cond = false;
                }
            }else{
                System.out.println("Dato ingresado no valido, intentelo nuevamente");
            }
        }
        return input;
    }


    @Override
    public String toString() {
        return "DATOS REVISION\n* Identificador Revision >> " + id + "\n* Identificador Visita Terreno >>  " + "\n* Estado Revision >> " + estadoRevision;
    }

    public String getEstadoRevision() {
        return estadoRevision;
    }

    public void setEstadoRevision(String estadoRevision) {
        this.estadoRevision = estadoRevision;
    }
    
}
