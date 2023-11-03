package Laboratorio03HerenciaOscarEscriba;

public class Snacks extends Emprendiento {
    private String Gramos; 
    private String Sabor; 
    private String Tamanio; 

    public Snacks() { 
        super();
        Gramos =""; 
        Sabor =""; 
        Tamanio=""; 
    } 
    public Snacks(String Gramos, String Sabor, String Tamanio, int idProducto, String nombre, int cantidadVendida, int CantidadDisponible, String Estado, double Precio, String Categoria) { 
        super(idProducto, nombre, cantidadVendida, CantidadDisponible, Estado, Precio, Categoria); 
        this.Gramos=Gramos; 
        this.Sabor=Sabor; 
        this.Tamanio=Tamanio; 
    } 

    public String getGramos() {
        return this.Gramos;
    }

    public void setGramos(String Gramos) {
        this.Gramos = Gramos;
    }

    public String getSabor() {
        return this.Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getTamanio() {
        return this.Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }
    @Override
    public String toString() {
        return "{" +
            " Gramos='" + getGramos() + "'" +
            ", Sabor='" + getSabor() + "'" +
            ", Tamanio='" + getTamanio() + "'" +
            "}";
    }

}
