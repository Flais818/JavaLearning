
public class PruebaAritmetica {
    
    public static void main (String [] args) {
        
        //Varibales locales
        int operandoA = 6;
        int operandoB = 2;
        
        //Crearr objeto de la clase
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        
        // Imprimir los valores
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        // Imprimir resultados
        System.out.println("\nResultaado de la suma: " + objeto1.sumar() );
        System.out.println("\nResultado de la resta: " + objeto1.restar());
        System.out.println("\nResultado de la multiplicacion: " + objeto1.multi() );
        System.out.println("\nResultaado de la division: " + objeto1.divi() );
        
    }

}
       

