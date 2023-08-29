package Ejercicio2;
import java.util.Scanner; 
public class Principal { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        Empleado uno = new Empleado(); 
        /**
         * inicializamos las variables para  meter en la clase de Cliente... 
         */ 
        String Nombre=""; 
        int Noches=0; 
        int TipoCliente=0; 
        System.out.println("Ingrese si es usuario o si es empleado. 1. si es empleado \2n 2. si es cliente");
        int op = teclado.nextInt(); 
        teclado.nextLine(); 
        if (op == 1) { 
            //se despliegan las opciones de empleado...  
            System.out.println("Ingresa las opciones que quieres realizar");
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
                System.out.println("Ya no hay cupos disponibles para el hotel."));;
            }
        }
    }
    
}
