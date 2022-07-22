
public class Aritmetica {
    
    //Atributos
    int a, b;
    
    //Consturctor
    public Aritmetica () {
        System.out.println("Ejecutando constructor vacio");
    }
    
    // Consturctor con parametros
    public Aritmetica (int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }
    
    //Metodos
    public int sumar () {
        return this.a + this.b;
    }
    
    public int restar (){
        return this.a - this.b;
    }
    
    public int multi (){
        return this.a * this.b;
    }
    
    public int divi () {
        return this.a / this.b;
    }
}
