package Ejercicio3;

public class examanes {  
    private String nombrem; 
    private int nota; 
    private int cu; 

    public void examanes() { 
        nombrem=""; 
        nota =0; 
        cu=0; 
    } 
    public examanes(String nombrem, int nota, int cu){ 
        this.nombrem=nombrem; 
        this.nota=nota; 
        this.cu=cu; 
    } 
     /* 
     * @return String, int. 
     * se van a hacer los metodos get y set de cada uno de los elemntos...
     */   
     public String getNombrem() { 
        return this.nombrem; 
    } 
    public void setNombrem(String nombrem){ 
        this.nombrem=nombrem; 
    }  
    public int getNota() { 
        return this.nota;
    } 
    public void setNota(int nota) { 
        this.nota=nota; 
    } 
    public int getCu() { 
        return this.cu; 
    } 
    public void setCu(int cu) { 
        this.cu=cu; 
    } 
    @Override 
    public String toString() {
        return "nombreMateria: " + getNombrem() + ", nota: " + getNota() + ", codigoUnico: " + getCu(); 
    }
}
