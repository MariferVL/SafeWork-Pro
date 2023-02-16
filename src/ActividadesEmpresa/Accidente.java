package ActividadesEmpresa;

public class Accidente extends ValidacionAbs{
    
    String origen;
    String consecuencias;

    public Accidente(){
        super();
    }

    public Accidente(String id, String rutCliente, String dia, String hora, String lugar, String origen,
            String consecuencias) {
        super(id, rutCliente, dia, hora, lugar);
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "\nDATOS ACCIDENTE\n\n* Origen --> " + origen + "\n* Consecuencias=" + consecuencias;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    

    
    
}
