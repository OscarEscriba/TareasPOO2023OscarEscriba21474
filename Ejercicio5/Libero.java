package Ejercicio5;

public class Libero extends Jugador { 
    private int RecibosEfectivos; 

    //metodos 
    public Libero() { 
        super(); 
        RecibosEfectivos=0; 
    } 

    public Libero(int RecibosEfectivos, String Nombre, String Pais, int Erroes, int Aces, int TotalServicios) { 
      super(Nombre, Pais, Erroes, Aces, TotalServicios); 
        this.RecibosEfectivos=RecibosEfectivos; 
    } 
    //los constructores metodos get y set 
    public int getRecibosEfectivos() {
        return this.RecibosEfectivos;
    }

    public void setRecibosEfectivos(int RecibosEfectivos) {
        this.RecibosEfectivos = RecibosEfectivos;
    } 
    //metodos toString

    @Override
    public String toString() {
        return "{" +
            " RecibosEfectivos='" + getRecibosEfectivos() + "'" +
            "}";
    } 
    //metodo para calcular la efectivad... 
    public double CalcularEfectividad () {  
        return (double) 
    }

} 
