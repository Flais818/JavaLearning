
//import com.gm.Utileria;
//import com.gm.*;
import static com.gm.Utileria.imprimir;


public class EjemploPaquetesPrueba {

    public static void main(String[] args) {
        // Utilizando el nombre de la clase completamente calificado
        // Fully qualified name
        com.gm.Utileria.imprimir("Hola!");
        
        // Haciendo un import de la clas
        // Utileria.imprimir
        // Haciendo un import de tipo static
       imprimir("Mundo!");
    }
    
}
