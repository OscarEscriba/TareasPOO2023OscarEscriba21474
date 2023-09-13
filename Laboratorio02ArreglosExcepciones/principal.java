package Laboratorio02ArreglosExcepciones;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List; 
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber; 
public class principal {  
    private static curso[][] Listacurso; 
    private static profesor[][] ListaProfesor; 
    private static final int NDias =7; //Numero de dias de la semana, para el calendario. 
    private static final int NHoras=24; //Numero de horas el dia. 
    public static void main (String [] args) { 
        Scanner scanner= new Scanner(System.in); 
        Listacurso = new curso[NHoras][NDias]; 
        ListaProfesor = new profesor[NHoras][NDias]; 
        while(true) { 
            System.out.println("Que accion querras hacer?"); 
            System.out.println("1. Agregar nuevo curso"); 
            System.out.println("2. Eliminar Curso"); 
            System.out.println("3. Mostrar calendario Estudiante"); 
            System.out.println("4. Mostrar calendario de Profesor"); 
            System.out.println("5. Resetear Calenadrio"); 
            System.out.println("6. salir");    
            int opcion=scanner.nextInt(); 
            
            switch(opcion) { 
                case 1:  
                agregarCurso();
                break; 
                case 2:  
                elimminarCurso(); 
                break; 
                case 3:  
                MostrarCalendarioCurso(); 
                break;
                case 4:  
                MostrarCalendario(); 
                break;  
                case 5: 
                resetear(); 
                break; 
                case 6:  
                System.out.println( "Adios!!"); 
                scanner.close();
                System.exit(0); 
                break; 
                default: 
                System.out.println("Opcion no valida"); 
                break; 
            }
        }
    } 
    public static void agregarCurso() { 
        Scanner scanner=new Scanner(System.in); 

        System.out.println("codgio del curso "); 
        int codigo = scanner.nextInt(); 
        System.out.println("Ingrese el nombre del curso"); 
        String nombre = scanner.nextLine(); 
        System.out.println("Ingrese la cantidad de periodos"); 
        int periodos=scanner.nextInt(); 
        System.out.println("Ingrese el dia (0-6)"); 
        int dia = scanner.nextInt(); 
        System.out.println("Ingrese la hora (0-4): "); 
        int hora = scanner.nextInt(); 
        System.out.println("Ingrese la cantidad de alumnos que tiene el curso, no pueden ser mas de 20"); 
        int alumnos =scanner.nextInt(); 
        System.out.println("Ingrese el nombre del profesor que imparte la clase: "); 
        String profesor = scanner.nextLine();  
        System.out.println("Ingrese el carnet del profesor: "); 
        int carne = scanner.nextInt(); 
        System.out.println("Ingrese el correo del Profesor: "); 
        String correo = scanner.nextLine(); 
        System.out.println("Ingrese el telefono del profesro: "); 
        int telefono = scanner.nextInt(); 
        scanner.nextLine();  

        curso curso = new curso( codigo,  nombre,  periodos,  dia,  hora,  alumnos, new profesor( profesor,  carne,  correo,  telefono));     
        Listacurso[hora][dia] = curso; 
        ListaProfesor [hora][dia] = curso.getProfesor();  

        System.out.println("Curso agregado correctamente..."); 

    } 
    public static void elimminarCurso() {  
        Scanner scanner = new Scanner(System.in);  
        //agregar la hora y el dia del evento que se quiere eliminar... 
        System.out.println("ingrese el dia (0-6): "); 
        int dia = scanner.nextInt(); 
        System.out.println("Ingrese la hora (0-4): "); 
        int hora = scanner.nextInt(); 

        if (Listacurso[hora][dia] != null) { 
            System.out.println("el curso se ha eliminado correctamente. "); 
            Listacurso[hora][dia] = null; 
            ListaProfesor[hora][dia]=null; 
        }else { 
            System.out.println("No hay curso para eliminar... ");;
        }
    } 
    public static void MostrarCalendarioCurso() { 
        System.out.println("Calendario de estudiantes"); 
        for (int hora = 0; hora < NHoras; hora++) { 
            for (int dia =0; dia < NDias; dia++) { 
                curso curso = Listacurso[hora][dia];  
                if (curso != null) {
                    System.out.println("Día " + dia + ", Hora " + hora + ":");
                    System.out.println("Curso: " + curso.getNombre());
                    System.out.println("Profesor: " + curso.getProfesor().getNombre());
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println("Día " + dia + ", Hora " + hora + ": No hay curso programado.");
                    System.out.println("-----------------------------------");
                }
            }
        }
    }
    
    public static void MostrarCalendario() { 
        System.out.println("Calendario de Profesores"); 
        for (int hora = 0; hora < NHoras; hora++) { 
            for (int dia =0; dia < NDias; dia++) { 
                profesor Profesor = ListaProfesor[dia][hora];  
                if (Profesor != null) {
                    System.out.println("Día " + dia + ", Hora " + hora + ":");
                    System.out.println("Profesor: " + Profesor.getNombre());
                    System.out.println("Carnet: " + Profesor.getCarne());
                    System.out.println("Correo: " + Profesor.getCorreo());
                    System.out.println("Teléfono: " + Profesor.getTelefono());
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println("Día " + dia + ", Hora " + hora + ": No hay clase asignada a este profesor.");
                    System.out.println("-----------------------------------");
                }
            }
        }
    }
    public static void resetear() { 
        Listacurso = new curso[NHoras][NDias]; 
        ListaProfesor = new profesor[NHoras][NDias]; 
        System.out.println("Calendario reseteado... "); 
    }
}
