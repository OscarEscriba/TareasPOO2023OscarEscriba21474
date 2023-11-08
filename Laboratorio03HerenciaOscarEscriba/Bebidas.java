package Laboratorio03HerenciaOscarEscriba;

import java.util.List;

public class Bebidas extends Emprendiento{
    private String Ml; 
    private String Tipo; 

    //constructores... 
    public Bebidas() {  
        super(); 
        Ml=""; 
        Tipo=""; 
    } 
    public Bebidas (String Ml, String Tipo,String idProducto, String nombre, 
    String cantidadVendida, String CantidadDisponible, String Estado, 
    String Precio, String Categoria) { 
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
    //metodos para los registros que enocontramos en bebidas... 
    public void mostrarBebidas (List<Emprendiento> emprendimiento) { 
        int contadorBebidas=0; 
        System.out.println("Bebidas Disponibles:"); 
        for (Emprendiento emprendientos: emprendimiento) { 
            if (emprendientos instanceof Bebidas) {  
                contadorBebidas++; 
                System.out.println(emprendientos.getNombre()+" - " + (((Bebidas) emprendientos).getMl()+"Ml -"+(((Bebidas) emprendientos).getTipo())));           
            }
        }
             System.out.println("LA CANTIDAD DE BEBIDAS SON... "+contadorBebidas); 
    }
}