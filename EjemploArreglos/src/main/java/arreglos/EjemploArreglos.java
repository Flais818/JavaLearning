package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
        // Declarar arreglo de int
        int edades[];

        // Instanciar el arreglo
        edades = new int[3];

        // Inicializar valores
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        // Imprimir valores 
        System.out.println("Valor en el indice 0: " + edades[0]);
        System.out.println("Valor en el indice 1: " + edades[1]);
        System.out.println("Valor en el indice 2: " + edades[2]);

        // Declar e instanciar arreglo de tipo object
        Persona personas[] = new Persona[4];

        // Inicializar valores
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        // Imprimir valores
        System.out.println("Arreglo object en indice 0: " + personas[0]);
        System.out.println("Arreglo object en indice 1: " + personas[1]);
        System.out.println("Arreglo object en indice 2: " + personas[2]);

        // Arreglo con notacion simplificada
        String nombres[] = {"Zara", "Laura", "Carlos", "Carmen"};

        // Imprimir con ciclo for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre en indice " + i + ":" + nombres[i]);
        }
        
    }

}
