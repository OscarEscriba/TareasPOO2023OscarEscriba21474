package Ejercicio3;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
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
                NotaBajo(ListaExamen);
                break;  
                case 5 : 
                CantidadAlumnos(ListaAlumno); 
                break;  
                case 6: 
                NotaAlta(ListaExamen); 
                break; 
                case 7:  
                Promedio(ListaExamen);  
                break; 
                case 8:  
                System.out.println("Saliendo del programa. "); 
                teclado.close();
                System.exit(0);
                default: 
                System.out.println("Opcion no valida. Por favor ingrese una opcion valida. ");
            }
        }

    }  

    //aqui es donde van a ir todas las funciones de nuetro codigo... 
    private static void MostrarMenu() { 
        System.out.println("Menu: "); 
        System.out.println("1. agregar alumno"); 
        System.out.println("2. Ingrese examen: "); 
        System.out.println("3. Mostrar los registros");  
         System.out.println("4 Mostrar nota mas baja...");   
         System.out.println("5. mostrar la cantidad de alumnos registrados..."); 
         System.out.println("6. Mostrar la nota mas alta...");  
         System.out.println("7. mostrar el promedio de las notas...");
        System.out.println("8. salir "); 
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
    private static void NotaBajo(List<examanes> ListaExamen) { 
        if (ListaExamen.isEmpty()) { 
            System.out.println("La lista de examenes esta vacia. "); 
            return; 
        } 
        int NotaBaja = ListaExamen.get(0).getNota(); //mando a obtener la nota desde el registro 0...  
        String nombreNotaBaja = ListaExamen.get(0).getNombrem();  
        int cuNotabaja =ListaExamen.get(0).getCu(); 
        for (examanes examen: ListaExamen) { 
            if (examen.getNota() < NotaBaja){ 
                NotaBaja=examen.getNota();  
                nombreNotaBaja = examen.getNombrem();  
                cuNotabaja = examen.getCu(); 
            }
        } 
        System.out.println("La nota mas baja: " +NotaBaja+ "el nombre de la materia es: " +nombreNotaBaja + "El CU del estudiante es..." +cuNotabaja);
    } 
    private static void CantidadAlumnos(List<alumno> ListaAlumno) { 
        int cantidad =ListaAlumno.size(); 
        System.out.println("La cantidad de alumnos registrados es..." +cantidad);
    } 

        private static void NotaAlta(List<examanes> ListaExamen) {  
        if (ListaExamen.isEmpty()) { 
            System.out.println("La lista de examenes esta vacia. "); 
            return; 
        } 
        int NotaAlta= ListaExamen.get(0).getNota(); //mando a obtener la nota desde el registro 0...  
        String nombreNotaAlta = ListaExamen.get(0).getNombrem();  
        int cuNotaAlta =ListaExamen.get(0).getCu(); 
        for (examanes examen: ListaExamen) { 
            if (examen.getNota() > NotaAlta){ 
                NotaAlta=examen.getNota();  
                nombreNotaAlta = examen.getNombrem();  
                cuNotaAlta = examen.getCu(); 
            }
        } 
        System.out.println("La nota mas alta: " +NotaAlta+ "el nombre de la materia es: " +nombreNotaAlta + "El CU del estudiante es..." +cuNotaAlta);
    }  
    private static double Promedio(List<examanes> ListaExamen) { 
        if (ListaExamen.isEmpty()) { 
            System.out.println("la lista de examenes esta vacia"); 
            return 0.0; 
        } 
        int sumaNotas=0; 
        for (examanes examen: ListaExamen) { 
            sumaNotas += examen.getNota();  
        } 
        double promedio = (double) sumaNotas /ListaExamen.size();  
        System.out.println("el promedio es..." +promedio); 
        return promedio;   
    }
}
