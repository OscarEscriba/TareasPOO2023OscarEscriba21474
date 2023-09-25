package Ejercicio4;
import java.util.ArrayList; 
public class Torneo { 
    private ArrayList<Portero> ListaPorteros; 
    private ArrayList<Extremo> ListaExtremos; 

    public Torneo() { 
        ListaPorteros = new ArrayList<Portero>(); 
        ListaExtremos = new ArrayList<Extremo>(); 
    } 
    //me hace falta agregar los siguientes atributos para los metodos. 
    public void agregarJugador(String nombre, String pais, int Faltas, int GolesDirectos, int TotalLanzamientos,
    int ParadasEfectivas, int GolesRecibidos, int Pases, int AsistenciasEfectivas, int TipoJugador) { 
        //metodos para ingresar a los jugadores... 
        switch(TipoJugador) { 
            case 1:  
            Portero por = new Portero(ParadasEfectivas, GolesRecibidos, nombre, pais, Faltas, GolesDirectos, TotalLanzamientos); 
            ListaPorteros.add(por); 
            break; 
            case 2:  
            Extremo ext = new Extremo(Pases, AsistenciasEfectivas, nombre, pais, Faltas, GolesDirectos, TotalLanzamientos); 
            ListaExtremos.add(ext); 
            break; 
        }
     }
}
