
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan");
        System.out.println("persona1: " + persona1.obtenerNombre());
        
        Persona persona2 = persona1;
        System.out.println("persona2: " + persona2.obtenerNombre());
        
        persona1 = null;
        if (persona1 != null) {
            System.out.println("persona1 = " + persona1.obtenerNombre());
        }
        else {
            System.out.println("la variable persona1 no apunta a ningun objeto");
        }
        System.gc(); // Garbage collector solo planifica la llamada, se realiza cuano la vm lo considera
    }
    
    
}

class Persona {
    String nombre;
    
    Persona (String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre () {
        return this.nombre;
    }
}
