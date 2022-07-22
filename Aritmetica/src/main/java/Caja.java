
public class Caja {
    
    // Atributos
    int alto, ancho, prof;
    
    public Caja () {
        System.out.println("Constructor vacio");
    }
    
    public Caja (int alto, int ancho, int prof) {
        this.alto = alto;
        this.ancho = ancho;
        this.prof = prof;
        System.out.println("Constructor con 3 argumentos");
    }
    
    public int volumen () {
        int volumen = alto * ancho * prof;
        return volumen;
    }
    
}
