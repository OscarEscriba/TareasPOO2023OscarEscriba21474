package Ejercicio1;  
import java.util.*;  
import java.util.Random; 

public class Comprador {  
    //declaracion variables generales 
    public static int cantidadl1;  
    public static int cantidadl2; 
    public static int cantidadl3; 
    //declaracion de los atibutos de la clase Comprador.java 
    private String nombre; 
    private String email; 
    private int Nboletos; 
    private int PMaximo; 
    private Random AleatorioAsignado;   
    private Random Local; 
    //declaracion de los numero aleatorios...  
    private int valor; 
    private int a; 
    private int b;  
    private int localidad; 


    //constructores de la clase...
    public Comprador() { 
        nombre =""; 
        email=""; 
        Nboletos=0; 
        PMaximo=0;  
        AleatorioAsignado = new Random();  
        Local =new Random(); 
    } 

    public Comprador(String nombre, String email, int Nboletos, int PMaximo) { 
        this.nombre=nombre; 
        this.email=email; 
        this.Nboletos=Nboletos; 
        this.PMaximo=PMaximo; 
        AleatorioAsignado = new Random();  
        Local = new Random(); 
    } 
    //metodos de get y set... 
    public String getNombre() { 
        return nombre; 
    } 
    public void setNombre(String nombre) { 
        this.nombre=nombre; 
    }

    public String getEmail(){ 
        return email; 
    } 
    public void setEmail(String email){ 
        this.email = email; 
    } 

    public int getNboletos() { 
        return Nboletos; 
    } 
    public void setNboletos(int Nboletos) { 
        this.Nboletos=Nboletos; 
    } 

    public int getPMaximo(){ 
        return PMaximo; 
    } 
    public void setPmaximo(int PMaximo) { 
        this.PMaximo=PMaximo; 
    }  
    //variables que se van a mandar a otras clases.
    public static int getcantidadl1 () { 
        return cantidadl1; 
    } 
    public static int getcantidadl2() { 
        return cantidadl2;
    } 
    public static int getcantidadl3() { 
        return cantidadl3; 
    } 

    public int AleatorioAsignado() { 
        return AleatorioAsignado.nextInt(15000-1+1)+1; 
    }   
    public int Local() { 
        return Local.nextInt(3-1+1)+1; 
    }
    //funcion para realizar la estadistica acerca de la localidad y asi...  
    public void InfoCompra () {  
        if (Principal.sistema==1) { 
            valor = AleatorioAsignado(); //este es el numero aleatorio que es el ticket... 
        }else { 
            valor=0; 
        } 
        a = AleatorioAsignado(); 
        b =AleatorioAsignado(); 
        //verificacion si el ticker esta dentro de los valores del rango 
        if ((valor < a && valor >b)|| valor <b && valor >a) { 
            System.out.println("Se le dara un numero aleatorio dependiendo del numero sera la localidad."); 
            System.out.println("1. Localidad mas barata"); 
            System.out.println("2. Segunda Localidad con un precio de 500"); 
            System.out.println("3. Tercera localidad con un precio de 1000");
            localidad=Local();  
            if (localidad ==1) { 
                //localidad precio mas alejado pero las mas barata. 
                if (PMaximo < SistemaDeVentas.valorL1) { 
                    System.out.println("No tiene la suficiente capacidad economica para pagar la entrada...")
                }else if (SistemaDeVentas.BoletosL1() >0&& SistemaDeVentas.BoletosL1() <20){ 
                    cantidadl1 = PMaximo /SistemaDeVentas.valorL1;  
                    System.out.println("La cantidad de entrada que usted va a comprar con ese presupuesto en esta localidad es de "+cantidadl1); 
                }else { 
                    System.out.println("No tiene las validadciones necesarias para la compra..."); 
                }
            }else if (localidad ==2) { 
                //vista mejor al escenario con precio de 500 
                 if (PMaximo < SistemaDeVentas.valorL2) { 
                    System.out.println("No tiene la suficiente capacidad economica para pagar la entrada...")
                }else if (SistemaDeVentas.BoletosL2() >0&& SistemaDeVentas.BoletosL2() <20) { 
                    cantidadl2 = PMaximo /SistemaDeVentas.valorL2;  
                    System.out.println("La cantidad de entrada que usted va a comprar con ese presupuesto en esta localidad es de "+cantidadl2); 
                }else { 
                    System.out.println("No tiene las validadciones necesarias para la compra..."); 
                }
            }else { 
                //localidad hasta adelante 1000 
                 if (PMaximo < SistemaDeVentas.valorL3) { 
                    System.out.println("No tiene la suficiente capacidad economica para pagar la entrada...")
                }else if (SistemaDeVentas.BoletosL3() >0&& SistemaDeVentas.BoletosL3() <20){ 
                    cantidadl3 = PMaximo /SistemaDeVentas.valorL3;  
                    System.out.println("La cantidad de entrada que usted va a comprar con ese presupuesto en esta localidad es de "+cantidadl3); 
                } else { 
                    System.out.println("No tiene las validadciones necesarias para la compra..."); 
                }
            }
        }else {  
            //mensaje para demostrar que no es apto para comprar boletos.
            System.out.println("Este ticket no es apto para la compra de boletos, gracias por intentar...");
        }
    }
}
