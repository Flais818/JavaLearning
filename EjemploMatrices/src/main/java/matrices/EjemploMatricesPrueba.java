
package matrices;

public class EjemploMatricesPrueba {
    
    public static void main(String[] args) {
        
        // Declarar matriz
        int edades [] [];
        
        // Instanciar la matriz
        edades = new int [3] [2];
        
        // Inicializar los valores
        edades [0] [0] = 30;
        edades [0] [1] = 15;
        edades [1] [0] = 20;
        edades [1] [1] = 45;
        edades [2] [0] = 5;
        edades [2] [1] = 38;
        
        // Imprimir valores
        System.out.println("Valor en el indice [0][0]: " + edades[0][0]);
        System.out.println("Valor en el indice [1][0]: " + edades[1][0]);
        System.out.println("valor en el indice [2][0]: " + edades[2][0]);
        
        // Declarar e instanciar matriz tipo object
        Persona personas [][] = new Persona[1][2];
        
        // Inicializar los valores
        personas[0][0] = new Persona ("Juan");
        personas [0][1] = new Persona ("Karla");
        
        // Imprimir valores
        System.out.println("Persona en el indice [0][0]: " + personas[0][0]);
        System.out.println("Persona en el indice[0][1]: " + personas[0][1]);
        
        // Recorrer la matriz con ciclo for
        for (int renglon = 0; renglon < edades.length; renglon++){
            for (int columna = 0; columna < edades[renglon].length; columna++) {
                System.out.println("Valor en edades en el indice " + renglon + "-"+ columna + ":" + edades[renglon][columna]);
            }
        }
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Personas en la posicion " + i + "-" + j + personas[i][j]);
            }
        }
    }
}
