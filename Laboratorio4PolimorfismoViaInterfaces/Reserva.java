package Laboratorio4PolimorfismoViaInterfaces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reserva implements IKayak { 
        /*corregir mayusculas y minusculas de las variables... y el tipo de atributo 
        todos los codigos son string porque no me interesa realizar ninguan operacion con los nuemeros...
        */
        private String FechaViaje; 
        private Boolean IdaVuelta; 
        private String CantidadBoletos; 
        private String aerolinea; 
        private String numeroTarjeta; 
        private String Cuotas; 
        private String ClaseVuelo; 
        private String NumeroAsiento; 
        private String cantidadMaletas;  
        private IReservaUsuario usuario; 
    
       /*  public  Reserva () {  
            FechaViaje =""; 
            IdaVuelta=true; 
            CantidadBoletos =""; 
            aerolinea="";
            numeroTarjeta=""; 
            Cuotas=""; 
            ClaseVuelo =""; 
            NumeroAsiento="";
            cantidadMaletas="";  
        }  
        */ 
        public Reserva(IReservaUsuario usuario) { 
            this.usuario=usuario; 
        }
        //agregar los metodos getter y setter y el ToSring 
    public String getFechaViaje() {
        return this.FechaViaje;
    }

    public void setFechaViaje(String FechaViaje) {
        this.FechaViaje = FechaViaje;
    }

    public Boolean isIdaVuelta() {
        return this.IdaVuelta;
    }

    public Boolean getIdaVuelta() {
        return this.IdaVuelta;
    }

    public void setIdaVuelta(Boolean IdaVuelta) {
        this.IdaVuelta = IdaVuelta;
    }

    public String getCantidadBoletos() {
        return this.CantidadBoletos;
    }

    public void setCantidadBoletos(String CantidadBoletos) {
        this.CantidadBoletos = CantidadBoletos;
    }

    public String getAerolinea() {
        return this.aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCuotas() {
        return this.Cuotas;
    }

    public void setCuotas(String Cuotas) {
        this.Cuotas = Cuotas;
    }

    public String getClaseVuelo() {
        return this.ClaseVuelo;
    }

    public void setClaseVuelo(String ClaseVuelo) {
        this.ClaseVuelo = ClaseVuelo;
    }

    public String getNumeroAsiento() {
        return this.NumeroAsiento;
    }

    public void setNumeroAsiento(String NumeroAsiento) {
        this.NumeroAsiento = NumeroAsiento;
    }

    public String getCantidadMaletas() {
        return this.cantidadMaletas;
    }

    public void setCantidadMaletas(String cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }

    public IReservaUsuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(IReservaUsuario usuario) {
        this.usuario = usuario;
    } 
    @Override
    public String toString() {
        return "{" +
            " FechaViaje='" + getFechaViaje() + "'" +
            ", IdaVuelta='" + isIdaVuelta() + "'" +
            ", CantidadBoletos='" + getCantidadBoletos() + "'" +
            ", aerolinea='" + getAerolinea() + "'" +
            ", numeroTarjeta='" + getNumeroTarjeta() + "'" +
            ", Cuotas='" + getCuotas() + "'" +
            ", ClaseVuelo='" + getClaseVuelo() + "'" +
            ", NumeroAsiento='" + getNumeroAsiento() + "'" +
            ", cantidadMaletas='" + getCantidadMaletas() + "'" +
            ", usuario='" + getUsuario() + "'" +
            "}";
    }
          @Override
        public void Reservacion() {
            Scanner teclado = new Scanner(System.in); 
            System.out.println("Ingrese la fecha del viaje"); 
            this.FechaViaje = teclado.nextLine(); 
            System.out.println("Ingrese la cantidad de boletos"); 
            this.CantidadBoletos = teclado.nextLine(); 
            System.out.println("Ingrese si el viaje es de ida y vuelta (true)/ solo ida  (false)"); 
            this.IdaVuelta = teclado.nextBoolean(); 
            System.out.println("Ingrese el numero de tarjeta");
            this.numeroTarjeta = teclado.nextLine(); 
            System.out.println("Ingrese la cantidad de cuotas"); 
            this.Cuotas = teclado.nextLine(); 
            System.out.println("Ingrese La clase del vuelo"); 
            this.ClaseVuelo = teclado.nextLine(); 
            System.out.println("Ingrese el numero de asiento que desea"); 
            this.NumeroAsiento = teclado.nextLine(); 
            System.out.println("Ingrese la cantidad de maletas que lleva");
            this.cantidadMaletas = teclado.nextLine();  
            teclado.close(); 
        }
    
        //metodos de la interfaz... 
        public void imprimirItinerario() { 
            System.out.println("detalles de la reserva..."); 
            System.out.println("Fecha de viaje" + FechaViaje); 
            System.out.println("vuelo ida y vuelta " + (IdaVuelta?"si":"no")); 
            System.out.println("cantidad de boletos " + CantidadBoletos); 
            System.out.println("numero de tarjeta " + numeroTarjeta); 
            System.out.println("Aerolinea " +aerolinea); 
            System.out.println("cuotas " + Cuotas); 
            System.out.println("tipo de vuelo " + ClaseVuelo); 
        } 

        public void itinerario(){ 
            String nombreArchivo="Itinerario.csv"; 
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {  
            writer.write("fecha de viaje, vuelo ida y vuelta, cantidad de boletos, numero de tarjeta, aerolinea, cuotas, clase vuelo");  
            writer.newLine(); 
            //escribir los datos de la reserva.... 
            writer.write(FechaViaje + ","+(IdaVuelta?"si":"no")+", "+CantidadBoletos + ", " + numeroTarjeta + ", " + aerolinea + ", " + Cuotas + ", " +ClaseVuelo); 
            writer.newLine();  
            System.out.println("archivo csv generado correctamente..." + nombreArchivo);
            }catch(IOException e ){ 
                System.out.println("Error al generar el archivo csv" +e.getMessage());
            }   
        }
}
