package Ejercicio4;
//import java.util.Objects;
public class Portero extends Jugador{
    private int ParadasEfectivas; 
    private int GolesRecibidos; 
    
    //crear los metodos. 
    public Portero() { 
        super(); 
        ParadasEfectivas=0; 
        GolesRecibidos=0; 
    } 
    public Portero(int ParadasEfectivas, int GolesRecibidos, String Nombre, String Pais, int Faltas, int GolesDirectos, int TotalLanzamientos) { 
        super(Nombre, Pais, Faltas, GolesDirectos, TotalLanzamientos); 
        this.ParadasEfectivas=ParadasEfectivas; 
        this.GolesRecibidos=GolesRecibidos; 
    }
    //los constructores metodos get y set.  

    public int getParadasEfectivas() {
        return this.ParadasEfectivas;
    }

    public void setParadasEfectivas(int ParadasEfectivas) {
        this.ParadasEfectivas = ParadasEfectivas;
    }

    public int getGolesRecibidos() {
        return this.GolesRecibidos;
    }

    public void setGolesRecibidos(int GolesRecibidos) {
        this.GolesRecibidos = GolesRecibidos;
    }

    @Override
    public String toString() {
        return "{" +
            " ParadasEfectivas='" + getParadasEfectivas() + "'" +
            ", GolesRecibidos='" + getGolesRecibidos() + "'" +
            "}";
    }
    //metodo calculo de la efectividad... 
    public double Efectividad() { 
        double Efectividad = ((ParadasEfectivas-GolesRecibidos)*100/(ParadasEfectivas+GolesRecibidos))+super.ParteFinalCalculo(); 
        return Efectividad; 
    }
}
