package Ejercicio2;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber; 
public class Principal { 
    public static int a;

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        Empleado uno = new Empleado(); 
        /**
         * inicializamos las variables para  meter en la clase de Cliente... 
         */ 
        String Nombre=""; 
        int Noches=0; 
        int TipoCliente=0;  
        int opcion=0; 
        System.out.println("Ingrese si es usuario o si es empleado. 1. si es empleado \2n 2. si es cliente");
        int op = teclado.nextInt(); 
        teclado.nextLine(); 
        if (op == 1) { 
            //se despliegan las opciones de empleado...  
            System.out.println("Usted es el empleado y puede realizar las siguientes opciones "); 
            System.out.println("1.Mostrar la lista de clientes en ListaDeEspera"); 
            System.out.println("2.Agregar cliente a Estandar"); 
            System.out.println("3. Agregar Cliente a Deluxe");  
            System.out.println("4. Agregar cliente a Suites");  
            System.out.println("5. Final");  
            int a= teclado.nextInt();  
            while (a>=0 && a <5){ 
                switch (a) { 
                    case 1: 
                    //mostrar la lista entera 
                    System.out.println("Mostar cliente \n---------------------------\n"); 
                    System.out.println(uno); //se muestra la lista de Espera... 
                    a=5;  //sale del programa automaticamente  
                    break;
                    case 2:  
                  //  System.out.println(uno.LlenarListas);
                    break; 
                    case 3: 
                    opcion=2; 
                    break; 
                    case 4: 
                    opcion =3; 
                    break;
                    default: 
                    opcion =5; 
                }
            }
        }else { 
            //se despliegan las opciones de cliente... 
            int i=0; 
            if (i < 10) { 
                System.out.println("Ingrese el nombre de la persoa para la Reservacion: "); 
                Nombre=teclado.nextLine(); 
                System.out.println("Ingrese la cantidade de noches a reservar: "); 
                Noches=teclado.nextInt(); 
                System.out.println("ingrese el tipo de cliente que es, 1. si es Regular 2. Si es frecuente o 3. si es vip: "); 
                TipoCliente=teclado.nextInt(); 
                teclado.nextLine(); 
                uno.LlenarListaDeEspera(Nombre, Noches, TipoCliente); 
                i++; 
            }else { 
                System.out.println("Ya no hay cupos disponibles para el hotel.");
            }
        }
    }
    
}
