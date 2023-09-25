package Ejercicio4;
//import java.util.Objects;
public class Extremo extends Jugador {
    private int Pases; 
    private int AsistenciasEfectivas;  

    //metodos... 
    public Extremo(){ 
        super(); 
        Pases=0; 
        AsistenciasEfectivas=0; 
    } 
    public Extremo(int Pases, int AsistenciasEfectivas, String Nombre, String Pais, int Faltas, int GolesDirectos, int TotalLanzamientos) {
        super(Nombre, Pais, Faltas, GolesDirectos, TotalLanzamientos); 
        this.AsistenciasEfectivas = AsistenciasEfectivas; 
        this.Pases=Pases; 
    } 
    //los constructores metodos get y set

    public int getPases() {
        return this.Pases;
    }

    public void setPases(int Pases) {
        this.Pases = Pases;
    }

    public int getAsistenciasEfectivas() {
        return this.AsistenciasEfectivas;
    }

    public void setAsistenciasEfectivas(int AsistenciasEfectivas) {
        this.AsistenciasEfectivas = AsistenciasEfectivas;
    }

    @Override
    public String toString() {
        return "{" +
            " Pases='" + getPases() + "'" +
            ", AsistenciasEfectivas='" + getAsistenciasEfectivas() + "'" +
            "}";
    }

}
