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
     public double CalculoEstadistico(boolean Extremo, boolean Portero) { 
        double e =0; 
        if (Extremo) { 
            for (Extremo ext: ListaExtremos) { 
                if(ext != null) {  
                    System.out.println(ext); 
                    e = e + ext.Efectividad(); 
                }
            }
        } 
        if (Portero) { 
            for (Portero port: ListaPorteros) { 
                if(port != null){  
                        System.out.println(port); 
                    e = e+port.Efectividad(); 
                }
            }
        } 
        return e; 
     } 

    public ArrayList<Portero> getListaPorteros() {
        return this.ListaPorteros;
    }

    public void setListaPorteros(ArrayList<Portero> ListaPorteros) {
        this.ListaPorteros = ListaPorteros;
    }

    public ArrayList<Extremo> getListaExtremos() {
        return this.ListaExtremos;
    }

    public void setListaExtremos(ArrayList<Extremo> ListaExtremos) {
        this.ListaExtremos = ListaExtremos;
    }

    @Override
    public String toString() {
        return "{" +
            " ListaPorteros='" + getListaPorteros() + "'" +
            ", ListaExtremos='" + getListaExtremos() + "'" +
            "}";
    }

}
