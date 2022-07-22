
public class Persona {
    
    private int idPersona; // Se aoscia con un objeto o instancia
    private String nombre; // Se aoscia con un objeto o instancia
    private static int contadorPersonas; // Se asocia con la clase
    
    public Persona (String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }
    
//    public void setIPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public static int getCoontadorPersonas () {
        return contadorPersonas;
    }
    
    @Override
    public String toString () {
        return "idPeresona: " + idPersona + ", nombre: " + nombre + ", contadorPersona: " + contadorPersonas;
    }
    
}
