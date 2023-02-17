package ActividadesEmpresa;

public class VisitaTerreno extends ValidacionAbs {
     private String comentarios;

    public VisitaTerreno(){
        super();
    }
    
    public VisitaTerreno(String id, String rutCliente, String dia, String hora, String lugar, String comentarios) {
        super(id, rutCliente, dia, hora, lugar);
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "\nDATOS REVISION\n\n* Comentarios --> " + comentarios;
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
