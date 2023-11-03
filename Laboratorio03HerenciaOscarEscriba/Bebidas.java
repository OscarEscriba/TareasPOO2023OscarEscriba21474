package Laboratorio03HerenciaOscarEscriba;

public class Bebidas extends Emprendiento{
    private String Ml; 
    private String Tipo; 

    //constructores... 
    public Bebidas() {  
        super(); 
        Ml=""; 
        Tipo=""; 
    } 
    public Bebidas (String Ml, String Tipo,int idProducto, String nombre, 
    int cantidadVendida, int CantidadDisponible, String Estado, 
    double Precio, String Categoria) { 
        super(idProducto, nombre, cantidadVendida, CantidadDisponible, Estado, Precio, Categoria); 
        this.Ml=Ml; 
        this.Tipo=Tipo; 
    } 
    //metodos get y set... 

    public String getMl() {
        return this.Ml;
    }

    public void setMl(String Ml) {
        this.Ml = Ml;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
        @Override
    public String toString() {
        return "{" +
            " Ml='" + getMl() + "'" +
            ", Tipo='" + getTipo() + "'" +
            "}";
    }

}

