package Ejercicio1; 
public class SistemaDeVentas {
    public static int noentradas=60;  
    public static int valorL1=100; 
    public static int valorL2=500; 
    public static int valorL3=1000;  
    public static int cantidadl1=20; 
    public static int cantidadl2=20; 
    public static int cantidadl3 =20; 

    //metodos para realizar los calculos de los boletos. 
    public static int Boletos () { 
        int totalB = noentradas - Comprador.getcantidadl1() - Comprador.getcantidadl2() -Comprador.getcantidadl3();  
        return totalB; 
    } 
    public static int BoletosL1() { 
        int L1 = (noentradas/3)-Comprador.getcantidadl1(); 
        return L1; 
    } 
    public static int BoletosL2() { 
          int L2 = (noentradas/3)-Comprador.getcantidadl2(); 
        return L2; 
    } 
    public static int BoletosL3() { 
          int L3 = (noentradas/3)-Comprador.getcantidadl3(); 
        return L3; 
    } 
    //metodos para relizar el calculo de dinero... 
    public static int Dinero() { 
        int dinero = ((BoletosL1())*valorL1)+(BoletosL1()*valorL2)+(BoletosL3()*valorL3); 
        return dinero; 
    }
}
