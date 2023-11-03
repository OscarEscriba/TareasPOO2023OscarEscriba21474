package Laboratorio03HerenciaOscarEscriba;
public class Juguetes extends Emprendiento {
    private String TamanioJ; 
    private String TipoJ; 

    //constructores
    public Juguetes(){ 
        super(); 
        TamanioJ=""; 
        TipoJ=""; 
    } 
    public Juguetes(String TamanioJ, String TipoJ,int idProducto, String nombre, int cantidadVendida, int CantidadDisponible, String Estado, double Precio, String Categoria) { 
        super(idProducto, nombre, cantidadVendida, CantidadDisponible, Estado, Precio, Categoria); 
        this.TamanioJ=TamanioJ; 
        this.TipoJ=TipoJ; 
    } 
    //metodos get y set 

    public String getTamanioJ() {
        return this.TamanioJ;
    }

    public void setTamanioJ(String TamanioJ) {
        this.TamanioJ = TamanioJ;
    }

    public String getTipoJ() {
        return this.TipoJ;
    }

    public void setTipoJ(String TipoJ) {
        this.TipoJ = TipoJ;
    }
    @Override
    public String toString() {
        return "{" +
            " TamanioJ='" + getTamanioJ() + "'" +
            ", TipoJ='" + getTipoJ() + "'" +
            "}";
    }

}
