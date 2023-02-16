package ActividadesEmpresa;

public class Capacitacion{

    String id;
    String rutCliente;
    String dia;
    String hora;
    String lugar;
    String origen;
    String cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(String id, String rutCliente, String dia, String hora, String lugar, String origen,
            String cantidadAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    

    @Override
    public String toString() {
        return "Capacitacion [id=" + id + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora + ", lugar="
                + lugar + ", origen=" + origen + ", cantidadAsistentes=" + cantidadAsistentes + "]";
    }

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

    

    

    

}