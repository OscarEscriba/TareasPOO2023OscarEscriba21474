package Ejercicio5;

public class Jugador {
    protected String Nombre;  
    protected String Pais; 
    protected int Errores; 
    protected int Aces; 
    protected int TotalServicios; 

    public Jugador() { 
        Nombre =""; 
        Pais =""; 
        Errores=0; 
        Aces=0; 
        TotalServicios=0; 
    } 

    public Jugador(String Nombre, String Pais, int Errores, int Aces, int TotalServicios){
        this.Nombre=Nombre; 
        this.Pais=Pais; 
        this.Errores=Errores; 
        this.Aces=Aces; 
        this.TotalServicios=TotalServicios; 
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

    public int getErrores() {
        return this.Errores;
    }

    public void setErrores(int Errores) {
        this.Errores = Errores;
    }

    public int getAces() {
        return this.Aces;
    }

    public void setAces(int Aces) {
        this.Aces = Aces;
    }

    public int getTotalServicios() {
        return this.TotalServicios;
    }

    public void setTotalServicios(int TotalServicios) {
        this.TotalServicios = TotalServicios;
    }


    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Pais='" + getPais() + "'" +
            ", Errores='" + getErrores() + "'" +
            ", Aces='" + getAces() + "'" +
            ", TotalServicios='" + getTotalServicios() + "'" +
            "}";
    }

    //metodos generales de la clase jugador...  
    public double CalcularEfectividad() { 
        return 0; 
    }
}
