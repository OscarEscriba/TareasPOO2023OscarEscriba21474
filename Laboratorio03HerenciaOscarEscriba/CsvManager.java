package Laboratorio03HerenciaOscarEscriba;
//en esta clase estaremos trabajando lo que es el archivo CSV... 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List; 

public class CsvManager { 
    //esta es la ruta para el archivo csv. 
    private static final String CSV_File ="Invetario.csv"; 
    public static List<Emprendiento>leerProductosDesdeCSV() { 
        List<Emprendiento> emprendimiento = new ArrayList<>(); 
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_File))){ 
            String Line; 
            while ((Line = br.readLine()) !=null) { 
                String[] datos = Line.split("\\|"); 
                Emprendiento emprendiento = crearEmprendimiento(datos); 
                //tengo error en esa linea pero tengo que entender la linea de codigo 
                //para crear las demas funciones, porque eso es solo una funcion.
                
                emprendimiento.add(emprendiento); 
            }
        } catch(IOException e) { 
            e.printStackTrace();
        } 
        return emprendimiento; 
    }
}
