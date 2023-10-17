package Ejercicio5;

public class Extremo extends Jugador {
    private int Ataques; 
    private int Befectivos; //bloqueos efectivos 
    private int Bfallidos; //bloqueos fallidos. 

    //metodos... 
    public Extremo() { 
        super(); 
        Ataques =0; 
        Befectivos=0; 
        Bfallidos=0; 
    } 

    public Extremo (int Ataques, int Befectivos, int Bfallidos, String Nombre, String Pais, int Erroes, int Aces, int TotalServicios) {  
        super(Nombre, Pais, Erroes, Aces, TotalServicios); 
        this.Ataques=Ataques; 
        this.Befectivos=Befectivos; 
        this.Bfallidos=Bfallidos; 
    } 

    //los contructores get y set 

    public int getAtaques() {
        return this.Ataques;
    }

    public void setAtaques(int Ataques) {
        this.Ataques = Ataques;
    }

    public int getBefectivos() {
        return this.Befectivos;
    }

    public void setBefectivos(int Befectivos) {
        this.Befectivos = Befectivos;
    }

    public int getBfallidos() {
        return this.Bfallidos;
    }

    public void setBfallidos(int Bfallidos) {
        this.Bfallidos = Bfallidos;
    } 

    @Override
    public String toString() {
        return "{" +
            " Ataques='" + getAtaques() + "'" +
            ", Befectivos='" + getBefectivos() + "'" +
            ", Bfallidos='" + getBfallidos() + "'" +
            "}";
    }

}
