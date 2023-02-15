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
        return "DATOS PROFESIONAL\nNombre --> " + nombre + "\nFecha nacimiento --> " + fechaNacimiento +  "\nTitulo --> " + titulo 
                + "\nFecha Ingreso --> " + fechaIngreso;
    }

    @Override
    public String analizarUsuario() {
        // TODO Auto-generated method stub
        return super.analizarUsuario() + "\nTitulo --> " + getTitulo() + "\nFecha Ingreso --> " + getFechaIngreso();
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
}