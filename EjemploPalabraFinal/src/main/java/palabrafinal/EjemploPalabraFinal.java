package palabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
//         Modificar un atributo final
//        ClaseFinal.VAR_PRIMITIVO;
//
//        Modificar un tipo object
//        ClaseFinal.VAR_PERSONA = new Persona();

          // Apunta al mismo objeto siempre, pero puede modificarlo
          ClaseFinal.VAR_PERSONA.setNombre("Juan");
          System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
          
          // Se modifica el nombre del objeto al que apunta 
          ClaseFinal.VAR_PERSONA.setNombre("Carlos");
          System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
