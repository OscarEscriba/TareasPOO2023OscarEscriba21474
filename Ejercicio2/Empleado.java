package Ejercicio2;

import java.util.concurrent.Flow.Subscriber;

public class Empleado { 
    /** 
     * Declaramos los arreglos que se van a utilizar en esta clase...
     */
    private Cliente [] ListaDeEspera;   
    private Cliente [] Estandar; 
    private Cliente [] Deluxe; 
    private Cliente [] Suites;  
    private int i; 

    /** 
     * usamos los metodos para inicializar los arreglos... 
     * 
     */ 
    public Empleado() { 
        ListaDeEspera = new Cliente[9]; 
        Estandar = new Cliente[4]; 
        Deluxe = new Cliente[4]; 
        Suites = new Cliente[4]; 
        i=0; 
    } 
    /** 
     * @description agregar la informacion a la lista de espera
     * @param nombre de la persona de la reservacion 
     * @param Noches la cantidad de noches que se va a quedar la persona reservada. 
     * @param TipoCliente el tipo de cliente que es 
     */
    public void LlenarListaDeEspera (String Nombre, int Noches, int TipoCliente) { 
        if (i <10) { 
            Cliente cliente = new Cliente(Nombre, Noches, TipoCliente); //creo el tipo de objeto en el que voy a meter en el arreglo. 
            ListaDeEspera[i]=cliente; //meter e objeto del arreglo en la posicion adecuada.
            i++; 
        } 
    }  
    /** 
     * @description asigna los clientes en la lista de espera de estandar. 
     */ 
    public void LlenarListas(String Nombre) {  
        int indiceStandar=0; 
        int indiceDeluxe =0; 
        int indiceSuites=0; 
        for(Cliente objeto: ListaDeEspera) {  
            switch(Principal.a){ 
                case 2:  
                if (indiceStandar <Estandar.length) { 
                    Estandar[indiceStandar]=objeto; 
                    indiceStandar++; 
                }else { 
                    System.out.println("Esta seccion de habitacion esta llena");
                }
                break; 
                case 3: 
                if (indiceDeluxe <Deluxe.length) { 
                    Deluxe[indiceDeluxe]=objeto; 
                    indiceDeluxe++; 
                }else { 
                    System.out.println("Esta seccion de habitacion esta llena");
                }
                break; 
                case 4:  
                if (indiceSuites <Suites.length) { 
                    Suites[indiceSuites]=objeto; 
                    indiceSuites++; 
                }else { 
                    System.out.println("Esta seccion de habitacion esta llena");
                }
                break; 
            }
        }
    }
}
