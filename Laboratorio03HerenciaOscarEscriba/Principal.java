package Laboratorio03HerenciaOscarEscriba;

import java.util.List; 
import java.util.Scanner; 
//import java.util.logging.ErrorManager; 



public class Principal {
    public static void main(String[] args){   
        //leer el archivo CSV 
        List<Emprendiento> emprendimiento = CsvManager.leerProductosDesdeCSV(); 

        //hacer las formas para ingresar el texto necesario para todo el programa y vamos a tener el metodo para realizarlo...  
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingresa el id del producto que quuieras buscar...");
        String idProducto = teclado.nextLine(); 

        Emprendiento productoEncontrado = buscarProductoPorId(emprendimiento, idProducto); 
        if(productoEncontrado != null) { 
            System.out.println("Producto encontrado: "+productoEncontrado.getNombre());
        } else { 
            System.out.println("Producto no encontrado..."); 
        }

        
        Bebidas bebida = new Bebidas(); 
        Snacks snacks = new Snacks(); 
        Juguetes  juguetes = new Juguetes(); 
        //llamamos los metodos especificos de cada subclase para mostar los productos... 
        bebida.mostrarBebidas(emprendimiento); 
        snacks.mostrarSnacks(emprendimiento); 
        juguetes.mostrarJuguetes(emprendimiento);   

        //se manda a llamar el metodo de ventas... 
        Ventas();  
        teclado.close(); 
    }  

    //metodo para buscar producto por medio de un id... 
    public static Emprendiento buscarProductoPorId(List<Emprendiento> emprendimiento, String idProducto) { 
        for (Emprendiento emprendientos: emprendimiento) { 
            if (emprendientos.getIdProducto().equals(idProducto)) { 
                return emprendientos; 
            }
        } 
        return null;  
    } 

    /*metodos para mostrar el informe de ventas...   
    hay 160 bebidas vendidas...
    hay 10 juguete vendidos...
    hay 50 snacks vendidos...
    */ 
    public static void Ventas(){ 
        int ventasBebidas=1250; 
        int ventasJuguetes=500;  
        int PrecioJuguetes =50; 
        int ventasSnacks=250;
        int ventasTotales=2000; 
        System.out.println("La cantidad de dinero generada por bebidas es... "+ventasBebidas); 
        System.out.println("La cantidad de dinero generada por juguetes es... "+ventasJuguetes); 
        System.out.println("Cada juguete se vendio a un promedio de "+PrecioJuguetes + "Por lo que consideramos que es un exito...");
        System.out.println("La cantidad de dinero generada por Snacks es... "+ventasSnacks);  
        System.out.println("La cantidad de dinero generada en total es... "+ventasTotales); 


    }
} 
