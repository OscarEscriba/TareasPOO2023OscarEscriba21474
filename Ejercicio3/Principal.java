package Ejercicio3;
import java.util.Scanner; 
import java.util.ArrayList;  
import java.util.List; 
public class Principal { 
    public static void main (String [] args) {   
        //aqui es donde se inician los arrayList de cada una de las clases... 
        List<alumno> ListaAlumno = new ArrayList<>(); 
        List<examanes> ListaExamen = new ArrayList<>(); 
        Scanner teclado = new Scanner(System.in);    

        while (true) {  
            MostrarMenu(); 
            int opcion = teclado.nextInt(); 
            teclado.nextLine(); //limpia la entrada. 
            switch(opcion){ 
                case 1: 
                System.out.println("Ingrese el nombre del alumno: "); 
                String nombre =teclado.nextLine(); 
                System.out.println("Ingrese el apeliido del alumno: "); 
                String apeliido =teclado.nextLine(); 
                System.out.println("Ingrese el correo del alumno: "); 
                String correo =teclado.nextLine(); 
                System.out.println("Ingrese el cumpleanios del alumno: "); 
                int cumpleanios = teclado.nextInt();  
                System.out.println("Ingrese el codigo unico del alumno: "); 
                int codigoUnico = teclado.nextInt();  
                ListaAlumno.add(new alumno(nombre, apeliido, correo, cumpleanios, codigoUnico));
                break; 
                case 2: 
                System.out.println("Ingrese el nombre de la materia:  ");
                String nombrem = teclado.nextLine(); 
                System.out.println("ingrese la nota del examen: "); 
                int nota = teclado.nextInt(); 
                System.out.println("Ingrese el codigo del alumno del examen: "); 
                int cu = teclado.nextInt(); 
                ListaExamen.add(new examanes(nombrem, nota, cu)); 
                break; 
                case 3: 
                Mostrar(ListaAlumno, ListaExamen);  
                break; 
                case 4:  
                System.out.println("Saliendo del programa. "); 
                teclado.close();
                System.exit(0);
                default: 
                System.out.println("Opcion no valida. Por favor ingrese una opcion valida. ");
            }
        }

    } 
    private static void MostrarMenu() { 
        System.out.println("Menu: "); 
        System.out.println("1. agregar alumno"); 
        System.out.println("2. Ingrese examen: "); 
        System.out.println("3. Mostrar los registros"); 
        System.out.println("4. salir "); 
        System.out.println("Ingrese su opcion: ");  
    }

    private static void Mostrar(List<alumno> ListaAlumno, List<examanes> ListaExamen ) { 
        System.out.println("alumnos registrados"); 
        for (alumno alumnos: ListaAlumno){ 
            System.out.println(alumnos); 
        } 
        System.out.println("Examenes registrados: "); 
        for (examanes examen:ListaExamen ) { 
            System.out.println(examen); 
        }
    }
}
