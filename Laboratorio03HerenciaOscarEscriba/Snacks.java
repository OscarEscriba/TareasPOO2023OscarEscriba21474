package Laboratorio03HerenciaOscarEscriba;

import java.util.List;

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
    public Snacks(String Gramos, String Sabor, String Tamanio, String idProducto, String nombre, String cantidadVendida, String CantidadDisponible, String Estado, String Precio, String Categoria) { 
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
    
    //metodo para mostrar los snacks... 
    public void mostrarSnacks(List <Emprendiento> emprendimiento) {   
        int contadorSnacks =0; 
        System.out.println("Los snacks disponibles son los siguientes..."); 
        for (Emprendiento emprendientos: emprendimiento) { 
            if (emprendientos instanceof Snacks) {   
                contadorSnacks++; 
                Snacks snacks = (Snacks)emprendientos; 
                System.out.println("Nombre "+snacks.getNombre()+"Tamanio "+snacks.getTamanio()+ "Gramos "+snacks.getGramos()
                +"Sabor "+snacks.getSabor()); 
            } 
        }   
        System.out.println("LA CANTIDAD DE SNACKS ES LA SIGUIENTE..."+contadorSnacks);
    }
}
