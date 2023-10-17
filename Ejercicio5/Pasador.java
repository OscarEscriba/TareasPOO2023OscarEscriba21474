package Ejercicio5;

public class Pasador extends Jugador { 
    private int Pases; 
    private int FintasEfectivas; 

    //metodos... 
    public Pasador() { 
        super(); 
        Pases=0; 
        FintasEfectivas=0; 
    }
    public Pasador(int Pases, int FintasEfectivas, String Nombre, String Pais, int Errores, int Aces, int TotalServicios) { 
        super(Nombre, Pais, Errores, Aces, TotalServicios); 
        this.Pases=Pases; 
        this.FintasEfectivas=FintasEfectivas; 
    } 
    //metodos get y set 

    public int getPases() {
        return this.Pases;
    }

    public void setPases(int Pases) {
        this.Pases = Pases;
    }

    public int getFintasEfectivas() {
        return this.FintasEfectivas;
    }

    public void setFintasEfectivas(int FintasEfectivas) {
        this.FintasEfectivas = FintasEfectivas;
    }
    @Override
    public String toString() {
        return "{" +
            " Pases='" + getPases() + "'" +
            ", FintasEfectivas='" + getFintasEfectivas() + "'" +
            "}";
    }

}
