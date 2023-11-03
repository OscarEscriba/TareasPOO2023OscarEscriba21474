package Laboratorio03HerenciaOscarEscriba;

public class Emprendiento {
    private int idProducto; 
    private String nombre; 
    private int CantidadDisponible; 
    private int cantidadVendida; 
    private String Estado; 
    private double Precio; 
    private String Categoria; 

    //constructoresSt 

    public Emprendiento() { 
    } 

    public Emprendiento(int idProducto, String nombre, int cantidadVendida, int CantidadDisponible, String Estado, double Precio, String Categoria) { 
        this.idProducto=idProducto; 
        this.nombre=nombre; 
        this.CantidadDisponible=CantidadDisponible; 
        this.cantidadVendida=cantidadVendida; 
        this.Estado=Estado; 
        this.Precio=Precio; 
        this.Categoria=Categoria; 
    } 
    //metodos get y set... 
    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return this.CantidadDisponible;
    }

    public void setCantidadDisponible(int CantidadDisponible) {
        this.CantidadDisponible = CantidadDisponible;
    }

    public int getCantidadVendida() {
        return this.cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public double getPrecio() {
        return this.Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    @Override
    public String toString() {
        return "{" +
            " idProducto='" + getIdProducto() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", CantidadDisponible='" + getCantidadDisponible() + "'" +
            ", cantidadVendida='" + getCantidadVendida() + "'" +
            ", Estado='" + getEstado() + "'" +
            ", Precio='" + getPrecio() + "'" +
            ", Categoria='" + getCategoria() + "'" +
            "}";
    }
}
