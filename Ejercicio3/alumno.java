package Ejercicio3;

import java.util.ArrayList;

public class alumno {     
    private String nombre; 
    private String apellido; 
    private String correo;  
    private int cumpleanios; 
    private int codigoUnico; 

    public void alumno() { 
        ArrayList<String> alumno = new ArrayList<String>(); 
    } 
    public alumno(String nombre, String apellido, String correo, int cumpleanios, int codigoUnico) { 
        this.nombre=nombre; 
        this.apellido=apellido; 
        this.correo=correo; 
        this.cumpleanios=cumpleanios; 
        this.codigoUnico=codigoUnico; 
    } 
    /* 
     * @return String 
     * se van a hacer los metodos get y set de cada uno de los elemntos...
     */ 
    public String getNombre() { 
        return this.nombre; 
    } 
    public void setNombre(String nombre){ 
        this.nombre=nombre; 
    } 
    
    public String getApellido() { 
        return this.apellido; 
    } 
    public void setApellido(String apellido) { 
        this.apellido=apellido; 
    } 

    public String getCorreo(){
        return this.correo; 
    } 
    public void setCorreo(String correo) {
        this.correo=correo; 
    } 

    public int getCumpleanios() { 
        return this.cumpleanios; 
    } 
    public void setCumpleanios(int cumpleanios) { 
        this.cumpleanios=cumpleanios; 
    } 

    public int getCodigoUnico() { 
        return this.codigoUnico;
    } 
    public void setCodigoUnico(int codigoUnico){ 
        this.codigoUnico=codigoUnico; 
    }
}
