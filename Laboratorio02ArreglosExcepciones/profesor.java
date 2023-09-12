package Laboratorio02ArreglosExcepciones;

public class profesor {
    /* 
     * nombre
     * carne 
     * correo 
     * telefono 
     */ 
    private String nombre; 
    private int carne; 
    private String correo; 
    private int telefono;  

    public profesor() {
        this.nombre=""; 
        this.carne=0; 
        this.correo=""; 
        this.telefono=0; 
    } 
    public profesor (String nombre, int carne, String correo, int telefono) {
        this.nombre=nombre; 
        this.carne=carne; 
        this.correo=correo; 
        this.telefono=telefono; 
    } 

    public String getNombre() { 
        return this.nombre; 
    } 
    public void setNombre(String nombre) {
        this.nombre=nombre; 
    } 

    public int getCarne() { 
        return this.carne;
    } 
    public void setCarne(int carne) { 
        this.carne=carne; 
    } 

    public String getCorreo() { 
        return this.correo; 
    } 
    public void setCorreo(String correo) {
        this.correo=correo; 
    } 

    public int getTelefono(){ 
        return this.telefono; 
    } 
    public void setTelefono(int telefono) { 
        this.telefono=telefono; 
    } 

    //Metodo toString 
    @Override 
    public String toString() { 
        return "{" + 
        "nombre'" + getNombre() + "'" + 
        " carne'" + getCarne() + "'" + 
        " correo'" + getCorreo() + "'" + 
        " telefono'" + getTelefono() + "'" + 
        "}"; 
    }
}
