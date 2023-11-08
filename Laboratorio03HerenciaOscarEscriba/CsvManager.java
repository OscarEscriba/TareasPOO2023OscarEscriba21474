package Laboratorio03HerenciaOscarEscriba;
//en esta clase estaremos trabajando lo que es el archivo CSV... 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;

public class CsvManager { 
    //esta es la ruta para el archivo csv. 
    private static final String CSV_File ="C:\\Users\\Oscar Escriba\\Desktop\\6to Semestre compu\\POO\\TareasPOO2023OscarEscriba21474\\Laboratorio03HerenciaOscarEscriba\\lab3.csv";  

    public static List<Emprendiento>leerProductosDesdeCSV() { 
        List<Emprendiento> emprendimiento = new ArrayList<>(); 
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_File))){ 
            String Line; 
            while ((Line = br.readLine()) !=null) { 
                String[] datos = Line.split(",");  
                if(datos.length >=7) { 
                Emprendiento emprendientos = crearEmprendimiento(datos); //crea el producto segun la categoria... 
                emprendimiento.add(emprendientos);    
                } else {
                    System.out.println("la linea de archivo es incorrecta"); 
                }
             //   System.out.println(emprendimiento); 
            } 
            /* 
            -en emprendientos se guardan y se seleccionan que tipo de categoria es...  
            */ 

        } catch(IOException e) { 
            e.printStackTrace();
        } 
        return emprendimiento; 
    } 
    private static Emprendiento crearEmprendimiento(String[] emprendientos){ 
        if (emprendientos[6].equalsIgnoreCase("Bebidas")){ 
            return new Bebidas();  
        }else if (emprendientos[6].equalsIgnoreCase("Snaks")){ 
            return new Snacks(); 
        }else if(emprendientos[6].equalsIgnoreCase("Juguetes")){ 
            return new Juguetes(); 
        } 
        //si nos encontramos con una categoria no valida, devolver un producto generico... 
        return new Emprendiento(); 
    }
}
