package sprintempresa;

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
        return "DATOS ADMINISTRATIVO\n* Area --> " + area + "\n* Experiencia=" + experiencia;
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
