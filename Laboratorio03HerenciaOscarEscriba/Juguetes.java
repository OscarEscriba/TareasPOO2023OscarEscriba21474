package Laboratorio03HerenciaOscarEscriba;

import java.util.List;

public class Juguetes extends Emprendiento {
    private String TamanioJ; 
    private String TipoJ; 

    //constructores
    public Juguetes(){ 
        super(); 
        TamanioJ=""; 
        TipoJ=""; 
    } 
    public Juguetes(String TamanioJ, String TipoJ,String idProducto, String nombre, String cantidadVendida, String CantidadDisponible, String Estado, String Precio, String Categoria) { 
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
    //metodo para mostrar los juguetes... 
    public void mostrarJuguetes(List <Emprendiento> emprendimiento) {  
        int contadorJuguetes=0; 
        System.out.println("Estos son los juguetes disponibles"); 
        for (Emprendiento emprendientos: emprendimiento) { 
            if (emprendientos instanceof Juguetes) { 
                contadorJuguetes++; 
                System.out.println(emprendientos.getNombre() + "-tamanio: " + ((Juguetes) emprendientos).getTamanioJ() + "-tipo- " + ((Juguetes)emprendientos).getTipoJ());
            }
        } 
        System.out.println("LA CANTIDAD DE JUGUETES SON..."+contadorJuguetes); 
    } 
}
