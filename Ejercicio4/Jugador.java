package Ejercicio4;
public class Jugador {
    protected String Nombre; 
    protected String Pais; 
    protected int Faltas; 
    protected int GolesDirectos; 
    protected int TotalLanzamientos; 

    public Jugador() { 
        Nombre=""; 
        Pais =""; 
        Faltas=0; 
        GolesDirectos=0;
        TotalLanzamientos=0; 
    } 
    public Jugador (String Nombre, String Pais, int Faltas, int GolesDirectos, int TotalLanzamientos) { 
        this.Nombre=Nombre; 
        this.Pais=Pais;
        this.Faltas=Faltas; 
        this.GolesDirectos=GolesDirectos; 
        this.TotalLanzamientos=TotalLanzamientos; 
    } 

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return this.Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getFaltas() {
        return this.Faltas;
    }

    public void setFaltas(int Faltas) {
        this.Faltas = Faltas;
    }

    public int getGolesDirectos() {
        return this.GolesDirectos;
    }

    public void setGolesDirectos(int GolesDirectos) {
        this.GolesDirectos = GolesDirectos;
    }

    public int getTotalLanzamientos() {
        return this.TotalLanzamientos;
    }

    public void setTotalLanzamientos(int TotalLanzamientos) {
        this.TotalLanzamientos = TotalLanzamientos;
    }

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Pais='" + getPais() + "'" +
            ", Faltas='" + getFaltas() + "'" +
            ", GolesDirectos='" + getGolesDirectos() + "'" +
            ", TotalLanzamientos='" + getTotalLanzamientos() + "'" +
            "}";
    } 
    public double ParteFinalCalculo() {
        double parte1 = GolesDirectos*100; 
        double ParteFinal = parte1/TotalLanzamientos; 
        return ParteFinal; 
    }  

    //la parte que va a mandar los datos ingresados en faltas... 
   /**  public double Faltas() {  
        double faltas = Faltas; 
        return faltas; 
    }
    */  
}
