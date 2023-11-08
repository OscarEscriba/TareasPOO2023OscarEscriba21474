package Ejercicio2;
/**
 * Esta es la clase donde se ira organizando o guardando las distintas personas que se van hospedando en el hotel. 
 * yo considero que mejor aqui va el arreglo de lista de espera... 
 */
public class Cliente{ 
    private String Nombre; 
    private int Noches; 
    private int TipoCliente; 
//s
    public Cliente() { 
    } 
    public Cliente(String Nombre, int Noches, int TipoCliente) { 
        this.Nombre = Nombre; 
        this.Noches = Noches; 
        this.TipoCliente =TipoCliente; 
    } 
    /**
     * Los metodos get y set
     */ 
    public String getNombre() { 
        return this.Nombre; 
    } 
    public void setNombre(String Nombre) { 
        this.Nombre =Nombre; 
    } 
    public int getNoches() { 
        return this.Noches; 
    } 
    public void setNoches(int Noches) { 
        this.Noches=Noches; 
    } 
    public int getTipoCliente() { 
        return this.TipoCliente; 
    } 
    public void setTipoCliente(int TipoCliente) { 
        this.TipoCliente = TipoCliente; 
    } 
}
