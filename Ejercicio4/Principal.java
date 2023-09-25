package Ejercicio4;
import java.util.Scanner; 
public class Principal {
    public static void main(String [] args){ 
        Torneo balonmano = new Torneo(); 
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Bienvendio al contro de estadisticas del torneo internacional de balonmano"); 
        System.out.println("Elige la opcion que quieras elegir: 1. ingresar Portero 2. Ingresar extremo"); 
        int op = teclado.nextInt(); 
        teclado.nextLine(); 
        if (op ==1) { 
            System.out.println("Ingrese el nombre del portero");  
            String Nombre = teclado.nextLine(); 
            System.out.println("Ingrese el pais del portero");
                 String Pais = teclado.nextLine(); 
             System.out.println("Ingrese faltas del portero"); 
             int Faltas = teclado.nextInt(); 
              System.out.println("Ingrese Goles directos del portero");
                  int GolesDirectos = teclado.nextInt();
               System.out.println("Ingrese total de lanzamientos del portero"); 
                   int TotalLanzamientos = teclado.nextInt();
                System.out.println("Ingrese Paradas Efectivas del portero");  
                    int ParadasEfectivas = teclado.nextInt();
                 System.out.println("Ingrese Goles recibidos del portero"); 
                     int GolesRecibidos = teclado.nextInt(); 
                System.out.println("Ingrese el tipo de jugador 1. portero 2. extremo"); 
                int TipoJugador = teclado.nextInt(); 
                balonmano.agregarJugador(Nombre, Pais, Faltas, GolesDirectos, TotalLanzamientos, ParadasEfectivas, GolesRecibidos, ParadasEfectivas, ParadasEfectivas, TipoJugador); 
                  System.out.println(balonmano.CalculoEstadistico(false, true)); 
        }else {
              System.out.println("Ingrese el nombre del extremo");  
            String Nombre = teclado.nextLine(); 
            System.out.println("Ingrese el pais del extremo");
                 String Pais = teclado.nextLine(); 
             System.out.println("Ingrese faltas del extremo"); 
             int Faltas = teclado.nextInt(); 
              System.out.println("Ingrese Goles directos del extremo");
                  int GolesDirectos = teclado.nextInt();
               System.out.println("Ingrese total de lanzamientos del extremo"); 
                   int TotalLanzamientos = teclado.nextInt(); 
                   System.out.println("Ingrese Pases del extremo"); 
                   int Pases = teclado.nextInt();  
                   System.out.println("Ingrese total de asistencias efectivas del extremo"); 
                   int AsistenciasEfectivas = teclado.nextInt();  
                          System.out.println("Ingrese el tipo de jugador 1. portero 2. extreo"); 
                int TipoJugador = teclado.nextInt();  
                balonmano.agregarJugador(Nombre, Pais, Faltas, GolesDirectos, TotalLanzamientos, AsistenciasEfectivas, TotalLanzamientos, Pases, AsistenciasEfectivas, TipoJugador); 
                  System.out.println(balonmano.CalculoEstadistico(true, false)); 
        }  

    } 
}
