package ActividadesEmpresa;

import java.util.Scanner;

/**
 * @author Luis Zenteno
 * @author Barbara Carvajal
 * @author Maria Fernanda Villalobos
 * 
 *         Esta clase representa una sesión de capacitación que extiende una
 *         clase abstracta para fines de validación.
 */
public class Capacitacion extends ValidacionAbs {

    /**
     * Atributos privados solo accesados por la clase Capacitacion
    */
    private String duracion;
    private String cantidadAsistentes;

    /**
     * Constructor sin argumentos que llama al constructor de la superclase ValidacionAbs
    */
    public Capacitacion() {
        super();
    }

/**
     * Constructor de la clase con parámetros.
     * 
     * @param id         el identificador de la sesión de capacitación
     * @param rutCliente el RUT del cliente que solicita la sesión de capacitación
     * @param dia        el día de la semana en que se realizará la sesión de capacitación
     * @param hora       la hora en que se realizará la sesión de capacitación
     * @param lugar      el lugar donde se realizará la sesión de capacitación
     * @param origen     el origen de la solicitud de la sesión de capacitación
*/

    public Capacitacion(String id, String rutCliente, String dia, String hora, String lugar, String origen) {
        super(id, rutCliente, dia, hora, lugar, origen);
    }

    /**
     * Método para validar la cantidad de asistentes de una sesión de capacitación.
     *
     * @param mensaje el mensaje que se mostrará al usuario al solicitar la cantidad de asistentes
     * @param sc      el objeto Scanner utilizado para recibir la entrada del usuario
     * @return        una cadena de texto que representa la cantidad de asistentes validada
     */
    public String validarAsistentes(String mensaje, Scanner sc) {

        boolean cond = true;
        String input = "";

        while (cond) {

            // Se muestra el mensaje al usuario
            System.out.print("\n" + mensaje);

            // Se recibe la entrada del usuario
            input = sc.nextLine();

            // Se verifica si la entrada del usuario es una cadena de texto que contiene solo dígitos numéricos
            if (input.matches("[0-9]{1,3}")) {

                // Si la entrada es válida, se convierte en un número entero
                int asistentes = Integer.parseInt(input);

                 // Se verifica si el número está dentro del rango permitido de 1 a 999
                if (asistentes > 0 && asistentes < 1000) {

                    cond = false;

                } else {
                    System.out.println("La cantidad asistentes no está dentro del rango indicado");
                }
            } else {
                System.out.println("Datos ingresados no validos, intentelo nuevamente");
            }
        }
        // Se devuelve la entrada del usuario validada como una cadena de texto
        return input;
    }

    public String validarDuracion(String mensaje, Scanner sc) {

        boolean condicion = true;
        String input = "";

        while (condicion) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine();

        /*
             * Esta sección utilizada para la validacion de la duración de un evento, valida
             * que lo ingresado por el usuario sean solo números .
             * Si la duración del evento está en un rango de 1 a 5, el ciclo continuará.
             * Si lo ingresado por el usuario no es un dato numerico ni esta dentro del
             * rango establecido, el ciclo volverá a repetirse para pedir los datos
             * nuevamente.
        */
            if (input.matches("[1-5]{1}")) {

                condicion = false;
            } else {

                System.out.println("Cantidad de horas no valida, intentelo nuevamente");
            }
        }
        return input;
    }

    // transformar la hora a minutos.

    public String transformarHora() {

         // Se obtiene la duración de la capacitación en horas
        int horas = Integer.parseInt(this.getDuracion());

         // Se obtiene la duración de la capacitación en horas
        int minutos = horas * 60;

        // Se convierte la duración de la capacitación en minutos a una cadena de texto
        String min = Integer.toString(minutos);

        return min;
    }

    /**
     * El método concatena varias cadenas de texto y los valores de ciertos atributos 
     * para formar una cadena de texto más larga que describe la capacitación.
     * 
     * @return Retorna un mensaje con el texto “La capacitación será en A (lugar) a las B(hora) del día C, y durará D minutos”.
     */

    public String mostrarDetalle() {

        String detalle = "La capacitación será en " + this.getLugar() + " a las " + this.getHora() + " del día "
                + this.getDia() + " y durará " + this.transformarHora() + " minutos.";
        return detalle;
    }

    /**
     * Metodos getter/setter
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(String cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

}