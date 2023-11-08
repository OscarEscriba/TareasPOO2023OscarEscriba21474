package Laboratorio03HerenciaOscarEscriba;

public class Emprendiento {
    private String idProducto; 
    private String nombre; 
    private String CantidadDisponible; 
    private String cantidadVendida; 
    private String Estado; 
    private String Precio; 
    private String Categoria; 

    //constructoresSt 

    public Emprendiento() {  
        idProducto=""; 
        nombre=""; 
        CantidadDisponible=""; 
        cantidadVendida=""; 
        Estado=""; 
        Precio=""; 
        Categoria=""; 
    } 

    public Emprendiento(String idProducto, String nombre, String cantidadVendida, String CantidadDisponible, String Estado, String Precio, String Categoria) { 
        this.idProducto=idProducto; 
        this.nombre=nombre; 
        this.CantidadDisponible=CantidadDisponible; 
        this.cantidadVendida=cantidadVendida; 
        this.Estado=Estado; 
        this.Precio=Precio; 
        this.Categoria=Categoria; 
    } 
    //metodos get y set... 
    public String getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidadDisponible() {
        return this.CantidadDisponible;
    }

    public void setCantidadDisponible(String CantidadDisponible) {
        this.CantidadDisponible = CantidadDisponible;
    }

    public String getCantidadVendida() {
        return this.cantidadVendida;
    }

    public void setCantidadVendida(String cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPrecio() {
        return this.Precio;
    }

    public void setPrecio(String Precio) {
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
