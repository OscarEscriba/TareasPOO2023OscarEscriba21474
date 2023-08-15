package Ejercicio1; 
import java.util.*;  
import java.util.Scanner; 
public class Principal {
    public static int sistema;

    public static void main (String [] args){ 
        //inicializamos la parte del scanner... 
        Scanner teclado = new Scanner(System.in); 
        //vamos a ingresar un nuevo comprador...  
        String n=""; 
        String e="";   
         int NumeroB=0; int Presupuesto=0; 
         int sistema=0; 
        System.out.println("Quiere ingresar a comprar un boleto para ver a Taylor Swift? marque 1 si si quiere y 2 si no");  
        sistema =teclado.nextInt(); 
        if (sistema ==1) { 
        System.out.println("Ingrese el nombre del comprador: "); 
         n=teclado.nextLine(); 
        System.out.println("Ingrese el email del comprador: "); 
        e=teclado.nextLine(); 
        System.out.println("Ingrese el numero de Boletos que Desea Comprar: "); 
        NumeroB =teclado.nextInt(); 
        System.out.println("Ingrese el Presupuesto maximo para la compra de boletos: "); 
        Presupuesto =teclado.nextInt(); 
        Comprador comprador = new Comprador();  
        comprador.setNombre(n); 
        comprador.setEmail(e); 
        comprador.setNboletos(NumeroB); 
        comprador.setPmaximo(Presupuesto); 
        //revisar los datos del comprador... 
        System.out.println("Estos son los datos del comprador..."); 
        System.out.println(comprador);
        } else { 
            System.out.println("Gracias por ingresar al portal de compra de boletos de taylor swift...");
        }  
        //mostrar los datos finales... 
        System.out.println("La cantidad total de boletos es... "+SistemaDeVentas.Boletos()); 
        System.out.println("La cantidad de boletos de la localidad 1 es... "+SistemaDeVentas.BoletosL1()); 
        System.out.println("La cantidad de boletos de la localidad 2 es... "+SistemaDeVentas.BoletosL2());  
        System.out.println("La cantidad de boletos de la localidad 3 es... "+SistemaDeVentas.BoletosL3()); 
        System.out.println("El flujo de caja es el siguiente..." +SistemaDeVentas.Dinero()); 
    }
}
