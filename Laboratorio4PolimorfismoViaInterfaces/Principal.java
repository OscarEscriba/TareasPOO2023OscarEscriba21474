package Laboratorio4PolimorfismoViaInterfaces;

import java.util.Scanner;

public class Principal {
    public static void main (String[]args) { 
        //adad   
        Scanner taclado = new Scanner(System.in); 
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.println("Ingrese qué tipo de usuario desea ser: (marque el número de opción)");
            System.out.println("1. Usuario Premium, el cual cuenta con una serie de beneficios extras...");
            System.out.println("2. Usuario Gratis, el cual tiene restringidas algunas opciones en el sistema.");

            int opcion = taclado.nextInt();

            switch (opcion) {
                case 1:
                    // Código para Usuario Premium 
                    IReservaUsuario UsuarioPremium = new UsuarioPremium(); 
                    System.out.println("Ingrese el nombre de usuario premium"); 
                    String UsernameP = taclado.nextLine(); 
                    System.out.println("Ingrese contrasenia para usuario premium"); 
                    String password = taclado.nextLine(); 
                    UsuarioPremium.login(UsernameP, password); //parte que ya utiliza la otra clase.... 
                    opcionValida = true; 
                    //aqui ya nos vamos a lo que es el modo de reservacion...  
                    IKayak modoReserva = new Reserva(UsuarioPremium); 
                    modoReserva.Reservacion(); 
                    break;
                case 2:
                    // Código para Usuario Gratis 
                    IReservaUsuario Usuario = new Usuario(); 
                    System.out.println("Ingrese el nombre de usuario basico"); 
                    String Username = taclado.nextLine(); 
                    System.out.println("Ingrese contrasenia para usuario basico"); 
                    String passwordB = taclado.nextLine();  
                    Usuario.login(Username, passwordB);
                    opcionValida = true;  
                    //aqui nos vamos a lo que es el modo de reservacion... 
                    IKayak modoReservas = new Reserva(Usuario); 
                    modoReservas.Reservacion(); 
                    break;
                default:
                    System.out.println("No marcó ninguna opción. Elija nuevamente.");
            } 
            taclado.close(); 
        }
    }
}
