package Laboratorio02ArreglosExcepciones;

public class curso {
    private int codigo; 
    private String nombre; 
    private int periodos;
    private int dias; 
    private int horas; 
    private int alumnos; 
    private String profesor; 

    public curso() { 
        this.codigo=0; 
        this.nombre=""; 
        this.periodos=0; 
        this.dias=0; 
        this.horas=0;
        this.alumnos=0; 
        this.profesor=""; 
    } 
    public curso(int codigo, String nombre, int periodos, int dias, int horas, int alumnos, String profesor) { 
        this.codigo=codigo;  
        this.nombre=nombre; 
        this.periodos=periodos; 
        this.dias=dias; 
        this.horas=horas; 
        this.alumnos=alumnos; 
        this.profesor=profesor; 
    } 
    public int getCodigo () { 
        return this.codigo; 
    } 
    public void setCodigo(int codigo) { 
        this.codigo=codigo; 
    }  

    public String getNombre() { 
        return this.nombre; 
    } 
    public void setNombre(String nombre) { 
        this.nombre=nombre; 
    } 

    public int getPeriodos() { 
        return this.periodos; 
    } 
    public void setPeriodos(int periodos) { 
        this.periodos=periodos; 
    } 

    public int getDias() { 
        return this.dias; 
    } 
    public void setDias(int dias) {
        this.dias=dias;
    } 

    public int getHoras(){ 
        return this.horas; 
    } 
    public void setHoras(int horas) {
        this.horas=horas; 
    } 

    public int getAlumnos() { 
        return this.alumnos; 
    } 
    public void setAlumnos(int alumnos) { 
        this.alumnos=alumnos; 
    } 

    public String getProfesor() { 
        return this.profesor; 
    } 
    public void setProfesor(String profesor) { 
        this.profesor=profesor; 
    } 

    //metodos toString
    @Override 
    public String toString() { 
        return "{}" + 
        " codigo'" + getCodigo() + "'" + 
        " nombre'" + getNombre() + "'" + 
         " periodos'" + getCodigo() + "'" + 
          " dias'" + getCodigo() + "'" + 
           " horas'" + getCodigo() + "'" + 
            " alumnos '" + getCodigo() + "'" + 
             " profesor'" + getCodigo() + "'" + 
             "}"; 
    }
 }   

