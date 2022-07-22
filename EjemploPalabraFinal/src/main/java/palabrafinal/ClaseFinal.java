package palabrafinal;

// Con final ya no se pueden crear subclase de una marcada como final
public  class ClaseFinal { 
    
    // Variables marcadas como final
    public final int varNumero = 10;
    
    // Constantes 
    public static final int VAR_PRIMITIVO = 15;
    
    // Variable object constantes (no se modifica el valor,
    //siempre tiene la referencia de una Persona)
    
    public static final Persona VAR_PERSONA = new Persona();
    
    // final a un metodo
    public final void metodoFinal () {}

}

//class ClaseHija extends ClaseFinal {
//    
//     Sobre escritura del metodo en clase hija, no se puede 
//     por el final en la clase padre
//    public void metodoFinal () {} 
//}
