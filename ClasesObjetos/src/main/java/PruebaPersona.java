
public class PruebaPersona {

    public static void main(String[] args) {

        //Definicion de la variable
        Persona persona1;

        //Instanciar
        persona1 = new Persona();

        //Acceder al objeto
        persona1.desplegarNombre();

        //Modificar los atributos
        persona1.nombre = "Juan";
        persona1.apellido = "Marquez";

        //Imprimir
        System.out.println("\n");
        persona1.desplegarNombre();

        //crear un segundo objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Morrison";

        System.out.println("\n");
        persona2.desplegarNombre();

    }
}
