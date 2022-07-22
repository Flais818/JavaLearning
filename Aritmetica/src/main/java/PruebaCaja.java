
public class PruebaCaja {
    
    public static void main (String[] args) {
        
        // Definir variable
        int a = 2, b = 2, c = 2;
        
        // Creamos el objeto
        Caja prueba1 = new Caja(a, b, c);
            
        // Imprimimos el volumen
        System.out.println("Volumen de la caja = " + prueba1.volumen() );
        
    }
    
}
