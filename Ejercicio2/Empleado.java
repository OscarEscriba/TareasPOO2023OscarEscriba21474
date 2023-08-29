package Ejercicio2;

public class Empleado { 
    /** 
     * Declaramos los arreglos que se van a utilizar en esta clase...
     */
    private Cliente [] ListaDeEspera;   
    private Cliente [] Estandar; 
    private Cliente [] Deluxe; 
    private Cliente [] Suites; 

    /** 
     * usamos los metodos para inicializar los arreglos... 
     * 
     */ 
    public Empleado() { 
        ListaDeEspera = new Cliente[9]; 
        Estandar = new Cliente[4]; 
        Deluxe = new Cliente[4]; 
        Suites = new Cliente[4]; 
    } 
    /** 
     * @description agregar la informacion a la lista de espera
     * @param nombre de la persona de la reservacion 
     * @param Noches la cantidad de noches que se va a quedar la persona reservada. 
     * @param TipoCliente el tipo de cliente que es 
     */
    
}
