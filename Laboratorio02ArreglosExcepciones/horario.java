package Laboratorio02ArreglosExcepciones;
public class horario {
    private curso curso; 
    private profesor Maestro; 

    public horario(curso curso, profesor Maestro) { 
        this.curso=curso; 
        this.Maestro=Maestro; 
    } 
    public horario() { 
        this.curso = new curso(); 
        this.Maestro= new profesor(); 
    }  

    public profesor getMaestro() { 
        return Maestro; 
    } 
    public void setMaestro (profesor Maestro) { 
        this.Maestro=Maestro; 
    } 

    public curso getCurso () { 
        return curso; 
    } 
    public void setCurso(curso curso) { 
        this.curso=curso; 
    } 

}
