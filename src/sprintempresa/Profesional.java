package sprintempresa;

public class Profesional extends Usuario {

    String titulo;
    String fechaIngreso;

    public Profesional(){
        super();
    }

    public Profesional(String nombre, String fechaNacimiento, String rut, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, rut);

        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "\nDATOS PROFESIONAL\n\nNombre --> " + nombre + "\nFecha nacimiento --> " + fechaNacimiento +  "\nTitulo --> " + titulo 
                + "\nFecha Ingreso --> " + fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        // TODO Auto-generated method stub
        super.analizarUsuario();
        System.out.println("\nTitulo --> " + getTitulo() + "\nFecha Ingreso --> " + getFechaIngreso());
    }
}
