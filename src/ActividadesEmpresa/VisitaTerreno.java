package ActividadesEmpresa;

import java.util.Scanner;

public class VisitaTerreno extends ValidacionAbs {
     private String comentarios;

    public VisitaTerreno(){
        super();
    }
    
    public VisitaTerreno(String id, String rutCliente, String dia, String hora, String lugar, String origen,
            String comentarios) {
        super(id, rutCliente, dia, hora, lugar, origen);
        this.comentarios = comentarios;
    }

    public String validarDiaSemana(String mensaje, Scanner sc){
        boolean cond = true;
        String input = "";

        while (cond) {

            System.out.println("\n" + mensaje);
            input = sc.nextLine();

            if (input.matches("[a-z A-Z]{5,9}")){

                if (input.equals("lunes") || input.equals("martes") || input.equals("miercoles") || input.equals("jueves")
                    || input.equals("viernes") || input.equals("sabado") || input.equals("domingo")){
                        cond = false;
                    }else{
                        System.out.println("No has ingresado un dia de la semana correcto, intentalo nuevamente");
                    }
            }else{
                System.out.println("Dato ingresado no valido, intentalo nuevamente");
            }
        }
        return input;
    }

    @Override
    public String toString() {
        return "Revision [comentarios=" + comentarios + "]";
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setId(String id){
        this.id = id;
    }
}
